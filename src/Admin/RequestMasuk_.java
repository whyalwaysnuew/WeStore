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
public class RequestMasuk_ extends javax.swing.JPanel {
    
    public final Connection conn = new Koneksi().connect();

    private DefaultTableModel tabmode;
    
    public void aktif(){
        terimaBtn.setEnabled(false);
        tolakBtn.setEnabled(false);
    }
    
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
                String[] data = {"","REQ"+id, kode_barang, nama,jumlah,kategori, status, keterangan, tanggal};
                tabmode.addRow(data);
                noTable();
            }
        }catch(Exception e){
            
        }
    }

    
    /**
     * Creates new form RequestMasuk_
     */
    public RequestMasuk_() {
        initComponents();
        aktif();
        dataRequestMasuk();
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
        terimaBtn = new javax.swing.JButton();
        tolakBtn = new javax.swing.JButton();

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
        Title.setText("Data Request Masuk");

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

        terimaBtn.setBackground(new java.awt.Color(0, 102, 51));
        terimaBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        terimaBtn.setForeground(new java.awt.Color(255, 255, 255));
        terimaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Checkmark_20px.png"))); // NOI18N
        terimaBtn.setText("Terima");
        terimaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terimaBtnActionPerformed(evt);
            }
        });

        tolakBtn.setBackground(new java.awt.Color(153, 0, 0));
        tolakBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tolakBtn.setForeground(new java.awt.Color(255, 255, 255));
        tolakBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_cancel_20px.png"))); // NOI18N
        tolakBtn.setText("Tolak");
        tolakBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tolakBtnActionPerformed(evt);
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
                        .addComponent(Title)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ContentRequestLayout.createSequentialGroup()
                        .addComponent(terimaBtn)
                        .addGap(18, 18, 18)
                        .addComponent(tolakBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        ContentRequestLayout.setVerticalGroup(
            ContentRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentRequestLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Title)
                .addGap(18, 18, 18)
                .addGroup(ContentRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(terimaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tolakBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ScrollRequest, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                .addGap(108, 108, 108))
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

    private void terimaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terimaBtnActionPerformed
        int row = TableReqMasuk.getSelectedRow();
        String id = tabmode.getValueAt(row, 1).toString();
        String requestmasuk_kode = tabmode.getValueAt(row, 2).toString();
        String requestmasuk_nama = tabmode.getValueAt(row, 3).toString();
        String requestmasuk_jumlah = tabmode.getValueAt(row, 4).toString();
        String requestmasuk_kategori = tabmode.getValueAt(row, 5).toString();
        
        int ok = JOptionPane.showConfirmDialog(null, " Apakah Anda Yakin Ingin "
            + "Terima Request Masuk "+ requestmasuk_kode +"?", "Request masuk", JOptionPane.YES_NO_OPTION);
        
        if(ok == 0){
            String queryBarang = "SELECT id, jumlah FROM data_barang";
            String sql = "UPDATE data_masuk SET status='approved' WHERE id='" + id + "'";
            String insertBarang = "INSERT INTO data_barang (id,nama,jumlah,kategori)  VALUES('"
                    +requestmasuk_kode+"','"
                    +requestmasuk_nama+"','"
                    +requestmasuk_jumlah+"','"
                    +requestmasuk_kategori+"');";
            try{
                java.sql.Statement insert = conn.createStatement();
                
                java.sql.Statement detail = conn.createStatement();
                ResultSet databarang = detail.executeQuery(queryBarang);
                
                while(databarang.next()){
                    String databarang_id = databarang.getString("id");
                    String databarang_jumlah = databarang.getString("jumlah");
                    
                    System.out.println(requestmasuk_kode);
                    System.out.println(databarang_id);
                        if(requestmasuk_kode.equals(databarang_id)){
                            java.sql.Statement update = conn.createStatement();
                            
                            String total = databarang_jumlah + requestmasuk_jumlah;
                            String updatequery = "UPDATE data_barang SET jumlah='"+total+"' WHERE id='" + requestmasuk_kode + "'";
                            try{
                                update.executeUpdate(updatequery);
                                insert.executeUpdate(sql);
                                JOptionPane.showMessageDialog(null, "Data Barang " +requestmasuk_kode+ " telah diperbarui!");
                                JOptionPane.showMessageDialog(null, "Request Masuk "+ requestmasuk_kode +" telah diterima");
                            } catch(Exception error){
                                JOptionPane.showMessageDialog(null, "Data Barang " +requestmasuk_kode+ " gagal diperbarui! \n"+error);
                            }
                        } else {
                            try{
                                insert.executeUpdate(insertBarang);
                                insert.executeUpdate(sql);
                                JOptionPane.showMessageDialog(null, "Berhasil Input Data Barang " +requestmasuk_kode);
                                JOptionPane.showMessageDialog(null, "Request Masuk "+ requestmasuk_kode +" telah diterima");
                            } catch(Exception error){
                                JOptionPane.showMessageDialog(null, "Gagal Input Data Barang " +requestmasuk_kode+ " \n"+error);
                            }
                        }
                    databarang.close();
                }
            } catch(Exception error){
                //                    
            }
        }
        this.removeAll();
        this.add(new RequestMasuk_());
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_terimaBtnActionPerformed

    private void tolakBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tolakBtnActionPerformed
        int row = TableReqMasuk.getSelectedRow();
        String id = tabmode.getValueAt(row, 1).toString();
        String requestmasuk_kode = tabmode.getValueAt(row, 2).toString();
        
        int ok = JOptionPane.showConfirmDialog(null, " Apakah Anda Yakin Ingin\n"
            + "Tolak Request Masuk "+ requestmasuk_kode +"?", "Request Masuk", JOptionPane.YES_NO_OPTION);
        
        if(ok == 0){
            String sql = "UPDATE data_masuk SET status='declined' WHERE id='" + id + "'";
            try{
                java.sql.PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Request Masuk "+ requestmasuk_kode +" telah ditolak");
                this.removeAll();
                this.add(new RequestMasuk_());
                this.repaint();
                this.revalidate();
            } catch(Exception error){
                JOptionPane.showMessageDialog(null, "Request Masuk "+ requestmasuk_kode +" gagal ditolak! \n"+error);
            }
        }
    }//GEN-LAST:event_tolakBtnActionPerformed

    private void TableReqMasukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableReqMasukMouseClicked
        int row = TableReqMasuk.getSelectedRow();
        String status = tabmode.getValueAt(row, 6).toString();
        System.out.println(status);
        if("approved".equals(status) || "declined".equals(status)){
            terimaBtn.setEnabled(false);
            tolakBtn.setEnabled(false);
        }else{
            terimaBtn.setEnabled(true);
            tolakBtn.setEnabled(true);
        }
    }//GEN-LAST:event_TableReqMasukMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContentRequest;
    private javax.swing.JPanel PanelRequest;
    private javax.swing.JScrollPane ScrollRequest;
    private javax.swing.JTable TableReqMasuk;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField searchInput;
    private javax.swing.JButton terimaBtn;
    private javax.swing.JButton tolakBtn;
    // End of variables declaration//GEN-END:variables
}
