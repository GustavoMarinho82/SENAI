public abstract class Conta {
//Atributos
    private int numero;
    private int agencia;
    protected double saldo;
    

//Construtor
    public Conta(Titular titular, int numero, int agencia){
        titular = new Titular();
        this.numero = numero;
        this.agencia = agencia;
        
    }

    public Conta() {

    }
//Getters e Setters
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }


    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }


    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;


    }

    
//Funcoes

    public abstract void sacar(double valor);

    public abstract void depositar(double valor);
    
    public void transferir(double valor, Conta desfavorecida,Conta favorecido){

        desfavorecida.saldo -= valor;
        favorecido.saldo += valor;
    }
}