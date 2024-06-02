package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import modelo.Amigo;
import modelo.Emprestimo;

public class EmprestimoDAO extends BaseDAO {
    public ArrayList<Emprestimo> minhaListaEmprestimo = new ArrayList<>();
    public ArrayList<Emprestimo> getMinhaListaEmprestimo() {
        minhaListaEmprestimo.clear();
        
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM amigo");
            while (res.next()) {
                int idEmprestimo = res.getInt("idEmprestimo");
                int idAmigoEmprestimo = res.getInt("idAmigoEmprestimo");
                int idFerramentaEmprestimo = res.getInt("idFerramentaEmprestimo");
                LocalDate dataInicio = res.getDate("dataInicio").toLocalDate();
                LocalDate dataDevolucao = res.getDate("dataDevolucao").toLocalDate();
                Emprestimo objeto = new Emprestimo(idEmprestimo, idAmigoEmprestimo, idFerramentaEmprestimo, dataInicio, dataDevolucao);
                minhaListaEmprestimo.add(objeto);
            }
            res.close();
            stmt.close();
        } catch (SQLException ex) {
        }
        
        return minhaListaEmprestimo;
    }
    
    public void setMinhaListaEmprestimo(ArrayList<Emprestimo> minhaListaEmprestimo) {
        this.minhaListaEmprestimo = minhaListaEmprestimo;
    }
    
    public boolean insertEmprestimoBD(Emprestimo objeto) {
        String sql = "INSERT INTO emprestimo(idAmigoEmprestimo, idFerramentaEmprestimo, dataInicio, dataDevolucao) VALUES(?,?,?,?)";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            
            stmt.setInt(1, objeto.getIdAmigoEmprestimo());
            stmt.setInt(2, objeto.getIdFerramentaEmprestimo());
            
            if (objeto.getDataInicio() != null) {
                stmt.setDate(3, Date.valueOf(objeto.getDataInicio()));
            } else {
                stmt.setNull(3, java.sql.Types.DATE);
            }
            if (objeto.getDataDevolucao() != null) {
                stmt.setDate(4, Date.valueOf(objeto.getDataDevolucao()));
            } else {
                stmt.setNull(4, java.sql.Types.DATE);
            }
            
            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
    //Retorna o maior id de Amigo
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
}
