package salecat;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.ServiceUI;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class printer {
    //static String pwd = "/home/jorge/Documentos/Proyectos/Java/salecat/ticket.txt";
    
    public static void printTicket(String contentTicket) throws IOException{
        //BufferedWriter ticket = new BufferedWriter(new FileWriter(pwd));
        //ticket.write(contentTicket);
        //ticket.close();
        DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
        
        PrintRequestAttributeSet pras = new HashPrintRequestAttributeSet();
        PrintService printService[] = PrintServiceLookup.lookupPrintServices(flavor, pras);
        PrintService defaultService = PrintServiceLookup.lookupDefaultPrintService();
        PrintService serviceGui = ServiceUI.printDialog(null, 700, 200, printService, defaultService, flavor, pras);
        
        byte[] bytes = contentTicket.getBytes();
        
        Doc ticket = new SimpleDoc(bytes,flavor,null);
        
        DocPrintJob job = serviceGui.createPrintJob();
        
        try{
            job.print(ticket, null);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo imprimir el ticket", "Error", 0);
        }
    }
}
