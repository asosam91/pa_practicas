/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herpolim;

/**
 *
 * @author Samuel
 */
public class HerPolim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Perro p = new Perro();
        p.paint();*/
        
        TiroParabolico tb = new TiroParabolico(40d, 20d);
        for(double t = 0; t <= 3; t+=0.2)
        {
            tb.animar(t);
        }
        
        Lienzo li = new Lienzo(tb.getAncho() + 20, tb.getAlto() + 10);
        Calcomania cannon = new Cannon();
        li.agregaLienzo(0, 0, cannon);
        li.agregaLienzo(cannon.getAncho() + 1, 6, tb);
        li.paint();
        
    }
    
}
