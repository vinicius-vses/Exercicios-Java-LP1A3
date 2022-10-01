package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO{

    private static final String username = "sa";
    private static final String senha = "";
    private static final String url = "jdbc:h2:~/test";

    public static Connection createConnectionToMySQL() throws SQLException, ClassNotFoundException {
        Class.forName("org.h2.Driver");

        Connection connection = DriverManager.getConnection(url, username, senha);

        return connection;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection conn = createConnectionToMySQL();
        if (conn!=null){
            System.out.println("Conexao obtida com sucesso!");
            conn.close();
        }
    }
}

/*
public class ConexaoDAO {

    public void getConnection() throws SQLException {

        Connection conn;
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tenisetenis", "root", "Vini$0920");

        String sql = "CREATE TABLE usuario (id int not null AUTO_INCREMENT PRIMARY KEY,\n"
                + "    nome varchar (30),\n"
                + "    senha varchar (30))";
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        conn.close();
    }

        public static void main (String args[])
    {
        ConexaoDAO conn = new ConexaoDAO();
        try {
            conn.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void close() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

//return conn;*/
        /*try {
            String url = "jdbc:mysql://localhost:3306/tenisetenis?user=root&password=Vini$0920";
            conn = DriverManager.getConnection(url);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na conexao com o Banco de Dados! " + e.getMessage());
        }
        return conn;*/

/*public class ConexaoDAO {

    static String driverJDBC = "com.microsoft.jdbc.sqlserver.SQLServerDriver";
    static String url = "jdbc:microsoft:sqlserver://localhost:1433/DESKTOP-KUBLHQT";
    static String user = "sa";
    static String senha = "123";

    public static void main(String[] args) throws SQLException {

        Connection conexao = null;
        Connection conn = conexao;
        Statement st = null;

        String instrucaoSQL = "CREATE TABLE usuario ("
                + "IdUsuario int, nome varchar (50),"
                + "senha varchar (50))";

        try {
            JOptionPane.showMessageDialog(null, "Carregando o Driver JDBC...");
            Class.forName(driverJDBC);
            conexao = DriverManager.getConnection(url, user, user);

            JOptionPane.showMessageDialog(null, "Criando tabela...");
            st = conexao.createStatement();
            st.executeUpdate(instrucaoSQL);
            JOptionPane.showMessageDialog(null, "Tabela criada com sucesso!");
            st.close();
            conexao.close();

        } catch (HeadlessException | ClassNotFoundException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage() + "Falha no carregamento do Driver! ");
        }

        try {
            JOptionPane.showMessageDialog(null, "Conectando ao banco...");
            Connection conn = DriverManager.getConnection(url, user, senha);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na conexao com o Banco de Dados! " + erro.getMessage());
        }
    }
}*/
