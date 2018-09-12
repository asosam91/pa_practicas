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

    public void dibujaCirculo(int x1, int y1, int r, char c)
    {
        for(double t = 0; t <= Math.PI*2; t += 0.1)
        {
            double x = x1 + r * Math.cos(t);
            double y = y1 + r * Math.sin(t);

            this.setPen((int)x, (int)y, c);
        }
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
}
