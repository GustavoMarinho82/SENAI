public class Fatura implements Pagamento{
//Variaveis (privadas)
    private String numeroParte;
    private String descricaParte;
    private int quantidade;
    private double precoItem;
    

//Contrutor
    public Fatura(String numeroParte, String descricaParte, int quantidade, double precoItem) {
        this.numeroParte = numeroParte;
        this.descricaParte = descricaParte;
        this.quantidade = quantidade;
        this.precoItem = precoItem;
    }


//Getters e Setters
    public String getNumeroParte() {
        return numeroParte;
    }
    public void setNumeroParte(String numeroParte) {
        this.numeroParte = numeroParte;
    }


    public String getDescricaParte() {
        return descricaParte;
    }
    public void setDescricaParte(String descricaParte) {
        this.descricaParte = descricaParte;
    }


    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        if(this.quantidade > 0){
            this.quantidade = quantidade;
        }
            else {
                System.out.println("Erro: Quantidade não pode ser negativa");
            }
    }


    public double getPrecoItem() {
        return precoItem;
    }
    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }


//toString
    public String toString() {
        return ("FATURA"+ 
                "\nNumero Parte: " + getNumeroParte()+
                "\nDescricao: " + getDescricaParte()+
                "\nQuantidade: " + getQuantidade()+
                "\nPreco por Item: " + getPrecoItem());
    }


//Funcao
    public double getTotalPagamento() {
        return (getQuantidade() * getPrecoItem());
    }

}
