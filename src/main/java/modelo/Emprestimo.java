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
    private boolean status;
    private EmprestimoDAO dao;

    public Emprestimo(){
        this(0,0,0,LocalDate.of(1970, 1, 1),LocalDate.of(1970, 1, 1),false);
    }

    // Construtor parametrizado que inicializa os atributos com valores fornecidos
    public Emprestimo(int idEmprestimo, int idAmigoEmprestimo, int idFerramentaEmprestimo, LocalDate dataInicio, LocalDate dataDevolucao, boolean status) {
        this.idEmprestimo = idEmprestimo;
        this.idAmigoEmprestimo = idAmigoEmprestimo;
        this.idFerramentaEmprestimo = idFerramentaEmprestimo;
        this.dataInicio = dataInicio;
        this.dataDevolucao = dataDevolucao;
        this.status = status;
        this.dao = new EmprestimoDAO();
    }
    
    // Métodos Getters e Setters
    
    // Obtém o ID do empréstimo
    public int getIdEmprestimo() {
        return idEmprestimo;
    }
    
    // Define o ID do empréstimo
    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }
    
    // Obtém o ID do amigo que fez o empréstimo
    public int getIdAmigoEmprestimo() {
        return idAmigoEmprestimo;
    }
    
    // Define o ID do amigo que fez o empréstimo
    public void setIdAmigoEmprestimo(int idAmigoEmprestimo) {
        this.idAmigoEmprestimo = idAmigoEmprestimo;
    }
    
    // Obtém o ID da ferramenta emprestada
    public int getIdFerramentaEmprestimo() {
        return idFerramentaEmprestimo;
    }

    // Define o ID da ferramenta emprestada
    public void setIdFerramentaEmprestimo(int idFerramentaEmprestimo) {
        this.idFerramentaEmprestimo = idFerramentaEmprestimo;
    }
    
    // Obtém a data de início do empréstimo
    public LocalDate getDataInicio() {
        return dataInicio;
    }

    // Define a data de início do empréstimo
    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    // Obtém a data de devolução do empréstimo
    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    // Define a data de devolução do empréstimo
    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    
    // Verifica se o empréstimo está ativo
    public boolean isStatus() {
        return status;
    }

    // Define o status do empréstimo
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return "idEmprestimo" + idEmprestimo + "idAmigoEmprestimo" + idAmigoEmprestimo + "idFerramentaEmprestimo" + idFerramentaEmprestimo 
                + "dataInicio" + dataInicio + "dataDevolucao" + dataDevolucao + "status" + status;
    }
    
    //Pegando os métodos de EmprestimoDAO
    public ArrayList<Emprestimo> getMinhaListaEmprestimo() {
        return dao.getMinhaListaEmprestimo();
    }
    
    // Insere um novo empréstimo no banco de dados
    public boolean insertEmprestimoBD(int idAmigoEmprestimo, int idFerramentaEmprestimo, LocalDate dataInicio, LocalDate dataDevolucao) {
        int idEmprestimo = this.maiorIDEmprestimo() + 1;
        Emprestimo objeto = new Emprestimo(idEmprestimo, idAmigoEmprestimo, idFerramentaEmprestimo, dataInicio, dataDevolucao, status);
        dao.insertEmprestimoBD(objeto);
        return true;
    }
    
    // Obtém o maior ID de empréstimo existente
    public int maiorIDEmprestimo() {
        return dao.maiorIDEmprestimo();
    }
    
    // Deleta um empréstimo pelo seu ID
    public boolean deleteEmprestimoBD(int idEmprestimo) {
        dao.deleteEmprestimoBD(idEmprestimo);
        return true;
    }
    
    // Atualiza o status de um empréstimo pelo seu ID
    public boolean updateStatusEmprestimoBD(int idEmprestimo, boolean status){
        dao.updateStatusEmprestimoBD(idEmprestimo, status);
        return true;
    }
    
    // Verifica se o amigo possui algum empréstimo ativo
    public boolean verificaSeTemEmprestimoAtivo(int idAmigoEmprestimo){
        dao.verificaSeTemEmprestimoAtivo(idAmigoEmprestimo);
        return true;
    }
}