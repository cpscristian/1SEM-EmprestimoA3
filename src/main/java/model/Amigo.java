package model;

import dao.AmigoDAO;
import java.util.ArrayList;

public class Amigo{
    private String telefone;
    private String nomeAmigo;
    private AmigoDAO dao;

    public Amigo(){
        this("","");
    }
    
    public Amigo(String nome, String telefone) {
        this.nomeAmigo = nome;
        this.telefone = telefone;
        this.dao = new AmigoDAO();
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getNomeAmigo() {
        return nomeAmigo;
    }

    public void setNomeAmigo(String nomeAmigo) {
        this.nomeAmigo = nomeAmigo;
    }
    
    public ArrayList<Amigo> getMinhaListaAmigo() {
        return dao.getMinhaListaAmigo();
    }
}
