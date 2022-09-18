import java.util.Scanner;

public class App {
    public static void main(String arg[]) {
        int legal;
        Homem homem = new Homem();
        Cao cao = new Cao();
        Gato gato = new Gato();
        
        Scanner igor = new Scanner(System.in);

        System.out.println("Escolha o som desejado \n"+ 
                           "1 - Homem \n"+
                           "2 - Cão \n"+
                           "3 - Gato\n"+
                           "4 - Fechar o programa");
        legal = igor.nextInt();
        homem.falando();
        cao.falando();
        gato.falando();
        if(legal == 1){
            homem.falando();
            
        }
    }
}