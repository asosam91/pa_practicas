/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficafunciones;

/**
 *
 * @author Samuel
 */
public class GraficaFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a = -4;
        double b = 4;
        double paso = 0.2;
        
        for(double i = a; i <= b; i+=paso)
        {
            int valor = (int)gx(i, a, b, paso);
            grafica(valor);
        }
    }
    
    public static void grafica(int valor)
    {
        for(int i = 0; i < valor; i++)
        {
            System.out.print(" ");
        }
        System.out.println("*");
    }
    
    public static double gx(double x, double a, double b, double paso)
    {
        double maximo = maximo(a,b,paso);
        double minimo = minimo(a,b,paso);
        double escala = 50 / (maximo - minimo);
        
        return escala*(funcion(x) - minimo);
    }
    
    /**
     * Función que calcula
     * @param x
     * @return 
     */
    public static double funcion(double x)
    {
        double r = 0d;
        r = Math.cos(x);
        return r;
    }
    
    public static double maximo(double a, double b, double paso)
    {
        double max = funcion(a);
        double medio = (a+b)/2;
        double iinc = a;
        double idec = b;
        
        while(iinc <= medio)
        {
            if(funcion(iinc) > max)
                max = funcion(iinc);
            if(funcion(idec) > max)
                max = funcion(idec);
            
            iinc += paso;
            idec -= paso;
        }
        
        return max;
    }
    
    public static double minimo(double a, double b, double paso)
    {
        double min = funcion(a);
        double medio = (a+b)/2;
        double iinc = a;
        double idec = b;
        
        while(iinc <= medio)
        {
            if(funcion(iinc) < min)
                min = funcion(iinc);
            if(funcion(idec) < min)
                min = funcion(idec);
            
            iinc += paso;
            idec -= paso;
        }
        
        return min;
    }
    
}
