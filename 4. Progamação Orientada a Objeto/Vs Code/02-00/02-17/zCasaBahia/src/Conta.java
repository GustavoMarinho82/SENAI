public class Conta {
    private int num;
    private double saldo;



    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public double depositar(int num){
        saldo += this.num;
        return(saldo);
    }

    public void verSaldo(){
        System.out.println("Saldo: " + saldo);
    }
}

