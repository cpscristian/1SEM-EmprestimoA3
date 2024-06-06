package modelo;

import dao.FerramentaDAO;
import java.util.ArrayList;

public class Ferramenta {
    //Atributos
    private int idFerramenta; // Identificador de ferramenta
    private String nomeFerramenta; // Nome da ferramenta
    private String marca; // Marca da ferramenta
    private double preco; // Preço da ferramenta
    private FerramentaDAO dao;

    public Ferramenta(){
        this(0,"","",0.0);
    }
    
    public Ferramenta(int idFerramenta, String nomeFerramenta, String marca, double preco) {
        this.idFerramenta = idFerramenta;
        this.nomeFerramenta = nomeFerramenta;
        this.marca = marca;
        this.preco = preco;
        this.dao = new FerramentaDAO();
    }
    
    // Getters e setters
    // Obtém o ID da ferramenta
    public int getIdFerramenta() {
        return idFerramenta;
    }

    // Define o ID da ferramenta
    public void setIdFerramenta(int idFerramenta) {
        this.idFerramenta = idFerramenta;
    }
    
    // Obtém o nome da ferramenta
    public String getNomeFerramenta() {
        return nomeFerramenta;
    }

    // Define o nome da ferramenta
    public void setNomeFerramenta(String nomeFerramenta) {
        this.nomeFerramenta = nomeFerramenta;
    }

    // Obtém a marca da ferramenta
    public String getMarca() {
        return marca;
    }

    // Define a marca da ferramenta
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Obtém o preço da ferramenta
    public double getPreco() {
        return preco;
    }

    // Define o preço da ferramenta
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    @Override
    public String toString() {
        return "idFerramenta" + idFerramenta + "preco=" + preco;
    }
    
    //Pegando os métodos de FerramentaDAO
    public ArrayList<Ferramenta> getMinhaListaFerramenta() {
        return dao.getMinhaListaFerramenta();
    }
    
    public Ferramenta carregaFerramenta(int idFerramenta) {
        return dao.carregaFerramenta(idFerramenta);
    }
    
    // Insere uma nova ferramenta no banco de dados
    public boolean insertFerramentaBD(String nomeFerramenta, String marca, double preco) {
        int idFerramenta = this.maiorIDFerramenta() + 1;
        Ferramenta objeto = new Ferramenta(idFerramenta, nomeFerramenta, marca, preco);
        dao.insertFerramentaBD(objeto);
        return true;
    }
    
    // Obtém o maior ID de ferramenta existente
    public int maiorIDFerramenta() {
        return dao.maiorIDFerramenta();
    }
    
    // Deleta uma ferramenta pelo seu ID
    public boolean deleteFerramentaBD(int idFerramenta) {
        dao.deleteFerramentaBD(idFerramenta);
        return true;
    }
    
    // Atualiza os dados de uma ferramenta no banco de dados
    public boolean updateFerramentaBD(int idFerramenta, String nomeFerramenta, String marca, double preco) {
        Ferramenta objeto = new Ferramenta(idFerramenta, nomeFerramenta, marca, preco);
        dao.updateFerramentaBD(objeto);
        return true;
    }
    
}
