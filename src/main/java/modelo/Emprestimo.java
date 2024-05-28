package modelo;

import dao.EmprestimoDAO;

public class Emprestimo {
    //Atributos
    private int idEmprestimo;
    private String dataInicio;
    private String dataDevolucao;
    private EmprestimoDAO dao;
    
    private static int idCounter = 0;//O id é preenchido automaticamente

    public Emprestimo(){
        this("","");
    }

    public Emprestimo(String dataInicio, String dataDevolucao) {
        this.idEmprestimo = ++idCounter;
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
    
    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

}