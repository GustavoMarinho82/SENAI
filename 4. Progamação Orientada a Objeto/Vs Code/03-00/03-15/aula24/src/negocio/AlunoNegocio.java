package negocio;

import java.util.Scanner;


public class AlunoNegocio {
    Scanner teclado = new Scanner (System.in);

    
    public int lerMatricula(){
        System.out.println("Digite a matricula");
            return teclado.nextInt();
    }

    public String lerNomeA(){
        System.out.println("Digite o nome");
            return teclado.nextLine();
    }

    public String lerEmail(){
        System.out.println("Digite o email");
            return teclado.nextLine();
    }

    public int lerIdade(){
        System.out.println("Digite a idade");
            return teclado.nextInt();
    }

    public String lerSexo(){
        System.out.println("Digite o sexo (H - Homem | M - Mulher)");
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