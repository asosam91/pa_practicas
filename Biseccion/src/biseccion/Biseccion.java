/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biseccion;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class Biseccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lee = new Scanner(System.in);
        System.out.println("Ingrese el límite");
        
        double x1 = 0f;
        double n = lee.nextDouble();
        
        System.out.println("Final: \t" + biseccion(x1,n));
    }
    
    private static double biseccion(double x1, double n)
    {
        double x2 = n;
        double m = 0d;
        double tol = 0.0;
        do
        {
            m = (x1+x2)/2.0;
            double val = calculate(x1, n) * calculate(m, n);
            // System.out.println("Valor calculado\t" + val);
            if(val < 0)
                x2 = m;
            else
                x1 = m;
            
            tol = Math.abs(x2 - x1);
            // System.out.println("tol \t\t" + tol);
        } while (tol > 0.00001);
        
        return m;
    }
    
    private static double calculate(double x1, double n)
    {
        double val = n - Math.pow(x1, 2);
        // System.out.println("Calculo\t\t" + val);
        return val;
    }
}
