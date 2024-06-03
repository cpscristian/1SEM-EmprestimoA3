package modelo;

import dao.EmprestimoDAO;
import java.util.ArrayList;
import java.time.LocalDate;

public class Emprestimo {
    //Atributos

    private int idAmigoEmprestimo;
    private int idFerramentaEmprestimo;
    private LocalDate dataInicio;
    private LocalDate dataDevolucao;
    private boolean status;
    private EmprestimoDAO dao;

    public Emprestimo(){
        this(0,0,LocalDate.of(1970, 1, 1),LocalDate.of(1970, 1, 1),false);
    }

    public Emprestimo(int idAmigoEmprestimo, int idFerramentaEmprestimo, LocalDate dataInicio, LocalDate dataDevolucao, boolean status) {

        this.idAmigoEmprestimo = idAmigoEmprestimo;
        this.idFerramentaEmprestimo = idFerramentaEmprestimo;
        this.dataInicio = dataInicio;
        this.dataDevolucao = dataDevolucao;
        this.status = status;
        this.dao = new EmprestimoDAO();
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
    
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return "idAmigoEmprestimo" + idAmigoEmprestimo + "idFerramentaEmprestimo" + idFerramentaEmprestimo 
                + "dataInicio" + dataInicio + "dataDevolucao" + dataDevolucao + "status" + status;
    }
    
    //Pegando os métodos de EmprestimoDAO
    public ArrayList<Emprestimo> getMinhaListaEmprestimo() {
        return dao.getMinhaListaEmprestimo();
    }
    
    public boolean insertEmprestimoBD(int idAmigoEmprestimo, int idFerramentaEmprestimo, LocalDate dataInicio, LocalDate dataDevolucao) {
//        int idEmprestimo = this.maiorIDEmprestimo() + 1;
        Emprestimo objeto = new Emprestimo(idAmigoEmprestimo, idFerramentaEmprestimo, dataInicio, dataDevolucao, status);
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