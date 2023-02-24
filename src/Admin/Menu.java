/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Admin;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Icon;

/**
 *
 * @author Nuew
 */
public class Menu extends javax.swing.JPanel {
    
    public ArrayList<Menu> getListMenu(){
        return listMenu;
    }

    private final ArrayList<Menu> listMenu = new ArrayList<>();
    private ActionListener act;
    
    /**
     * Creates new form Menu
     */
    public Menu(Icon icon, boolean sbm, Icon iconSub, String menuNama, ActionListener act, Menu... listMenu) {
        initComponents();
        
        itemIcon.setIcon(icon);
        itemMenu.setText(menuNama);
        subIcon.setIcon(iconSub);
        subIcon.setVisible(sbm);
        
        if(act != null){
            this.act = act;
        }
        this.setSize(new Dimension(Integer.MAX_VALUE, 45));
        this.setMaximumSize(new Dimension(Integer.MAX_VALUE, 45));
        this.setMinimumSize(new Dimension(Integer.MAX_VALUE, 45));
        for(int i = 0; i < listMenu.length; i++){
            this.listMenu.add(listMenu[i]);
            listMenu[i].setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        itemIcon = new javax.swing.JLabel();
        subIcon = new javax.swing.JLabel();
        itemMenu = new javax.swing.JLabel();

        setBackground(new java.awt.Color(224, 228, 239));
        setPreferredSize(new java.awt.Dimension(215, 52));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        itemIcon.setAlignmentY(0.0F);
        itemIcon.setMaximumSize(new java.awt.Dimension(24, 24));
        itemIcon.setMinimumSize(new java.awt.Dimension(24, 24));
        itemIcon.setPreferredSize(new java.awt.Dimension(24, 24));

        subIcon.setAlignmentY(0.0F);

        itemMenu.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        itemMenu.setForeground(new java.awt.Color(54, 55, 85));
        itemMenu.setText("Menu...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itemIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(subIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itemMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
//       setBackground(new java.awt.Color(195,190,215));
//        if(showing){
//            hideMenu();
//        }else{
//            showMenu();
//        }
//        
//        if(act != null){
//            act.actionPerformed(null);
//        }        
    }//GEN-LAST:event_formMouseClicked

    private boolean showing = false;
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        if(showing){
            hideMenu();
        }else{
            showMenu();
        }
        
        if(act != null){
            act.actionPerformed(null);
        }
    }//GEN-LAST:event_formMousePressed

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        setBackground(new Color(137,157,239));       
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        setBackground(new Color(224,228,239));    
    }//GEN-LAST:event_formMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel itemIcon;
    private javax.swing.JLabel itemMenu;
    private javax.swing.JLabel subIcon;
    // End of variables declaration//GEN-END:variables

    private void hideMenu() {
        new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i = listMenu.size() - 1; i >= 0; i--){
                    sleep();
                    listMenu.get(i).setVisible(false);
                    listMenu.get(i).hideMenu();
                }
                getParent().repaint();
                getParent().revalidate();
                showing = false;
            }
        }).start();
    }

    private void showMenu() {
        new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i = 0; i < listMenu.size(); i++){
                    sleep();
                    listMenu.get(i).setVisible(true);
                }
                showing = true;
                getParent().repaint();
                getParent().revalidate();
            }
        }).start();
    }
    
    private void sleep(){
        try{
            Thread.sleep(20);
        }catch(Exception e){
            
        }
    }

}
