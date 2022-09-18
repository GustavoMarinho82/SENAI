public class ContaPoupanca extends Conta implements Rendimentos{
//Construtores
    public ContaPoupanca(Titular titular, int numero, int agencia) {
        super(titular, numero, agencia);
    }

    public ContaPoupanca() {
    }
    

//Funcoes
    @Override
    public void sacar(double valor){
        if(valor <= saldo) {
            saldo -= valor;
        }
    }

    @Override
    public void depositar(double valor) {
            saldo += valor;
    }

    public void atualizar(double taxaRendimento){
        //this.taxaRendimento = taxaRendimento; 
    }

}