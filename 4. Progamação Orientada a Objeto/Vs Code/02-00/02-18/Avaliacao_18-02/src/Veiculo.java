public abstract class Veiculo {  
//Atributos (privados)
    private String placa;
    private int ano;


//Construtor
    public Veiculo (String placa, int ano){
        this.placa = placa;
        this.ano = ano;
    }

//Sobrecarga
    public Veiculo(){
    }

//Getters e Setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

//Funcao para exibir os dados
    public void exibirDados(){
        System.out.println("Placa: "+ placa+ "\n"+
                           "Ano: "+ ano);
    }

}