import java.sql.Connection;
import java.sql.DriverManager; //não é necesssario com o Connection Factory
import java.sql.SQLException;

//sem Connection Factory
/* public class TestaConexao {
    public static void main(String[] args) throws SQLException {
        
        //Conexão com o banco
        Connection con = DriverManager
        .getConnection("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC",
        "root" ,
        "alunolab");

        System.out.println("Conexão Fechada!");
        
        //Fecha Conexão
        con.close();

    }
}   */


//com Connection Factory
public class TestaConexao {
    public static void main (String[] args) throws SQLException{

        CriaConexao criaConexao = new CriaConexao();
        Connection con = criaConexao.recuperaConexao();

            System.out.println("Conexão Fechada!");

        con.close();
    }
}