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
public class RelojDigital extends Reloj {
    
    public RelojDigital()
    {
        super(100, 20);
        update();
    }
    
    @Override
    public void update()
    {        
        this.iniciaLienzo();
        String hora = this.getFullHourStr();
        
        int w = 0;
        for(char c : hora.toCharArray())
        {
            String str = obtieneNumeroAscci(c);
            int sp = 4;
            if(c!=':')
                sp += 3;
            Calcomania cal = new Calcomania(sp,6);
            cal.importaString(str);
            this.agregaLienzo(w, 0, cal);
            w += cal.getAncho();
        }
    }
    
    private String obtieneNumeroAscci(char n)
    {
        // Numeros obtenidos de https://gist.github.com/yuanqing/ffa2244bd134f911d365
        String str = "";
        switch(n)
        {
            case '0':
                str +=  " 0000 \n" +
                        "00  00 \n" +
                        "00  00 \n" +
                        "00  00 \n" +
                        " 0000 ";
                break;
            case '1':
                str += "1111\n" +
                        "  11\n" +
                        "  11\n" +
                        "  11\n" +
                        "111111";
                break;
                
            case '2':
                str += " 2222\n" +
                        "22  22\n" +
                        "   22\n" +
                        "  22\n" +
                        "222222";
                break;
                
            case '3':
                str += "333333\n" +
                        "    33\n" +
                        " 3333\n" +
                        "    33\n" +
                        "333333";
                break;
                
            case '4':
                str += "44  44\n" +
                        "44  44\n" +
                        "444444\n" +
                        "    44\n" +
                        "    44";
                break;  
            
            case '5':
                str += "55555\n" +
                        "55\n" +
                        "55555\n" +
                        "    55\n" +
                        "55555";
                break;
                
            case '6':
                str += " 6666\n" +
                        "66\n" +
                        "66666\n" +
                        "66  66\n" +
                        " 6666";
                break;
                
            case '7':
                str += "777777\n" +
                        "   77\n" +
                        "  77\n" +
                        " 77\n" +
                        "77";
                break;
                
            case '8':
                str += " 8888\n" +
                        "88  88\n" +
                        " 8888\n" +
                        "88  88\n" +
                        " 8888";
                break;
                
            case '9':
                str += " 9999\n" +
                        "99  99\n" +
                        " 99999\n" +
                        "    99\n" +
                        " 9999";
                break;
                
            case ':':
                str += " \n" +
                        " 0\n\n" +
                        " 0\n\n";
                break;
        }
        
        return str;
    }
    
}
