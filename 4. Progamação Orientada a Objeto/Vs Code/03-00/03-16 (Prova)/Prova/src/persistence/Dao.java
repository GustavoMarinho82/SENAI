package persistence;

import java.sql.*;

public class Dao {
    
    Connection con;
    PreparedStatement stmt;
    ResultSet rs;

    private final String URL = "jdbc:mysql://localhost/Prova?useTimezone=true&serverTimezone=UTC";
    private final String USUARIO = "root";
    private final String SENHA = "alunolab";


    protected void open() throws SQLException {
        con = DriverManager.getConnection(URL, USUARIO, SENHA);
    }

    protected void close() throws SQLException {
        con.close();
    }
}
