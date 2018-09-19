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
        
        // Tarea
        Lienzo lm = new Lienzo();
        System.out.println("\n\nDibuja Círculo");
        System.out.println("Dibuja círculo que pase por dos puntos que serán " +
                "tomados como los puntos del diametro del círculo.");
        lm.dibujaCirculo(30, 40, 80, 80, '*');
        lm.paint();
        
        Lienzo lin = new Lienzo();
        System.out.println("\n\nDibuja línea");
        System.out.println("Dibuja una línea en base a su punto inicial, su "
                + "distancia y el ángulo que tiene en relación al eje X.");
        lin.dibujaLinea(50, 0, 30d, 160d, '*');
        lin.paint();
        
        Lienzo lsec = new Lienzo();
        System.out.println("\n\nDibuja sector");
        System.out.println("Dibuja un círculo y un sector de éste en base"
                + " a los ángulos dados en los parámetros");
        lsec.dibujaSector(20,0, 20, 90d, 135d, 'r');
        lsec.paint();
    }
    
}
