package DAO;

import DTO.FormCadastroDTO;
import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FormCadastroDAO {

    Connection conn;
    PreparedStatement ps;

    public FormCadastroDAO() {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormCadastroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
      public boolean verifica(UsuarioDTO model) throws SQLException, Exception {

        Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");

        String sql = "Select * FROM usuario WHERE nome ='" + model.getNome() + "' AND senha ='" + model.getSenha() + "'";

        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                return true;
            }

            connection.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ena verificacao!" + erro);
        }
        return false;
    }

    public boolean cadastrarUsuario(FormCadastroDTO formCadastroDto) throws SQLException {

        conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");       

        String sql = "insert into usuario (nome, senha) values (?,?)";
        
                /*"insert into usuario" + "values ('" + formCadastroDto.getNome() + "' , '"
                + formCadastroDto.getSenha() + "')";*/

        try {
            Statement st = conn.createStatement();
            int x = st.executeUpdate(sql);
            conn.close();
            if (x > 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro em FormCadastroDAO" + erro);
        }
        return false;
    }
}
