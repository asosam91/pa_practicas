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
public class CannonBall extends Calcomania {
    public CannonBall()
    {
        super(5,5);
        String str = " ___ \n" +
                    "/. .\\\n" +
                    "\\_v_/";
        this.importaString(str);
    }
}
