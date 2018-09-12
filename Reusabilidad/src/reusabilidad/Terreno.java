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
public class Terreno extends LienzoConMarco {

    /**
     * @param args the command line arguments
     */
    public Terreno() {
        // TODO code application logic here
        super(100,100);
        
        double a = 0d;
        double b = 100d;
        double paso = b/this.getAlto();
        int pasosReimman = 100;
        
        for(double i = a; i < b; i+=paso)
        {
            int valor1 = (int)gix(i, a, b, paso, this.getAncho());
            int valor2 = (int)gsx(i, a, b, paso, this.getAncho());
            // System.out.print(i + " ");
            this.setPen((int)i, valor1, '*');
            this.setPen((int)i, valor2, '*');
        }
        
        // this.paint();        
        double areaCultivable = (this.getAncho() * this.getAlto()) - 
                areaReimman(0, b, pasosReimman);

        System.out.println("El área de Reinman es de " + 
                areaCultivable +  
                " de acuerdo con " + pasosReimman + " pasos utilizados.");
    }
    
    private double getScale(double a, double b, double paso, int maxWidth)
    {
        double maximo = maximo(a,b,paso);
        double minimo = minimo(a,b,paso);
        // double escala = 50 / (maximo - minimo);
        return maxWidth / (b - a);
    }
    
    public double gix(double x, double a, double b, double paso, int maxWidth)
    {
        double escala = getScale(a, b, paso, maxWidth);
        return escala*(ix(x));
    }
    
    public double gsx(double x, double a, double b, double paso, int maxWidth)
    {
        double escala = getScale(a, b, paso, maxWidth);
        return escala*(sx(x));
    }
    
    private void grafica(int valor)
    {
        for(int i = 0; i < valor; i++)
        {
            System.out.print('~');            
        }
        System.out.println("*");
    }
    
    private double funcion(double x)
    {
        double i = ix(x);
        double s = sx(x);        
        return s - i;
    }
    
    private double ix(double x)
    {
        return 50 + 5 * Math.cos(x/10) * Math.sin(x/15);
    }
    
    private double sx(double x)
    {
        return 70 + 8 * Math.sin(x/35) * Math.cos(x/20);
    }
    
    public double areaReimman(double xInicial,
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
    
    public double maximo(double a, double b, double paso)
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
    
    public double minimo(double a, double b, double paso)
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
