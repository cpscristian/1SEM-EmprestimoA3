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
    // Lista para armazenar objetos do tipo Amigo
    public ArrayList<Amigo> minhaListaAmigo = new ArrayList<>();
    // Retorna a Lista de Amigos(objetos)
    public ArrayList<Amigo> getMinhaListaAmigo() {
        minhaListaAmigo.clear(); // Limpa a lista antes de preenchê-la novamente
        
        try {
            Statement stmt = this.getConexao().createStatement(); // Cria um objeto Statement para executar consultas SQL
            ResultSet res = stmt.executeQuery("SELECT * FROM amigo"); // Executa a consulta SQL e armazena os resultados em um ResultSet
            while (res.next()) {
                // Extrai os dados de cada coluna do ResultSet
                int idAmigo = res.getInt("idAmigo");
                String nomeAmigo = res.getString("nomeAmigo");
                String telefone = res.getString("telefone");
                
                // Cria um novo objeto Amigo com os valores obtidos
                Amigo objeto = new Amigo(idAmigo, nomeAmigo, telefone);
                minhaListaAmigo.add(objeto); // Adiciona o objeto Amigo a lista
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
            Statement stmt = this.getConexao().createStatement(); // Cria um objeto Statement para executar a consulta
            ResultSet res = stmt.executeQuery("SELECT * FROM amigo WHERE idAmigo = " + idAmigo); // Executa a consulta SQL para obter o amigo com o id específicado
            res.next();
            
            // Define os valores dos campos do objeto Amigo
            objeto.setNomeAmigo(res.getString("nomeAmigo"));
            objeto.setTelefone(res.getString("telefone"));
            stmt.close();
            // Mensagem de erro
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
        }
        return objeto; // Retorna o objeto Amigo
    }
    
    // Cadastra novo amigo
    public boolean insertAmigoBD(Amigo objeto) {
        String sql = "INSERT INTO amigo(nomeAmigo,telefone) VALUES(?,?)";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            
            // Define os valores dos parâmetros da consulta
            stmt.setString(1, objeto.getNomeAmigo());
            stmt.setString(2, objeto.getTelefone());
            
            stmt.execute();
            stmt.close();
            return true;
            // Mensagem de erro
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
    //Retorna o maior id de Amigo
    public int maiorIDAmigo() {
        int maiorIDAmigo = 0;
        try {
            Statement stmt = this.getConexao().createStatement(); // Cria um objeto Statement para executar a consulta
            ResultSet res = stmt.executeQuery("SELECT MAX(idAmigo) idAmigo FROM amigo"); // Executa a consulta SQL para obter o maior idAmigo
            res.next();
            maiorIDAmigo = res.getInt("idAmigo"); // Obtém o valor da coluna 'idAmigo'
            stmt.close();
            // Mensagem de erro
        } catch (SQLException ex) {
            System.out.println("Erro:" + ex);
        }
        return maiorIDAmigo;
    }
    
    // Deleta um amigo específico pelo seu campo ID
    public boolean deleteAmigoBD(int idAmigo) {
        try {
            Statement stmt = this.getConexao().createStatement(); // Cria um objeto Statement para executar a exclusão
            stmt.executeUpdate("DELETE FROM amigo WHERE idAmigo = " + idAmigo); // Executa a exclusão do registro com idAmigo especificado
            stmt.close();
            
            // Mensagem de erro
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
        }
        return true;
    }
    
    // Edita um amigo específico pelo seu campo ID
    public boolean updateAmigoBD(Amigo objeto) {
        String sql = "UPDATE amigo set nomeAmigo = ?,telefone = ? WHERE idAmigo = ?"; //Declaração SQL de atualização
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql); // Cria um PreparedStatement para a consulta parametrizada
            
            
            // Define os valores dos parâmetros da consulta
            stmt.setString(1, objeto.getNomeAmigo());
            stmt.setString(2, objeto.getTelefone());
            stmt.setInt(3, objeto.getIdAmigo());
            
            stmt.execute();
            stmt.close();
            return true;
            // Mensagem de erro
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
}
