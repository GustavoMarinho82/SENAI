import java.util.Scanner;
public class atividade03{
    public static void main(String [] args){
        double Nota01;
        double Nota02;

        double MediaAluno = 0;
        double MediaClasse = 0;

        int Aprovados = 0;
        int Recuperacao = 0;
        int Reprovados = 0;

            Scanner abc = new Scanner(System.in);

        for(int x=0; x<6 ; x++){
            System.out.println("Digite a 1° nota do Aluno "+ (x+1));
                Nota01 = abc.nextDouble();

            System.out.println("Digite a 2° nota do Aluno "+ (x+1));
                Nota02 = abc.nextDouble();
            
            MediaAluno = (Nota01 + Nota02)/2;
            MediaClasse += MediaAluno; 
            System.out.println("Media do Aluno "+ (x+1) + " = " + MediaAluno);

                if(MediaAluno >= 7){
                    Aprovados++;
                    System.out.println("O Aluno "+ (x+1)+ " esta Aprovado");
                }

                else if (MediaAluno < 7 && MediaAluno >= 3){
                    Recuperacao++;
                    System.out.println("O Aluno "+ (x+1)+ " esta em Recuperação");
                }
                
                else {
                    Reprovados++;
                    System.out.println("O Aluno "+ (x+1)+ " esta Reprovado");
                }

            System.out.println(" ");
        }
            MediaClasse /= 6;
            
        System.out.println("N° de Alunos Aprovados = "+ Aprovados + "\n" +
                           "N° de Alunos em Recuperação = "+ Recuperacao + "\n" +
                           "N° de Alunos Reprovados = "+ Reprovados + "\n" +
                           "Media da Classe: "+ MediaClasse + "\n");

        abc.close();
    }
}