/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoflujos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Samuel
 */
public class ProyectoFlujos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String b = "";
        try {
            File f = new File("C:\\Users\\Samuel\\Documents\\Lania\\Primero\\Programacion\\data\\stream\\Testdata-uni.txt");
            // FileReader fr = new FileReader(f);
            
            BufferedReader br = new BufferedReader(new FileReader(f));
            System.out.println(br.readLine());
            String resto = "";
            while((resto = br.readLine()) != null)
            {
                System.out.println(resto);
            }
            
            br.close();
            
            /*int c = 0;
            do {
                c = fr.read();
                if(!(c == -1)){
                    // System.out.println((char)c);
                    b += (char)c;
                }
            } while(c != -1);*/
            
        } catch (FileNotFoundException fileNotFoundException) {
            
        } catch (IOException ex) {
            Logger.getLogger(ProyectoFlujos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // System.out.print(b);
    }
    
}
