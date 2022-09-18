package persistence;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import entity.Aluno;


public class AlunoDao extends Dao{
    
    public void createTableAluno() throws SQLException{
        open();

        String TABELA = "CREATE TABLE aluno (matricula integer(7), nomeA varchar(30), email varchar(50), idade integer(3), sexo char(1))";

        stmt = con.prepareStatement(TABELA);
            stmt.execute();
            stmt.close();

        close();
    }

    public void create(Aluno a) throws Exception{
        open();

        String sql = "INSERT INTO aluno VALUES(?,?,?,?,?)";

        stmt = con.prepareStatement(sql);
            stmt.setInt(1, a.getMatricula());
            stmt.setString(2, a.getNomeA());
            stmt.setString(3, a.getEmail());
            stmt.setInt(4, a.getIdade());
            stmt.setString(5, a.getSexo());
                stmt.execute();
            stmt.close();

        close();
    }

    
    public List<Aluno> findAll() throws Exception{
        open();

        List<Aluno> lista = new ArrayList<Aluno>();
        String sql = "SELECT * FROM aluno ORDER BY matricula";
        
        stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

        while(rs.next()){
            Aluno a = new Aluno(
                rs.getInt("matricula"),
                rs.getString("nomeA"),
                rs.getString("email"),
                rs.getInt("idade"),
                rs.getString("sexo")
            );
            lista.add(a);
        }

        close();
            return lista;
        }

        
    public void update(Aluno a) throws Exception{
        open();

        String sql = "UPDATE aluno SET nomeA = ?, email = ?, idade = ?, sexo = ? WHERE matricula = ?";

        stmt = con.prepareStatement(sql);
            stmt.setInt(5, a.getMatricula());
            stmt.setString(1, a.getNomeA());
            stmt.setString(2, a.getEmail());
            stmt.setInt(3, a.getIdade());
            stmt.setString(4, a.getSexo());
                stmt.execute();
            stmt.close();

        close();
    }


    public void delete(Aluno a) throws Exception{
        open();

        String sql = "DELETE FROM aluno WHERE matricula = ?";

        stmt = con.prepareStatement(sql);
            stmt.setInt(1, a.getMatricula());
                stmt.execute();
            stmt.close();
            
        close();
    }
}