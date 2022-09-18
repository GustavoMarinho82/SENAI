public class Pessoa {
    static final int LifeTime = 100;
    private String nome;
    private int idade;
    private float altura;

    //Esse é o construtor
    public Pessoa (String nome, int idade, float altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    
// Getter e Setters
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
    public void TempoRestante(int LifeTime, int idade){
        int Restante = LifeTime - idade;
        System.out.println("Tempos Restantes de Vida: "+ Restante);
    }
    public int RTempoRestante(int LifeTime, int idade){
        int Restante = LifeTime - idade;
        return(Restante);
    }
}
