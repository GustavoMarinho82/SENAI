package persistence;
import java.util.Scanner;
import java.util.*;
import entity.Turma;

    

public class TurmaDao extends Dao {

    Scanner entrada = new Scanner (System.in);

    public void salvar(Turma t) throws Exception{
        
        abrir();
        stmt = con.prepareStatement("Insert into Turma values (?,?,?)");
        stmt.setInt(1 , t.getCodigoT());
        stmt.setString(2, t.getSala());
        stmt.setString(3, t.getHorario());
        stmt.execute();
        fechar();
    }


    public void excluirDados() throws Exception{

        abrir();
        stmt = con.prepareStatement("DELETE FROM Turma WHERE codigoT = ?");
            System.out.println("Digite o codigo");
        stmt.setInt(1, entrada.nextInt());
        stmt.execute();
        fechar();

    }
    public void atualizarDados(Turma t) throws Exception{
        abrir();
        stmt = con.prepareStatement("UPDATE Turma SET sala = ?, horario = ? WHERE codigoT = ? ");
        System.out.println("Digite o codigo : ");
        stmt.setInt(3, entrada.nextInt());

        System.out.println("Digite a nova sala: ");
        stmt.setString(1, entrada.next());
        System.out.println("Digite o novo horario: ");
        stmt.setString(2, entrada.next());
        stmt.execute();
        fechar();
    }

    public List <Turma> listagemGeral() throws Exception{
        
        abrir();
        stmt = con.prepareStatement("Select * from Turma order by codigoT");
        rs = stmt.executeQuery();

        List <Turma> lista = new ArrayList<Turma>();
            while(rs.next()){
                Turma t = new Turma();
                t.setCodigoT(rs.getInt("codigoT"));
                t.setSala(rs.getString("sala"));
                t.setHorario(rs.getString("horario"));
                lista.add(t);
            }
        fechar();
        
        return lista;

    }

}
