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
public class BandaMusical {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // String pel = "E D E D E G A E B";
        /*Rhythm rhythm = new Rhythm()
        .addLayer("O..oO...O..oOO..")
        .addLayer("..S...S...S...S.")
        .addLayer("````````````````")
        .addLayer("...............+");*/

        // String pel = "B Bb B Bb B Gb A G E";
        String ofe = "EmajQqQ Eqmaj EmajQQQ EQqmin BQmin EmajQQ EminQ DmajQQQQ";
        Partitura partitura = new Partitura(ofe);
        Banda miBanda = new Banda();
        miBanda.agregarInstrumento(new Piano());
        //miBanda.agregarInstrumento(new Bateria());
        // miBanda.agregarInstrumento(new Bajo());
        
        // miBanda.tocar(partitura, rhythm);
        miBanda.tocar(partitura);
    }
    
}
