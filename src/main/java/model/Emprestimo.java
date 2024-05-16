package model;

public class Emprestimo {
    private String dataInicio;
    private String dataDevolucao;

    public Emprestimo(){
        this("","");
    }

    public Emprestimo(String dataInicio, String dataDevolucao) {
        this.dataInicio = dataInicio;
        this.dataDevolucao = dataDevolucao;
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