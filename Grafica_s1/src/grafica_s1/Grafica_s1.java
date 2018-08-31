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
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lee = new Scanner(System.in);
        System.out.println("\t\tIntervalo");
        // int x = lee.nextInt();
        // double cos = Math.cos(Math.toRadians(x));
        // System.out.println(cos);
        int num1 = -4;
        int num2 = 4;
        double paso = 0.2;
        
        System.out.println("\n\tIntervalo de " + num1 + " a " + num2 + "con paso de " + paso);
        createGraphic(num1, num2, paso);
    }
    
    private static void createGraphic(int limMin, int limMax, double paso)
    {
        // Eje Y
        System.out.println(Math.cos(Math.toRadians(limMin)));
        System.out.println(Math.cos(Math.toRadians(limMax)));
        for(double y = -1; y <= 1; y += 0.0001)
        {
            // System.out.println("Entro");
            String gr = "";
            boolean flag = false;
            // Eje x
            for(double x = limMin; x <= limMax + paso; x += paso)
            {
                // System.out.println("x: " + x + "; y: " + y);
                double punto = Math.cos(Math.toRadians(x));
                // System.out.println(punto + "\n");

                // Imprime Y
                if(aproxNumber(punto, y, 0.00002))
                {
                    /*
                    System.out.println("True");
                    System.out.println(punto + "\n");
                    */
                    gr += "*";
                    flag = true;
                } else 
                {
                    gr += " ";
                }
            }
            if(flag == true)
            {
                System.out.println(gr);
            }
        }
    }
    
    /**
     * Calcula aproximando
     * @param current Numero actual
     * @param number Número al cual se quiere aproximar
     * @param tol Tolerancia
     * @return boolean
     */
    private static boolean aproxNumber(double current, double number, double tol)
    {
        if(((number/current) < 1 + tol) && ((number/current) > 1 - tol))
        {
            // System.out.println(number/current);
            return true;
        } else
            return false;
    }
}
