import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int opcao;
        LojaPazeli lp = new LojaPazeli(0, 0, 0);
        LojaTaveira lt = new LojaTaveira(0, 0, 0);
        LojaSolimões ls = new LojaSolimões(0, 0, 0);

        do{
        System.out.println("1 - Adicionar produto na loja Pazeli: ");
        System.out.println("2 - Adicionar produto na loja Taveira: ");
        System.out.println("3 - Adicionar produto na loja Solimões: ");
        System.out.println("4 - Visualizar produtos: ");

         Scanner entrada = new Scanner(System.in);
         opcao = entrada.nextInt();

         
         if(opcao == 1){
             lp.setBibliaDoLinux((lp.getBibliaDoLinux()+ entrada.nextInt()));
             lp.setContatinhosDoIgor((lp.getContatinhosDoIgor() + entrada.nextInt()));
             lp.setFotoIgorBiquine((lp.getFotoIgorBiquine() + entrada.nextInt()));

         }

         else if(opcao == 2){
             lt.setBibliaDoLinux((lt.getBibliaDoLinux() + entrada.nextInt()));
             lt.setContatinhosDoIgor((lt.getContatinhosDoIgor() + entrada.nextInt()));
             lt.setFotoIgorBiquine((lt.getFotoIgorBiquine() + entrada.nextInt()));


         }
         if(opcao == 3){
            ls.setBibliaDoLinux((ls.getBibliaDoLinux()+ entrada.nextInt()));
            ls.setContatinhosDoIgor((ls.getContatinhosDoIgor() + entrada.nextInt()));
            ls.setFotoIgorBiquine((ls.getFotoIgorBiquine() + entrada.nextInt()));





    } 
}while (opcao !=0);
}
}


