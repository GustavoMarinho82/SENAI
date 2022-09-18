package negocio; //Feito
import java.util.Scanner;
import entity.Aluno;

public class AlunoNegocio {
    Scanner entrada = new Scanner(System.in);

    public Aluno lerDados(){
        Aluno a = new Aluno();
        
        
        System.out.println("Entre com matricula: ");
        a.setMatricula(entrada.nextInt());

        System.out.println("Entre com o nome: ");
        a.setNome(entrada.next());

        return a;

    }


    public int menu(){
        int opc;
        System.out.println("\nMENU");
        System.out.println("1 - Gravar");
        System.out.println("2 - Listar");
        System.out.println("3 - Excluir");
        System.out.println("4 - Modificar");
        System.out.println("5 - Fechar programa");
        opc = entrada.nextInt();
        return opc;
    }


    public int menu2(){
        int opc2;
        System.out.println("Qual?");
        System.out.println("1 - Aluno");
        System.out.println("2 - Professor");
        System.out.println("3 - Turma");
        opc2 = entrada.nextInt();
        return opc2;
    }
}
