package modelo;

import dao.AmigoDAO;
import java.util.ArrayList;

public class Amigo{
    //Atributos
    public int idAmigo;
    private String telefone;
    private String nomeAmigo;
    private AmigoDAO dao;
    

    public Amigo(){
        this(0,"","");
    }
    
    public Amigo(int idAmigo, String nome, String telefone) {
        this.idAmigo = idAmigo; // Define o ID do amigo
        this.nomeAmigo = nome; // Define o nome do amigo
        this.telefone = telefone; // Define o telefone do amigo
        this.dao = new AmigoDAO(); // Inicializa o objeto DAO
    }
    
    public int getIdAmigo() {
        return idAmigo;
    }

    // Método para definir o ID do amigo
    public void setIdAmigo(int idAmigo) {
        this.idAmigo = idAmigo;
    }
    
    // Método para obter o telefone do amigo
    public String getTelefone() {
        return telefone;
    }

    // Método para definir o telefone do amigo
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    // Método para obter o nome do amigo
    public String getNomeAmigo() {
        return nomeAmigo;
    }

    // Método para definir o nome do amigo
    public void setNomeAmigo(String nomeAmigo) {
        this.nomeAmigo = nomeAmigo;
    }
    
    @Override
    public String toString() {
        return "idAmigo" + idAmigo;
    }
    
    // Pegando os métodos de AmigoDAO
    public ArrayList<Amigo> getMinhaListaAmigo() {
        return dao.getMinhaListaAmigo();
    }
    
    // Método para carregar um amigo específico pelo ID
    public Amigo carregaAmigo(int idAmigo) {
        return dao.carregaAmigo(idAmigo);
    }
    
    public boolean insertAmigoBD(String nomeAmigo, String telefone) {
        int idAmigo = this.maiorIDAmigo() + 1;
        Amigo objeto = new Amigo(idAmigo, nomeAmigo, telefone);
        dao.insertAmigoBD(objeto);
        return true;
    }
    
    // Método para obter o maior ID de amigo do banco de dados
    public int maiorIDAmigo() {
        return dao.maiorIDAmigo();
    }
    
    // Método para deletar um amigo do banco de dados pelo ID
    public boolean deleteAmigoBD(int idAmigo) {
        dao.deleteAmigoBD(idAmigo);
        return true;
    }
    
    // Método para atualizar os dados de um amigo no banco de dados
    public boolean updateAmigoBD(int idAmigo, String nomeAmigo, String telefone) {
        Amigo objeto = new Amigo(idAmigo, nomeAmigo, telefone);
        dao.updateAmigoBD(objeto);
        return true;
    }
}
