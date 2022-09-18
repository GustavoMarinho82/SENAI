public class Professor extends Pessoa{
    //Variaveis exclusivas da classe
    double salario;
    String materia;
    

    //Construtor com "super"
    public Professor(String nome, int CPF, double salario, String materia) {
        super(nome, CPF);
        this.salario = salario;
        this.materia = materia;
    }

    public Professor() {

    }
    
}