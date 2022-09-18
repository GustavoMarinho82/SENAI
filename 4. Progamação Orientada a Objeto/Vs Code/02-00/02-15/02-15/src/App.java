public class App {
    public static void main(String[] args){
        Pessoa pessoa = new  Pessoa(" Igor", 16, 174);
        Pessoa Igor = new Pessoa(" Igor", 16, 174);
        Pessoa Gustavo = new Pessoa(" Gustavo", 15, 170);

        pessoa.setNome = ("Igor");
        pessoa. setIdade = (16);
        pessoa.setAltura = (1.74f);

        System.out.println("Nome "+ pessoa.getNome());
        System.out.println("Idade "+ pessoa.getNome());
        System.out.println("Altura "+ pessoa.getAltura());
        System.out.println("O tempo de vida de Pessoa é:"+ pessoa.TEMPODEVIDA);
        System.out.println("O tempo de vida de Pessoa é:"+ Igor.TEMPODEVIDA) ;
        System.out.println("O tempo de vida de Pessoa é:"+ Gustavo.TEMPODEVIDA);

        int tempodeVida= pessoa.returneTempoVida(); 
        System.out.println("O tempo de vida é "+ tempodeVida);


    }
}
    
  
