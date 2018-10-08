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
        super(100, 10);
        update();
    }
    
    @Override
    public void update()
    {        
        this.clear();
        String hora = this.getFullHourStr();
        
        int w = 0;
        for(char c : hora.toCharArray())
        {
            Lienzo l = LienzoFactory(obtieneNumeroAscci(c));
            this.agregaLienzo(w, this.getAlto() - l.getAlto() - 1, l);
            w += l.getAncho();
        }
    }
    
    private String[] obtieneNumeroAscci(char n)
    {
        // Numeros obtenidos de https://gist.github.com/yuanqing/ffa2244bd134f911d365
        String[] str = {""};
        switch(n)
        {
            case '0':
                String[] tstr = { " 0000 \n" ,
                        "00  00 \n" ,
                        "00  00 \n" ,
                        "00  00 \n" ,
                        " 0000 "};
                str = new String[tstr.length];
                str = tstr;
                break;
            case '1':
                String[] t1str = {"1111\n" ,
                        "  11\n" ,
                        "  11\n" ,
                        "  11\n" ,
                        "111111"};
                str = new String[t1str.length];
                str = t1str;                
                break;
                
            case '2':
                String[] t2str = {" 2222\n" ,
                        "22  22\n" ,
                        "   22\n" ,
                        "  22\n" ,
                        "222222"};
                str = new String[t2str.length];
                str = t2str;                
                break;
                
            case '3':
                String[] t3str = {"333333\n" ,
                        "    33\n" ,
                        " 3333\n" ,
                        "    33\n" ,
                        "333333"};
                str = new String[t3str.length];
                str = t3str;                
                break;
                
            case '4':
                String[] t4str = {"44  44\n" ,
                        "44  44\n" ,
                        "444444\n" ,
                        "    44\n" ,
                        "    44"};
                str = new String[t4str.length];
                str = t4str;                
                break;  
            
            case '5':
                String[] t5str = {"55555\n" ,
                        "55\n" ,
                        "55555\n" ,
                        "    55\n" ,
                        "55555"};
                str = new String[t5str.length];
                str = t5str;                
                break;
                
            case '6':
                String[] t6str = {" 6666\n" ,
                        "66\n" ,
                        "66666\n" ,
                        "66  66\n" ,
                        " 6666"};
                str = new String[t6str.length];
                str = t6str;                
                break;
                
            case '7':
                String[] t7str = {"777777\n" ,
                        "   77\n" ,
                        "  77\n" ,
                        " 77\n" ,
                        "77"};
                str = new String[t7str.length];
                str = t7str;                
                break;
                
            case '8':
                String[] t8str = {" 8888\n" ,
                        "88  88\n" ,
                        " 8888\n" ,
                        "88  88\n" ,
                        " 8888"};
                str = new String[t8str.length];
                str = t8str;                
                break;
                
            case '9':
                String[] t9str = {" 9999\n" ,
                        "99  99\n" ,
                        " 99999\n" ,
                        "    99\n" ,
                        " 9999"};
                str = new String[t9str.length];
                str = t9str;                
                break;
                
            case ':':
                String[] atstr = {" \n" ,
                        " 0\n\n" ,
                        " 0\n\n"};
                str = new String[atstr.length];
                str = atstr;
                break;
        }
        
        return str;
    }
    
}
