/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandamusical;

import org.jfugue.player.Player;

/**
 *
 * @author Samuel
 */
public class Instrumento {
    private Partitura partitura;
    
    public Partitura getPartitura()
    {
        return this.partitura;
    }
    
    public Instrumento()
    {
        
    }
    
    public void sonar()
    {
        
    }
    
    public void afinar()
    {
        
    }
    
    public void tocar(Partitura p)
    {
        /*String[] notas = p.getNotas().split(" ");
        for(String n : notas)
        {
            System.out.println(n);
        }*/
        
        Player player = new Player();
        player.play(p.getNotas());
    }
}
