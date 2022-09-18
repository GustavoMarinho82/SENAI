import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    //Variaveis
        int opcao;
        int opcao2;
        
    //Scanner
        Scanner teclado = new Scanner(System.in);

    //Sei la
        do {
            System.out.println("\nO que deseja fazer?"+
                               "1 - Criar conta \n"+
                               "2 - Exibir dados \n"+
                               "3 - Depositar / Sacar \n"+
                               "4 - Fechar o programa");
                opcao= teclado.nextInt();
            
            if (opcao ==1){
                System.out.println("Qual tipo de conta deseja criar?????????? \n"+
                                    "1 - Conta corrente \n"+ 
                                    "2 - Conta poupanca");
                                    opcao2 = teclado.nextInt();
                
                if (opcao2 ==1) {
                   System.out.println("Digite o titular:"); 
                
                
                }

            }
          
        } while (opcao!=4);
          teclado.close();
    }
}
