package model;

public class Amigo{
    private String telefone;
    private String nome;

    public Amigo(){
        this("","");
    }
    
    public Amigo(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
