package salecat;

import javax.swing.JFrame;

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
}
