package VIEW;

import DTO.FormCalcadoDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormCalcado extends javax.swing.JFrame {

    ArrayList<FormCalcadoDTO> list = new ArrayList<>();
    FormCalcadoDTO formCalcadoDto;

    public FormCalcado() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCalcado = new javax.swing.JTable();
        btnPesquisar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnCarregarCampos = new javax.swing.JButton();
        btnLimparCampos = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Marca");

        jLabel1.setText("Nome do Modelo");

        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });

        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });

        btnAdd.setText("Adicionar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        tabelaCalcado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "MARCA", "MODELO"
            }
        ));
        jScrollPane1.setViewportView(tabelaCalcado);

        btnPesquisar.setText("Listar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jLabel3.setText("ID");

        txtId.setEnabled(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        btnCarregarCampos.setText("Carregar Campos");
        btnCarregarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarCamposActionPerformed(evt);
            }
        });

        btnLimparCampos.setText("Limpar Campos");
        btnLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnLimparCampos)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCarregarCampos))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnAdd)
                            .addGap(63, 63, 63)))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnAlterar)
                        .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtModelo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnExcluir)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                            .addComponent(btnPesquisar)))
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnAlterar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisar)
                    .addComponent(btnExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCarregarCampos)
                    .addComponent(btnLimparCampos))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            addCalcado(formCalcadoDto);
        } catch (SQLException ex) {
            Logger.getLogger(FormCalcado.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            listarCalcado();
        } catch (SQLException ex) {
            Logger.getLogger(FormCalcado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) tabelaCalcado.getModel();
            model.setNumRows(0);

            ArrayList<FormCalcadoDTO> list = listarCalcado();

            for (int num = 0; num < list.size(); num++) {
                model.addRow(new Object[]{
                    list.get(num).getId(),
                    list.get(num).getMarca(),
                    list.get(num).getModelo(),});
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormCalcado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnCarregarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarCamposActionPerformed
        carregarCampos();
    }//GEN-LAST:event_btnCarregarCamposActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparCamposActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try {
            alterarCalcado(formCalcadoDto);
        } catch (SQLException ex) {
            Logger.getLogger(FormCalcado.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            DefaultTableModel model = (DefaultTableModel) tabelaCalcado.getModel();
            model.setNumRows(0);

            ArrayList<FormCalcadoDTO> list = listarCalcado();

            for (int num = 0; num < list.size(); num++) {
                model.addRow(new Object[]{
                    list.get(num).getId(),
                    list.get(num).getMarca(),
                    list.get(num).getModelo(),});
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormCalcado.class.getName()).log(Level.SEVERE, null, ex);
        }
        limparCampos();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            excluirCalcado(formCalcadoDto);
        } catch (SQLException ex) {
            Logger.getLogger(FormCalcado.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            DefaultTableModel model = (DefaultTableModel) tabelaCalcado.getModel();
            model.setNumRows(0);

            ArrayList<FormCalcadoDTO> list = listarCalcado();

            for (int num = 0; num < list.size(); num++) {
                model.addRow(new Object[]{
                    list.get(num).getId(),
                    list.get(num).getMarca(),
                    list.get(num).getModelo(),});
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormCalcado.class.getName()).log(Level.SEVERE, null, ex);
        }
        limparCampos();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed

    }//GEN-LAST:event_txtModeloActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormCalcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCalcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCalcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCalcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCalcado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCarregarCampos;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaCalcado;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    // End of variables declaration//GEN-END:variables

    public void carregarCampos() {
        int setar = tabelaCalcado.getSelectedRow();

        txtId.setText(tabelaCalcado.getModel().getValueAt(setar, 0).toString());
        txtMarca.setText(tabelaCalcado.getModel().getValueAt(setar, 1).toString());
        txtModelo.setText(tabelaCalcado.getModel().getValueAt(setar, 2).toString());
    }

    public void limparCampos() {

        txtId.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtMarca.requestFocus();
    }

    public void addCalcado(FormCalcadoDTO formCalcadoDto) throws SQLException {
        String query = "insert into calcado (marca, modelo) values (?,?)";

        Connection conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
        PreparedStatement ps = null;

        try {

            ps = (PreparedStatement) conn.prepareStatement(query);
            ps.setString(1, formCalcadoDto.getMarca());
            ps.setString(2, formCalcadoDto.getModelo());

            ps.execute(query);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "addCalcado" + e);
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "addCalcado Fechar Conexões" + e);
            }
        }
    }

    public ArrayList<FormCalcadoDTO> listarCalcado() throws SQLException {
        String query = "select * from calcado";

        Connection conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = (PreparedStatement) conn.prepareStatement(query);
            rs = ps.executeQuery(query);

            while (rs.next()) {

                FormCalcadoDTO formCalcadoDto = new FormCalcadoDTO();

                formCalcadoDto.setId(rs.getInt("id"));
                formCalcadoDto.setMarca(rs.getString("marca"));
                formCalcadoDto.setMarca(rs.getString("modelo"));

                list.add(formCalcadoDto);
            }
            ps.execute(query);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "listarCalcado Pesquisar Fechar Conexões" + e);
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
            return list;
        }
    }

    public void alterarCalcado(FormCalcadoDTO formCalcadoDto) throws SQLException {
        String query = "update calcado set marca = ?, modelo = ? where id = ?";

        Connection conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
        PreparedStatement ps = null;

        try {

            ps = (PreparedStatement) conn.prepareStatement(query);
            ps.setString(1, formCalcadoDto.getMarca());
            ps.setString(2, formCalcadoDto.getModelo());
            ps.setInt(3, formCalcadoDto.getId());

            ps.execute(query);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "alterarCalcado" + e);
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "alterarCalcado Fechar Conexões" + e);
            }
        }
    }

    public void excluirCalcado(FormCalcadoDTO formCalcadoDto) throws SQLException {
        String query = "delete from calcado where id = ?";
        PreparedStatement ps = null;

        Connection conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");

        try {

            ps = (PreparedStatement) conn.prepareStatement(query);

            ps.setInt(1, formCalcadoDto.getId());

            ps.execute(query);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "excluirCalcado Excluir" + e);
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "excluirCalcado Fechar Conexões" + e);
            }
        }
    }
}

/*private void cadastrarCalcado() throws SQLException {
        String marca, modelo;

        marca = txtMarca.getText();
        modelo = txtModelo.getText();

        FormCalcadoDTO formcalcado = new FormCalcadoDTO();
        formcalcado.setMarca(marca);
        formcalcado.setModelo(modelo);

        FormCalcadoDAO formCalcadoDao = new FormCalcadoDAO();
        formCalcadoDao.addCalcado(formcalcado);
    }

    private void listarCalcados() {
        try {
            FormCalcadoDAO formCalcadoDao = new FormCalcadoDAO();

            DefaultTableModel model = (DefaultTableModel) tabelaCalcado.getModel();
            model.setNumRows(0);

            ArrayList<FormCalcadoDTO> lista = formCalcadoDao.PesquisaCalcado();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getId(),
                    lista.get(num).getMarca(),
                    lista.get(num).getModelo(),});
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar Calcados na View: " + erro);
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
    }*/

 /*private void alterarCalcado() throws SQLException {

        int id;
        String marca, modelo;

        id = Integer.parseInt(txtId.getText());
        marca = txtMarca.getText();
        modelo = txtModelo.getText();

        FormCalcadoDTO formCalcadoDto = new FormCalcadoDTO();
        formCalcadoDto.setId(id);
        formCalcadoDto.setMarca(marca);
        formCalcadoDto.setModelo(modelo);

        FormCalcadoDAO formCalcadoDao = new FormCalcadoDAO();
        formCalcadoDao.alterarCalcado(formCalcadoDto);
    }

    private void excluirCalcado() throws SQLException {
        int id;

        id = Integer.parseInt(txtId.getText());

        FormCalcadoDTO formCalcadoDto = new FormCalcadoDTO();
        formCalcadoDto.setId(id);

        FormCalcadoDAO formCalcadoDao = new FormCalcadoDAO();
        formCalcadoDao.excluirCalcado(formCalcadoDto);

    }

    private void addCalcado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}*/
