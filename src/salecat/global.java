package salecat;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import views.menu;
/**
 *
 * @author jorge garcia
 */
public class global {
    
    public static void showJFrame(JFrame frame, String title){
        frame.setLocationRelativeTo(null);
        frame.setTitle(title);
        frame.setVisible(true);
    }
    
    public static String getDataTable(DefaultTableModel model, JTable table, int column){
        return model.getValueAt(table.getSelectedRow(), column).toString();
    }
    
    public static void validation(JLabel title, boolean incorrect){
        if(incorrect){
            title.setForeground(new Color(255,68,41));
        }else{
            title.setForeground(menu.titleContent.getForeground());
        }
    }
}
