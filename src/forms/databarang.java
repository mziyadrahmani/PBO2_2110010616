/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

import com.mysql.jdbc.PreparedStatement;
import database.koneksi;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class dataBarang extends javax.swing.JFrame {

    koneksi myobject;

    public DefaultTableModel modelTabelBarang;

    public dataBarang() {
        initComponents();

        this.setLocationRelativeTo(null);

        myobject = new koneksi();

        modelTabelBarang = new DefaultTableModel();
        tableBarang.setModel(modelTabelBarang);
        modelTabelBarang.addColumn("ID");
        modelTabelBarang.addColumn("Nama");
        modelTabelBarang.addColumn("Jumlah");
        modelTabelBarang.addColumn("Harga");
        tampilDataBarang();

        comboBarang.removeAllItems();

        try {
            Statement statement = koneksi.connect.createStatement();
            String query = "SELECT barang FROM dataterima";
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                String barang = rs.getString("barang");
                comboBarang.addItem(barang);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtStok = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        comboBarang = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBarang = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DATA BARANG");

        jLabel2.setText("Barang");

        jLabel3.setText("Stok");

        txtStok.setEditable(false);

        jButton2.setText("Kembali");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Harga");

        comboBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBarangActionPerformed(evt);
            }
        });

        jButton1.setText("Simpan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tableBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableBarang);

        jButton3.setText("Ubah");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Hapus");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setText("Cari data");

        txtCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariActionPerformed(evt);
            }
        });
        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCariKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtStok)
                                    .addComponent(txtHarga)
                                    .addComponent(comboBarang, 0, 182, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(185, 185, 185))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void tampilDataBarang() {
        try {
            modelTabelBarang.getDataVector().removeAllElements();
            modelTabelBarang.fireTableDataChanged();

            java.sql.PreparedStatement query = myobject.connect.prepareStatement("SELECT * FROM databarang");
            ResultSet data = query.executeQuery();
            while (data.next()) {
                Object[] kolom = new Object[4];
                kolom[0] = data.getString("id");
                kolom[1] = data.getString("nama");
                kolom[2] = data.getString("stok");
                kolom[3] = data.getString("harga");
                modelTabelBarang.addRow(kolom);

            }
            query.close();
            data.close();
        } catch (Exception e) {
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        mainmenu mainMenuForm = new mainmenu();
        mainMenuForm.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            if (txtStok.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Stok belum di isi");
                txtStok.requestFocus();
            } else if (txtHarga.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Harga belum di isi");
                txtHarga.requestFocus();
            } else {
                String insertQuery = "INSERT INTO databarang (id, nama, stok, harga) VALUE (null, ?, ?, ?)";

                java.sql.PreparedStatement simpan = koneksi.connect.prepareStatement(insertQuery);

                simpan.setString(1, comboBarang.getSelectedItem().toString());
                simpan.setString(2, txtStok.getText());
                simpan.setString(3, txtHarga.getText());

                simpan.executeUpdate();

                JOptionPane.showMessageDialog(this, "Data berhasil disimpan");
                txtStok.setText("");
                txtHarga.setText("");
                tampilDataBarang();
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBarangActionPerformed

        try {
            String selectedBarang = comboBarang.getSelectedItem().toString();

            String query = "SELECT jumlah FROM dataterima WHERE barang = ?";

            java.sql.PreparedStatement preparedStatement = koneksi.connect.prepareStatement(query);
            preparedStatement.setString(1, selectedBarang);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                int stok = rs.getInt("jumlah");
                txtStok.setText(String.valueOf(stok));
            } else {
                txtStok.setText("Tidak Ditemukan");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_comboBarangActionPerformed

    private void tableBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBarangMouseClicked

        int kolom = tableBarang.getSelectedRow();
        //String id = tableBarang.getValueAt(kolom, 0).toString();
        String barang = tableBarang.getValueAt(kolom, 1).toString();
        String stok = tableBarang.getValueAt(kolom, 2).toString();
        String harga = tableBarang.getValueAt(kolom, 3).toString();
        //.setText(npm);
        comboBarang.setSelectedItem(barang);
        txtStok.setText(stok);
        txtHarga.setText(harga);

    }//GEN-LAST:event_tableBarangMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        try {
            if (comboBarang.getSelectedItem() == null || comboBarang.getSelectedItem().toString().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Silahkan pilih data terlebih dahulu");
            } else {
                String sql = "DELETE from databarang WHERE nama=?";
                java.sql.PreparedStatement hapus = myobject.connect.prepareStatement(sql);
                hapus.setString(1, (String) comboBarang.getSelectedItem());

                hapus.executeUpdate();
                tampilDataBarang();
                JOptionPane.showMessageDialog(this, "data berhasil dihapus!");

            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {
            if ( //(txtnpm.getText().isEmpty()) &&
                    //                    (comboBarang.getText().isEmpty()) &&
                    (txtStok.getText().isEmpty())
                    && (txtHarga.getText().isEmpty())) {
                JOptionPane.showMessageDialog(this, "Silahkan pilih data terlebih dahulu");
            } else {
                String sql = "UPDATE databarang SET stok=?, harga=? WHERE nama=?";
                java.sql.PreparedStatement ubah = myobject.connect.prepareStatement(sql);
                ubah.setString(1, txtStok.getText());
                ubah.setString(2, txtHarga.getText());
                ubah.setString(3, (String) comboBarang.getSelectedItem());
                ubah.executeUpdate();
                tampilDataBarang();
                JOptionPane.showMessageDialog(this, "data berhasil diubah!");

            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtCariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyPressed

        modelTabelBarang.getDataVector().removeAllElements();
        modelTabelBarang.fireTableDataChanged();

        try {
            String searchText = "%" + txtCari.getText() + "%";
            String sqlcari = "SELECT * FROM databarang WHERE id LIKE ? OR nama LIKE ? OR harga LIKE ? OR stok LIKE ?";
            java.sql.PreparedStatement cari = myobject.connect.prepareStatement(sqlcari);
            cari.setString(1, searchText);
            cari.setString(2, searchText);
            cari.setString(3, searchText);
            cari.setString(4, searchText);

            ResultSet data = cari.executeQuery();
            while (data.next()) {
                Object[] baris = new Object[4];
                baris[0] = data.getString("id");
                baris[1] = data.getString("nama");
                baris[2] = data.getString("stok");
                baris[3] = data.getString("harga");
                modelTabelBarang.addRow(baris);
            }
            cari.close();
            data.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_txtCariKeyPressed

    private void txtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(dataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dataBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBarang;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableBarang;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtStok;
    // End of variables declaration//GEN-END:variables
}
