import java.util.Scanner;
public class Atividade01 {
    public static void main(String[] args) {
        double Nota01;
        double Nota02;
        double Nota03;
        Character Letra;

        Scanner abc = new Scanner (System.in);

        System.out.println("Digite a 1° Nota");
            Nota01 = abc.nextDouble();

        System.out.println("Digite a 2° Nota");
            Nota02 = abc.nextDouble();

        System.out.println("Digite a 3° Nota");
            Nota03 = abc.nextDouble();
        
        System.out.println("Digite o Parametro (A ou P)");
            Letra = abc.next().charAt(0);
        

        if (Letra == 'A'){
            ParametroA(Nota01, Nota02, Nota03);
        }

        else if (Letra == 'P'){
            ParametroP(Nota01, Nota02, Nota03);
        }

        else {
            System.out.println("Parametro Invalido");
        }
     abc.close();
    }

//Funcoes

    public static void ParametroA(double Nota01, double Nota02, double Nota03){
        double Media = (Nota01+ Nota02+ Nota03)/3;

        System.out.println("Media Aritmetica das Notas: "+ Media);
    }

    public static void ParametroP(double Nota01, double Nota02, double Nota03){
        double Media = ((Nota01*5)+ (Nota02*3)+ (Nota03*2))/10;

        System.out.println("Media Ponderada das Notas: "+ Media);
    }
}