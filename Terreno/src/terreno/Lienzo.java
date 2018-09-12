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
public class Lienzo {

    private int ancho;
    private int alto;
    private char [][] lienzo;
    
    public Lienzo() {
        ancho = 100;
        alto = 100;
        lienzo = new char[ancho][alto];
        for(int i = 0; i < ancho; i++) {
            for(int j = 0; j < alto; j++) {
                lienzo[i][j]='.';
            }
        } 
    }
    
    public int getWidth()
    {
        return this.ancho;
    }
    
    public int getHeight()
    {
        return this.alto;
    }
    
    public int getArea()
    {
        return this.ancho * this.alto;
    }
    
    /**
     * Coloca en las coordenadas dadas.
     * @param x Eje X.
     * @param y Eje Y.
     * @param c Catacter que se imprimirá.
     */
    public void setPen(int x, int y, char c) {
       // Coloca el caracter c en la posición x,y
       lienzo[x][y] = c;
    }
    
    /**
     * Imprime lienzo
     */
    public void paint() {
        // Imprime el lienzo en la pantalla
        for(int y = alto - 1; y >= 0; y--) {
            System.out.println();
            for(int x = 0; x < ancho; x++) {
                System.out.print(lienzo[x][y]);
            }
        }
        System.out.println();
    }
}
