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
        Lienzo lienzo = new Lienzo(51,51);
        lienzo.dibujaLinea(0, 0, 10, 5, '*');
        lienzo.paint();
    }
    
}
