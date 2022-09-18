public class App {
    public static void main(String[] args) throws Exception {
    /*Sem Construtor    
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Antonio");
        pessoa.setIdade(59);
        pessoa.setAltura(1.47f);
        

    */ 
    //Com Construtor

        Pessoa pessoa = new Pessoa("Antonio", 59, 1.44f);

        System.out.println("Nome: "+ pessoa.getNome()+ "\n"+
                           "Idade: "+ pessoa.getIdade()+ "\n"+
                           "Altura: "+ pessoa.getAltura());
   
                           
    Pessoa Eliezer = new Pessoa("Eliezer", 62, 1.68f);
    Pessoa Miguel = new Pessoa("Miguel", 41, 1.93f);

    System.out.println("Tempo de Vida de pessoa "+ pessoa.LifeTime);
    System.out.println("Tempo de Vida de Eleizer "+ Eliezer.LifeTime);
    System.out.println("Tempo de Vida de Mig "+ Miguel.LifeTime);

    pessoa.TempoRestante(pessoa.LifeTime, pessoa.getIdade());
    System.out.println(pessoa.RTempoRestante(pessoa.LifeTime, pessoa.getIdade()));
    }
}
