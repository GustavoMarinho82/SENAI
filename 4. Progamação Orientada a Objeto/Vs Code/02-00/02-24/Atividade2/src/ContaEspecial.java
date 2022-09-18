public class ContaEspecial extends Conta implements Rendimentos {
//Construtor
    public ContaEspecial(Titular titular, int numero, int agencia) {
        super(titular, numero, agencia);
    }

    public ContaEspecial() {
    }

//Funcoes
    public void atualizar(double taxaRendimento){
        //this.taxaRendimento = taxaRendimento; 
    }



    @Override
    public void sacar(double valor) {
    }
    @Override
    public void depositar(double valor) {
    }
    

}
