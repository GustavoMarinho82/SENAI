package persistence; //Feito
import java.util.Scanner;
import java.util.*;
import entity.Aluno;

    

public class AlunoDao extends Dao {

    Scanner entrada = new Scanner (System.in);

    public void salvar(Aluno a) throws Exception{
        
        abrir();
        stmt = con.prepareStatement("Insert into Aluno values (?,?)");
        stmt.setInt(1, a.getMatricula());
        stmt.setString(2, a.getNome());
        stmt.execute();
        fechar();
    }


    public void excluirDados() throws Exception{

        abrir();
        stmt = con.prepareStatement("DELETE FROM Aluno WHERE matricula = ?");
            System.out.println("Digite a matricula");
        stmt.setString(1, entrada.next());
        stmt.execute();
        fechar();

    }
    public void atualizarDados(Aluno a) throws Exception{
        abrir();
        stmt = con.prepareStatement("UPDATE Aluno SET matricula = ?, nome = ? WHERE matricula = ? ");
        System.out.println("Digite a matricula original: ");
        stmt.setInt(3, entrada.nextInt());

        System.out.println("Digite a nova matricula: ");
        stmt.setInt(1, entrada.nextInt());
        System.out.println("Digite o novo nome: ");
        stmt.setString(2, entrada.next());
        stmt.execute();
        fechar();
    }



    public List <Aluno> listagemGeral() throws Exception{
        
        abrir();
        stmt = con.prepareStatement("Select * from Aluno order by matricula");
        rs = stmt.executeQuery();

        List <Aluno> lista = new ArrayList<Aluno>();
            while(rs.next()){
                Aluno a = new Aluno();
                a.setMatricula(rs.getInt("matricula"));
                a.setNome(rs.getString("nome"));
                lista.add(a);
            }
        fechar();
        
        return lista;

    }

}
