/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafica_s1;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class Grafica_s1 {

    /**
     * @param args the command line arguments
     */
    
    // Entre más pequeño, mayor precisión habrá en el eje de las Y.
    static double y_precision = 0.0001;
    
    // Tolerancia diferencia entre punto calculado y punto Y.
    static double precision_tolerance = 0.00004;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lee = new Scanner(System.in);
        System.out.println("\t\tIntervalo");
        int num1 = -4;
        int num2 = 4;
        
        // Entre más pequeño, mayor presición tendrá el eje de las X
        double paso = 0.2;
        
        System.out.println("\n\tIntervalo de " + num1 + " a " + num2 + " con paso de " + paso);
        createGraphic(num1, num2, paso);
    }
    
    private static void createGraphic(int limMin, int limMax, double paso)
    {
        // System.out.println(Math.cos(Math.toRadians(limMin)));
        // System.out.println(Math.cos(Math.toRadians(limMax)));
        
        // Eje Y
        for(double y = -1; y <= 1; y += y_precision)
        {
            
            String gr = "";
            boolean flag = false;
            // Eje x
            for(double x = limMin; x <= limMax + paso; x += paso)
            {
                double punto = Math.cos(x);
                // System.out.println("[x: " + x + "; y: " + y + "]: " + punto);

                // Imprime Y
                if(aproxNumber(punto, y * -1))
                {
                    // Existe una diferencia mínima aceptada para imprimir la marca.
                    gr += "*";
                    flag = true;
                } else 
                {
                    // No existe una diferencia.
                    // Genera un espacio que recorre el eje de las X
                    gr += ".";
                }
            }
            if(flag == true)
            {
                // Genera un espacio que recorre el eje de las Y
                System.out.println(gr);
            }
        }
    }
    
    /**
     * Calcula aproximando
     * @param current Numero actual
     * @param number Número al cual se quiere aproximar
     * @return boolean
     */
    private static boolean aproxNumber(double current, double number)
    {
        if(((number/current) < 1 + precision_tolerance) && ((number/current) > 1 - precision_tolerance))
        {
            // System.out.println(number/current);
            return true;
        } else
            return false;
    }
}
