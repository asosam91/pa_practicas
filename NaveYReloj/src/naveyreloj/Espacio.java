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
public class Espacio extends Lienzo {
    private Nave miNave;
    
    public Nave getMiNave()
    {
        return this.miNave;
    }
    
    public Espacio(Nave nave)
    {
        super(105,100);
        this.miNave = nave;
        mueveNave(0, 0);
    }
    
    public void agregaNave(Nave nave) {
        this.miNave = nave;
    }
    
    public void estadoInicial()
    {
        String[] n = {"               ____\n" ,
                "          .-'\'\'p 8o\'\'`-.\n" ,
                "       .-'8888P'Y.`Y[ ' `-.\n" ,
                "     ,']88888b.J8oo_      '`.\n" ,
                "   ,' ,88888888888[\'        Y`.\n" ,
                "  /   8888888888P            Y8\\\n" ,
                " /    Y8888888P'             ]88\\\n" ,
                ":     `Y88'   P              `888:\n" ,
                ":       Y8.oP '- >            Y88:\n" ,
                "|          `Yb  __             `'|\n" ,
                ":            `'d8888bo.          :\n" ,
                ":             d88888888ooo.      ;\n" ,
                " \\            Y88888888888P     /\n" ,
                "  \\            `Y88888888P     /\n" ,
                "   `.            d88888P'    ,'\n" ,
                "     `.          888PP'    ,'\n" ,
                "       `-.      d8P'    ,-'   \n" ,
                "          `-.,,_'__,,.-''"};

        Lienzo l = Lienzo.LienzoFactory(n);
        this.agregaLienzo(40, this.getAlto() - l.getAlto() - 40, l);
    }
    
    public void mueveNave(int x, int y)
    {
        this.clear();
        this.estadoInicial();

        this.agregaLienzo(x, y, this.miNave);
    }
}
