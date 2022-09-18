public class ContaCorrente extends Conta {
    //Atributos
        private double limite;
        private double taxa;
    
    
    //Construtor
        public ContaCorrente(Titular titular, int numero, int agencia, double limite, double taxa) {
            super(titular, numero, agencia);
            this.limite = limite;
            this.taxa = taxa;
        }
    
    
    //Getters e Setters
    
        public double getLimite() {
            return limite;
        }
        public void setLimite(double limite) {
            this.limite = limite;
        }
    
    
        public double getTaxa() {
            return taxa;
        }
        public void setTaxa(double taxa) {
            this.taxa = taxa;
        }
    
    
        public void getSaldoComLimite() {
            System.out.println("Saldo: "+ getSaldo()+ "\n"+
                               "Limite: "+ getLimite()+ "\n");
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
            if ( (saldo+valor)<= limite ) {
                saldo += valor;
            }
        }




    }