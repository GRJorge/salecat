package salecat;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import views.menu;

/**
 *
 * @author jorge garcia
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        try{
            UIManager.setLookAndFeel(new com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkIJTheme());
            //UIManager.setLookAndFeel(new com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneLightIJTheme());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo cargar el tema" + e, "Error", 0);
        }
        
        global.showJFrame(new menu(), "Menu principal");
    }
    
}
