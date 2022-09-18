public class Ator {
    static final int TEMPODEVIDA = 100;
    private String nome;
    private int idade;
    private float altura;
    private String escolaAtor;
    
    public class Ator extends Pessoa {
        private String escolaAtor;
        private List<String> filme;
       public Ator(String nome, int idade, float altura, String escolaAtor){

           super(nome, idade, altura);
           this.escolaAtor = escolaAtor;
           
       }
    }

    @Override
    public String toString() {
        return "Ator [altura=" + altura + ", escolaAtor=" + escolaAtor + ", idade=" + idade + ", nome=" + nome + "]";
    }

    
    
}
