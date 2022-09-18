public class Caminhao extends Veiculo {
//Atributos (privados)
    private int eixos;


//Construtor
    public Caminhao (String placa, int ano, int eixos){
        setPlaca(placa);
        setAno(ano);
        this.eixos = eixos;
    }

//Sobrecarga
    public Caminhao(){
    }

//Getters Setters
    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

//Funcao para exibir os dados
    public void exibirDados(){
        System.out.println("Placa: "+ getPlaca()+ "\n"+
                           "Ano: "+ getAno()+ "\n"+
                           "N° de Eixos: "+ eixos);
    }

}