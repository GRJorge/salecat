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
import javax.print.SimpleDoc;
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
        PrintService defaultService = PrintServiceLookup.lookupDefaultPrintService();
        
        DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
        
        byte[] bytes = contentTicket.getBytes();
        
        Doc ticket = new SimpleDoc(bytes,flavor,null);
        
        DocPrintJob job = defaultService.createPrintJob();
        
        try{
            job.print(ticket, null);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo imprimir el ticket", "Error", 0);
        }
    }
}
