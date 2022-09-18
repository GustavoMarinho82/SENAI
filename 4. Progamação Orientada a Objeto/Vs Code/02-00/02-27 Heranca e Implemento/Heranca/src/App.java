import java.util.Scanner;

public class App {    
    public static void main(String[] args) throws Exception {
        //Variaveis
        int opcao, opcao2;
        int p=0, a=0, x=0;
        
            String nomeT;
            int CpfT;
            double salarioT;
            String materiaT;
            int matriculaT;

        Scanner teclado = new Scanner (System.in);

            Professor professor[] = new Professor[100];
            Aluno aluno[] = new Aluno[100];


        //'Do' para repetir o que esta dentro das {} ate que o 'while' seja verdadeiro
        do{
            System.out.println("\nEscolha uma opcao \n"+
                               "1 - Cadastrar uma Pessoa \n"+
                               "2 - Exibir dados de uma Pessoa \n"+
                               "3 - Fechar programa");
                opcao = teclado.nextInt();
        

            if (opcao == 1) {
                System.out.println("Cadastrar um: \n"+
                                   "1 - Professor \n"+
                                   "2 - Aluno");
                    opcao2 = teclado.nextInt();


                if (opcao2 == 1){
                    System.out.println("Digite o nome");
                        nomeT = teclado.next();
                    System.out.println("Digite o CPF");
                        CpfT = teclado.nextInt();
                    
                    System.out.println("Digite o salario");
                        salarioT = teclado.nextDouble();
                    System.out.println("Digite a materia");
                        materiaT = teclado.next();

                            professor[p] = new Professor(nomeT, CpfT, salarioT, materiaT);
                                p++;
                
                }
                    else if (opcao2 == 2) {
                        System.out.println("Digite o nome");
                            nomeT = teclado.next();
                        System.out.println("Digite o CPF");
                            CpfT = teclado.nextInt();
                        
                        System.out.println("Digite a matricula");
                            matriculaT = teclado.nextInt();

                                aluno[a] = new Aluno(nomeT, CpfT, matriculaT);
                                    a++;

                    }
                        else {
                            System.out.println("Valor Invalido!");
                        }
            }

                else if (opcao == 2) {
                    System.out.println("Digite o CPF do elemento");
                        CpfT = teclado.nextInt();

                        for(x=0; x<p; x++) {
                            if (professor[x].CPF == CpfT) {
                                System.out.println("\nNome: "+ professor[x].nome+
                                                   "\nCPF: "+ professor[x].CPF +
                                                   "\nSalario: "+ professor[x].salario+
                                                   "\nMateria: "+ professor[x].materia);
                            }
                        }

                        for(x=0; x<a; x++) {
                            if (aluno[x].CPF == CpfT) {
                                System.out.println("\nNome: "+ aluno[x].nome+
                                                   "\nCPF: "+ aluno[x].CPF +
                                                   "\nMatricula: "+ aluno[x].matricula );
                            }
                        }
                }

                    else if (opcao != 3){
                        System.out.println("Valor Invalido!");
                    }

        } 
        while (opcao != 3);
        
        teclado.close();
        
    }
}