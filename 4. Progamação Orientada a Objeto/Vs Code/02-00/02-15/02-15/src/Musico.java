public class Musico {
    static final int TEMPODEVIDA = 100;
    private String nome;
    private int idade;
    private float altura;
    private String escolaMusico;
  
    public class Musico extends Pessoa {
        private String escolaMusico;
        private List<String> filme;
       public Musico(String nome, int idade, float altura, String escolaMusico){

           super(nome, idade, altura);
           this.escolaMusico = escolaMusico;
           
       }
    }

    @Override
    public String toString() {
        return "Ator [altura=" + altura + ", escolaMusica=" + escolaMusico + ", idade=" + idade + ", nome=" + nome + "]";
    }

    
    
}

