public class Aluno extends Pessoa {
    //Variavel exclusiva da classe
    int matricula;


    //Construtor com "super"
    public Aluno(String nome, int CPF, int matricula) {
        super(nome, CPF);
        this.matricula = matricula;
    }

    public Aluno() {

    }

}