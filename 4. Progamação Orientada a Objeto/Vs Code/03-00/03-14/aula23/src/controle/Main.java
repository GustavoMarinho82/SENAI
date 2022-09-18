package controle;

import java.util.List;
import entity.Pessoa;
import negocio.PessoaNegocio;
import persistence.PessoaDao;

public class Main {
    public static void main(String[] args) {

        try {
            PessoaDao pd = new PessoaDao();
            Pessoa p = new Pessoa();

            pd.criarTabelaPessoa();
                int opc = new PessoaNegocio().menu();

            switch (opc) {
                case 1:
                    p = new Pessoa(new PessoaNegocio().lerIdPessoa(),
                            new PessoaNegocio().lerNome(),
                            new PessoaNegocio().lerEmail());
                    pd.create(p);
                    
                        System.out.println("Gravado com sucesso!");
                break;
                    
                case 2:
                    List<Pessoa> lp = new PessoaDao().findAll();
                        for (int i = 0; i < lp.size(); i++) {
                            Pessoa p1 = lp.get(i);
                            System.out.println(p1);
                        }

                break;

                case 3:
                    p = new Pessoa(new PessoaNegocio().lerIdPessoa(),
                            new PessoaNegocio().lerNome(),
                            new PessoaNegocio().lerEmail());
                    pd.update(p);

                        System.out.println("Atualização realizada com Sucesso!");
                break;

                case 4:
                    pd.delete(new PessoaNegocio().lerIdPessoa());

                        System.out.println("Exclusão realizada com Sucesso");
                break;

                default:
                    System.out.println("Valor Inválido!");
                break;

            }
            
        } catch (Exception e) {
            System.out.println("Erro : " + e.getMessage());
        }

    }
}