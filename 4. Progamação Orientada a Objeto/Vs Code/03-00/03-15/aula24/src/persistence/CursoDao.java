package persistence;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import entity.Curso;


public class CursoDao extends Dao{
    
    public void createTableCurso() throws SQLException{
        open();

        String TABELA = "CREATE TABLE curso (idcurso int(5), nomeC varchar(30))";

        stmt = con.prepareStatement(TABELA);
            stmt.execute();
            stmt.close();

        close();
    }

    public void create(Curso c) throws Exception{
        open();

        String sql = "INSERT INTO curso VALUES(?,?)";

        stmt = con.prepareStatement(sql);
            stmt.setInt(1, c.getIdcurso());
            stmt.setString(2, c.getNomeC());
                stmt.execute();
            stmt.close();

        close();
    }

    
    public List<Curso> findAll() throws Exception{
        open();

        List<Curso> lista = new ArrayList<Curso>();
        String sql = "SELECT * FROM curso ORDER BY idcurso";
        
        stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

        while(rs.next()){
            Curso c = new Curso(
                rs.getInt("idcurso"),
                rs.getString("nomeC")
            );
            lista.add(c);
        }

        close();
            return lista;
        }

        
    public void update(Curso c) throws Exception{
        open();

        String sql = "UPDATE curso SET nomeC = ? WHERE idcurso = ?";

        stmt = con.prepareStatement(sql);
            stmt.setInt(2, c.getIdcurso());
            stmt.setString(1, c.getNomeC());
                stmt.execute();
            stmt.close();

        close();
    }


    public void delete(Curso c) throws Exception{
        open();

        String sql = "DELETE FROM curso WHERE idcurso = ?";

        stmt = con.prepareStatement(sql);
            stmt.setInt(1, c.getIdcurso());
                stmt.execute();
            stmt.close();
            
        close();
    }
}