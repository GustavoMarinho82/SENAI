public class Funcionario extends Pessoa {
//Variaveis
    private Double salario;
    private Double comissao;


//Contrutor
    public Funcionario(String nome, String email, int idade, Double salario, Double comissao) {
        super(nome, email, idade);
        this.salario = salario;
        this.comissao = comissao;
    }

    public Funcionario () {

    }

//Getters e Setters
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getComissao() {
        return comissao;
    }
    public void setComissao(Double comissao) {
        this.comissao = comissao;
    } 

//Funcoes
    public double valeTransporte() {
        return (salario*0.06);
    }

    public double calcularSalariobruto() {
        return (salario + comissao - (valeTransporte()));
    }
    
    public void exibirDados() {
        System.out.println("Nome: " + getNome() + "\n" + 
                           "Email: " + getEmail() + "\n"+ 
                           "Idade: " + getIdade() + "\n"+
                           "Salario: " + salario + "\n" +
                           "Comissao: " + comissao + "\n"+
                           "Salario Bruto: "+ calcularSalariobruto() + "\n");
    }

}