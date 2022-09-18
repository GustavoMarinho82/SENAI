package entity;

public class Aluno {
    private int matricula;
    private String nomeA;
    private String email;
    private int idade;
    private String sexo;
    

//Construtores
    public Aluno(int matricula, String nomeA, String email, int idade, String sexo) {
        this.matricula = matricula;
        this.nomeA = nomeA;
        this.email = email;
        this.idade = idade;
        this.sexo = sexo;
    }

    public Aluno() {}

    
//Getters e Setters
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNomeA() {
        return nomeA;
    }
    public void setNomeA(String nomeA) {
        this.nomeA = nomeA;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


//toString
    @Override
    public String toString() {
        return "Aluno [email=" + email + ", idade=" + idade + ", matricula=" + matricula + ", nomeA=" + nomeA
                + ", sexo=" + sexo + "]";
    }

}