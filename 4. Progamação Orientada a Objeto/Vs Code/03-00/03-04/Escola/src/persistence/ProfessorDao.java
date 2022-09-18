package persistence; //Feito
import java.util.Scanner;
import java.util.*;
import entity.Professor;

    

public class ProfessorDao extends Dao {

    Scanner entrada = new Scanner (System.in);

    public void salvar(Professor p) throws Exception{
        
        abrir();
        stmt = con.prepareStatement("Insert into Professor values (?,?,?)");
        stmt.setInt(1 , p.getCodigoP());
        stmt.setString(2, p.getNome());
        stmt.setString(3, p.getTitulacao());
        stmt.execute();
        fechar();
    }


    public void excluirDados() throws Exception{

        abrir();
        stmt = con.prepareStatement("DELETE FROM Professor WHERE codigoP = ?");
            System.out.println("Digite o codigo");
        stmt.setInt(1, entrada.nextInt());
        stmt.execute();
        fechar();

    }
    public void atualizarDados(Professor p) throws Exception{
        abrir();
        stmt = con.prepareStatement("UPDATE Professor SET nome = ?, titulação = ? WHERE codigoP = ? ");
        System.out.println("Digite o codigo : ");
        stmt.setInt(3, entrada.nextInt());

        System.out.println("Digite o novo nome: ");
        stmt.setString(1, entrada.next());
        System.out.println("Digite a nova titulacao: ");
        stmt.setString(2, entrada.next());
        stmt.execute();
        fechar();
    }

    public List <Professor> listagemGeral() throws Exception{
        
        abrir();
        stmt = con.prepareStatement("Select * from Professor order by codigoP");
        rs = stmt.executeQuery();

        List <Professor> lista = new ArrayList<Professor>();
            while(rs.next()){
                Professor a = new Professor();
                a.setCodigoP(rs.getInt("codigoP"));
                a.setNome(rs.getString("nome"));
                a.setTitulacao(rs.getString("titulação"));
                lista.add(a);
            }
        fechar();
        
        return lista;

    }

}
