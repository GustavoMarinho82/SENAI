public class Fisica extends Pessoa {

    private String cpf;

    public Fisica(String nome, String endereco, String cpf) {
        super(nome, endereco);
        this.cpf = cpf;
      
    }

    public Fisica() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Nome: "+ getNome()+
               "\nEndereço: "+ getEndereco()+
               "\nCPF: "+cpf;
    }

    
}
