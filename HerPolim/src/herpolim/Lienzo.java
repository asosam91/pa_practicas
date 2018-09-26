/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herpolim;

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
    
    public char getChar(int x, int y) {
        return this.lienzo[x][y];
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
    
    public void agregaLienzo(int x, int y, Lienzo la)
    {
        int xl = 0, yl = 0;
        for(int i = y; yl < la.getAlto(); i++)
        {
            for(int j = x; xl < la.getAncho(); j++)
            {
                try
                {
                    this.setPen(j, i, la.getChar(xl, yl));
                } catch(Exception ex){
                    System.out.println(ex + "x: " + xl + ", y: " + yl);
                    break;
                }
                xl++;
            }
            xl = 0;
            yl++;
        }
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
    
    @Override
    public String toString()
    {
        // Imprime el lienzo en la pantalla
        String r = "";
        for(int y = this.alto - 1; y >= 0; y--) {
            r = r + "\n";
            for(int x = 0; x < this.ancho; x++) {
                r = r + this.lienzo[x][y] + "";
            }
        }
        return r;
    }
    
    /**
     * Método auxiliar para iniciar lienzo
     */
    private void iniciaLienzo()
    {
        this.lienzo = new char[this.ancho][this.alto];
        for(int i = 0; i < this.ancho; i++) {
            for(int j = 0; j < this.alto; j++) {
                this.lienzo[i][j]=' ';
            }
        } 
    }    
}
