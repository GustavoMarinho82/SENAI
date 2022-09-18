import java.sql.Connection; //não é necesssario com o Connection Factory
import java.sql.PreparedStatement; //não é necesssario com o Connection Factory
import java.sql.SQLException;
import java.sql.Statement; //não é necesssario sem o Connection Factory

//sem Connection Factory
/* public class TestaInsercao {
    public static void main(String[] args) throws SQLException {

        CriaConexao criaConexao = new CriaConexao();
        Connection con = criaConexao.recuperaConexao();

        PreparedStatement pstm = con.prepareStatement("INSERT INTO produtos (nome, descricao) values (?, ?)");
            pstm.setString(1, "Celular");
            pstm.setString(2, "Celular Samsung S10");
            pstm.execute();


            con.close();
    }
} */


//com Connection Factory
public class TestaInsercao {
    public static void main(String[] args) throws SQLException {

        CriaConexao criaConexao = new CriaConexao();
        Connection con = criaConexao.recuperaConexao();

        Statement stm = con.createStatement();
            stm.execute("DELETE FROM produtos WHERE id > 2");

        int linhasModificadas = stm.getUpdateCount();
            System.out.println("Quantidade de Linhas que forma modificadas: "+ linhasModificadas);
        
        con.close();
    }
} 