/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Nuew
 */
public class MainAdmin extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public MainAdmin() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        execute();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Navbar = new javax.swing.JPanel();
        Sidebar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnMenu = new javax.swing.JPanel();
        ContentWrapper = new javax.swing.JPanel();
        Content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Navbar.setBackground(new java.awt.Color(54, 55, 85));
        Navbar.setPreferredSize(new java.awt.Dimension(846, 70));

        javax.swing.GroupLayout NavbarLayout = new javax.swing.GroupLayout(Navbar);
        Navbar.setLayout(NavbarLayout);
        NavbarLayout.setHorizontalGroup(
            NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1005, Short.MAX_VALUE)
        );
        NavbarLayout.setVerticalGroup(
            NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(Navbar, java.awt.BorderLayout.PAGE_START);

        Sidebar.setBackground(new java.awt.Color(224, 228, 239));
        Sidebar.setPreferredSize(new java.awt.Dimension(250, 471));

        jScrollPane1.setBackground(new java.awt.Color(224, 228, 239));
        jScrollPane1.setBorder(null);

        pnMenu.setBackground(new java.awt.Color(224, 228, 239));
        pnMenu.setLayout(new javax.swing.BoxLayout(pnMenu, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(pnMenu);

        javax.swing.GroupLayout SidebarLayout = new javax.swing.GroupLayout(Sidebar);
        Sidebar.setLayout(SidebarLayout);
        SidebarLayout.setHorizontalGroup(
            SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        SidebarLayout.setVerticalGroup(
            SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
        );

        getContentPane().add(Sidebar, java.awt.BorderLayout.LINE_START);

        ContentWrapper.setBackground(new java.awt.Color(255, 255, 255));

        Content.setBackground(new java.awt.Color(255, 255, 255));
        Content.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout ContentWrapperLayout = new javax.swing.GroupLayout(ContentWrapper);
        ContentWrapper.setLayout(ContentWrapperLayout);
        ContentWrapperLayout.setHorizontalGroup(
            ContentWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ContentWrapperLayout.setVerticalGroup(
            ContentWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(ContentWrapper, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1021, 663));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Content.add(new Admin.Content());
        Content.repaint();
        Content.revalidate();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Content;
    private javax.swing.JPanel ContentWrapper;
    private javax.swing.JPanel Navbar;
    private javax.swing.JPanel Sidebar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnMenu;
    // End of variables declaration//GEN-END:variables

    private void execute() {
       ImageIcon iconDashboard = new ImageIcon(getClass().getResource("/icon/icons8_health_data_24px.png"));
       ImageIcon iconBarang = new ImageIcon(getClass().getResource("/icon/icons8_box_24px.png"));
       ImageIcon iconBarangMasuk = new ImageIcon(getClass().getResource("/icon/icons8_packing_24px.png"));
       ImageIcon iconBarangKeluar = new ImageIcon(getClass().getResource("/icon/icons8_unpacking_24px.png"));
       ImageIcon iconRequestKeluar = new ImageIcon(getClass().getResource("/icon/icons8_Circled_Up_Right_24px.png"));
       ImageIcon iconRequestMasuk = new ImageIcon(getClass().getResource("/icon/icons8_Circled_Down_Left_Arrow_24px.png"));
       ImageIcon iconBarangShow = new ImageIcon(getClass().getResource("/icon/icons8_tiles_24px.png"));
       ImageIcon iconTransaksi = new ImageIcon(getClass().getResource("/icon/icons8_Banknotes_24px.png"));
       ImageIcon iconLaporan = new ImageIcon(getClass().getResource("/icon/icons8_google_docs_24px.png"));
       ImageIcon iconLogout = new ImageIcon(getClass().getResource("/icon/icons8_Logout_24px.png"));
       
       Menu menuBarangMasuk = new Menu(null, true, iconBarangMasuk, "Barang Masuk", null);
       Menu menuBarangKeluar = new Menu(null, true, iconBarangKeluar, "Barang Keluar", null);
       Menu menuRequestKeluar = new Menu(null, true, iconRequestKeluar, "Request Keluar", null);
       Menu menuRequestMasuk = new Menu(null, true, iconRequestMasuk, "Request Masuk", null);
       Menu menuBarangShow = new Menu(null, true, iconBarangShow, "Data Barang", new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
                Content.removeAll();
                Content.add(new ShowBarang_());
                Content.repaint();
                Content.revalidate();
           }
       });
       
       Menu menuDashboard = new Menu(iconDashboard, false, null, "Dashboard", null);
       Menu menuBarang = new Menu(iconBarang, false, null, "Barang", null,menuBarangShow, menuBarangMasuk, menuBarangKeluar);
       Menu menuRequest = new Menu(iconBarang, false, null, "Data Request", null, menuRequestMasuk, menuRequestKeluar);
       Menu menuTransaksi = new Menu(iconTransaksi, false, null, "Transaksi", null);
       Menu menuLaporan = new Menu(iconLaporan, false, null, "Laporan", null);
       Menu menuLogout = new Menu(iconLogout, false, null, "Logout", null);
       
       addMenu(menuDashboard, menuBarang, menuRequest, menuTransaksi, menuLaporan, menuLogout);
    }
    
    private void addMenu(Menu... menu){
        for (int i = 0; i < menu.length; i++){
            pnMenu.add(menu[i]);
            ArrayList<Menu> listMenu = menu[i].getListMenu();
            for(Menu m : listMenu){
                addMenu(m);
            }
        }
        pnMenu.revalidate();
    }
}
