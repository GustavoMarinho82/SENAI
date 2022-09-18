public class Cliente extends Pessoa {
//Variaveis
    private String cpf;


//Construtor

    public Cliente(String nome, String email, int idade, String cpf) {
        super(nome, email, idade);
        this.cpf = cpf;
    }

    public Cliente () {

    }

//Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

//Funcoes
    public void exibirDados() {
        System.out.println("Nome: " + getNome() + "\n" + 
                           "Email: " + getEmail() + "\n"+ 
                           "Idade: " + getIdade() + "\n"+
                           "CPF: " + cpf + "\n");
    }

}