package Form;
import Config.Koneksi;
import java.util.logging.Logger;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Input_Barang extends javax.swing.JFrame {
    private Connection conn;

    public Input_Barang() {
        initComponents();
       conn = Koneksi.getConnection();
        getData();
        nonAktifButton();
        aktifButton();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        t_cari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_barang = new javax.swing.JTable();
        t_id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t_barang = new javax.swing.JTextField();
        t_harga_jual = new javax.swing.JTextField();
        t_stok = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_tambah = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        t_harga_beli = new javax.swing.JTextField();
        t_satuan = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        tabel_barang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama Barang", "Harga Jual", "Harga Beli", "Stok", "Satuan"
            }
        ));
        tabel_barang.setGridColor(new java.awt.Color(0, 153, 255));
        tabel_barang.setSelectionBackground(new java.awt.Color(0, 153, 255));
        tabel_barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_barangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_barang);

        jLabel1.setText("ID Barang");

        jLabel2.setText("Nama Barang");

        jLabel3.setText("Harga Jual");

        jLabel4.setText("Stok");

        btn_tambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/tambah.png"))); // NOI18N
        btn_tambah.setText("Tambah");
        btn_tambah.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
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

        btn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/update.png"))); // NOI18N
        btn_update.setText("Update");
        btn_update.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        jButton2.setText("Kembali");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Harga Beli");

        t_satuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PCS", "Pack" }));

        jLabel6.setText("Satuan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t_cari)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(t_id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                                .addComponent(t_barang, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(t_harga_jual, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(t_harga_beli, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel5)
                            .addComponent(t_stok, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_hapus, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(btn_tambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jButton2)
                            .addComponent(jLabel6)
                            .addComponent(t_satuan, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(t_barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_harga_jual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_harga_beli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_satuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(8, 8, 8)
                .addComponent(t_stok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t_cariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_cariMouseClicked
        t_cari.setText("");
    }//GEN-LAST:event_t_cariMouseClicked

    private void t_cariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_cariKeyTyped
        DefaultTableModel model = (DefaultTableModel) tabel_barang.getModel();
        model.setRowCount(0);

        String cari = t_cari.getText();

        try {
            String sql ="SELECT * From barang WHERE id_barang LIKE ? OR nama_barang LIKE ?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1,"%" + cari + "%");
            st.setString(2,"%" + cari + "%");

            ResultSet rs = st.executeQuery();

            while(rs.next()){
                String id = rs.getString( "id_barang");
                String nama_barang = rs.getString( "nama_barang");
                String harga_jual = rs.getString( "harga_jual");
                String harga_beli = rs.getString( "harga_beli");
                String stok = rs.getString( "stok");
                String satuan = rs.getString( "satuan");
                
                Object[] rowData ={id,nama_barang,harga_jual,harga_beli,stok,satuan};
                model.addRow(rowData);
            }
            rs.close();
            st.close();
        }catch (Exception e){
            Logger.getLogger(Form_Data_User.class.getName()).log(Level.SEVERE,null,e);
        }
    }//GEN-LAST:event_t_cariKeyTyped

    private void tabel_barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_barangMouseClicked
        int selectedRow = tabel_barang.getSelectedRow();
        if(selectedRow != -1){
            String id_barang = tabel_barang.getValueAt(selectedRow, 0).toString();
            String nama_barang = tabel_barang.getValueAt(selectedRow, 1).toString();
            String harga_jual = tabel_barang.getValueAt(selectedRow, 2).toString();
            String harga_beli = tabel_barang.getValueAt(selectedRow, 3).toString();
            String stok = tabel_barang.getValueAt(selectedRow, 4).toString();
            String satuan = tabel_barang.getValueAt(selectedRow, 5).toString();
            
            t_id.setText(id_barang);
            t_barang.setText(nama_barang);
            t_harga_jual.setText(harga_jual);
            t_harga_beli.setText(harga_beli);
            t_stok.setText(stok);
            t_satuan.setSelectedItem(satuan);
        }
        btn_tambah.setEnabled(false);
        btn_update.setEnabled(true);
        btn_hapus.setEnabled(true);
    }//GEN-LAST:event_tabel_barangMouseClicked

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        String id_barang = t_id.getText();
        String nama_barang = t_barang.getText();
        String harga_jual = t_harga_jual.getText();
        String harga_beli = t_harga_beli.getText();
        String stok = t_stok.getText();
        String satuan = t_satuan.getSelectedItem().toString();

        if (id_barang.isEmpty() || (nama_barang.isEmpty() || (harga_jual.isEmpty()|| (harga_beli.isEmpty() || (stok.isEmpty()))))){
            JOptionPane.showMessageDialog(this, "Semua kolom wajib diisi !", "Validasi",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{
            String sql = "INSERT INTO barang (id_barang,nama_barang,harga_jual,harga_beli,stok,satuan) VALUES (?,?,?,?,?,?)";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, id_barang);
            st.setString(2, nama_barang);
            st.setString(3, harga_jual);
            st.setString(4, harga_beli);
            st.setString(5, stok);
            st.setString(6, satuan);

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

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        resetForm();
        aktifButton();
        nonAktifButton();

    }//GEN-LAST:event_btn_batalActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        int selectedRow = tabel_barang.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(this, "Pilih baris yang ingin diubah");
            return;
        }
        String id_barang = t_id.getText();
        String nama_barang = t_barang.getText();
        String harga_jual = t_harga_jual.getText();
        String harga_beli = t_harga_beli.getText();
        String stok = t_stok.getText();
        String satuan = t_satuan.getSelectedItem().toString();

        if (id_barang.isEmpty() || (nama_barang.isEmpty() || (harga_jual.isEmpty() || (harga_beli.isEmpty() || (stok.isEmpty()))))){
            JOptionPane.showMessageDialog(this, "Semua kolom wajib diisi !", "Validasi",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            String sql = "UPDATE barang SET id_barang=?, nama_barang =?, harga_jual=?, harga_beli=? , stok=?, satuan=?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, id_barang);
            st.setString(2, nama_barang);
            st.setString(3, harga_jual);
            st.setString(4, harga_beli);
            st.setString(5, stok);
            st.setString(6, satuan);
            
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
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        int selectedRow = tabel_barang.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(this, "Pilih baris yang ingin diubah");
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(this,"Apakah anda yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION){
            String id = tabel_barang.getValueAt(selectedRow, 0).toString();
            
            try
            {
                String sql = "DELETE FROM barang WHERE id_barang=?";
                PreparedStatement st = conn.prepareStatement(sql);
                st.setString(1, id);
                int rowDelete =st.executeUpdate();
                if (rowDelete > 0){
                    JOptionPane.showMessageDialog(this,"Data berhasil dihapus");
                }
                st.close();
            }catch(Exception e){
                Logger.getLogger(Input_Barang.class.getName()).log(Level.SEVERE,null,e);
            }
        }
        resetForm();
        getData();
        aktifButton();
        nonAktifButton();


    }//GEN-LAST:event_btn_updateActionPerformed

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
            java.util.logging.Logger.getLogger(Input_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Input_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Input_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Input_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Input_Barang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t_barang;
    private javax.swing.JTextField t_cari;
    private javax.swing.JTextField t_harga_beli;
    private javax.swing.JTextField t_harga_jual;
    private javax.swing.JTextField t_id;
    private javax.swing.JComboBox<String> t_satuan;
    private javax.swing.JTextField t_stok;
    private javax.swing.JTable tabel_barang;
    // End of variables declaration//GEN-END:variables
      
    private void resetForm() {
        t_id.setText("");
        t_barang.setText("");
        t_harga_jual.setText("");
        t_stok.setText("");
        
    }
    private void nonAktifButton() {
       btn_update.setEnabled(false);
       btn_hapus.setEnabled(false);
    }
    
    private void aktifButton() {
      btn_tambah.setEnabled(true);
       btn_batal.setEnabled(true);
    }

    private void getData() {
       DefaultTableModel model = (DefaultTableModel) tabel_barang.getModel();
        model.setRowCount(0);
        
        try {
            String sql ="SELECT * From barang";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                int id_barang = rs.getInt( "id_barang");
                String nama_barang = rs.getString( "nama_barang");
                int harga_jual = rs.getInt( "harga_jual");
                int harga_beli = rs.getInt( "harga_beli");
                int stok = rs.getInt( "stok");
                String satuan = rs.getString ("satuan");
                Object[] rowData ={id_barang,nama_barang,harga_jual,harga_beli,stok,satuan};
                model.addRow(rowData);
            }
            rs.close();
            st.close();
        }catch (Exception e){
            Logger.getLogger(Form_Data_User.class.getName()).log(Level.SEVERE,null,e);
        }
    }
}
