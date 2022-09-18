import java.sql.Connection;
import java.sql.SQLException;

import persistence.DAO;

public class TesteConexao {
 
    
    public static void main(String[]args )throws SQLException{

        DAO dao = new DAO();
        Connection connection = dao.abrirConexao();

        System.out.println("\nFechando conexão:)");

        connection.close();

        
    }

}