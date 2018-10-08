/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naveyreloj;

/**
 *
 * @author Samuel
 */
public class Challenger extends Nave {
    public Challenger()
    {
        super();
        String[] n = {"      (=========)\n" ,
                    "      |=========|\n" ,
                    "      |====_====|\n" ,
                    "      |== / \\ ==|\n" ,
                    "      |= / _ \\ =|\n" ,
                    "   _  |=| ( ) |=|\n" ,
                    "  /=\\ |=|     |=| /=\\\n" ,
                    "  |=| |=| USA |=| |=|\n" ,
                    "  |=| |=|  _  |=| |=|\n" ,
                    "  |=| |=| | | |=| |=|\n" ,
                    "  |=| |=| | | |=| |=|\n" ,
                    "  |=| |=| | | |=| |=|\n" ,
                    "  |=| |/  | |  \\| |=|\n" ,
                    "  |=|/    | |    \\|=|\n" ,
                    "  |=/NASA |_| NASA\\=|\n" ,
                    "  |(_______________)|\n" ,
                    "  |=| |_|__|__|_| |=|\n" ,
                    "  |=|   ( ) ( )   |=|\n" ,
                    " /===\\           /===\\\n" ,
                    "|||||||         |||||||\n" ,
                    "-------         -------\n" ,
                    " (~~~)           (~~~)"};
        
        Lienzo l = Nave.LienzoFactory(n);
        this.resize(l.getAncho(), l.getAlto());
        this.agregaLienzo(0, 0, l);
    }
}
