package persistence;

import java.util.ArrayList;
import java.util.List;
import entity.Pessoa;

public class PessoaDao extends Dao {

    public void criarTabelaPessoa()throws Exception{
        open();
        
        String tabela ="CREATE TABLE IF NOT EXISTS pessoa(idpessoa int primary key,"
                        +"nome varchar(35),"
                        +"email varchar(50))";

        stmt = con.prepareStatement(tabela);
            stmt.execute();
            stmt.close();
        close();
    }

    public void create(Pessoa p)throws Exception{
        open();

        String sql = "insert into pessoa values (?,?,?)";

        stmt = con.prepareStatement(sql);
            stmt.setInt(1, p.getIdpessoa());
            stmt.setString(2, p.getNome());
            stmt.setString(3, p.getEmail());
            stmt.execute();
            stmt.close();
        close();
    }

    public List<Pessoa> findAll()throws Exception{
        open();

        List<Pessoa> lista1 = new ArrayList<Pessoa>();

        String sql = "select * from pessoa order by nome";
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();


        while(rs.next()){
            Pessoa p = new Pessoa(
            rs.getInt("idpessoa"),
            rs.getString("nome"),
            rs.getString("email"));
            lista1.add(p);       
        }

       close();
       return lista1;
    }

    public void update(Pessoa p)throws Exception{
        open();

        String sql = "update pessoa set nome = ?, email = ? where idpessoa = ?";
       
        stmt = con.prepareStatement(sql);
            stmt.setString(1,p.getNome() );
            stmt.setString(2,p.getEmail() );
            stmt.setInt(3,p.getIdpessoa() );
            stmt.execute();
            stmt.close();
        
        close();
    }

    public void delete(int idpessoa)throws Exception{
        open();

        String sql = "DELETE FROM pessoa where  idpessoa = ?";

        stmt = con.prepareStatement(sql);
            stmt.setInt(1, idpessoa);
            stmt.execute();
            stmt.close();
        close();
    }

}