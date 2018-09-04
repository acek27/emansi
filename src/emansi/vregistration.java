/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emansi;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author acek
 */
public class vregistration extends javax.swing.JFrame {

    /**
     * Creates new form vregistration
     */
    private koneksi connection = new koneksi();
    private session usr = new session();

    public vregistration() {
        initComponents();
        showData();
        getJenis();
        getAcara();
        showDate();
    }

    public void showData() {
        String query = "SELECT Nomor,"
                + " Nama, "
                + " Instansi, "
                + " Alamat, "
                + " NO_HP, "
                + "Tanggal  "
                + "FROM data d "
                + "join Event e on d.id_event = e.id_event  "
                + "where e.id_user='" + usr.get() + "'";
        DefaultTableModel model = connection.select(query);
        jtTabel.setModel(model);
    }

    public void getJenis() {
        String j[] = connection.getData("SELECT * From jenis", 2);
        System.out.println("");
        for (int i = 0; i < j.length; i++) {
            cbStatus.addItem(j[i]);
        }
    }

    public void getAcara() {
        String query = "SELECT * From Event e "
                + "left join login l on e.id_user = l.id_user "
                + "where e.id_user='" + usr.get() + "'";
        String j[] = connection.getData(query, 2);
        for (int i = 0; i < j.length; i++) {
            cbAcara.addItem(j[i]);
        }
    }

    public void showDate() {
        Date date = new Date();
        jdate.setDate(date);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jExit = new javax.swing.JButton();
        jLogout = new javax.swing.JButton();
        jBack = new javax.swing.JButton();
        tfNama = new javax.swing.JTextField();
        tfAlamat = new javax.swing.JTextField();
        tfFakultas = new javax.swing.JTextField();
        tfNo = new javax.swing.JTextField();
        cbStatus = new javax.swing.JComboBox();
        jdate = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabel = new javax.swing.JTable();
        cbAcara = new javax.swing.JComboBox();
        jbCreate = new javax.swing.JButton();
        jbEdit = new javax.swing.JButton();
        jbDelete = new javax.swing.JButton();
        jbReset = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit.png"))); // NOI18N
        jExit.setBorderPainted(false);
        jExit.setContentAreaFilled(false);
        jExit.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit1.png"))); // NOI18N
        jExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitActionPerformed(evt);
            }
        });
        getContentPane().add(jExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, -1, -1));

        jLogout.setBackground(new java.awt.Color(0, 51, 51));
        jLogout.setFont(new java.awt.Font("Aroania", 1, 14)); // NOI18N
        jLogout.setForeground(new java.awt.Color(204, 204, 255));
        jLogout.setText("Logout");
        jLogout.setBorderPainted(false);
        jLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(jLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, -1, -1));

        jBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        jBack.setBorderPainted(false);
        jBack.setContentAreaFilled(false);
        jBack.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back1.png"))); // NOI18N
        jBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackActionPerformed(evt);
            }
        });
        getContentPane().add(jBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 50, 50));

        tfNama.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        tfNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNamaActionPerformed(evt);
            }
        });
        getContentPane().add(tfNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 220, -1));

        tfAlamat.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        tfAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAlamatActionPerformed(evt);
            }
        });
        getContentPane().add(tfAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 220, -1));

        tfFakultas.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        tfFakultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFakultasActionPerformed(evt);
            }
        });
        getContentPane().add(tfFakultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 220, -1));

        tfNo.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        tfNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNoActionPerformed(evt);
            }
        });
        getContentPane().add(tfNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 220, -1));

        cbStatus.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStatusActionPerformed(evt);
            }
        });
        getContentPane().add(cbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 220, 30));
        getContentPane().add(jdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, 220, -1));

        jtTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jtTabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtTabelMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtTabel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 610, 280));

        cbAcara.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        cbAcara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAcaraActionPerformed(evt);
            }
        });
        getContentPane().add(cbAcara, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 220, -1));

        jbCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/create.png"))); // NOI18N
        jbCreate.setContentAreaFilled(false);
        jbCreate.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/create1.png"))); // NOI18N
        jbCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCreateActionPerformed(evt);
            }
        });
        getContentPane().add(jbCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 60, 60));

        jbEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit.png"))); // NOI18N
        jbEdit.setContentAreaFilled(false);
        jbEdit.setEnabled(false);
        jbEdit.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit1.png"))); // NOI18N
        jbEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditActionPerformed(evt);
            }
        });
        getContentPane().add(jbEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 60, 60));

        jbDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N
        jbDelete.setContentAreaFilled(false);
        jbDelete.setEnabled(false);
        jbDelete.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete1.png"))); // NOI18N
        jbDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jbDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 60, 60));

        jbReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/reset.png"))); // NOI18N
        jbReset.setContentAreaFilled(false);
        jbReset.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/reset1.png"))); // NOI18N
        jbReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbResetActionPerformed(evt);
            }
        });
        getContentPane().add(jbReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 60, 60));

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Alamat");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Tanggal");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 135, -1, 20));

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Status");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Instansi");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("No. HP");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Acara");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Nama");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/info.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/info1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 60, 40, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/background2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitActionPerformed
        int a = JOptionPane.showConfirmDialog(rootPane, "Some input data "
                + "in textfield maybe will lose"
                + "\nClik Yes to confirm", "Message", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jExitActionPerformed

    private void jBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackActionPerformed
        // TODO add your handling code here:
        dispose();
        new home().setVisible(true);
    }//GEN-LAST:event_jBackActionPerformed

    private void tfNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNamaActionPerformed

    private void tfAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAlamatActionPerformed

    private void tfFakultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFakultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFakultasActionPerformed

    private void tfNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNoActionPerformed

    private void cbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbStatusActionPerformed

    private void jtTabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTabelMousePressed
        // TODO add your handling code here:
        int row = getRowTable();
        String nm = (String) getTableValue(row, 1);
        tfNama.setText(nm);
        String fakul = (String) getTableValue(row, 2);
        tfFakultas.setText(fakul);
        String alamat = (String) getTableValue(row, 3);
        tfAlamat.setText(alamat);
        String no = (String) getTableValue(row, 4);
        tfNo.setText(no);
        String status = (String) getTableValue(row, 5);
        cbStatus.setSelectedItem(status);
        jbCreate.setEnabled(false);
        jbEdit.setEnabled(true);
        jbDelete.setEnabled(true);
    }//GEN-LAST:event_jtTabelMousePressed

    private void cbAcaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAcaraActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_cbAcaraActionPerformed

    private void jbCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCreateActionPerformed
        String nama = tfNama.getText();
        String fakultas = tfFakultas.getText();
        String alamat = tfAlamat.getText();
        String no = tfNo.getText();
        String status = cbStatus.getSelectedItem().toString();
        //untuk tanggal
        SimpleDateFormat formatdate;
        formatdate = new SimpleDateFormat("yyyy-M-d");
        String tgl = formatdate.format(jdate.getDate());
        int idjenis;

        String acara = cbAcara.getSelectedItem().toString();
        if (status.equals("Booking")) {
            idjenis = 2;
        } else {
            idjenis = 1;
        }

        String query = "INSERT INTO `siap`.`data` ("
                + "Nomor, "
                + "Nama, "
                + "Instansi, "
                + "Alamat, "
                + "id_jenis, "
                + "NO_HP, "
                + "id_event, "
                + "Tanggal) "
                + "VALUES "
                + "(NULL ,  "
                + "'" + nama + "', "
                + "'" + fakultas + "', "
                + "'" + alamat + "', "
                + "" + idjenis + ","
                + "'" + no + "', "
                + connection.getID(acara) + ",'"
                + tgl + "')";
        connection.insertUpdateDelete(query);
        refresh();
        reset();
    }//GEN-LAST:event_jbCreateActionPerformed

    private void reset() {
        tfNama.setText("");
        tfFakultas.setText("");
        tfAlamat.setText("");
        tfNo.setText("");
        jbCreate.setEnabled(true);
        jbEdit.setEnabled(false);
        jbDelete.setEnabled(false);
    }

    public void refresh() {
        showData();
    }

    public int getRowTable() {
        int row = jtTabel.getSelectedRow();
        return row;
    }

    public Object getTableValue(int row, int column) {
        Object value = jtTabel.getValueAt(row, column);
        return value;
    }

    private void jbEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditActionPerformed
        int row = getRowTable();
        String id = (String) getTableValue(row, 0);
        String nama = tfNama.getText();
        String fakultas = tfFakultas.getText();
        String alamat = tfAlamat.getText();
        String no = tfNo.getText();
        String status = cbStatus.getSelectedItem().toString();
        //untuk tanggal
        SimpleDateFormat formatdate;
        formatdate = new SimpleDateFormat("yyyy-M-d");
        String tgl = formatdate.format(jdate.getDate());
        String idjenis;
        if (status.equals("Booking")) {
            idjenis = "2";
        } else {
            idjenis = "1";
        }
        String query = "Update data set Nama='" + nama + "',Instansi='"
                + fakultas + "',Alamat='" + alamat + "',NO_HP='" + no + "',id_jenis="
                + idjenis + ", Tanggal ='" + tgl + "' "
                + "WHERE `data`.`Nomor` =" + id;
        connection.insertUpdateDelete(query);
        refresh();
        jbEdit.setEnabled(false);
        jbCreate.setEnabled(true);
        reset();
    }//GEN-LAST:event_jbEditActionPerformed

    private void jbDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeleteActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(rootPane, "Apakah anda yakin?", "Message", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (a == 0) {

            int row = getRowTable();
            String id = (String) getTableValue(row, 0);
            String query = "DELETE FROM siap.data "
                    + "WHERE `data`.`Nomor` =" + id + ";";
            connection.insertUpdateDelete(query);
            refresh();
            reset();
            JOptionPane.showMessageDialog(rootPane, "Data Berhasil Dihapus");
        }
    }//GEN-LAST:event_jbDeleteActionPerformed

    private void jbResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbResetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_jbResetActionPerformed

    private void jLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogoutActionPerformed
        // TODO add your handling code here:
        dispose();
        new login().setVisible(true);
    }//GEN-LAST:event_jLogoutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Aplikasi ini digunakan untuk\n"
                + "memudahkan dalam memanajemen acara\n"
                + "yang ada di Program Studi Sistem Informasi\n"
                + "UNIVERSITAS JEMBER");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(vregistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vregistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vregistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vregistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vregistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbAcara;
    private javax.swing.JComboBox cbStatus;
    private javax.swing.JButton jBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jLogout;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCreate;
    private javax.swing.JButton jbDelete;
    private javax.swing.JButton jbEdit;
    private javax.swing.JButton jbReset;
    private com.toedter.calendar.JDateChooser jdate;
    private javax.swing.JTable jtTabel;
    private javax.swing.JTextField tfAlamat;
    private javax.swing.JTextField tfFakultas;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfNo;
    // End of variables declaration//GEN-END:variables
}
