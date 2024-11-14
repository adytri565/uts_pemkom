package Form;
import Config.Koneksi;
import java.util.logging.Logger;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Form_Data_User extends javax.swing.JFrame {
private Connection conn;


    public Form_Data_User() {
        initComponents();
        conn = Koneksi.getConnection();
        getData();
        nonAktifButton();
        aktifButton();
    }
    private void getData() {
        DefaultTableModel model = (DefaultTableModel) tabel_data.getModel();
        model.setRowCount(0);
        
        try {
            String sql ="SELECT * From user";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt( "id_user");
                String nama = rs.getString( "nama");
                String username = rs.getString( "username");
                String email = rs.getString( "email");
                String role = rs.getString( "role");
                String password = rs.getString( "password");
                Object[] rowData ={id,nama,username,email,role,password};
                model.addRow(rowData);
            }
            rs.close();
            st.close();
        }catch (Exception e){
            Logger.getLogger(Form_Data_User.class.getName()).log(Level.SEVERE,null,e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_data = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        t_nama = new javax.swing.JTextField();
        JLabel2 = new javax.swing.JLabel();
        t_username = new javax.swing.JTextField();
        JLabel3 = new javax.swing.JLabel();
        t_email = new javax.swing.JTextField();
        JLabel4 = new javax.swing.JLabel();
        t_password = new javax.swing.JTextField();
        JLabel5 = new javax.swing.JLabel();
        btn_tambah = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        t_cari = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        t_level = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabel_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "Username", "Email", "Role", "Password"
            }
        ));
        tabel_data.setGridColor(new java.awt.Color(0, 153, 255));
        tabel_data.setSelectionBackground(new java.awt.Color(0, 153, 255));
        tabel_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_dataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_data);

        jLabel1.setText("Nama");

        JLabel2.setText("Username");

        JLabel3.setText("Email");

        JLabel4.setText("Role");

        JLabel5.setText("Password");

        btn_tambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/tambah.png"))); // NOI18N
        btn_tambah.setText("Tambah");
        btn_tambah.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/update.png"))); // NOI18N
        btn_update.setText("Update");
        btn_update.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_batal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/batal.png"))); // NOI18N
        btn_batal.setText("Batal");
        btn_batal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        btn_hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/delete.png"))); // NOI18N
        btn_hapus.setText("Hapus");
        btn_hapus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        t_cari.setForeground(new java.awt.Color(153, 153, 153));
        t_cari.setText("Search");
        t_cari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_cariMouseClicked(evt);
            }
        });
        t_cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_cariKeyTyped(evt);
            }
        });

        jButton2.setText("Kembali");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        t_level.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "kasir" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(t_cari)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t_username)
                    .addComponent(t_nama)
                    .addComponent(t_email)
                    .addComponent(t_password)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLabel2)
                            .addComponent(JLabel5)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_update, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(btn_tambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51))
                    .addComponent(t_level, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(t_level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_batal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
      String nama = t_nama.getText();
      String username = t_username.getText();
      String email = t_email.getText();
      String level = t_level.getSelectedItem().toString();
      String password = t_password.getText();
      
      if (nama.isEmpty() || (username.isEmpty() || (email.isEmpty() || (level.isEmpty()) ||(password.isEmpty())))){
          JOptionPane.showMessageDialog(this, "Semua kolom wajib diisi !", "Validasi",JOptionPane.ERROR_MESSAGE);
          return;
      }
      try{
          String sql = "INSERT INTO user (nama,username,email,role,password) VALUES (?,?,?,?,?)";
          PreparedStatement st = conn.prepareStatement(sql);
          st.setString(1, nama);
          st.setString(2, username);
          st.setString(3, email);
          st.setString(4, level);
          st.setString(5, password);
          
          int rowInserted = st.executeUpdate();
          if (rowInserted > 0){
              JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan");
              resetForm();
              getData();
          }
          st.close();
      }catch (Exception e){
         Logger.getLogger(Form_Data_User.class.getName()).log(Level.SEVERE,null,e);
      }
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        int selectedRow = tabel_data.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(this, "Pilih baris yang ingin diubah");
            return;
        }
        String id = tabel_data.getValueAt(selectedRow,0).toString();
        String nama = t_nama.getText();
        String username = t_username.getText();
        String email = t_email.getText();
        String level = t_level.getSelectedItem().toString();
        String password = t_password.getText();
        
       if (nama.isEmpty() || (username.isEmpty() || (email.isEmpty() || (level.isEmpty()) ||(password.isEmpty())))){
          JOptionPane.showMessageDialog(this, "Semua kolom wajib diisi !", "Validasi",JOptionPane.ERROR_MESSAGE);
          return;
      }
       try {
           String sql = "UPDATE user SET nama=?, username=?,email=?, role=?, password=? WHERE id_user=? ";
          PreparedStatement st = conn.prepareStatement(sql);
          st.setString(1, nama);
          st.setString(2, username);
          st.setString(3, email);
          st.setString(4, level);
          st.setString(5, password);
          st.setString(6, id);
          int rowUpdated = st.executeUpdate();
          if (rowUpdated > 0){
              JOptionPane.showMessageDialog(this, "Data berhasil diperbarui");
              resetForm();
              getData();
          }
          st.close();
           
           
       }catch (Exception e){
           Logger.getLogger(Form_Data_User.class.getName()).log(Level.SEVERE,null,e);
       }
        
    }//GEN-LAST:event_btn_updateActionPerformed

    private void tabel_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_dataMouseClicked
        int selectedRow = tabel_data.getSelectedRow();
        if(selectedRow != -1){
            String nama = tabel_data.getValueAt(selectedRow, 1).toString();
            String username = tabel_data.getValueAt(selectedRow, 2).toString();
            String email = tabel_data.getValueAt(selectedRow, 3).toString();
            String level = tabel_data.getValueAt(selectedRow, 4).toString();
            String password = tabel_data.getValueAt(selectedRow, 5).toString();
            
            t_nama.setText(nama);
            t_username.setText(username);
            t_email.setText(email);
            t_level.setSelectedItem(level);
            t_password.setText(password);
        }
        btn_tambah.setEnabled(false);
        btn_update.setEnabled(true);
        btn_hapus.setEnabled(true);
    }//GEN-LAST:event_tabel_dataMouseClicked

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
       resetForm();
       aktifButton();
       nonAktifButton();
       
    }//GEN-LAST:event_btn_batalActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
       int selectedRow = tabel_data.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(this, "Pilih baris yang ingin diubah");
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(this,"Apakah anda yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION){
            String id = tabel_data.getValueAt(selectedRow, 0).toString();
            
            try
            {
                String sql = "DELETE FROM user WHERE id_user=?";
                PreparedStatement st = conn.prepareStatement(sql);
                st.setString(1, id);
                int rowDelete =st.executeUpdate();
                if (rowDelete > 0){
                    JOptionPane.showMessageDialog(this,"Data berhasil dihapus");
                }
                st.close();
            }catch(Exception e){
                Logger.getLogger(Form_Data_User.class.getName()).log(Level.SEVERE,null,e);
            }
        }
        resetForm();
        getData();
        aktifButton();
        nonAktifButton();
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void t_cariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_cariKeyTyped
       DefaultTableModel model = (DefaultTableModel) tabel_data.getModel();
        model.setRowCount(0);
        
        String cari = t_cari.getText();
        
        try {
            String sql ="SELECT * From user WHERE nama LIKE ? OR username LIKE ?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1,"%" + cari + "%");
            st.setString(2,"%" + cari + "%");
            
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt( "id_user");
                String nama = rs.getString( "nama");
                String username = rs.getString( "username");
                String email = rs.getString( "email");
                String role = rs.getString( "role");
                String password = rs.getString( "password");
                Object[] rowData ={id,nama,username,email,role,password};
                model.addRow(rowData);
            }
            rs.close();
            st.close();
        }catch (Exception e){
            Logger.getLogger(Form_Data_User.class.getName()).log(Level.SEVERE,null,e);
        }
    }//GEN-LAST:event_t_cariKeyTyped

    private void t_cariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_cariMouseClicked
        t_cari.setText("");
    }//GEN-LAST:event_t_cariMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Form_Profil_Admin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Data_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Data_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Data_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Data_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Data_User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel2;
    private javax.swing.JLabel JLabel3;
    private javax.swing.JLabel JLabel4;
    private javax.swing.JLabel JLabel5;
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t_cari;
    private javax.swing.JTextField t_email;
    private javax.swing.JComboBox<String> t_level;
    private javax.swing.JTextField t_nama;
    private javax.swing.JTextField t_password;
    private javax.swing.JTextField t_username;
    private javax.swing.JTable tabel_data;
    // End of variables declaration//GEN-END:variables

    private void resetForm() {
        t_nama.setText("");
        t_username.setText("");
        t_email.setText("");
        t_level.setSelectedItem("");
        t_password.setText("");
    }

    private void nonAktifButton() {
       btn_update.setEnabled(false);
       btn_hapus.setEnabled(false);
    }

    private void aktifButton() {
      btn_tambah.setEnabled(true);
       btn_batal.setEnabled(true);
    }
}
