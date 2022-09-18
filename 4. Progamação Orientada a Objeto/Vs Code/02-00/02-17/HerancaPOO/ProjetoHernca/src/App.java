

public class App {
    public static void main(String[] args) throws Exception {
        String nome = "Eduarda";
        String endereco = "Rua x";
        String cpf = "1215511";

        Fisica pessoaFisica = new Fisica(nome, endereco, cpf);

        System.out.println(pessoaFisica.toString());
       
    }
}
