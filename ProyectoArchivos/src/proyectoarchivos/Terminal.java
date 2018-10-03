/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoarchivos;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 *
 * @author Samuel
 */
public class Terminal {
    private String path;
    private int a = 0;
    
    public Terminal()
    {
        this.path = "";
    }
    
    public Terminal(String path)
    {
        this.path = path;
    }
    
    public String dir()
    {
        return this.dir(this.path);
    }
    
    /**
     * Obtiene el listado de archivos de un directorio
     * @param path Ruta que se desea visualizar.
     * @return Información de la ruta.
     */
    public String dir(String path)
    {
        String d = "";
        path = path.trim();
        
        if(path == "")
            path = "C:\\";
        
        File directory = new File(path);
        int files = 0, directories = 0;
        
        d += this.getFormatedFiles(directory);
        
        // d += "\t" + files + " File(s)\t\t\t" + directory.length() + " bytes.";
        // d += "\n\t" + directories + " Dir(s)\t" + directory.getFreeSpace() + " bytes free.";
        
        return d;
    }
    
    public String ls(String path)
    {
        return this.dir(path);
    }
    
    public String dirRecursive()
    {
        return this.dirRecursive(this.path);
    }
    
    public String dirRecursive(String path)
    {
        String d = "";
        
        File directory = new File(path);
        if(directory.isDirectory())
        {
            for(File direc : directory.listFiles())
            {
                if (direc.exists() && direc.isDirectory())
                {
                    //this.dir(direc.getAbsolutePath());
                    try
                    {
                        d += "\n\tCarpeta: " + direc.getAbsolutePath() + "\n";
                        d += dirRecursive(direc.getAbsolutePath());
                        a++;
                    } catch(Exception ex)
                    {
                        System.out.println(a);
                        System.out.println("Puede que exista un problema debido a que " +
                                "no se tienen los permisos necesarios.");
                    }
                    
                    
                } else {
                    d += getFileFormated(direc);
                }
            }
        } else {
            d += getFileFormated(directory);
        }
        
        return d;
    }
    
    private String getFormatedFiles(File directory)
    {
        String d = "";
        for(File file : directory.listFiles())
        {
            d += getFileFormated(file);
        }
        
        return d;
    }
    
    private String getFileFormated(File file)
    {
        String d = "";
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        String isdir = "";
        String length = "";
        if(file.isDirectory())
        {
            isdir = "<DIR>";
            //directories++;                
        } else {
            length = String.valueOf(file.length());
            //files++;
        }

        d += sdf.format(file.lastModified()) + "\t" + isdir 
                + "\t" + length + "\t\t" + file.getName() + "\n";
        
        return d;
    }
}
