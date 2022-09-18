
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    //Informaçoes do cliente 
    public static void main(String[] args){
        System.out.println("Cadastro de cliente");
        System.out.println("Para efetuar o cadastro,preencha as informações:");
        System.out.println("ID:7");
        System.out.println("Nome: Igor");
        System.out.println("Idade: 16");
        System.out.println("Telefone:(21)965149531");
        System.out.println("_____________________________");
        System.out.println();
        System.out.println();
        //Criação da Lista
        ArrayList<Cliente> cadastroCliente=new ArrayList<Cliente>();
         //Scanner
        try (Scanner entrada = new Scanner(System.in)) {
            int id, idade;
            String nome, telefone;
              //Loop
            while(true){
                System.out.print("Informe o ID do Cliente:");
                id=entrada.nextInt();
                 if(id<0){
                     break;
                 }
                 System.out.println("Informe o Nome do cliente:");
                nome=entrada.next();

                System.out.println("Informe a idade do cliente:");
                idade=entrada.nextInt();

                System.out.println("Informe o telefone do cliente:");
                telefone=entrada.next();

                cadastroCliente.add(new Cliente(id,nome, idade ,telefone));
            
            }
        }
        System.out.println("Relatorio de clientes");
         System.out.println( String.format("Numero total de clientes:%d", cadastroCliente.size()));
         System.out.println("Relátorio de clientes");

         for(int i =0; i<cadastroCliente.size(); i++){
             cadastroCliente.get(i).imprime();
         
         }
        
      
    }
}
