/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolienzo1;

/**
 *
 * @author Samuel
 */
public class ProyectoLienzo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lienzo cLienzo = new Lienzo();
        Lienzo cLienzo2 = new Lienzo();
        
        for(int x = 0; x <= 79; x++)
        {
            int y = (int)funcion(x);
            cLienzo.setPen(x, y, '+');
        }
        
        for(int x = 0; x <= 40; x++)
        {
            int y = (int)funcion2(x);
            cLienzo2.setPen(x, y, '+');
        }
        
        cLienzo.paint();
        cLienzo2.paint();
    }
    
    public static double funcion(double x)
    {
        double r = 0;
        r = x;
        return r;
    }
    
    public static double funcion2(double x)
    {
        double r = 0;
        r = 40 - x;
        return r;
    }
}
