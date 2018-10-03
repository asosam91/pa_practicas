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
public class Bateria extends Instrumento {
    @Override
    public void tocar(Partitura p) {
        System.out.println("\nBateria: ");
        super.tocar(p);
    }
}
