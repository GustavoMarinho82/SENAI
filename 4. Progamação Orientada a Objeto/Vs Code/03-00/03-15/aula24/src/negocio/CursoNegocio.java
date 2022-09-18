package negocio;

import java.util.Scanner;


public class CursoNegocio {
    Scanner teclado = new Scanner (System.in);

    
    public int lerIdcurso(){
        System.out.println("Digite o id");
            return teclado.nextInt();
    }

    public String lerNomeC(){
        System.out.println("Digite o nome");
            return teclado.nextLine();
    }

    public int Menu(){
        
        System.out.println("\nMENU");
        System.out.println("1- Gravar");
        System.out.println("2- Listar");
        System.out.println("3- Alterar");
        System.out.println("4- Excluir");

        int opc = teclado.nextInt();
        return opc;
    }
}