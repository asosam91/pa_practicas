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
public class TiroParabolico extends Lienzo {
    private double angulo;
    private double velocidad;
    
    public TiroParabolico(double velocidad, double angulo)
    {
        super(200,200);
        this.velocidad = velocidad;
        this.angulo = angulo;
    }
    
    public void animar(double tiempo)
    {
        double x = this.velocidad * Math.cos(Math.toRadians(this.angulo)) * tiempo;
        double y = this.velocidad * Math.sin(Math.toRadians(this.angulo)) * tiempo 
                - (0.5*9.81*Math.pow(tiempo, 2));
        
        if((x >= 0) && (x <= this.getAncho() - 1) &&
            (y >= 0) && (x <= this.getAlto() - 1))
        {
            // this.setPen((int)x, (int)y, '*');
            Calcomania cb = new CannonBall();
            this.agregaLienzo((int)x, (int)y, cb);
        }
    }
}
