package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import modelo.Emprestimo;

public class EmprestimoDAO extends BaseDAO {
    public ArrayList<Emprestimo> minhaListaEmprestimo = new ArrayList<>();
    // Método para listar os valores dos empréstimos do banco de dados
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
                minhaListaEmprestimo.add(objeto);
            }
            res.close();
            stmt.close();
        } catch (SQLException ex) {
        }
        
        return minhaListaEmprestimo; // Retorna a lista de Emprestimo
    }
    
    public void setMinhaListaEmprestimo(ArrayList<Emprestimo> minhaListaEmprestimo) {
        this.minhaListaEmprestimo = minhaListaEmprestimo;
    }
    
    // Método para inserir os valores dos empréstimos do banco de dados
    public boolean insertEmprestimoBD(Emprestimo objeto) {
        //Inserindo 
        String sql = "INSERT INTO emprestimo(idAmigoEmprestimo, idFerramentaEmprestimo, dataInicio, dataDevolucao, status) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            
            // Define valores dos parâmetros da consulta
            stmt.setInt(1, objeto.getIdAmigoEmprestimo());
            stmt.setInt(2, objeto.getIdFerramentaEmprestimo());
            stmt.setDate(3, Date.valueOf(objeto.getDataInicio()));
            stmt.setDate(4, Date.valueOf(objeto.getDataDevolucao()));
            stmt.setBoolean(5, true);
            
            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException erro) {
            // Mensagens de erro
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
    //Retorna o maior id de Amigo
    public int maiorIDEmprestimo() {
        int maiorIDEmprestimo = 0;
        try {
            Statement stmt = this.getConexao().createStatement(); // Cria um objeto Statement para executar a consulta
            ResultSet res = stmt.executeQuery("SELECT MAX(idEmprestimo) idAmigo FROM emprestimo"); // Executa aconsulta SQL para obter o maior idEmprestimo
            res.next();
            maiorIDEmprestimo = res.getInt("idEmprestimo"); //Obtém o valor da coluna 'idEmprestimo'
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Erro:" + ex);
        }
        return maiorIDEmprestimo; // Retorna o maior idEmprestimo
    }
    
    // Deleta um empréstimo do banco de dados
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
    
    //Atualiza o status do banco de dados
    public boolean updateStatusEmprestimoBD(int idEmprestimo, boolean status) {
        String sql = "UPDATE emprestimo SET status = ? WHERE idEmprestimo = ?";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            
            stmt.setBoolean(1, status);
            stmt.setInt(2, idEmprestimo);
            
            stmt.executeUpdate(); // Executa a atualização
            stmt.close(); // Fecha o PreparedStatement
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
        return true;
    }
}
