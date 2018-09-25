/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naveyreloj;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Samuel
 */
public class Reloj extends Lienzo {
    private int hora;
    private int minuto;
    private int segundo;
    
    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }
    
    public String getFullHourStr()
    {
        String hora = "";
        if(this.getHora() < 10)
            hora += "0";
        
        hora += this.getHora() + ":";
        
        if(this.getMinuto() < 10)
            hora += "0";
        hora += this.getMinuto() +  ":";
        
        if(this.getSegundo() < 10)
            hora += "0";
        hora += this.getSegundo();
        
        return hora;
    }
    
    public Reloj()
    {        
        super();
        setHoraExacta(false);
    }
    
    public Reloj(int width, int height)
    {        
        super(width, height);
        setHoraExacta(false);
    }
    
    public void setHoraExacta(boolean b)
    {
        if(b)
            refreshTime();
        else
        {
            this.hora = 13;
            this.minuto = 44;
            this.segundo = 25;
        }
        this.update();
    }
    
    public void update()
    {
        refreshTime();
        // Analógico
        // Obtiene el centro
        int center = (int)(this.getAlto() / 2);

        // Dibuja
        this.dibujaCirculo(center, center, center - 1, '=');

        // Dibuja hora
        int h = this.hora;
        if(h > 12)
            h -= 12;
        double lHora = obtieneAngulo(h, 12);
        this.dibujaLinea(center, center, ((double)center / 2) - 1, 
               lHora, obtieneCaracterReloj(h, 12));

        // Dibuja minutero
        double lMin = obtieneAngulo(this.minuto, 60);
        this.dibujaLinea(center, center, center - 2, 
                lMin, 'm');

        // Dibuja segundos
        double lSec = obtieneAngulo(this.segundo, 60);
        this.dibujaLinea(center, center, center - 2, 
                lSec, '*');
    }
    
    /**
     * Actualiza la hora actual
     */
    public void refreshTime()
    {
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdfh = new SimpleDateFormat("HH");
        this.hora = Integer.parseInt(sdfh.format(c.getTime()));
        
        SimpleDateFormat sdfm = new SimpleDateFormat("mm");
        this.minuto = Integer.parseInt(sdfm.format(c.getTime()));
        
        SimpleDateFormat sdfs = new SimpleDateFormat("ss");
        this.segundo = Integer.parseInt(sdfs.format(c.getTime()));
    }
    
    private double obtieneAngulo(int p, int c)
    {
        double m = 360.0/(double)c;
        return 90 - Math.toDegrees(Math.toRadians(m) * p);
    }
    
    /**
     * Obtiene un caracter de acuerdo a la posición correspondiente
     * en un reloj.
     * @param t Hora, minuto o segundo que se desea mostrar.
     * @param base Base sobre la cual define el número de unidades 
     * necesarias para completar una vuelta
     * @return 
     */
    private char obtieneCaracterReloj(int t, int base)
    {
        if(base == 12)
        {
            if(t == 0 || t == 6)
                return '|';
            else if(t == 3 || t == 9)
                return '-';
            else if((t >= 7 && t < 9) || (t >= 1 && t < 3))
                return '/';
            else if((t >= 4 && t < 6) || (t >= 9 && t <= 11))
                return '\\';
                
        } else if(base == 60)
        {
            if(t < 3 || (t > 28 && t < 33) || t > 57)
                return '|';
            else if((t >= 12 && t <= 17) || (t > 43 && t < 48))
                return '-';
            else if((t >= 7 && t < 9) || (t >= 33 && t <= 43))
                return '/';
            else if((t >= 48 && t <= 57) || (t > 17 && t <= 28))
                return '\\';
        }
        
        return '.';
    }
    
    /*@Override
    public String toString() {
        return String.valueOf(this.hora) + String.valueOf(this.minuto)
                + String.valueOf(this.segundo);
    }*/
}
