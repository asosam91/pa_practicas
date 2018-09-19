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
public class Lienzo {
    private int alto;
    private int ancho;
    private char[][] lienzo;
    
    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }
    
    public Lienzo()
    {
        this.alto = 100;
        this.ancho = 100;
        iniciaLienzo();
    }
    
    public Lienzo(int ancho, int alto)
    {
        this.alto = alto;
        this.ancho = ancho;
        iniciaLienzo();
    }
    
    /**
     * Dibuja línea
     * @param x1 Valor cartesiano de X del punto 1
     * @param y1 Valor cartesiano de Y del punto 1
     * @param x2 Valor cartesiano de X del punto 2
     * @param y2 Valor cartesiano de Y del punto 2
     * @param c Caracter que será usado para dibujar la línea
     */
    public void dibujaLinea(int x1, int y1, int x2, int y2, char c)
    {
        // Ordena automáticamente las coordenadas dadas, a fin
        // de que p1 sea aquel punto que se encuentre más cercano a 0.
        // Si la función es llamada desde la sobrecarga de esta funcion
        // donde se pide una distancia y un ángulo, en caso que el ángulo
        // sea igual a 270°, también reorganizará los puntos.
        int tx = x1;
        int ty = y1;
        if(x1 > x2 || (x1 == x2 && y2 < y1))
        {
            x1 = x2;
            y1 = y2;
            x2 = tx;
            y2 = ty;
        }
        
        if(x1 == x2)
        {
            for(int y = y1; y <= y2; y++)
            {
                this.setPen(x1, y, c);
            }
        } else 
        {
            double m = ((double)(y2 - y1)) / ((double)x2 - x1);

            for(int x = x1; x <= x2; x++)
            {
                int y = (int)(m * (x - x1) + y1);
                this.setPen(x, y, c);
            }
        }
    }
    
    /**
     * Dibuja una línea dado un punto inicial, la distancia y el ángulo
     * @param x1 Coordenada X
     * @param y1 Coordenada Y
     * @param d Distancia de la línea
     * @param t Ángulo con respecto al Y
     * @param c Caracter que será usado para dibujar el círculo.
     */
    public int[] dibujaLinea(int x1, int y1, double d, double t, char c)
    {
        int x = (int)(Math.cos(Math.toRadians(t)) * d);
        int y = (int)(Math.sin(Math.toRadians(t)) * d);
        int[] rv = {x, y};
        
        dibujaLinea(x1, y1, x1 + x, y1 + y, c);
        return rv;
    }

    /**
     * Dibuja un círculo a partir de un punto dado y un radio.
     * @param x1 Coordenada X
     * @param y1 Coordenada Y
     * @param r Radio
     * @param c Caracter que será usado para dibujar el círculo.
     */
    public void dibujaCirculo(int x1, int y1, int r, char c)
    {
        for(double t = 0; t <= Math.PI*2; t += 0.1)
        {
            int rv = auxDibujaCirculo(x1, y1, r, t, c);
            if(rv == 0) break;
        }
    }
    
    /**
     * Dibuja un círculo que pase por dos puntos dados.
     * @param x1 Coordenada X del punto 1
     * @param y1 Coordenada Y del punto 1
     * @param x2 Coordenada X del punto 2
     * @param y2 Coordenada Y del punto 2
     * @param c Caracter que será usado para dibujar el círculo.
     */
    public void dibujaCirculo(int x1, int y1, int x2, int y2, char c)
    {
        // Calcula centro
        int xc = returnMiddlePoint(x1, x2);
        int yc = returnMiddlePoint(y1, y2);
        
        // Calcula radio
        int r = getDistance(x1, y1, xc, yc);
        dibujaLinea(x1, y1, xc, yc, 'r');
        
        dibujaCirculo(xc, yc, r, c);
    }
        
    private int auxDibujaCirculo(int x1, int y1, int r, double t, char c)
    {
        double x = x1 + r * Math.cos(t);
        double y = y1 + r * Math.sin(t);

        if((int)x < 0 || (int)y < 0 || (int)x > this.ancho || (int)y > this.alto)
        {
            System.out.println("Error: El círculo sale de los límites del lienzo. "
                    + "\nReplantee los puntos. \n\nInformación extra:");
            System.out.println("x:\t" + (int)x + "\ny:\t" + (int)y + 
                    "\n\nLienzo\nAlto:\t" + this.getAlto() +
                    "\nAncho:\t" + this.getAncho());

            return 0;
        } else
        {
            this.setPen((int)x, (int)y, c);
            return 1;
        }
    }
    
    /**
     * Dibuja sector de un círculo en base a un radio, un ángulo de inicio y
     * un ángulo "de apertura"
     * @param x1 Coordenada X del punto
     * @param y1 Coordenada Y del punto
     * @param r Radio
     * @param t1 Ángulo de inicio
     * @param t2 Ángulo de fin
     * @param c Caracter que será usado para dibujar el círculo.
     */
    public void dibujaSector(int x1, int y1, int r, double t1, double t2, char c)
    {
        this.dibujaLinea(x1, y1, r, t1, c);
        this.dibujaLinea(x1, y1, r, t2, c);
        
        this.dibujaCirculo(x1, y1, r, c);
    }
    
    /**
     * Coloca en las coordenadas dadas.
     * @param x Eje X.
     * @param y Eje Y.
     * @param c Catacter que se imprimirá.
     */
    public void setPen(int x, int y, char c) {
       // Coloca el caracter c en la posición x,y
       this.lienzo[x][y] = c;
    }
    
    /**
     * Imprime lienzo
     */
    public void paint() {
        System.out.println(this.toString());
    }
    
    private void iniciaLienzo()
    {
        this.lienzo = new char[this.ancho][this.alto];
        for(int i = 0; i < this.ancho; i++) {
            for(int j = 0; j < this.alto; j++) {
                this.lienzo[i][j]='.';
            }
        } 
    }
    
    private int returnMiddlePoint(int p1, int p2)
    {
        return (p2 + p1) / 2;
    }
    
    private int getDistance(int x1, int y1, int x2, int y2)
    {
        int d = (int)(Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow(y2 - y1, 2))));
        return d;
    }
    
    @Override
    public String toString()
    {
        // Imprime el lienzo en la pantalla
        String r = "";
        for(int y = this.alto - 1; y >= 0; y--) {
            r = r + "\n";
            for(int x = 0; x < this.ancho; x++) {
                r = r + this.lienzo[x][y] + " ";
            }
        }
        return r;
    }
}
