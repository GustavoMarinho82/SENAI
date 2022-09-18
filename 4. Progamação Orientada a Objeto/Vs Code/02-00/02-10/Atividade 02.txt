import java.util.Scanner;
public class atividade02 {
    public static void main(String[] args){
    double SalarioA = 0;
    double SalarioN = 0;
    String Plano = "z";

        Scanner abc = new Scanner(System.in);

        System.out.println("Digite o seu Salário");
            SalarioA = abc.nextDouble();
        
        System.out.println("Digite o seu Plano");
            Plano = abc.next();

        abc.close();
         
        
        switch(Plano) {

        case "A":
        SalarioN = SalarioA*1.10;
            break;
        
        case "B":
        SalarioN = SalarioA*1.15;
            break;

        case "C":
        SalarioN = SalarioA*1.20;
            break;
        
        default:
        System.out.print("Erro");
        }


        System.out.print("Salario Antigo: ");
        System.out.println(SalarioA);
        System.out.print("Salário Novo: R$");
        System.out.println(SalarioN);
        
        }
    } 

