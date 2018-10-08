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
public class Nave extends Lienzo {
    public Nave()
    {
        super();
        String[] n = {"       !\n" ,
                    "       !\n" ,
                    "       ^\n" ,
                    "      / \\\n" ,
                    "     /___\\\n" ,
                    "    |=   =|\n" ,
                    "    |     |\n" ,
                    "    |     |\n" ,
                    "    |     |\n" ,
                    "    |     |\n" ,
                    "    |     |\n" ,
                    "    |     |\n" ,
                    "    |     |\n" ,
                    "    |     |\n" ,
                    "    |     |\n" ,
                    "   /|##!##|\\\n" ,
                    "  / |##!##| \\\n" ,
                    " /  |##!##|  \\\n" ,
                    "|  / ^ | ^ \\  |\n" ,
                    "| /  ( | )  \\ |\n" ,
                    "|/   ( | )   \\|\n" ,
                    "    ((   ))\n" ,
                    "   ((  :  ))\n" ,
                    "   ((  :  ))\n" ,
                    "    ((   ))\n" ,
                    "     (( ))\n" ,
                    "      ( )\n" ,
                    "       .\n" ,
                    "       ."};
        
        Lienzo l = Nave.LienzoFactory(n);
        this.resize(l.getAncho(), l.getAlto());
        this.agregaLienzo(0, 0, l);
    }
}
