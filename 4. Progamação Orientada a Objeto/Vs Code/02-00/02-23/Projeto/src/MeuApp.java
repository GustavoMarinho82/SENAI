import java.util.ArrayList;
public class MeuApp {
    
   public void calcularSalarioDeFuncionario(Funcionario funcionario){
       if (funcionario instanceof Gerente){
        
       }else if (funcionario instanceof Coordenador){

       }else if (funcionario instanceof Operador){

       }
       
   }

    public static void main(String[] args){
        DAO FuncionarioDAO = new FuncionarioDAO();

        if(FuncionarioDAO instanceof DAO){
        FuncionarioDAO.salvar(FuncionarioDAO);
        }

        else{
            System.out.println("A classe FuncionarioDAO não implementa BasicoDAO, nenhum procedimento foi realizado");
            
        }

    }
}
