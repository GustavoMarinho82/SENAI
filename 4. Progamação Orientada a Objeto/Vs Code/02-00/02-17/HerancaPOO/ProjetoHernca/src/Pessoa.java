public abstract class Pessoa {
    //Atributos
    private String nome;
    private String endereco;
   
    //Construtores (Polimórfico)
    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public Pessoa() { //Sobrecarga do construtor Pessoa
    }
    
    //Encapsulamento
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Meu nome é :"+ nome +" e meu endereço é "+ endereco;
    }

    

    
}
