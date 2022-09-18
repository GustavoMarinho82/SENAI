package entity;

public class Funcionario {
//Atributos
    private int id;
    private String dataAdmissao;
    private double salario;
    private String especialidade;
    

//Construtores
    public Funcionario(int id, String dataAdmissao, double salario, String especialidade) {
        this.id = id;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
        this.especialidade = especialidade;
    }

    public Funcionario() {
    }


//Getters e Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }
    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }


//toString
    @Override
    public String toString() {
        return "Funcionario [id=" + id + ", dataAdmissao=" + dataAdmissao + ", especialidade=" + especialidade + 
                ", salario=" + salario + "]";
    }
    
}