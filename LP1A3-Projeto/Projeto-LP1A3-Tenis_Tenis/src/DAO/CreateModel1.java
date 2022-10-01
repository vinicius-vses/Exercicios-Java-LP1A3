package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateModel1 {

    public void criaModel() throws Exception {
        Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
        String query = "CREATE DATABASE tenisetenis; "
                + "USE tenisetenis; "
                + "CREATE TABLE usuario( "
                + " nome varchar (30),"
                + " senha varchar (30)"
                + "    );"
                + "CREATE TABLE calcado("
                + " id int not null AUTO_INCREMENT PRIMARY KEY,"
                + " marca varchar (30),"
                + " modelo varchar (30)"
                + "    );";
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(query);
        connection.close();
    }

    public static void main(String args[]) {
        CreateModel1 cm = new CreateModel1();
        try {
            cm.criaModel();
        } catch (Exception ex) {
            Logger.getLogger(CreateModel1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
