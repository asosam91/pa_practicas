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
        // Ordena puntos
        int tx = x1;
        int ty = y1;
        if(x1 > x2)
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
    
    public void dibujaLinea(int x1, int y1, double d, double t, char c)
    {
        int x = (int)(Math.cos(t) * d);
        int y = (int)(Math.sin(t) * d);
        
        dibujaLinea(x1, y1, x1 + x, y1 + y, c);        
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
            double x = x1 + r * Math.cos(t);
            double y = y1 + r * Math.sin(t);

            if((int)x < 0 || (int)y < 0 || (int)x > this.ancho || (int)y > this.alto)
            {
                System.out.println("Error: El círculo sale de los límites del lienzo. "
                        + "\nReplantee los puntos. \n\nInformación extra:");
                System.out.println("x:\t" + (int)x + "\ny:\t" + (int)y + 
                        "\n\nLienzo\nAlto:\t" + this.getAlto() +
                        "\nAncho:\t" + this.getAncho());
                
                break;
            } else
                this.setPen((int)x, (int)y, c);
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
    
    public void dibujaSector()
    {
        
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
        // Imprime el lienzo en la pantalla
        for(int y = this.alto - 1; y >= 0; y--) {
            System.out.println();
            for(int x = 0; x < this.ancho; x++) {
                System.out.print(this.lienzo[x][y]);
            }
        }
        System.out.println();
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
}
