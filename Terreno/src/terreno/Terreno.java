/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terreno;

/**
 *
 * @author Samuel
 */
public class Terreno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lienzo lienzo = new Lienzo();
        
        double a = 0d;
        double b = 100d;
        double paso = b/lienzo.getHeight();
        int pasosReimman = 100;
        
        for(double i = a; i < b; i+=paso)
        {
            int valor1 = (int)gix(i, a, b, paso, lienzo.getWidth());
            int valor2 = (int)gsx(i, a, b, paso, lienzo.getWidth());
            // System.out.print(i + " ");
            lienzo.setPen((int)i, valor1, '*');
            lienzo.setPen((int)i, valor2, '*');
        }
        
        lienzo.paint();        
        double areaCultivable = (lienzo.getWidth() * lienzo.getHeight()) - 
                areaReimman(0, b, pasosReimman);

        System.out.println("El área de Reinman es de " + 
                areaCultivable +  
                " de acuerdo con " + pasosReimman + " pasos utilizados.");
    }
    
    private static double getScale(double a, double b, double paso, int maxWidth)
    {
        double maximo = maximo(a,b,paso);
        double minimo = minimo(a,b,paso);
        // double escala = 50 / (maximo - minimo);
        return maxWidth / (b - a);
    }
    
    public static double gix(double x, double a, double b, double paso, int maxWidth)
    {
        double escala = getScale(a, b, paso, maxWidth);
        return escala*(ix(x));
    }
    
    public static double gsx(double x, double a, double b, double paso, int maxWidth)
    {
        double escala = getScale(a, b, paso, maxWidth);
        return escala*(sx(x));
    }
    
    private static void grafica(int valor)
    {
        for(int i = 0; i < valor; i++)
        {
            System.out.print('~');            
        }
        System.out.println("*");
    }
    
    private static double funcion(double x)
    {
        double i = ix(x);
        double s = sx(x);        
        return s - i;
    }
    
    private static double ix(double x)
    {
        return 50 + 5 * Math.cos(x/10) * Math.sin(x/15);
    }
    
    private static double sx(double x)
    {
        return 70 + 8 * Math.sin(x/35) * Math.cos(x/20);
    }
    
    public static double areaReimman(double xInicial,
                                     double xFinal,
                                     int numeroPasos) {
        double resultado = 0.0;
        double incremento = (xFinal - xInicial) / numeroPasos;
        double semiIncremento = incremento / 2;
        double x = xInicial;
        // Calcula la suma de los rectángulos
        for (int i = 0; i < numeroPasos; i++) {
            resultado += incremento * funcion(x + semiIncremento);
            x += incremento;
        }

        return resultado;
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
