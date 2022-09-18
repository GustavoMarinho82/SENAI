public class Main {
    public static void main(String args[]){
        Pagamento pagObjetos[] = new Pagamento[4];

        pagObjetos[0] = new Fatura("123", "bicicleta", 2,200.00);
        pagObjetos[1] = new Fatura("222","bola", 5,10.000);
        pagObjetos[2] = new Empregado("Pedro", "Sousa","222" , 350.00);
        pagObjetos[3] = new Empregado("João","Silva" ,"111" ,100.00 );
    
    System.out.println("Faturas e empregados processados polimorficamente pela interface:\n");

    for(int i = 0; i < pagObjetos.length; i++){
        System.out.println(pagObjetos[i].toString()+ "\npagamento feito: "+
        pagObjetos[i].getTotalPagamento());

    }

    }
}
