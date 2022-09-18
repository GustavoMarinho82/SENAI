public abstract class Pessoa {
    final int TEMPODEVIDA = 100;
     private String nome;
     private int idade;
     private float altura;

    public String setNome;
    public float setAltura;
    public int setIdade;
    public String getAltura;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public int returneTempoVida(){
        int tempoRestante = TEMPODEVIDA - this.idade;
        return tempoRestante;
    }
     public Pessoa(String nome, int idade, float altura){
         this.nome =  nome;
         this.idade = idade;
         this.altura = altura;
     }
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
     public Pessoa(){

     }

     
}