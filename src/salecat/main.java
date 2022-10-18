package salecat;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

import database.userDB;
import javax.swing.JFrame;
import views.login;
import views.createAdmin;
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
        
        if(checkUser() == false){
            global.showJFrame(new login(), "Iniciar Sesión");
        }else{
            global.showJFrame(new createAdmin(), "Crear administrador");
        }
    }

    private static boolean checkUser(){
        boolean first = true;
        
        try {
            ResultSet query = userDB.getName();
            
            while(query.next()){
                if(query.getString("name").isEmpty() == false){
                    first = false;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return first;
    }
}
