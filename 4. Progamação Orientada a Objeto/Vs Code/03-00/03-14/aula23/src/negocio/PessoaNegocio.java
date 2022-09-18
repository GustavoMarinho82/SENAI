package negocio;

import java.util.Scanner;

public class PessoaNegocio {
    
    Scanner entrada = new Scanner(System.in);
     
    public int lerIdPessoa(){
        System.out.println("Entre com a matrícula: ");
        return entrada.nextInt();
    }

    public String lerNome(){
        System.out.println("Entre com o nome: ");
        return entrada.nextLine();
    }

    public String lerEmail(){
        System.out.println("Entre com o e-mail: ");
        return entrada.nextLine();
    }

    public int menu(){
        int opc;
        System.out.println("Menu");
        System.out.println("1- Gravar");
        System.out.println("2- Listar");
        System.out.println("3- Alterar");
        System.out.println("4- Excluir");
        opc = entrada.nextInt();
        return opc;
    }
    
}