import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Conta conta0 = new Conta();
        int x;

        Scanner aaa = new Scanner(System.in);

     //   System.out.println("Num = "+ conta0.getNum() + "\n"+
     //                      "Saldo = "+ conta0.getSaldo());
    
    do{    System.out.println("Deposite: ");
        x = aaa.nextInt();

        conta0.setNum(x);
        


        conta0.depositar(x);

        conta0.verSaldo();

    } while (conta0.getSaldo() < 101);
    }
}
