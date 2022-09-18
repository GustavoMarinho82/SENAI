import java.util.Scanner;
public class Atividade01 {
    public static void main(String[] args){
        double SalarioAntigo;
    double SalarioNovo;
    
    Scanner abc = new Scanner(System.in);
    System.out.println("Digite o seu salário");
        SalarioAntigo = abc.nextDouble();

    SalarioNovo = SalarioAntigo;

        if (SalarioAntigo < 1100){
            SalarioNovo = SalarioAntigo*1.12;
        }

        else if (SalarioAntigo < 2200){
            SalarioNovo = SalarioAntigo*1.05;
        }

        System.out.print("Salário Anterior: R$");
        System.out.println(SalarioAntigo);
        System.out.print("Salário Novo: R$");
        System.out.println(SalarioNovo);


        if (SalarioAntigo < 1100){
            System.out.println("Auxilio: R$150,00");
        }
        else {
            System.out.println("Auxilio: R$100,00");
        }
        abc.close();
    }
}