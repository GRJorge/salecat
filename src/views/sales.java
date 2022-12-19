package views;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import database.saleDB;
import database.productSaleDB;

/**
 *
 * @author jorge
 */
public class sales extends javax.swing.JPanel {
    
    ArrayList<Integer> idSales = new ArrayList<>();
    
    /**
     * Creates new form sales
     */
    public sales() {
        initComponents();
        
        try {
            fillSales(saleDB.getAll());
        } catch (SQLException ex) {
            Logger.getLogger(sales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salesScroll = new javax.swing.JScrollPane();
        sales = new javax.swing.JTable();
        productScroll = new javax.swing.JScrollPane();
        products = new javax.swing.JTable();

        sales.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        sales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Total", "Usuario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesMouseClicked(evt);
            }
        });
        salesScroll.setViewportView(sales);

        products.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        products.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descripcion", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productScroll.setViewportView(products);
        if (products.getColumnModel().getColumnCount() > 0) {
            products.getColumnModel().getColumn(0).setMaxWidth(256);
            products.getColumnModel().getColumn(2).setMaxWidth(128);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productScroll)
                    .addComponent(salesScroll))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(salesScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(productScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void salesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesMouseClicked
        try {
            fillProducts(productSaleDB.getProducts(idSales.get(sales.getSelectedRow())));
        } catch (SQLException ex) {
            Logger.getLogger(sales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_salesMouseClicked
    
    private void fillSales(ResultSet query) throws SQLException{
        String[] data = new String[3];
        
        DefaultTableModel model = (DefaultTableModel) sales.getModel();
        model.setRowCount(0);
        
        while(query.next()){
            idSales.add(query.getInt("id"));
            data[0] = query.getString("date");
            data[1] = query.getString("total");
            data[2] = query.getString("userFK");
            model.addRow(data);
        }
        sales.setModel(model);
    }
    
    private void fillProducts(ResultSet query) throws SQLException{
        String[] data = new String[3];
        
        DefaultTableModel model = (DefaultTableModel) products.getModel();
        model.setRowCount(0);
        
        while(query.next()){
            data[0] = query.getString("code");
            data[1] = query.getString("description");
            data[2] = query.getString("price");
            model.addRow(data);
        }
        products.setModel(model);
        System.out.println("test");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane productScroll;
    private javax.swing.JTable products;
    private javax.swing.JTable sales;
    private javax.swing.JScrollPane salesScroll;
    // End of variables declaration//GEN-END:variables
}
