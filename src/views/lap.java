package views;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;

import salecat.global;
import database.saleDB;

/**
 *
 * @author axdevil
 */
public class lap extends javax.swing.JPanel {
    
    float totalVar;
    ArrayList<Integer> idProducts = new ArrayList<>();
    DefaultTableModel model;
    sale sale = new sale();
    
    /**
     * Creates new form lap
     */
    public lap(float total, DefaultTableModel model, ArrayList<Integer> idProducts) {
        initComponents();
        totalVar = total;
        this.idProducts = idProducts;
        this.model = model;
        this.total.setText("$" + total);
        
        System.out.println(this.idProducts);
        
        ((JSpinner.DefaultEditor)received.getEditor()).getTextField().addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {}
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == 10){
                    confirm.requestFocusInWindow();
                }
            }
            @Override
            public void keyReleased(KeyEvent e) {}
        });
        
        received.addChangeListener((ChangeEvent e) -> {
            getLap();
        });
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        totalTitle = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        receivedTitle = new javax.swing.JLabel();
        received = new javax.swing.JSpinner();
        lapTitle = new javax.swing.JLabel();
        lap = new javax.swing.JLabel();
        confirm = new javax.swing.JButton();
        cancel = new javax.swing.JButton();

        totalTitle.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        totalTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalTitle.setText("Total:");
        totalTitle.setToolTipText("");

        total.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        total.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        total.setText("0");
        total.setToolTipText("");

        receivedTitle.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        receivedTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        receivedTitle.setText("Recibido:");
        receivedTitle.setToolTipText("");

        received.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        received.setModel(new javax.swing.SpinnerNumberModel(0.0f, null, null, 1.0f));

        lapTitle.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lapTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lapTitle.setText("Cambio:");
        lapTitle.setToolTipText("");

        lap.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lap.setForeground(new java.awt.Color(41, 121, 255));
        lap.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lap.setText("0");
        lap.setToolTipText("");

        confirm.setBackground(new java.awt.Color(41, 121, 255));
        confirm.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        confirm.setForeground(new java.awt.Color(255, 255, 255));
        confirm.setText("Vender");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cancel.setText("Cancelar");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lapTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lap, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(totalTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(receivedTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(received, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalTitle)
                    .addComponent(total))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(received)
                    .addComponent(receivedTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lapTitle)
                    .addComponent(lap))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirm)
                    .addComponent(cancel))
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        sale.table.setModel(model);
        sale.total.setText(total.getText());
        sale.totalVar = this.totalVar;
        sale.idProducts = this.idProducts;
        menu.changeContent(sale, "Punto de venta", sale.code);
    }//GEN-LAST:event_cancelActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        try {
            saleDB.add(totalVar);
            menu.changeContent(sale, "Punto de venta", sale.code);
            System.out.println("Aqui imprime ticket");
        } catch (SQLException ex) {
            Logger.getLogger(lap.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_confirmActionPerformed

    private void getLap(){
        float lapVar = (Float.parseFloat(received.getValue().toString()) - totalVar);
        lap.setText("$" + lapVar);
        if(lapVar < 0){
            global.validation(lap, true);
        }else{
            global.validation(lap, false);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JButton confirm;
    private javax.swing.JLabel lap;
    private javax.swing.JLabel lapTitle;
    public javax.swing.JSpinner received;
    private javax.swing.JLabel receivedTitle;
    private javax.swing.JLabel total;
    private javax.swing.JLabel totalTitle;
    // End of variables declaration//GEN-END:variables
}
