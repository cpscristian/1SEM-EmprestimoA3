package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Emprestimo;

public class EmprestimoDAO extends BaseDAO {
    // Lista para armazenar objetos do tipo Emprestimo
    public ArrayList<Emprestimo> minhaListaEmprestimo = new ArrayList<>();
    public ArrayList<Emprestimo> getMinhaListaEmprestimo() {
        minhaListaEmprestimo.clear(); // Limpa a lista antes de preenchê-la novamente
        
        try {
            Statement stmt = this.getConexao().createStatement(); // Cria um objeto Statement para executar consultas SQL
            ResultSet res = stmt.executeQuery("SELECT * FROM emprestimo"); // Executa a consulta SQL e armazena os resultados em um ResultSet
            while (res.next()) {
                // Extrai os dados de cada coluna do ResultSet
                int idEmprestimo = res.getInt("idEmprestimo");
                int idAmigoEmprestimo = res.getInt("idAmigoEmprestimo");
                int idFerramentaEmprestimo = res.getInt("idFerramentaEmprestimo");
                LocalDate dataInicio = res.getDate("dataInicio").toLocalDate();
                LocalDate dataDevolucao = res.getDate("dataDevolucao").toLocalDate();
                boolean status = res.getBoolean("status");
                // Cria um novo objeto Emprestimo com os valores obtidos
                Emprestimo objeto = new Emprestimo(idEmprestimo, idAmigoEmprestimo, idFerramentaEmprestimo, dataInicio, dataDevolucao, status);
                minhaListaEmprestimo.add(objeto); // Adiciona o objeto Emprestimo a lista
            }
            res.close();
            stmt.close();
        } catch (SQLException ex) {
        }
        
        return minhaListaEmprestimo;
    }
    
    // Define a lista de Emprestimos
    public void setMinhaListaEmprestimo(ArrayList<Emprestimo> minhaListaEmprestimo) {
        this.minhaListaEmprestimo = minhaListaEmprestimo;
    }
    
    // Insere um novo Emprestimo no banco de dados
    public boolean insertEmprestimoBD(Emprestimo objeto) {
        //Inserindo 
        String sql = "INSERT INTO emprestimo(idAmigoEmprestimo, idFerramentaEmprestimo, dataInicio, dataDevolucao, status) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            
            // Define os valores dos parâmetros da consulta
            stmt.setInt(1, objeto.getIdAmigoEmprestimo());
            stmt.setInt(2, objeto.getIdFerramentaEmprestimo());
            stmt.setDate(3, Date.valueOf(objeto.getDataInicio()));
            stmt.setDate(4, Date.valueOf(objeto.getDataDevolucao()));
            stmt.setBoolean(5, true);
            
            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
    // Retorna o maior id de Emprestimo
    public int maiorIDEmprestimo() {
        int maiorIDEmprestimo = 0;
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(idEmprestimo) idAmigo FROM emprestimo");
            res.next();
            maiorIDEmprestimo = res.getInt("idEmprestimo");
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Erro:" + ex);
        }
        return maiorIDEmprestimo;
    }
    
    // Deleta um Emprestimo específico pelo seu campo ID
    public boolean deleteEmprestimoBD(int idEmprestimo) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM emprestimo WHERE idEmprestimo = " + idEmprestimo);
            stmt.close();
            
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
        }
        return true;
    }
    
    //Atualiza o status de um Emprestimo específico pelo seu ID
    public boolean updateStatusEmprestimoBD(int idEmprestimo, boolean status) {
        String sql = "UPDATE emprestimo SET status = ? WHERE idEmprestimo = ?";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            
            // Define os valores dos parâmetros da consulta
            stmt.setBoolean(1, status);
            stmt.setInt(2, idEmprestimo);
            
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
        return true;
    }
    
    //Auto-explicatório mas... Verifica se tem algum empréstimo ativo ligado ao amigo selecionado
    public boolean verificaSeTemEmprestimoAtivo(int idAmigoEmprestimo) {
           String sql = "SELECT COUNT(*) AS count FROM emprestimo WHERE idAmigoEmprestimo = ? AND status = true";
           try {
                PreparedStatement stmt = this.getConexao().prepareStatement(sql);
                stmt.setInt(1, idAmigoEmprestimo);
                ResultSet res = stmt.executeQuery();
           
                //se for maior que zero
                if (res.next() && res.getInt("count") > 0) {
                    JOptionPane.showMessageDialog(null, "O amigo possui empréstimo(s) ativo(s).");
                    res.close();
                    stmt.close();
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "O amigo não possuí nenhum empréstimo ativo.");
                    res.close();
                    stmt.close();
                    return false;
                }
            // Mensagem de erro
           } catch (SQLException ex) {
                System.out.println("Erro:" + ex);
                throw new RuntimeException(ex);
           }
     }
}
