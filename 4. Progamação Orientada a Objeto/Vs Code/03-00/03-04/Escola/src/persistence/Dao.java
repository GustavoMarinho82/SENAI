package persistence; //Feito
 
import  java.sql.*;
 
public class Dao{
    Connection con;
    PreparedStatement stmt;
    ResultSet rs;

    private final String URL = "jdbc:mysql://localhost/Escola?useTimezone=true&serverTimezone=UTC";
    private final String USUARIO = "root";
    private final String SENHA =  "alunolab";


    protected void abrir() throws SQLException{
        con = DriverManager.getConnection(URL, USUARIO, SENHA);
    }
    
    protected void fechar() throws SQLException{
        con.close();
    }

}