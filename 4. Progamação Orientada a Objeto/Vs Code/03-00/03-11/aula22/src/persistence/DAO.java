package persistence;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DAO {

    private final String URL = "jdbc:mysql://localhost/aula22?useTimezone=true&serverTimezone=UTC";
    private final  String USUARIO = "root";
    private final String SENHA = "alunolab";

    public DataSource dataSource;

    public DAO() {

        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setJdbcUrl(URL);
        comboPooledDataSource.setUser(USUARIO);
        comboPooledDataSource.setPassword(SENHA);


        comboPooledDataSource.setMaxPoolSize(15);
            this.dataSource = comboPooledDataSource;
        

    }
    
    public Connection abrirConexao() throws SQLException{
        return this.dataSource.getConnection();
    }
}
]