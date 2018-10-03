/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandamusical;

import org.jfugue.rhythm.Rhythm;

/**
 *
 * @author Samuel
 */
public class Banda {
    private Instrumento[] instrumentos;
    private int maxInstrumentos;
    
    public Banda()
    {
        this.instrumentos = new Instrumento[10];
        maxInstrumentos = 0;
    }
    
    public void agregarInstrumento(Instrumento ins)
    {
        /*for(int i = 0; i < this.instrumentos.length; i++)
        {
            if(this.instrumentos[i] == null)
            {
                this.instrumentos[i] = ins;
                break;
            }
        }*/
        
        if(maxInstrumentos < 10) {
            this.instrumentos[maxInstrumentos++] = ins;
        } else {
            System.out.println("Banda completa");
        }
    }
    
    public void tocar(Partitura p)
    {
        for(int i = 0; i < maxInstrumentos; i++)
        {
            instrumentos[i].tocar(p);
        }
    }
    
    public void tocar(Partitura p, Rhythm r)
    {
        for(int i = 0; i < maxInstrumentos; i++)
        {
            instrumentos[i].tocar(p);
        }
    }
}
