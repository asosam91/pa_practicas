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
public class Calcomania extends Lienzo {
    private String draw;

    public String getDraw() {
        return draw;
    }

    /*public void setDraw(String draw) {
        this.draw = draw;
    }*/
    
    public Calcomania()
    {
        super(20, 20);
    }
    
    public Calcomania(int width, int height)
    {
        super(width, height);
    }
    
    public void importaString(String c)
    {
        this.draw = c;
        char[] sc = c.toCharArray();
                
        int x = 0;
        int y = this.getAlto() - 1;
        for(char ca : sc)
        {            
            if(ca == '\n')
            {
                y--;
                x = 0;
            } else {
                this.setPen(x, y, ca);
                x++;
            }
        }
    }
}
