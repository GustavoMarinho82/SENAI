package controle;

import java.util.List;

import entity.*;
import negocio.*;
import persistence.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        int um = 1;

        while (um == 1) {
            try {

                Funcionario f = new Funcionario();
                FuncionarioDao fd = new FuncionarioDao();
                FuncionarioNegocio fn = new FuncionarioNegocio();

                int opc = fn.Menu();

                switch (opc) {

                    case 1:
                        f = new Funcionario (new FuncionarioNegocio().lerId(),
                                             new FuncionarioNegocio().lerDataAdmissao(),
                                             new FuncionarioNegocio().lerSalario(),
                                             new FuncionarioNegocio().lerEspecialidade());
                        fd.create(f);
                        
                            System.out.println("Gravado com Sucesso!");

                    break;

                    case 2:
                        List<Funcionario> lf = new FuncionarioDao().findAll();

                        for(int x = 0; x <lf.size(); x++){
                            Funcionario f1 = lf.get(x);
                            System.out.println(f1);
                        }

                    break;

                    case 3:
                        f = new Funcionario (new FuncionarioNegocio().lerId(),
                                             new FuncionarioNegocio().lerDataAdmissao(),
                                             new FuncionarioNegocio().lerSalario(),
                                             new FuncionarioNegocio().lerEspecialidade());
                        fd.update(f);
                        
                            System.out.println("Atualizado com Sucesso!");
                    break;

                    case 4:
                        fd.delete(new FuncionarioNegocio().lerId());

                            System.out.println("Deletado com Sucesso");
                    break;

                    default:
                        System.out.println("Valor Inválido");
                    break;

                }

            } catch (Exception e) {
                System.out.println("ERRO \n" + e.getMessage());
            }
        }
    }
}