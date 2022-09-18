/*SITE SOBRE A HERANCA   
 *https://www.devmedia.com.br/entendendo-e-aplicando-heranca-em-java/24544 */


/*Uma CLASSE ABSTRATA nao permite que objetos sejam instanciados nela, mas sua classes-filhas podem
 *https://www.treinaweb.com.br/blog/classes-abstratas-vs-interfaces  */

/*As classes abstratas permitem que criemos METODOS ABSTRATOS. Basicamente, um método abstrato é um método 
 * especial que não possui implementação, apenas assinatura (tipo de retorno, nome e parâmetros), 
 * e obriga as classes que “herdarem” da classe abstrata à implementar estes métodos */


public abstract class Pessoa {
    //Variaveis que serao herdadas pelas classes-filhas
    String nome;
    int CPF;


    /*Construtores em classes "maes" sao feitos para que os construtores das filhas possam usar o "super"
     *Ex: super(nome, CPF)  */
    public Pessoa(String nome, int CPF){
        this.nome = nome;
        this.CPF = CPF;
    }

    public Pessoa(){

    }

}