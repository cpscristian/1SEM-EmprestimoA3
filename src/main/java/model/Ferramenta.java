package model;

import dao.FerramentaDAO;
import java.util.ArrayList;

public class Ferramenta {
    private String nomeFerramenta;
    private String marca;
    private double preco;
    private FerramentaDAO dao;

    public Ferramenta(){
        this("","",0.0);
    }
    
    public Ferramenta(String nomeFerramenta, String marca, double preco) {
        this.nomeFerramenta = nomeFerramenta;
        this.marca = marca;
        this.preco = preco;
        this.dao = new FerramentaDAO();
    }

    public String getNomeFerramenta() {
        return nomeFerramenta;
    }

    public void setNomeFerramenta(String nomeFerramenta) {
        this.nomeFerramenta = nomeFerramenta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public ArrayList<Ferramenta> getMinhaListaFerramenta() {
        return dao.getMinhaListaFerramenta();
    }
    
}
