package dao;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Amigo;

public class AmigoDAO extends BaseDAO{
    public ArrayList<Amigo> minhaListaAmigo = new ArrayList<>();
    // Retorna a Lista de Amigos(objetos)
    public ArrayList<Amigo> getMinhaListaAmigo() {
        minhaListaAmigo.clear();
        
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM amigo");
            while (res.next()) {
                int idAmigo = res.getInt("idAmigo");
                String nomeAmigo = res.getString("nomeAmigo");
                String telefone = res.getString("telefone");
                Amigo objeto = new Amigo(idAmigo, nomeAmigo, telefone);
                minhaListaAmigo.add(objeto);
            }
            res.close();
            stmt.close();
        } catch (SQLException ex) {
        }
        
        return minhaListaAmigo;
    }
    
    public void setMinhaListaAmigo(ArrayList<Amigo> minhaListaAmigo) {
        this.minhaListaAmigo = minhaListaAmigo;
    }
    
    //Carrega um Amigo pelo id
    public Amigo carregaAmigo(int idAmigo) {
        Amigo objeto = new Amigo();
        objeto.setIdAmigo(idAmigo);
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM amigo WHERE idAmigo = " + idAmigo);
            res.next();
            objeto.setNomeAmigo(res.getString("nomeAmigo"));
            objeto.setTelefone(res.getString("telefone"));
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
        }
        return objeto;
    }
    
    // Cadastra novo amigo
    public boolean insertAmigoBD(Amigo objeto) {
        String sql = "INSERT INTO amigo(nomeAmigo,telefone) VALUES(?,?)";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            stmt.setString(1, objeto.getNomeAmigo());
            stmt.setString(2, objeto.getTelefone());
            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
    //Retorna o maior id de Amigo
    public int maiorIDAmigo() {
        int maiorIDAmigo = 0;
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(idAmigo) idAmigo FROM amigo");
            res.next();
            maiorIDAmigo = res.getInt("idAmigo");
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Erro:" + ex);
        }
        return maiorIDAmigo;
    }
    
    // Deleta um amigo específico pelo seu campo ID
    public boolean deleteAmigoBD(int idAmigo) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM amigo WHERE idAmigo = " + idAmigo);
            stmt.close();
            
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
        }
        return true;
    }
    
    // Edita um amigo específico pelo seu campo ID
    public boolean updateAmigoBD(Amigo objeto) {
        String sql = "UPDATE amigo set nomeAmigo = ?,telefone = ? WHERE idAmigo = ?";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            
            
            stmt.setString(1, objeto.getNomeAmigo());
            stmt.setString(2, objeto.getTelefone());
            stmt.setInt(3, objeto.getIdAmigo());
            
            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
}
