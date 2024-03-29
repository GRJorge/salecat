package views;

import java.sql.ResultSet;

import database.userDB;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

import salecat.global;
/**
 *
 * @author jorge garcia
 */
public class settings extends javax.swing.JPanel{

    
    JFrame menuW;
    /**
     * Creates new form settings
     */
    public settings(JFrame menu) {
        initComponents();
        
        this.menuW = menu;
        
        try {
            ResultSet userName = userDB.getNameById(global.getActualUser());
            while(userName.next()){
                actualUser.setText("Usuario actual: " + userName.getString("name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(settings.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(global.getActualUser() != 1){
            createUser.setVisible(false);
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

        actualUser = new javax.swing.JLabel();
        close = new javax.swing.JButton();
        signOff = new javax.swing.JButton();
        createUser = new javax.swing.JButton();

        actualUser.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        actualUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        actualUser.setText("Usuario actual: 1");

        close.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        close.setText("Salir");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        signOff.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        signOff.setText("Cerrar sesión");
        signOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOffActionPerformed(evt);
            }
        });

        createUser.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        createUser.setText("Crear nuevo usuario");
        createUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(actualUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 30, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(createUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(signOff)))
                        .addGap(0, 30, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(actualUser)
                .addGap(18, 18, 18)
                .addComponent(createUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(close)
                    .addComponent(signOff))
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeActionPerformed

    private void signOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOffActionPerformed
        global.showJFrame(new login(), "Iniciar sesión");
        menuW.setVisible(false);
    }//GEN-LAST:event_signOffActionPerformed

    private void createUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserActionPerformed
        createUser w = new createUser(menuW);
        menu.changeContent(w, "", w.name);
    }//GEN-LAST:event_createUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actualUser;
    private javax.swing.JButton close;
    private javax.swing.JButton createUser;
    private javax.swing.JButton signOff;
    // End of variables declaration//GEN-END:variables
}
