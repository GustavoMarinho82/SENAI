package negocio;

import java.util.Scanner;

public class FuncionarioNegocio {
  
    Scanner teclado = new Scanner (System.in);


    public int lerId() {
        System.out.println("Digite o Id");
            return teclado.nextInt();
    }

    public String lerDataAdmissao() {
        System.out.println("Digite a Data de Admissão");
            return teclado.next();
    }

    public double lerSalario() {
        System.out.println("Digite o Salario");
            return teclado.nextDouble();
    }

    public String lerEspecialidade() {
        System.out.println("Digite a Especialidade");
            return teclado.next();
    }


    public int Menu() {
        System.out.println("\nMENU");
        System.out.println("1 - Criar");
        System.out.println("2 - Listar");
        System.out.println("3 - Alterar");
        System.out.println("4 - Deletar");
        
        int opc = teclado.nextInt();
            return opc;
    }

}