public class Onibus extends Veiculo {
//Atributos (privados)
    private int assentos;


//Construtor
    public Onibus (String placa, int ano, int assentos){
        setPlaca(placa);
        setAno(ano);
        this.assentos = assentos;
    }

//Sobrecarga
    public Onibus(){
    }

//Getters e Setter
    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

//Funcao para exibir os dados
    public void exibirDados(){
        System.out.println("Placa: "+ getPlaca()+ "\n"+
                           "Ano: "+ getAno()+ "\n"+
                           "N° de Assentos: "+ assentos);
    }

}