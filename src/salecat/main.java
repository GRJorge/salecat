package salecat;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import views.menu;

/**
 *
 * @author axdevil
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        try{
            UIManager.setLookAndFeel(new com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkIJTheme());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo cargar el tema" + e, "Error", 0);
        }
        
        menu w = new menu();
        w.setTitle("Menu principal");
        w.setLocationRelativeTo(null);
        w.setVisible(true);
    }
    
}
