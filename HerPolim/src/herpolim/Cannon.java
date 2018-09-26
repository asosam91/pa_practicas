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
public class Cannon extends Calcomania {
    public Cannon()
    {
        super(15,9);
        String str = "         ,-.\n" +
                    " **   _.-.  \\\n" +
                    "  \\.-'       \\\n" +
                    " /          _/\n" +
                    "|      _  /´\n" +
                    "|     /_\\'\n" +
                    " \\    \\_/\n" +
                    "  ´´´´";
        
        this.importaString(str);
    }
}
