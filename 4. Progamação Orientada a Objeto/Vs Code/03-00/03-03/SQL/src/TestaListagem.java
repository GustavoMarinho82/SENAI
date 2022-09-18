import java.sql.Connection;
   import java.sql.DriverManager; //não é necesssario com o Connection Factory
   import java.sql.ResultSet;
   import java.sql.SQLException;
   import java.sql.Statement;

//sem Connection Factory
/*public class TestaListagem{
    public static void main(String args[]) throws SQLException{
        //Conexão com o banco
        Connection con = DriverManager
        .getConnection("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC",
        "root" ,
        "alunolab");

        Statement stm = con.createStatement();//Cria um objrto stantement
        stm.execute("SELECT id, nome, descricao from produtos");//Este objetp possui um método que executa códigos SQL

        ResultSet rs = stm.getResultSet();

        while(rs.next()){
            Integer id = rs.getInt("id");

            System.out.println("id:"+ id);
            String nome = rs.getString("nome");
            System.out.println("Nome:"+ nome);
            String descricao = rs.getString(3);
            System.out.println("Descrição:"+descricao);
        }
            con.close();
    }
}   */


//com Connection Factory
public class TestaListagem{
    public static void main(String args[]) throws SQLException {
        CriaConexao criaConexao = new CriaConexao();
        Connection con = criaConexao.recuperaConexao();

        Statement stm = con.createStatement();
            stm.execute("SELECT id, nome, descricao FROM produtos");
        
        ResultSet rs = stm.getResultSet();

        while(rs.next()){
            int id = rs.getInt("id");
                System.out.println("Id: "+ id);
            
            String nome = rs.getString("nome");
                System.out.println("Nome: "+ nome);
            
             String descricao = rs.getString(3);
                System.out.println("Descricao: "+ descricao);

        }

        con.close();
    }
}