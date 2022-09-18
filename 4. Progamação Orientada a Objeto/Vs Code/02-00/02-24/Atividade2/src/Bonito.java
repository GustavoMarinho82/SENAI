public class Bonito {
    Boolean bonito;
    public static void main(String[] args) throws Exception {
    //Variaveis
    
    Bonito gustavo[] = new Bonito[1];
    Bonito igor[] = new Bonito[1];

        gustavo[0] =  new Bonito(true);
        igor[0] =  new Bonito(false);
        
        System.out.println("Gustavo é bonito? " + gustavo[0].bonito);
        System.out.println("Igor é bonito? " + igor[0].bonito);
        
    }
    
    public Bonito(boolean bonito) {
        this.bonito = bonito;
    }
}
