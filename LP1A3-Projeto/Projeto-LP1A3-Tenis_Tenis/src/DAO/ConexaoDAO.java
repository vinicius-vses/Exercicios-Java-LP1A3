package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDAO{

    private static final String username = "sa";
    private static final String senha = "";
    private static final String url = "jdbc:h2:~/test";

    public static Connection createConnectionToH2() throws SQLException, ClassNotFoundException {
        Class.forName("org.h2.Driver");

        Connection connection = DriverManager.getConnection(url, username, senha);

        return connection;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection conn = createConnectionToH2();
        if (conn!=null){
            JOptionPane.showMessageDialog(null, "Conexao obtida com sucesso!");
            conn.close();
        }
    }
}