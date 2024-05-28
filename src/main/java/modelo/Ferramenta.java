package modelo;

import dao.FerramentaDAO;
import java.util.ArrayList;

public class Ferramenta {
    //Atributos
    private int idFerramenta;
    private String nomeFerramenta;
    private String marca;
    private double preco;
    private FerramentaDAO dao;
    
    private static int idCounter = 0;//O id é preenchido automaticamente

    public Ferramenta(){
        this("","",0.0);
    }
    
    public Ferramenta(String nomeFerramenta, String marca, double preco) {
        this.idFerramenta = ++idCounter;
        this.nomeFerramenta = nomeFerramenta;
        this.marca = marca;
        this.preco = preco;
        this.dao = new FerramentaDAO();
    }
    
    public int getIdFerramenta() {
        return idFerramenta;
    }

    public void setIdFerramenta(int idFerramenta) {
        this.idFerramenta = idFerramenta;
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
    
    //Pegando os métodos de FerramentaDAO
    public ArrayList<Ferramenta> getMinhaListaFerramenta() {
        return dao.getMinhaListaFerramenta();
    }
    
    public Ferramenta carregaFerramenta(int idFerramenta) {
        return dao.carregaFerramenta(idFerramenta);
    }
    
    public boolean insertFerramentaBD(String nomeFerramenta, String marca, double preco) {
        int idFerramenta = this.maiorIDFerramenta() + 1;
        Ferramenta objeto = new Ferramenta(nomeFerramenta, marca, preco);
        dao.insertFerramentaBD(objeto);
        return true;
    }
    
    public int maiorIDFerramenta() {
        return dao.maiorIDFerramenta();
    }
    
    public boolean deleteFerramentaBD(int idFerramenta) {
        dao.deleteFerramentaBD(idFerramenta);
        return true;
    }
    
    public boolean updateFerramentaBD(String nomeFerramenta, String marca, double preco) {
        Ferramenta objeto = new Ferramenta(nomeFerramenta, marca, preco);
        dao.updateFerramentaBD(objeto);
        return true;
    }
    
}
