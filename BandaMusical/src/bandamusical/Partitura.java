/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandamusical;

/**
 *
 * @author Samuel
 */
public class Partitura {
    // private Nota[] notas;
    private String notas;
    private int tiempo;
    
    /*public Nota[] getNotas() {
        return notas;
    }

    public void setNotas(Nota[] notas) {
        this.notas = notas;
    }*/
    
    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
    public Partitura()
    {
        
    }
    
    public Partitura(String n)
    {
        this.notas = n;
    }
}
