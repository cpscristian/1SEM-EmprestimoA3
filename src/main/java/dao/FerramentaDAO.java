package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Ferramenta;

public class FerramentaDAO extends BaseDAO {
    public ArrayList<Ferramenta> minhaListaFerramenta = new ArrayList<>();
    
    // Retorna a Lista de Ferramentas(objetos)
    public ArrayList<Ferramenta> getMinhaListaFerramenta() {
        minhaListaFerramenta.clear(); //Limpa nosso ArrayList
        
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM ferramenta");
            while (res.next()) {
                int idFerramenta = res.getInt("idFerramenta");
                String nomeFerramenta = res.getString("nomeFerramenta");
                String marca = res.getString("marca");
                double preco = res.getDouble("preco");
                Ferramenta objeto = new Ferramenta(idFerramenta, nomeFerramenta, marca, preco);
                minhaListaFerramenta.add(objeto);
            }
            res.close();
            stmt.close();
        } catch (SQLException ex) {
        }
        
        return minhaListaFerramenta;
    }

    public void setMinhaListaFerramenta(ArrayList<Ferramenta> minhaListaFerramenta) {
        this.minhaListaFerramenta = minhaListaFerramenta;
    }
    
    //Carrega uma Ferramenta pelo id
    public Ferramenta carregaFerramenta(int idFerramenta) {
        Ferramenta objeto = new Ferramenta();
        objeto.setIdFerramenta(idFerramenta);
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM ferramenta WHERE idFerramenta = " + idFerramenta);
            res.next();
            objeto.setNomeFerramenta(res.getString("nomeFerramenta"));
            objeto.setMarca(res.getString("marca"));
            objeto.setPreco(res.getDouble("preco"));
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
        }
        return objeto;
    }
    
    // Cadastra nova ferramenta
    public boolean insertFerramentaBD(Ferramenta objeto) {
        String sql = "INSERT INTO ferramenta(nomeFerramenta, marca, preco) VALUES(?,?,?)";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            stmt.setString(1, objeto.getNomeFerramenta());
            stmt.setString(2, objeto.getMarca());
            stmt.setDouble(3, objeto.getPreco());
            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
    //Retorna o maior id de Ferramenta
    public int maiorIDFerramenta() {
        int maiorIDFerramenta = 0;
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(idFerramenta) idFerramenta FROM ferramenta");
            res.next();
            maiorIDFerramenta = res.getInt("idFerramenta");
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Erro:" + ex);
        }
        return maiorIDFerramenta;
    }
    
    // Deleta uma ferramenta específica pelo seu campo ID
    public boolean deleteFerramentaBD(int idFerramenta) {
        try {
            
            
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM ferramenta WHERE idFerramenta = " + idFerramenta);
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
        }
        return true;
    }
    
    // Edita uma ferramenta específica pelo seu campo ID
    public boolean updateFerramentaBD(Ferramenta objeto) {
        String sql = "UPDATE ferramenta set nomeFerramenta = ?,marca = ? ,preco = ? WHERE idFerramenta = ?";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            
            stmt.setString(1, objeto.getNomeFerramenta());
            stmt.setString(2, objeto.getMarca());
            stmt.setDouble(3, objeto.getPreco());
            stmt.setInt(4, objeto.getIdFerramenta());
            
            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
}
