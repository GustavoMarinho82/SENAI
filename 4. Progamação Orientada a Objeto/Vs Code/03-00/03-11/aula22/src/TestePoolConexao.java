import java.sql.SQLException;

import persistence.DAO;

public class TestePoolConexao {
    
     public static void main(String[] args)throws SQLException{

        DAO dao = new DAO();

        for(int i =0;i <20;i++){
            dao.abrirConexao();
            System.out.println("Conexão de Número: " + (i+1));
        }
     }
}