import java.util.Scanner;
public class Atividade02 {
    public static void main(String[] args){
    
    //   final int Tamanho = 40; 
    brinquedo brinquedos[] = new brinquedo[40];
    int opcao;
    int Cont = 0;
    int Cod_temporario;
    int x;
    Double Lucro;
    Double Perc_l;
    int existe;

    Scanner entrada = new Scanner(System.in);

    do{
        System.out.println("Escolha opção desejada:" + "\n"+ 
                            "1 - Cadastrar o brinquedo" + "\n"+
                            "2 - Mostrar lucro" + "\n"+
                            "3 - Mostrar produtos com estoque abaixo do estoque minimo" + "\n"+
                            "4 - Finalizar");
        opcao = entrada.nextInt();
    
        switch(opcao){
            case 1:
                if (Cont == 40){
                    System.out.println("Já foram cadastrados 40 brinquedos!");
                }

                else{
                    System.out.println("Digite o codigo do brinquedo");
                    Cod_temporario = entrada.nextInt();
                
                    x=0;
                    while ((x < Cont) && (brinquedos[x].cod != Cod_temporario))
                    x++;
                    
                    
                    if (x < Cont)
                        System.out.println("Produto já cadastrado!");
                    
                    else {
                        entrada = new Scanner(System.in);

                        brinquedos[x] = new brinquedo();
                        brinquedos[x].cod = Cod_temporario;

                        System.out.println("Digite a quantidade em estoque");
                        brinquedos[x].Qtd_est = entrada.nextInt();

                        System.out.println("Digite o estoque minimo");
                        brinquedos[x].Est_min = entrada.nextInt();

                        System.out.println("Digite o preco de compra");
                        brinquedos[x].Preco_compra = entrada.nextDouble();

                        System.out.println("Digite o preco de venda");
                        brinquedos[x].Preco_venda = entrada.nextDouble();

                        System.out.println("Digite uma descricao");
                        brinquedos[x].Descricao = entrada.next();

                        Cont++;
                        System.out.println("Produto cadastrado com sucesso \n");
                    
                }

            }
                break;

            case 2:
                System.out.println("Digite o codigo do brinquedo");
                Cod_temporario = entrada.nextInt();
                        
                x=0;
                while ((x < Cont) && (brinquedos[x].cod != Cod_temporario))
                x++;

                Lucro = brinquedos[x].Preco_venda - brinquedos[x].Preco_compra;                
                Perc_l = (Lucro/brinquedos[x].Preco_compra)*100;

                System.out.println("Preco de Compra: R$"+ brinquedos[x].Preco_compra + "\n" +
                                   "Preco de Venda: R$"+ brinquedos[x].Preco_venda + "\n" +
                                   "Lucro: R$"+ Lucro + "\n" +
                                   "Percentual de Lucro: "+ Perc_l+ "%"+ "\n");

                break;
            
            case 3:
            
            existe = 0;

            for(x=0; x<Cont; x++){
                if (brinquedos[x].Qtd_est < brinquedos[x].Est_min)
                System.out.println("Codigo do produto: "+ brinquedos[x].cod +
                                   "Estoque: "+ brinquedos[x].Qtd_est +
                                   "Estoque minimo: "+ brinquedos[x].Est_min);
            }

            if ( existe == 0 ){
                System.out.println("Nenhum produto com estoque abaixo do minimo");
            }
        }
        //entrada.close();
    } while (opcao !=4);
    }

    ////brinquedos[i].cod
    public static class brinquedo{
        int cod;
        int Qtd_est;
        int Est_min;
        double Preco_compra;
        double Preco_venda;
        String Descricao;

    }
}