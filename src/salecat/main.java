package salecat;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
/**
 *
 * @author axdevil
 */
public class main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        String contentTicket;
        
        BufferedReader scanTicket = new BufferedReader(new FileReader("/home/jorge/Documentos/Proyectos/Java/salecat/ticket.txt"));
        BufferedWriter editTicket = new BufferedWriter(new FileWriter("/home/jorge/Documentos/Proyectos/Java/salecat/ticket.txt"));
    }
    
}
