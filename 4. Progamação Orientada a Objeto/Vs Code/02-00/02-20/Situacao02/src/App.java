import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    //Variaveis
        int opcao, opcao2;
        String nomeT, emailT, cpfT;
        int idadeT;
        Double salarioT, comissaoT;
        int Cont_F = 0, Cont_C = 0, x;

        Funcionario funcionario[] = new Funcionario[50];
        Cliente cliente[] = new Cliente[50];

        for (x=0; x<50; x++){
            funcionario[x] = new Funcionario();
            cliente[x] = new Cliente();
        }

        Scanner teclado = new Scanner(System.in);


        do {
            System.out.println("\n"+ "O que você deseja fazer? \n"+
                               "1 - Cadastrar uma pessoa \n"+
                               "2 - Ver os dados \n"+
                               "3 - Fechar o programa");
                opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrar: \n"+
                                       "1 - Funcionario \n"+
                                       "2 - Cliente");
                        opcao2 = teclado.nextInt();
                
                    switch (opcao2) {
                        case 1:
                            System.out.println("Digite o nome");
                                nomeT = teclado.next();
                            System.out.println("Digite o email");
                                emailT = teclado.next();
                            System.out.println("Digite a idade");
                                idadeT = teclado.nextInt();
                                
                            System.out.println("Digite o salario");
                                salarioT = teclado.nextDouble();
                            System.out.println("Digite a comissao");
                                comissaoT = teclado.nextDouble();


                            funcionario[Cont_F] = new Funcionario(nomeT, emailT, idadeT, salarioT, comissaoT);

                                Cont_F++;

                            System.out.println("Funcionario cadastrado com sucesso!");
                        break;
                        
                        case 2:
                            System.out.println("Digite o nome");
                                nomeT = teclado.next();
                            System.out.println("Digite o email");
                                emailT = teclado.next();
                            System.out.println("Digite a idade");
                                idadeT = teclado.nextInt();
                        
                            System.out.println("Digite o CPF");
                                cpfT = teclado.next();


                            cliente[Cont_C] = new Cliente(nomeT, emailT, idadeT, cpfT);

                                Cont_C++;

                            System.out.println("Cliente cadastrado com sucesso!");
                        break;
                        
                        default:
                            System.out.println("Valor invalido!");
                        break;
                        }
                break;

                case 2:
                    System.out.println("\n"+ "Ver os dados de: \n"+
                                       "1 - Apenas uma pessoa \n"+
                                       "2 - Todos os funcionarios \n"+
                                       "3 - Todos os clientes");
                        opcao2 = teclado.nextInt();
                    
                    switch (opcao2) {
                        case 1:
                            System.out.println("Digite o nome");
                                nomeT = teclado.next();
                            
                            x = 0;
                            while (x<Cont_F || x<Cont_C) {

                                if (nomeT.equals(funcionario[x].getNome())) {
                                    System.out.println("Funcionario cadastrado n° "+ (x+1));
                                    funcionario[x].exibirDados();
                                }
                                if (nomeT.equals(cliente[x].getNome())) {
                                    System.out.println("Cliente cadastrado n° "+ (x+1));
                                    cliente[x].exibirDados();
                                }
                                
                                x++;
                            }
                        break;

                        case 2:
                            for(x=0; x<Cont_F; x++) {
                                System.out.println("Funcionario cadastrado n° "+ (x+1));
                                funcionario[x].exibirDados();
                            }
                        break;

                        case 3:
                            for(x=0; x<Cont_C; x++) {
                                System.out.println("Cliente cadastrado n° "+ (x+1));
                                cliente[x].exibirDados();
                            }
                        break;

                        default:
                            System.out.println("Valor invalido!");
                        break;
                    }
                break;
                    
            }

        } while (opcao != 3);
          teclado.close();
    }
}