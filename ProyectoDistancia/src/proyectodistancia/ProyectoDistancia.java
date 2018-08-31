/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodistancia;

/**
 *
 * @author Samuel
 */
public class ProyectoDistancia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] p1 = {6, 2};
        double[] p2 = {4, 1};
        
        // double v = distancia(6,4,2,1);
        /* double v = distancia(p1[0], p2[0], p1[1], p2[1]);
        System.out.println("La distancia los puntos es: " + 
                String.valueOf(v));
        */
        
        /*
        for(int i = -5; i <= 5; i++)
        {
            double in = intervalo(i);
            System.out.println("El intervalo es de " + String.valueOf(i) + 
                    " es: " + String.valueOf(in));
        }
        */
        
        /*
        double numVal = 100;
        double min = -5, max = 5;
        double paso = (max - min) / numVal;
        
        for(double i = min; i <= max; i += paso)
        {
            double in = intervalo(i);
            System.out.println("El intervalo es de " + String.valueOf(i) + 
                    " es: " + String.valueOf(in));
        }
        */
        
        
    }
    
    public static double distancia(double x1, double y1, double x2, double y2)
    {
        double r = 0;
        r = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
        return r;
    }
    
    public static double intervalo(double x)
    {
        double r = 0;
        r = Math.exp(-0.5 * Math.pow(x, 2))/Math.sqrt(2.0*Math.PI);
        
        return r;
    }
    
    /* Tarea */
    public static double biseccion(double lim)
    {
        
    }
}
