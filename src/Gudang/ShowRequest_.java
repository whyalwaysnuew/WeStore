/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Gudang;

import Database.Koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Nuew
 */
public class ShowRequest_ extends javax.swing.JPanel {
    
    public final Connection conn = new Koneksi().connect();

    private DefaultTableModel tabmode;
    
    public void noTable(){
        int Baris = tabmode.getRowCount();
        for (int a=0; a<Baris; a++)
        {
            String nomor = String.valueOf(a+1);
            tabmode.setValueAt(nomor,a,0);
        }
    }
    
    public void dataRequestMasuk(){
        Object[] Baris = {"No", "Kode Request", "Kode Barang", "Nama Barang", "Jumlah", "Kategori", "Status", "Keterangan", "Tanggal-Waktu"};
        tabmode = new DefaultTableModel(null, Baris);
        TableReqMasuk.setModel(tabmode);
        String sql = "SELECT * FROM data_masuk";
        try{
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String id = hasil.getString("id");
                String kode_barang = hasil.getString("kode_barang");
                String nama = hasil.getString("nama_barang");
                String jumlah = hasil.getString("jumlah");
                String kategori = hasil.getString("kategori");
                String status = hasil.getString("status");
                String keterangan = hasil.getString("keterangan");
                String timestamp = hasil.getString("created_at");
                String[] data = {"",id, kode_barang, nama,jumlah,kategori, status, keterangan, timestamp};
                tabmode.addRow(data);
                noTable();
            }
        }catch(Exception e){
            
        }
    }
    
    public void dataRequestKeluar(){
        Object[] Baris = {"No", "Kode Request", "Kode Barang", "Nama Barang", "Jumlah", "Kategori", "Status", "Keterangan", "Tanggal-Waktu"};
        tabmode = new DefaultTableModel(null, Baris);
        TableReqKeluar.setModel(tabmode);
        String sql = "SELECT * FROM data_keluar";
        try{
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String id = hasil.getString("id");
                String kode_barang = hasil.getString("kode_barang");
                String nama = hasil.getString("nama_barang");
                String jumlah = hasil.getString("jumlah");
                String kategori = hasil.getString("kategori");
                String status = hasil.getString("status");
                String keterangan = hasil.getString("keterangan");
                String timestamp = hasil.getString("created_at");
                String[] data = {"",id, kode_barang, nama,jumlah,kategori, status, keterangan, timestamp};
                tabmode.addRow(data);
                noTable();
            }
        }catch(Exception e){
            
        }
    }
    
    public void cariRequest(String sql){
        Object[] Baris = {"No", "Kode Request", "Kode Barang", "Nama Barang", "Jumlah", "Kategori", "Status", "Keterangan", "Tanggal"};
        tabmode = new DefaultTableModel(null, Baris);
        TableReqMasuk.setModel(tabmode);
        int brs = TableReqMasuk.getRowCount();
        for (int i = 0; 1 < brs; i++){
            tabmode.removeRow(1);
        }
        try{
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String id = hasil.getString("id");
                String kode_barang = hasil.getString("kode_barang");
                String nama = hasil.getString("nama_barang");
                String jumlah = hasil.getString("jumlah");
                String kategori = hasil.getString("kategori");
                String status = hasil.getString("status");
                String keterangan = hasil.getString("keterangan");
                String tanggal = hasil.getString("created_at");
                String[] data = {"",id, kode_barang, nama,jumlah,kategori, status, keterangan, tanggal};
                tabmode.addRow(data);
                noTable();
            }
        }catch(Exception e){
            
        }
    }

    public void cariRequest2(String sql){
        Object[] Baris = {"No", "Kode Request", "Kode Barang", "Nama Barang", "Jumlah", "Kategori", "Status", "Keterangan", "Tanggal"};
        tabmode = new DefaultTableModel(null, Baris);
        TableReqKeluar.setModel(tabmode);
        int brs = TableReqKeluar.getRowCount();
        for (int i = 0; 1 < brs; i++){
            tabmode.removeRow(1);
        }
        try{
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String id = hasil.getString("id");
                String kode_barang = hasil.getString("kode_barang");
                String nama = hasil.getString("nama_barang");
                String jumlah = hasil.getString("jumlah");
                String kategori = hasil.getString("kategori");
                String status = hasil.getString("status");
                String keterangan = hasil.getString("keterangan");
                String tanggal = hasil.getString("created_at");
                String[] data = {"",id, kode_barang, nama,jumlah,kategori, status, keterangan, tanggal};
                tabmode.addRow(data);
                noTable();
            }
        }catch(Exception e){
            
        }
    }
    
    /**
     * Creates new form RequestMasuk_
     */
    public ShowRequest_() {
        initComponents();
        dataRequestMasuk();
        dataRequestKeluar();
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
        ScrollRequest = new javax.swing.JScrollPane();
        TableReqMasuk = new javax.swing.JTable();
        Title = new javax.swing.JLabel();
        searchInput = new javax.swing.JTextField();
        ScrollRequest2 = new javax.swing.JScrollPane();
        TableReqKeluar = new javax.swing.JTable();
        requestKeluar = new javax.swing.JLabel();
        requestMasuk = new javax.swing.JLabel();
        searchInput2 = new javax.swing.JTextField();

        setLayout(new java.awt.CardLayout());

        PanelRequest.setLayout(new java.awt.CardLayout());

        ContentRequest.setBackground(new java.awt.Color(255, 255, 255));

        TableReqMasuk.setModel(new javax.swing.table.DefaultTableModel(
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
        TableReqMasuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableReqMasukMouseClicked(evt);
            }
        });
        ScrollRequest.setViewportView(TableReqMasuk);

        Title.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        Title.setText("Data Request");

        searchInput.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        searchInput.setText("Cari data request...");
        searchInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchInputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchInputFocusLost(evt);
            }
        });
        searchInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchInputKeyTyped(evt);
            }
        });

        TableReqKeluar.setModel(new javax.swing.table.DefaultTableModel(
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
        TableReqKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableReqKeluarMouseClicked(evt);
            }
        });
        ScrollRequest2.setViewportView(TableReqKeluar);

        requestKeluar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        requestKeluar.setText("Request Keluar");

        requestMasuk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        requestMasuk.setText("Request Masuk");

        searchInput2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        searchInput2.setText("Cari data request...");
        searchInput2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchInput2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchInput2FocusLost(evt);
            }
        });
        searchInput2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchInput2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout ContentRequestLayout = new javax.swing.GroupLayout(ContentRequest);
        ContentRequest.setLayout(ContentRequestLayout);
        ContentRequestLayout.setHorizontalGroup(
            ContentRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentRequestLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContentRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollRequest, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE)
                    .addGroup(ContentRequestLayout.createSequentialGroup()
                        .addComponent(requestMasuk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ScrollRequest2)
                    .addGroup(ContentRequestLayout.createSequentialGroup()
                        .addComponent(Title)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ContentRequestLayout.createSequentialGroup()
                        .addComponent(requestKeluar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchInput2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        ContentRequestLayout.setVerticalGroup(
            ContentRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentRequestLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Title)
                .addGap(25, 25, 25)
                .addGroup(ContentRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ContentRequestLayout.createSequentialGroup()
                        .addGroup(ContentRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(requestMasuk))
                        .addGap(18, 18, 18)
                        .addComponent(ScrollRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(requestKeluar))
                    .addComponent(searchInput2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ScrollRequest2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        PanelRequest.add(ContentRequest, "card2");

        add(PanelRequest, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void searchInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchInputKeyTyped
        System.out.println(searchInput.getText());
        String sqlPencarian = "SELECT * FROM data_masuk WHERE nama_barang LIKE '%"+searchInput.getText()+"%' OR kode_barang LIKE '%"+searchInput.getText()+"%'";
        cariRequest(sqlPencarian);
    }//GEN-LAST:event_searchInputKeyTyped

    private void searchInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchInputFocusGained
        String cari = searchInput.getText();
        if(cari.equals("Cari data request...")){
            searchInput.setText("");
        }
    }//GEN-LAST:event_searchInputFocusGained

    private void searchInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchInputFocusLost
        String cari = searchInput.getText();
        if(cari.equals("Cari data request...") || cari.equals("")){
            searchInput.setText("Cari data request...");
        }
    }//GEN-LAST:event_searchInputFocusLost

    private void TableReqMasukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableReqMasukMouseClicked
        //
    }//GEN-LAST:event_TableReqMasukMouseClicked

    private void TableReqKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableReqKeluarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TableReqKeluarMouseClicked

    private void searchInput2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchInput2FocusGained
        String cari = searchInput2.getText();
        if(cari.equals("Cari data request...")){
            searchInput2.setText("");
        }
    }//GEN-LAST:event_searchInput2FocusGained

    private void searchInput2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchInput2FocusLost
        String cari = searchInput2.getText();
        if(cari.equals("Cari data request...") || cari.equals("")){
            searchInput2.setText("Cari data request...");
        }
    }//GEN-LAST:event_searchInput2FocusLost

    private void searchInput2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchInput2KeyTyped
        System.out.println(searchInput2.getText());
        String sqlPencarian = "SELECT * FROM data_keluar WHERE nama_barang LIKE '%"+searchInput2.getText()+"%' OR kode_barang LIKE '%"+searchInput2.getText()+"%'";
        cariRequest2(sqlPencarian);
    }//GEN-LAST:event_searchInput2KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContentRequest;
    private javax.swing.JPanel PanelRequest;
    private javax.swing.JScrollPane ScrollRequest;
    private javax.swing.JScrollPane ScrollRequest2;
    private javax.swing.JTable TableReqKeluar;
    private javax.swing.JTable TableReqMasuk;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel requestKeluar;
    private javax.swing.JLabel requestMasuk;
    private javax.swing.JTextField searchInput;
    private javax.swing.JTextField searchInput2;
    // End of variables declaration//GEN-END:variables
}
