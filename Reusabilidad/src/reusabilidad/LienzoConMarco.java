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
public class LienzoConMarco extends Lienzo {
    public LienzoConMarco()
    {
        super();
        dibujaMarco(this.getAncho(), this.getAlto());
    }
    
    public LienzoConMarco(int ancho, int alto)
    {
        super(ancho, alto);
        dibujaMarco(this.getAncho(), this.getAlto());
    }
    
    public void dibujaMarco(int ancho, int alto)
    {
        // Dibuja horizontal
        this.dibujaLinea(0, 0, ancho - 1, 0, '-');
        this.dibujaLinea(0, alto - 1, ancho - 1, alto - 1, '-');
        
        // Dibuja vertical
        this.dibujaLinea(0, 0, 0, alto - 1, '|');
        this.dibujaLinea(ancho - 1, 0, ancho - 1, alto - 1, '|');
    }
}
