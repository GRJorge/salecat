package views;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.sql.ResultSet;

import database.permitDB;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import salecat.global;

/**
 *
 * @author axdevil
 */
public class menu extends javax.swing.JFrame {

    private boolean visibleMenu = true;
    
    public menu() {
        initComponents();
        sale w = new sale();
        changeContent(w, "Punto de venta", w.code);
        
        try {
            ResultSet query = permitDB.get(global.getActualUser());
            
            while(query.next()){
                if(query.getBoolean("product") == false){
                    newProduct.setVisible(false);
                }
                if(query.getBoolean("sale") == false){
                    sales.setVisible(false);
                }
                if(query.getBoolean("inventory") == false){
                    inventory.setVisible(false);
                }
                if(query.getBoolean("provider") == false){
                    provider.setVisible(false);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barMenu = new javax.swing.JPanel();
        inventory = new javax.swing.JLabel();
        newProduct = new javax.swing.JLabel();
        provider = new javax.swing.JLabel();
        settings = new javax.swing.JLabel();
        sale = new javax.swing.JLabel();
        sales = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        visibleBtn = new javax.swing.JPanel();
        iconVisibleBtn = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        titleContent = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });

        barMenu.setBackground(new java.awt.Color(41, 121, 255));

        inventory.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        inventory.setForeground(new java.awt.Color(255, 255, 255));
        inventory.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        inventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/inventory.png"))); // NOI18N
        inventory.setText("  Inventario");
        inventory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inventoryMousePressed(evt);
            }
        });

        newProduct.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        newProduct.setForeground(new java.awt.Color(255, 255, 255));
        newProduct.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        newProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/newProduct.png"))); // NOI18N
        newProduct.setText("  Nuevo producto");
        newProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                newProductMousePressed(evt);
            }
        });

        provider.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        provider.setForeground(new java.awt.Color(255, 255, 255));
        provider.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        provider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/provider.png"))); // NOI18N
        provider.setText("  Proveedores");
        provider.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        provider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                providerMousePressed(evt);
            }
        });

        settings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/settings.png"))); // NOI18N
        settings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                settingsMousePressed(evt);
            }
        });

        sale.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        sale.setForeground(new java.awt.Color(255, 255, 255));
        sale.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sale.png"))); // NOI18N
        sale.setText("  Punto de venta");
        sale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                saleMousePressed(evt);
            }
        });

        sales.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        sales.setForeground(new java.awt.Color(255, 255, 255));
        sales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sales.png"))); // NOI18N
        sales.setText("  Ventas");
        sales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                salesMousePressed(evt);
            }
        });

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon100x.png"))); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout barMenuLayout = new javax.swing.GroupLayout(barMenu);
        barMenu.setLayout(barMenuLayout);
        barMenuLayout.setHorizontalGroup(
            barMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(barMenuLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(barMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(barMenuLayout.createSequentialGroup()
                        .addGroup(barMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(sales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addComponent(newProduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(inventory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(provider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(settings, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        barMenuLayout.setVerticalGroup(
            barMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barMenuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sale)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inventory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newProduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(provider)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(settings)
                .addGap(16, 16, 16))
        );

        visibleBtn.setBackground(new java.awt.Color(0, 88, 235));
        visibleBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        visibleBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                visibleBtnMousePressed(evt);
            }
        });

        iconVisibleBtn.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        iconVisibleBtn.setForeground(new java.awt.Color(255, 255, 255));
        iconVisibleBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconVisibleBtn.setText("<<");

        javax.swing.GroupLayout visibleBtnLayout = new javax.swing.GroupLayout(visibleBtn);
        visibleBtn.setLayout(visibleBtnLayout);
        visibleBtnLayout.setHorizontalGroup(
            visibleBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconVisibleBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );
        visibleBtnLayout.setVerticalGroup(
            visibleBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconVisibleBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        content.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                contentComponentResized(evt);
            }
        });

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
        );

        titleContent.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        titleContent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleContent.setText("Titulo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(barMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(visibleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titleContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleContent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(barMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(visibleBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        resizeContent();
    }//GEN-LAST:event_formWindowStateChanged

    private void visibleBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visibleBtnMousePressed
        if(visibleMenu){
            barMenu.setVisible(false);
            iconVisibleBtn.setText(">>");
            visibleMenu = false;
        }else{
            barMenu.setVisible(true);
            iconVisibleBtn.setText("<<");
            visibleMenu = true;
        }
    }//GEN-LAST:event_visibleBtnMousePressed

    private void newProductMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newProductMousePressed
        newProduct w = new newProduct(0,0);
        
        changeContent(w, "Nuevo producto", w.code);       
    }//GEN-LAST:event_newProductMousePressed

    private void contentComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_contentComponentResized
        resizeContent();
    }//GEN-LAST:event_contentComponentResized

    private void providerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_providerMousePressed
        changeContent(new provider(), "Proveedores", null);
    }//GEN-LAST:event_providerMousePressed

    private void inventoryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryMousePressed
        changeContent(new inventory(), "Inventario", null);
    }//GEN-LAST:event_inventoryMousePressed

    private void settingsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMousePressed
        changeContent(new settings(this), "Configuración", null);
    }//GEN-LAST:event_settingsMousePressed

    private void saleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saleMousePressed
        sale w = new sale();
        
        changeContent(w,"Punto de venta", w.code);
    }//GEN-LAST:event_saleMousePressed

    private void salesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesMousePressed
        changeContent(new sales(),"Ventas",null);
    }//GEN-LAST:event_salesMousePressed
    
    public static void changeContent(JPanel newContent, String title,JTextField focus){
        titleContent.setText(title);
        newContent.setSize(content.getSize().width,content.getSize().height);
             
        content.removeAll();
        content.add(newContent);
        content.repaint();
        content.revalidate();
        
        try{
            focus.requestFocusInWindow();
        }catch(Exception e){
            System.out.println("No se agrego un JTextField al cual enfocar");
        }
    }
    
    public void resizeContent(){
        try{
            content.getComponent(0).setSize(content.getSize().width,content.getSize().height);
            content.revalidate();
        }catch(Exception e){
            System.out.println("No se encontro un JPanel cargado: " + e);
        }
    }
    
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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new menu().setVisible(true);
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barMenu;
    private static javax.swing.JPanel content;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel iconVisibleBtn;
    private javax.swing.JLabel inventory;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel newProduct;
    private javax.swing.JLabel provider;
    private javax.swing.JLabel sale;
    private javax.swing.JLabel sales;
    private javax.swing.JLabel settings;
    public static javax.swing.JLabel titleContent;
    private javax.swing.JPanel visibleBtn;
    // End of variables declaration//GEN-END:variables
}
