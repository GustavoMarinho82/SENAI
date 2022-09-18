package persistence;

import java.util.ArrayList;
import java.util.List;

import entity.Funcionario;


public class FuncionarioDao extends Dao{

    public void create(Funcionario f) throws Exception{
        open();

        String sql = "INSERT INTO funcionario VALUES(?,?,?,?)";

        stmt = con.prepareStatement(sql);
            stmt.setInt(1, f.getId());
            stmt.setString(2, f.getDataAdmissao());
            stmt.setDouble(3, f.getSalario());
            stmt.setString(4, f.getEspecialidade());
        
                stmt.execute();
            stmt.close();

        close();
    }

    
    public List<Funcionario> findAll() throws Exception{
        open();

        List<Funcionario> lista = new ArrayList<Funcionario>();
        String sql = "SELECT * FROM funcionario ORDER BY id";
        
        stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

        while(rs.next()){
            Funcionario f = new Funcionario(
                rs.getInt("id"),
                rs.getString("dataAdmissao"),
                rs.getDouble("salario"),
                rs.getString("especialidade")
            );
            lista.add(f);
        }

        close();
            return lista;
        }

        
    public void update(Funcionario f) throws Exception{
        open();

        String sql = "UPDATE funcionario SET dataAdmissao = ?, salario = ?, especialidade = ? WHERE id = ?";

        stmt = con.prepareStatement(sql);
            stmt.setInt(4, f.getId());
            stmt.setString(1, f.getDataAdmissao());
            stmt.setDouble(2, f.getSalario());
            stmt.setString(3, f.getEspecialidade());
                stmt.execute();
            stmt.close();

        close();
    }


    public void delete(int id_F) throws Exception{
        open();

        String sql = "DELETE FROM funcionario WHERE id = ?";

        stmt = con.prepareStatement(sql);
            stmt.setInt(1, id_F);
                stmt.execute();
            stmt.close();
            
        close();
    }
}