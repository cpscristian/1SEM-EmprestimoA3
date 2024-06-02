package modelo;

import dao.EmprestimoDAO;
import java.util.ArrayList;
import java.time.LocalDate;

public class Emprestimo {
    //Atributos
    private int idEmprestimo;
    private int idAmigoEmprestimo;
    private int idFerramentaEmprestimo;
    private LocalDate dataInicio;
    private LocalDate dataDevolucao;
    private EmprestimoDAO dao;

    public Emprestimo(){
        this(0,0,0,null,null);
    }

    public Emprestimo(int idEmprestimo, int idAmigoEmprestimo, int idFerramentaEmprestimo, LocalDate dataInicio, LocalDate dataDevolucao) {
        this.idEmprestimo = idEmprestimo;
        this.idAmigoEmprestimo = idAmigoEmprestimo;
        this.idFerramentaEmprestimo = idFerramentaEmprestimo;
        this.dataInicio = dataInicio;
        this.dataDevolucao = dataDevolucao;
        this.dao = new EmprestimoDAO();
    }
    
    public int getIdEmprestimo() {
        return idEmprestimo;
    }
    
    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }
    
    public int getIdAmigoEmprestimo() {
        return idAmigoEmprestimo;
    }
    
    public void setIdAmigoEmprestimo(int idAmigoEmprestimo) {
        this.idAmigoEmprestimo = idAmigoEmprestimo;
    }
    
    public int getIdFerramentaEmprestimo() {
        return idFerramentaEmprestimo;
    }

    public void setIdFerramentaEmprestimo(int idFerramentaEmprestimo) {
        this.idFerramentaEmprestimo = idFerramentaEmprestimo;
    }
    
    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    
    @Override
    public String toString() {
        return "idEmprestimo" + idEmprestimo + "idAmigoEmprestimo" + idAmigoEmprestimo + "idFerramentaEmprestimo" + idFerramentaEmprestimo;
    }
    
    //Pegando os métodos de EmprestimoDAO
    public ArrayList<Emprestimo> getMinhaListaEmprestimo() {
        return dao.getMinhaListaEmprestimo();
    }
    
    public boolean insertEmprestimoBD(int idAmigoEmprestimo, int idFerramentaEmprestimo, LocalDate dataInicio, LocalDate dataDevolucao) {
        int idEmprestimo = this.maiorIDEmprestimo() + 1;
        Emprestimo objeto = new Emprestimo(idEmprestimo, idAmigoEmprestimo, idFerramentaEmprestimo, dataInicio, dataDevolucao);
        dao.insertEmprestimoBD(objeto);
        return true;
    }
    
    public int maiorIDEmprestimo() {
        return dao.maiorIDEmprestimo();
    }
    
    public boolean deleteEmprestimoBD(int idEmprestimo) {
        dao.deleteEmprestimoBD(idEmprestimo);
        return true;
    }
}