package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    public ResultSet autenticacaoUsuario(UsuarioDTO usuarioDto) throws SQLException {
        
        Connection conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
        String sql = "select * from usuario where nome = ? and senha = ?";
        PreparedStatement ps = null;

        try {

            ps = conn.prepareStatement(sql);
            ps.setString(1, usuarioDto.getNome());
            ps.setString(2, usuarioDto.getSenha());

            ResultSet rs = ps.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
            return null;
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "UsuarioDAO Fechar Conexões" + e);
            }
        }
    }

    public boolean next() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
