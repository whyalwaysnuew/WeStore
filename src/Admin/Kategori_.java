/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Admin;

import Database.Koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Nuew
 */
public class Kategori_ extends javax.swing.JPanel {
    
    public final Connection conn = new Koneksi().connect();
    java.sql.PreparedStatement getKategori;
    ResultSet dataKategori;
    
    private DefaultTableModel tabmode;
    
    public void disabledInput(){
        kodeInput.setEditable(false);
        hapusBtn.setEnabled(false);
        ubahBtn.setEnabled(false);
    }
    
    public void noTable(){
        int Baris = tabmode.getRowCount();
        for (int a=0; a<Baris; a++)
        {
            String nomor = String.valueOf(a+1);
            tabmode.setValueAt(nomor,a,0);
        }
    }
    
    public void ubahKategori(){
        int row = TableKategori.getSelectedRow();
        String namaK = tabmode.getValueAt(row, 2).toString();
        int ok = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin \n"
                + "Ingin Mengubah Data Kategori "+namaK+"?", "Ubah Kategori", JOptionPane.YES_NO_OPTION);
        
        if(ok == 0){
            try{
                String kode = kodeInput.getText();
                String nama = namaInput.getText();

                java.sql.Statement stat = conn.createStatement();
                String sql = "UPDATE kategori SET nama='"+ nama +"' WHERE id='" + kode + "'";
                stat.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Berhasil Mengubah Kategori "+namaK);
            } catch(Exception error){
                JOptionPane.showMessageDialog(null, "Gagal Mengubah kategori"+namaK+"!\n"+error);
            }
            
        this.removeAll();
        this.add(new Kategori_());
        this.repaint();
        this.revalidate();
        }
    }
    
    public void tambahKategori(){
        String nama = kategoribaruInput.getText();
        if(nama.equals("")){
            JOptionPane.showMessageDialog(null, "Nama Kategori tidak boleh kosong!");
        }else{
            try{
                java.sql.Statement stat = conn.createStatement();
                String sql = "INSERT INTO kategori (nama) VALUES ('"+nama+"')";
                stat.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Berhasil Menambahkan Kategori "+nama);
            }catch(Exception error){
                JOptionPane.showMessageDialog(null, "Gagal Menambahkan Kategori!\n"+error);
            }
        }
        
        this.removeAll();
        this.add(new Kategori_());
        this.repaint();
        this.revalidate();
    }
    
    public void hapusKategori(){
        int row = TableKategori.getSelectedRow();
        String kode = tabmode.getValueAt(row, 1).toString();
        String nama = tabmode.getValueAt(row, 2).toString();
        
        int ok = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin \n"
                + "Ingin Menghapus Data Kategori "+nama+"?", "Hapus Kategori", JOptionPane.YES_NO_OPTION);
        if(ok == 0){
            try{
                java.sql.Statement stat = conn.createStatement();
                String sql = "DELETE FROM kategori WHERE id='"+kode+"'";
                stat.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Berhasil Menghapus Kategori "+nama);
            }catch(Exception error){
                JOptionPane.showMessageDialog(null, "Gagal Menghapus Kategori"+nama+"!\n"+error);
            }
            
            this.removeAll();
            this.add(new Kategori_());
            this.repaint();
            this.revalidate();
        }
    }
    
    public void TabelKategori(){
        Object[] Baris = {"No", "ID Kategori", "Nama Kategori"};
        tabmode = new DefaultTableModel(null, Baris);
        TableKategori.setModel(tabmode);
        String sql = "SELECT * FROM kategori";
        try{
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String id = hasil.getString("id");
                String nama = hasil.getString("nama");
                String[] data = {"", id, nama};
                tabmode.addRow(data);
                noTable();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Gagal Menampilkan Data Barang \n"+e);
        }
    }

    /**
     * Creates new form RequestMasuk_
     */
    public Kategori_() {
        initComponents();
        disabledInput();
        TabelKategori();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelRequest = new javax.swing.JPanel();
        ContentRequest = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        PanelKode = new javax.swing.JPanel();
        kodeLabel = new javax.swing.JLabel();
        kodeInput = new javax.swing.JTextField();
        PanelNama = new javax.swing.JPanel();
        namaLabel = new javax.swing.JLabel();
        namaInput = new javax.swing.JTextField();
        ubahBtn = new javax.swing.JButton();
        PanelBarang = new javax.swing.JPanel();
        ScrollBarang = new javax.swing.JScrollPane();
        TableKategori = new javax.swing.JTable();
        tabelLabel = new javax.swing.JLabel();
        hapusBtn = new javax.swing.JButton();
        PanelTambahKategori = new javax.swing.JPanel();
        tambahLabel = new javax.swing.JLabel();
        kategoribaruInput = new javax.swing.JTextField();
        tambahBtn = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        PanelRequest.setLayout(new java.awt.CardLayout());

        ContentRequest.setBackground(new java.awt.Color(255, 255, 255));

        Title.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        Title.setText("Request Keluar Barang");

        PanelKode.setBackground(new java.awt.Color(255, 255, 255));

        kodeLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kodeLabel.setForeground(new java.awt.Color(54, 55, 85));
        kodeLabel.setText("Kode Barang");

        javax.swing.GroupLayout PanelKodeLayout = new javax.swing.GroupLayout(PanelKode);
        PanelKode.setLayout(PanelKodeLayout);
        PanelKodeLayout.setHorizontalGroup(
            PanelKodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKodeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelKodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kodeInput)
                    .addGroup(PanelKodeLayout.createSequentialGroup()
                        .addComponent(kodeLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelKodeLayout.setVerticalGroup(
            PanelKodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKodeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kodeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kodeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelNama.setBackground(new java.awt.Color(255, 255, 255));

        namaLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        namaLabel.setForeground(new java.awt.Color(54, 55, 85));
        namaLabel.setText("Nama Kategori");

        javax.swing.GroupLayout PanelNamaLayout = new javax.swing.GroupLayout(PanelNama);
        PanelNama.setLayout(PanelNamaLayout);
        PanelNamaLayout.setHorizontalGroup(
            PanelNamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNamaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelNamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelNamaLayout.createSequentialGroup()
                        .addComponent(namaLabel)
                        .addGap(0, 414, Short.MAX_VALUE))
                    .addComponent(namaInput))
                .addContainerGap())
        );
        PanelNamaLayout.setVerticalGroup(
            PanelNamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNamaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(namaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(namaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ubahBtn.setBackground(new java.awt.Color(54, 55, 85));
        ubahBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ubahBtn.setForeground(new java.awt.Color(255, 255, 255));
        ubahBtn.setText("Ubah");
        ubahBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ubahBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ubahBtnMouseExited(evt);
            }
        });
        ubahBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahBtnActionPerformed(evt);
            }
        });

        PanelBarang.setBackground(new java.awt.Color(255, 255, 255));

        TableKategori.setModel(new javax.swing.table.DefaultTableModel(
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
        TableKategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableKategoriMouseClicked(evt);
            }
        });
        ScrollBarang.setViewportView(TableKategori);

        tabelLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tabelLabel.setText("Data Kategori");

        hapusBtn.setBackground(new java.awt.Color(153, 0, 0));
        hapusBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        hapusBtn.setForeground(new java.awt.Color(255, 255, 255));
        hapusBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_trash_20px_1.png"))); // NOI18N
        hapusBtn.setText("Hapus");
        hapusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBarangLayout = new javax.swing.GroupLayout(PanelBarang);
        PanelBarang.setLayout(PanelBarangLayout);
        PanelBarangLayout.setHorizontalGroup(
            PanelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                    .addGroup(PanelBarangLayout.createSequentialGroup()
                        .addComponent(tabelLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hapusBtn)))
                .addContainerGap())
        );
        PanelBarangLayout.setVerticalGroup(
            PanelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBarangLayout.createSequentialGroup()
                .addGroup(PanelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hapusBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(tabelLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ScrollBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelTambahKategori.setBackground(new java.awt.Color(255, 255, 255));

        tambahLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tambahLabel.setForeground(new java.awt.Color(54, 55, 85));
        tambahLabel.setText("Tambah Kategori");

        kategoribaruInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kategoribaruInputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                kategoribaruInputFocusLost(evt);
            }
        });
        kategoribaruInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                kategoribaruInputKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout PanelTambahKategoriLayout = new javax.swing.GroupLayout(PanelTambahKategori);
        PanelTambahKategori.setLayout(PanelTambahKategoriLayout);
        PanelTambahKategoriLayout.setHorizontalGroup(
            PanelTambahKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTambahKategoriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTambahKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTambahKategoriLayout.createSequentialGroup()
                        .addComponent(tambahLabel)
                        .addGap(0, 400, Short.MAX_VALUE))
                    .addComponent(kategoribaruInput))
                .addContainerGap())
        );
        PanelTambahKategoriLayout.setVerticalGroup(
            PanelTambahKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTambahKategoriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tambahLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kategoribaruInput, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tambahBtn.setBackground(new java.awt.Color(0, 153, 102));
        tambahBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tambahBtn.setForeground(new java.awt.Color(255, 255, 255));
        tambahBtn.setText("Tambah");
        tambahBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContentRequestLayout = new javax.swing.GroupLayout(ContentRequest);
        ContentRequest.setLayout(ContentRequestLayout);
        ContentRequestLayout.setHorizontalGroup(
            ContentRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentRequestLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContentRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentRequestLayout.createSequentialGroup()
                        .addGroup(ContentRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Title)
                            .addGroup(ContentRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tambahBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PanelTambahKategori, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ContentRequestLayout.createSequentialGroup()
                        .addComponent(PanelBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(ContentRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContentRequestLayout.createSequentialGroup()
                                .addComponent(ubahBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(PanelNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PanelKode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        ContentRequestLayout.setVerticalGroup(
            ContentRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentRequestLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Title)
                .addGap(18, 18, 18)
                .addGroup(ContentRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ContentRequestLayout.createSequentialGroup()
                        .addComponent(PanelKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PanelNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ubahBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PanelBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(PanelTambahKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tambahBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        PanelRequest.add(ContentRequest, "card2");

        add(PanelRequest, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void ubahBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahBtnActionPerformed
        ubahKategori();
    }//GEN-LAST:event_ubahBtnActionPerformed

    private void TableKategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableKategoriMouseClicked
        int row = TableKategori.getSelectedRow();
        String kode = tabmode.getValueAt(row, 1).toString();
        String nama = tabmode.getValueAt(row, 2).toString();
        
        kodeInput.setText(kode);
        namaInput.setText(nama);
        hapusBtn.setEnabled(true);
        ubahBtn.setEnabled(true);
    }//GEN-LAST:event_TableKategoriMouseClicked

    private void ubahBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ubahBtnMouseEntered
        //
    }//GEN-LAST:event_ubahBtnMouseEntered

    private void ubahBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ubahBtnMouseExited
        //        
    }//GEN-LAST:event_ubahBtnMouseExited

    private void tambahBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahBtnActionPerformed
        tambahKategori();
    }//GEN-LAST:event_tambahBtnActionPerformed

    private void hapusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusBtnActionPerformed
        hapusKategori();
    }//GEN-LAST:event_hapusBtnActionPerformed

    private void kategoribaruInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kategoribaruInputKeyTyped
        
    }//GEN-LAST:event_kategoribaruInputKeyTyped

    private void kategoribaruInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kategoribaruInputFocusGained
        
    }//GEN-LAST:event_kategoribaruInputFocusGained

    private void kategoribaruInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kategoribaruInputFocusLost
        
    }//GEN-LAST:event_kategoribaruInputFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContentRequest;
    private javax.swing.JPanel PanelBarang;
    private javax.swing.JPanel PanelKode;
    private javax.swing.JPanel PanelNama;
    private javax.swing.JPanel PanelRequest;
    private javax.swing.JPanel PanelTambahKategori;
    private javax.swing.JScrollPane ScrollBarang;
    private javax.swing.JTable TableKategori;
    private javax.swing.JLabel Title;
    private javax.swing.JButton hapusBtn;
    private javax.swing.JTextField kategoribaruInput;
    private javax.swing.JTextField kodeInput;
    private javax.swing.JLabel kodeLabel;
    private javax.swing.JTextField namaInput;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JLabel tabelLabel;
    private javax.swing.JButton tambahBtn;
    private javax.swing.JLabel tambahLabel;
    private javax.swing.JButton ubahBtn;
    // End of variables declaration//GEN-END:variables
}
