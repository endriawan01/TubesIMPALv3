/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import com.toedter.calendar.JDateChooser;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author vebbyclrs
 */
public class VAdmin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public VAdmin() {
        initComponents();
    }

    public JButton getBtnAddMatkul() {
        return btnAddMatkul;
    }

    public void setBtnAddMatkul(JButton btnAddMatkul) {
        this.btnAddMatkul = btnAddMatkul;
    }

    public JButton getBtnDsnAdd() {
        return btnDsnAdd;
    }

    public void setBtnDsnAdd(JButton btnDsnAdd) {
        this.btnDsnAdd = btnDsnAdd;
    }

    public JButton getBtnMhsAdd() {
        return btnMhsAdd;
    }

    public void setBtnMhsAdd(JButton btnMhsAdd) {
        this.btnMhsAdd = btnMhsAdd;
    }

    public JComboBox<String> getCboxDsnJK() {
        return cboxDsnJK;
    }

    public void setCboxDsnJK(JComboBox<String> cboxDsnJK) {
        this.cboxDsnJK = cboxDsnJK;
    }

    public JComboBox<String> getCboxKodeDosen() {
        return cboxKodeDosen;
    }

    public void setCboxKodeDosen(JComboBox<String> cboxKodeDosen) {
        this.cboxKodeDosen = cboxKodeDosen;
    }

    public JComboBox<String> getCboxMhsJK() {
        return cboxMhsJK;
    }

    public void setCboxMhsJK(JComboBox<String> cboxMhsJK) {
        this.cboxMhsJK = cboxMhsJK;
    }

    public JComboBox<String> getCboxMhsKodeDoswal() {
        return cboxMhsKodeDoswal;
    }

    public void setCboxMhsKodeDoswal(JComboBox<String> cboxMhsKodeDoswal) {
        this.cboxMhsKodeDoswal = cboxMhsKodeDoswal;
    }

    public JComboBox<String> getCboxSKS() {
        return cboxSKS;
    }

    public void setCboxSKS(JComboBox<String> cboxSKS) {
        this.cboxSKS = cboxSKS;
    }

    public JDateChooser getDateDsnBirthday() {
        return dateDsnBirthday;
    }

    public void setDateDsnBirthday(JDateChooser dateDsnBirthday) {
        this.dateDsnBirthday = dateDsnBirthday;
    }

    public JDateChooser getDateMhsBirthday() {
        return dateMhsBirthday;
    }

    public void setDateMhsBirthday(JDateChooser dateMhsBirthday) {
        this.dateMhsBirthday = dateMhsBirthday;
    }

    public JTable getTblDosen() {
        return tblDosen;
    }

    public void setTblDosen(JTable tblDosen) {
        this.tblDosen = tblDosen;
    }

    public JTable getTblMahasiswa() {
        return tblMahasiswa;
    }

    public void setTblMahasiswa(JTable tblMahasiswa) {
        this.tblMahasiswa = tblMahasiswa;
    }

    public JTable getTblMatkul() {
        return tblMatkul;
    }

    public void setTblMatkul(JTable tblMatkul) {
        this.tblMatkul = tblMatkul;
    }

    public JTextField getTxtDsnBirthplace() {
        return txtDsnBirthplace;
    }

    public void setTxtDsnBirthplace(JTextField txtDsnBirthplace) {
        this.txtDsnBirthplace = txtDsnBirthplace;
    }

    public JTextField getTxtDsnKode() {
        return txtDsnKode;
    }

    public void setTxtDsnKode(JTextField txtDsnKode) {
        this.txtDsnKode = txtDsnKode;
    }

    public JTextField getTxtDsnNama() {
        return txtDsnNama;
    }

    public void setTxtDsnNama(JTextField txtDsnNama) {
        this.txtDsnNama = txtDsnNama;
    }

    public JTextField getTxtKodeMatkul() {
        return txtKodeMatkul;
    }

    public void setTxtKodeMatkul(JTextField txtKodeMatkul) {
        this.txtKodeMatkul = txtKodeMatkul;
    }

    public JTextField getTxtMhsBirthplace() {
        return txtMhsBirthplace;
    }

    public void setTxtMhsBirthplace(JTextField txtMhsBirthplace) {
        this.txtMhsBirthplace = txtMhsBirthplace;
    }

    public JTextField getTxtMhsNIM() {
        return txtMhsNIM;
    }

    public void setTxtMhsNIM(JTextField txtMhsNIM) {
        this.txtMhsNIM = txtMhsNIM;
    }

    public JTextField getTxtMhsNama() {
        return txtMhsNama;
    }

    public void setTxtMhsNama(JTextField txtMhsNama) {
        this.txtMhsNama = txtMhsNama;
    }

    public JTextField getTxtNamaMatkul() {
        return txtNamaMatkul;
    }

    public void setTxtNamaMatkul(JTextField txtNamaMatkul) {
        this.txtNamaMatkul = txtNamaMatkul;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        Dosen = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDosen = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        cboxDsnJK = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        btnDsnAdd = new javax.swing.JButton();
        dateDsnBirthday = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        txtDsnBirthplace = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtDsnNama = new javax.swing.JTextField();
        txtDsnKode = new javax.swing.JTextField();
        Dosen1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtKodeMatkul = new javax.swing.JTextField();
        txtNamaMatkul = new javax.swing.JTextField();
        cboxSKS = new javax.swing.JComboBox<>();
        btnAddMatkul = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMatkul = new javax.swing.JTable();
        cboxKodeDosen = new javax.swing.JComboBox<>();
        Mahasiswa = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMahasiswa = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMhsNama = new javax.swing.JTextField();
        txtMhsNIM = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        dateMhsBirthday = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        txtMhsBirthplace = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cboxMhsKodeDoswal = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cboxMhsJK = new javax.swing.JComboBox<>();
        btnMhsAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblDosen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode ", "Nama"
            }
        ));
        jScrollPane2.setViewportView(tblDosen);

        jLabel12.setText("Jenis Kelamin");

        cboxDsnJK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jenis Kelamin", "Perempuan", "Laki-laki" }));

        jLabel13.setText("Tanggal Lahir");

        btnDsnAdd.setText("Tambahkan Dosen");

        jLabel14.setText("Tempat lahir");

        jLabel15.setText("Tambah Dosen Baru");

        jLabel16.setText("Nama");

        jLabel18.setText("Kode");

        javax.swing.GroupLayout DosenLayout = new javax.swing.GroupLayout(Dosen);
        Dosen.setLayout(DosenLayout);
        DosenLayout.setHorizontalGroup(
            DosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
            .addGroup(DosenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(DosenLayout.createSequentialGroup()
                        .addGroup(DosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel16)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel12))
                        .addGap(115, 115, 115)
                        .addGroup(DosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDsnAdd)
                            .addComponent(cboxDsnJK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(DosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtDsnNama)
                                .addComponent(txtDsnKode)
                                .addComponent(dateDsnBirthday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDsnBirthplace, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DosenLayout.setVerticalGroup(
            DosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DosenLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtDsnNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtDsnKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(dateDsnBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(txtDsnBirthplace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(cboxDsnJK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDsnAdd)
                .addGap(0, 47, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Dosen", Dosen);

        jLabel2.setText("Nama Mata Kuliah");

        jLabel3.setText("SKS");

        jLabel4.setText("Dosen");

        txtKodeMatkul.setText("Input Kode Mata Kuliah");

        txtNamaMatkul.setText("Input Nama Mata Kuliah");

        cboxSKS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sks", "1", "2", "3", "4" }));

        btnAddMatkul.setText("Tambah");

        jLabel1.setText("Kode Mata Kuliah");

        tblMatkul.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Matakuliah", "Judul Mata Kuliah", "SKS", "Dosen"
            }
        ));
        jScrollPane3.setViewportView(tblMatkul);

        javax.swing.GroupLayout Dosen1Layout = new javax.swing.GroupLayout(Dosen1);
        Dosen1.setLayout(Dosen1Layout);
        Dosen1Layout.setHorizontalGroup(
            Dosen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(Dosen1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Dosen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addGap(39, 39, 39)
                .addGroup(Dosen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtKodeMatkul)
                    .addComponent(txtNamaMatkul, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                    .addGroup(Dosen1Layout.createSequentialGroup()
                        .addGroup(Dosen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddMatkul)
                            .addComponent(cboxSKS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboxKodeDosen, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Dosen1Layout.setVerticalGroup(
            Dosen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Dosen1Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Dosen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKodeMatkul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Dosen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNamaMatkul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Dosen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboxSKS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Dosen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboxKodeDosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddMatkul)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Mata Kuliah", Dosen1);

        tblMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama ", "NIM", "Title 3"
            }
        ));
        tblMahasiswa.setToolTipText("");
        jScrollPane1.setViewportView(tblMahasiswa);

        jLabel5.setText("Tambah Mahasiswa Baru");

        jLabel6.setText("Nama");

        jLabel7.setText("NIM");

        txtMhsNIM.setEditable(false);

        jLabel8.setText("Tanggal Lahir");

        jLabel9.setText("Tempat lahir");

        jLabel10.setText("Dosen Wali");

        jLabel11.setText("Jenis Kelamin");

        cboxMhsJK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jenis Kelamin", "Perempuan", "Laki-laki" }));

        btnMhsAdd.setText("Tambahkan Mahasiswa");

        javax.swing.GroupLayout MahasiswaLayout = new javax.swing.GroupLayout(Mahasiswa);
        Mahasiswa.setLayout(MahasiswaLayout);
        MahasiswaLayout.setHorizontalGroup(
            MahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
            .addGroup(MahasiswaLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(MahasiswaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(115, 115, 115)
                .addGroup(MahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMhsAdd)
                    .addComponent(cboxMhsJK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtMhsNama)
                        .addComponent(txtMhsNIM, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                        .addComponent(dateMhsBirthday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMhsBirthplace))
                    .addComponent(cboxMhsKodeDoswal, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MahasiswaLayout.setVerticalGroup(
            MahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MahasiswaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtMhsNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtMhsNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(dateMhsBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtMhsBirthplace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(cboxMhsKodeDoswal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(cboxMhsJK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMhsAdd)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Mahasiswa", Mahasiswa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Dosen;
    private javax.swing.JPanel Dosen1;
    private javax.swing.JPanel Mahasiswa;
    private javax.swing.JButton btnAddMatkul;
    private javax.swing.JButton btnDsnAdd;
    private javax.swing.JButton btnMhsAdd;
    private javax.swing.JComboBox<String> cboxDsnJK;
    private javax.swing.JComboBox<String> cboxKodeDosen;
    private javax.swing.JComboBox<String> cboxMhsJK;
    private javax.swing.JComboBox<String> cboxMhsKodeDoswal;
    private javax.swing.JComboBox<String> cboxSKS;
    private com.toedter.calendar.JDateChooser dateDsnBirthday;
    private com.toedter.calendar.JDateChooser dateMhsBirthday;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable tblDosen;
    private javax.swing.JTable tblMahasiswa;
    private javax.swing.JTable tblMatkul;
    private javax.swing.JTextField txtDsnBirthplace;
    private javax.swing.JTextField txtDsnKode;
    private javax.swing.JTextField txtDsnNama;
    private javax.swing.JTextField txtKodeMatkul;
    private javax.swing.JTextField txtMhsBirthplace;
    private javax.swing.JTextField txtMhsNIM;
    private javax.swing.JTextField txtMhsNama;
    private javax.swing.JTextField txtNamaMatkul;
    // End of variables declaration//GEN-END:variables
}