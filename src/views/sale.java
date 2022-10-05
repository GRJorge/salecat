package views;

/**
 *
 * @author axdevil
 */
public class sale extends javax.swing.JPanel {

    /**
     * Creates new form sale
     */
    public sale() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        code = new javax.swing.JTextField();
        amount = new javax.swing.JSpinner();
        scrollTable = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        cancel = new javax.swing.JButton();
        confirm = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        code.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        code.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        amount.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        amount.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Producto", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scrollTable.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setMaxWidth(64);
            table.getColumnModel().getColumn(2).setMaxWidth(512);
        }

        cancel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cancel.setText("Cancelar");

        confirm.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        confirm.setText("Confirmar");

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("$1234567890");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(scrollTable, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE))
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollTable, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirm)
                    .addComponent(cancel)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner amount;
    private javax.swing.JButton cancel;
    public javax.swing.JTextField code;
    private javax.swing.JButton confirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane scrollTable;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
