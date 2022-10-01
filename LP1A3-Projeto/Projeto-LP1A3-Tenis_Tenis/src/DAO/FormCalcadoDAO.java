package DAO;

import DTO.FormCalcadoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FormCalcadoDAO {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<FormCalcadoDTO> lista = new ArrayList<>();

    public void addCalcado(FormCalcadoDTO formCalcadoDto) throws SQLException {
        String sql = "insert into calcado (marca, modelo) values (?,?)";

        conn = (Connection) new ConexaoDAO();

        try {

            ps = (PreparedStatement) conn.prepareStatement(sql);
            ps.setString(1, formCalcadoDto.getMarca());
            ps.setString(2, formCalcadoDto.getModelo());

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "FormCalcadoDAO" + e);
        }
    }

    public ArrayList<FormCalcadoDTO> listarCalcados() {
        String sql = "select * from calcado";
        conn = (Connection) new ConexaoDAO();

        try {
            ps = (PreparedStatement) conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                FormCalcadoDTO formCalcadoDto = new FormCalcadoDTO();
                formCalcadoDto.setId(rs.getInt("id"));
                formCalcadoDto.setMarca(rs.getString("marca"));
                formCalcadoDto.setMarca(rs.getString("modelo"));

                lista.add(formCalcadoDto);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "FormCalcadoDAO Pesquisar" + e);
        }
        return lista;
    }

    public void alterarCalcado(FormCalcadoDTO formCalcadoDto) throws SQLException {
        String sql = "update calcado set marca = ?, modelo = ? where id = ?";
        conn = (Connection) new ConexaoDAO();

        try {

            ps = (PreparedStatement) conn.prepareStatement(sql);
            ps.setString(1, formCalcadoDto.getMarca());
            ps.setString(2, formCalcadoDto.getModelo());
            ps.setInt(3, formCalcadoDto.getId());

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "FormCalcadoDAO Alterar" + e);
        }
    }
    
    public void excluirCalcado(FormCalcadoDTO formCalcadoDto) throws SQLException {
        String sql = "delete from calcado where id = ?";
        conn = (Connection) new ConexaoDAO();

        try {

            ps = (PreparedStatement) conn.prepareStatement(sql);
           
            ps.setInt(1, formCalcadoDto.getId());

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "FormCalcadoDAO Excluir" + e);
        }
    }
}
