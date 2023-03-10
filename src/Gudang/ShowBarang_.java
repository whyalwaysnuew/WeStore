/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Gudang;

import Database.Koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Nuew
 */
public class ShowBarang_ extends javax.swing.JPanel {
    
    public final Connection conn = new Koneksi().connect();

    private DefaultTableModel tabmode;
    
    //    
    public void noTable(){
        int Baris = tabmode.getRowCount();
        for (int a=0; a<Baris; a++)
        {
            String nomor = String.valueOf(a+1);
            tabmode.setValueAt(nomor,a,0);
        }
    }
    
    public void dataShowBarang(){
        Object[] Baris = {"No", "Kode Barang", "Nama Barang", "Jumlah", "Kategori"};
        tabmode = new DefaultTableModel(null, Baris);
        TableShow.setModel(tabmode);
        String sql = "SELECT * FROM data_barang";
        try{
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String id = hasil.getString("id");
                String nama = hasil.getString("nama");
                String jumlah = hasil.getString("jumlah");
                String kategori = hasil.getString("kategori");
                String[] data = {"",id,nama,jumlah,kategori};
                tabmode.addRow(data);
                noTable();
            }
        }catch(Exception e){
            
        }
    }
    
    public void cariBarang(String sql){
        Object[] Baris = {"No", "Kode Barang", "Nama Barang", "Jumlah", "Kategori"};
        tabmode = new DefaultTableModel(null, Baris);
        TableShow.setModel(tabmode);
        int brs = TableShow.getRowCount();
        for (int i = 0; 1 < brs; i++){
            tabmode.removeRow(1);
        }
        try{
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String id = hasil.getString("id");
                String nama = hasil.getString("nama");
                String jumlah = hasil.getString("jumlah");
                String kategori = hasil.getString("kategori");
                String[] data = {"",id,nama,kategori,jumlah,kategori};
                tabmode.addRow(data);
                noTable();
            }
        }catch(Exception e){
            
        }
    }
    
    
    /**
     * Creates new form ShowBarang_
     */
    public ShowBarang_() {
        initComponents();
        dataShowBarang();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelShow = new javax.swing.JPanel();
        ContentShow = new javax.swing.JPanel();
        ScrollShow = new javax.swing.JScrollPane();
        TableShow = new javax.swing.JTable();
        Title = new javax.swing.JLabel();
        searchInput = new javax.swing.JTextField();
        cetakBtn = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        PanelShow.setLayout(new java.awt.CardLayout());

        ContentShow.setBackground(new java.awt.Color(255, 255, 255));

        TableShow.setModel(new javax.swing.table.DefaultTableModel(
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
        ScrollShow.setViewportView(TableShow);

        Title.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        Title.setText("Data Barang");

        searchInput.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        searchInput.setText("Cari Barang...");
        searchInput.setMinimumSize(new java.awt.Dimension(6, 29));
        searchInput.setPreferredSize(new java.awt.Dimension(74, 29));
        searchInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchInputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchInputFocusLost(evt);
            }
        });
        searchInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchInputActionPerformed(evt);
            }
        });
        searchInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchInputKeyTyped(evt);
            }
        });

        cetakBtn.setBackground(new java.awt.Color(0, 0, 102));
        cetakBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cetakBtn.setForeground(new java.awt.Color(255, 255, 255));
        cetakBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_print_20px_1.png"))); // NOI18N
        cetakBtn.setText("Cetak Laporan");
        cetakBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContentShowLayout = new javax.swing.GroupLayout(ContentShow);
        ContentShow.setLayout(ContentShowLayout);
        ContentShowLayout.setHorizontalGroup(
            ContentShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentShowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContentShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentShowLayout.createSequentialGroup()
                        .addComponent(Title)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ContentShowLayout.createSequentialGroup()
                        .addGroup(ContentShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ScrollShow, javax.swing.GroupLayout.DEFAULT_SIZE, 881, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentShowLayout.createSequentialGroup()
                                .addComponent(cetakBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        ContentShowLayout.setVerticalGroup(
            ContentShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentShowLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ContentShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cetakBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(ScrollShow, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                .addGap(73, 73, 73))
        );

        PanelShow.add(ContentShow, "card2");

        add(PanelShow, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void searchInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchInputActionPerformed

    private void searchInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchInputFocusLost
        String cari = searchInput.getText();
        if(cari.equals("Cari Barang...") || cari.equals("")){
            searchInput.setText("Cari Barang...");
        }
    }//GEN-LAST:event_searchInputFocusLost

    private void searchInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchInputFocusGained
        String cari = searchInput.getText();
        if(cari.equals("Cari Barang...")){
            searchInput.setText("");
        }
    }//GEN-LAST:event_searchInputFocusGained

    private void searchInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchInputKeyTyped
        String sqlPencarian = "SELECT * FROM data_barang WHERE id LIKE '%"+searchInput.getText()+"%' OR nama LIKE '%"+searchInput.getText()+"%'";
        cariBarang(sqlPencarian);
    }//GEN-LAST:event_searchInputKeyTyped

    private void cetakBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakBtnActionPerformed
        JasperReport laporan;
        
        String path = ".\\src\\Laporan\\DataBarang.jasper";
        try {
            laporan = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint cetak = JasperFillManager.fillReport(path, null, conn);
            JasperViewer cetakViewer = new JasperViewer(cetak, false);
            cetakViewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            cetakViewer.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Admin.ShowBarang_.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cetakBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContentShow;
    private javax.swing.JPanel PanelShow;
    private javax.swing.JScrollPane ScrollShow;
    private javax.swing.JTable TableShow;
    private javax.swing.JLabel Title;
    private javax.swing.JButton cetakBtn;
    private javax.swing.JTextField searchInput;
    // End of variables declaration//GEN-END:variables
}
