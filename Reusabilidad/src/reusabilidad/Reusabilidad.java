/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reusabilidad;

/**
 *
 * @author Samuel
 */
public class Reusabilidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Lienzo lienzo = new Lienzo(51,51);
        lienzo.dibujaLinea(1, 1, 50, 0, '*');
        lienzo.paint();*/
        
        /*Lienzo lienzoCirculo = new Lienzo(101,51);
        lienzoCirculo.dibujaCirculo(20, 20, 20, '*');
        lienzoCirculo.paint();*/
        
        
        /*LienzoConMarco lcm = new LienzoConMarco(50,10);
        lcm.paint();*/
        
        // Terreno terreno = new Terreno();
        // terreno.paint();
        
        Lienzo lm = new Lienzo();
        lm.dibujaCirculo(30, 40, 80, 80, '*');
        lm.paint();
    }
    
}
