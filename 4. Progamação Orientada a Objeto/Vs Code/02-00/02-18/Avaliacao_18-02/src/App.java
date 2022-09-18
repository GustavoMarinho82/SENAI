import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    //Variaveis
        int opcao, opcao2;
        int Cont_O = 0, Cont_C = 0;
        String placaT;
        int anoT, assentosT, eixosT;
        int x = 0;
    
    //Criacao de arrays que vao armazenar os dados dos veiculos cadastrados, sendo limitados a 50 de cada
        Onibus onibus[] = new Onibus[50];
        Caminhao caminhao[] = new Caminhao[50];
    
    //For para preencher os arrays com "variaveis" vazias, para que elas nao sejam "null", evitando futuros erros com os Getters e Setters
        for (x=0; x<50; x++) {
            onibus[x] = new Onibus();
            caminhao[x] = new Caminhao();
        }
    
    //Criacao do Scanner para receber Inputs do teclado
        Scanner teclado = new  Scanner(System.in);
    
    //'Do' feito para repetir o menu ate que a opcao 4 seja escolhida
        do {
            System.out.println("\n"+ "O que você deseja fazer? \n"+
                               "1 - Cadastrar um veiculo \n" +
                               "2 - Visualizar o N° de veiculos \n" +
                               "3 - Exibir dados \n" +
                               "4 - Fechar o programa");
            
                opcao = teclado.nextInt();

        //'Switch' feito para direcionar a execucao conforme a escolha
            switch (opcao){
                case 1:
                    System.out.println("\n"+ "Você deseja cadastrar um: \n"+ 
                                       "1- Onibus \n"+ 
                                       "2- Caminhao");

                        opcao2 = teclado.nextInt();

                    switch (opcao2) {
                        case 1:
                            System.out.println("Digite a placa");
                                placaT = teclado.next();

                            System.out.println("Digite o ano");
                                anoT = teclado.nextInt();

                            System.out.println("Digite o N° de assentos");
                                assentosT = teclado.nextInt();

                                x = 0;

                        /*While feito para garantir que um espaco do array de um veiculo ja cadastrado nao seja substituido por outro, 
                         *evitando que os dados desse veiculo sejam apagados. Alem disso, impede a exitencia de duas placas iguais */
                            while(x<Cont_O && !placaT.equals(onibus[x].getPlaca()) && !placaT.equals(caminhao[x].getPlaca())) {
                                x++;
                            }
                            
                            //Se feito para garantir que nao havera mais de um veiculo com a mesma placa
                                if(!placaT.equals(onibus[x].getPlaca()) && !placaT.equals(caminhao[x].getPlaca())){  
                                    onibus[Cont_O] = new Onibus(placaT, anoT, assentosT);
                                    /*onibus[Cont_O].setPlaca(placaT);
                                    onibus[Cont_O].setAno(anoT);
                                    onibus[Cont_O].setAssentos(assentosT); */

                                    Cont_O++;

                                    System.out.println("Veiculo cadastrado com sucesso!");

                                }
                                    else {
                                        System.out.println("O veiculo não pode ser cadastrado! \n"+
                                                           "Erro 11: Placa já cadastrada");
                                    }
                        break;

                        case 2:
                            System.out.println("Digite a placa");
                                placaT = teclado.next();

                            System.out.println("Digite o ano");
                                anoT = teclado.nextInt();

                            System.out.println("Digite o N° de eixos");
                                eixosT = teclado.nextInt();

                                x = 0;

                            while(x<Cont_C && !placaT.equals(onibus[x].getPlaca()) && !placaT.equals(caminhao[x].getPlaca())) {
                                x++;
                            }

                                if(!placaT.equals(onibus[x].getPlaca()) && !placaT.equals(caminhao[x].getPlaca())){  
                                    caminhao[Cont_C] = new Caminhao(placaT, anoT, eixosT);
                                    /*caminhao[Cont_C].setPlaca(placaT);
                                    caminhao[Cont_C].setAno(anoT);
                                    caminhao[Cont_C].setEixos(eixosT); */

                                    Cont_C++;

                                    System.out.println("Veiculo cadastrado com sucesso!");

                                }
                                    else {
                                        System.out.println("O veiculo não pode ser cadastrado! \n"+
                                                           "Erro 11: Placa já cadastrada");
                                    }
                        break;

                        default:
                            System.out.println("Valor inválido!");
                        }
                        break;
                
                case 2:
                    System.out.println("Total de Veiculos: "+ (Cont_O + Cont_C) + "\n"+
                                       "Onibus: "+ Cont_O + "\n"+
                                       "Caminhoes: "+ Cont_C);
                break;
                        
                case 3:
                    System.out.println("Ver os dados de: \n"+ 
                                       "1- Onibus \n"+ 
                                       "2- Caminhao");

                        opcao2 = teclado.nextInt();

                    switch(opcao2) {
                        case 1:
                            System.out.println("Digite a placa do veiculo");
                                placaT = teclado.next();
                            
                                x = 0;

                            while (x<Cont_O && !placaT.equals(onibus[x].getPlaca())) {
                                x++;
                            }

                            if (placaT.equals(onibus[x].getPlaca())) {
                                onibus[x].exibirDados();
                            }
                                else {
                                    System.out.println("Placa não encontrada");
                                }
                        break;

                        case 2:
                            System.out.println("Digite a placa do veiculo");
                                placaT = teclado.next();
                            
                                x = 0;

                            while (x<Cont_C && !placaT.equals(caminhao[x].getPlaca())) {
                                x++;
                            }

                            if (placaT.equals(caminhao[x].getPlaca())) {
                                caminhao[x].exibirDados();
                            }
                                else {
                                    System.out.println("Placa não encontrada");
                                }
                        break;

                        default:
                            System.out.println("Valor inválido!");
                        break;
                        
                        }
                    break;

            }
        }
            while (opcao !=4);
            
            teclado.close();
    }
}