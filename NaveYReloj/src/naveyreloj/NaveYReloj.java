/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naveyreloj;

/**
 *
 * @author Samuel
 */
public class NaveYReloj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Reloj analógico");
        Reloj miReloj = new Reloj(20,20);
        miReloj.setHoraExacta(true);
        System.out.println(miReloj);
        
        System.out.println("\n\nReloj digital");
        Reloj miOtroReloj = new RelojDigital();
        miOtroReloj.setHoraExacta(true);
        miOtroReloj.paint();
        
        System.out.println("\n\n\n\t\t-- Naves --");
        // System.out.println("\nFrame 1");
        Nave miNave = new Nave();
        Espacio terrestre = new Espacio(miNave);
        System.out.println(terrestre);
        
        // System.out.println("\nFrame 2");
        terrestre.mueveNave(20, 20);
        System.out.println(terrestre);
        
        // System.out.println("\nFrame 3");
        Nave otraNave = new Challenger();
        terrestre.agregaNave(otraNave);
        terrestre.mueveNave(80, 40);
        System.out.println(terrestre);
    }
    
}
