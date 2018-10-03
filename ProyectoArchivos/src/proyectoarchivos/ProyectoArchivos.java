/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoarchivos;

import java.io.File;

/**
 *
 * @author Samuel
 */
public class ProyectoArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*File miArchivo = new File("C:\\Users\\Samuel\\Documents\\Lania\\Primero\\Programacion\\data\\stream\\Prueba.txt");
        if(miArchivo.exists())
        {
            System.out.println("El archivo " + miArchivo.getName() + " existe! " +
                    "Está en el directorio " + miArchivo.getParent() + 
                    "\nTiene el tamaño " + miArchivo.getTotalSpace() + " bytes.\n\n");
        } else
            System.out.println("El archivo no existe.");*/
        
        /*File directory = new File("C:\\Users\\Samuel\\Documents\\Lania\\Primero\\Programacion\\data\\stream");
        if(directory.exists() && directory.isDirectory())
        {
            for(File cont : directory.listFiles()){
                System.out.println("Archivo:\t" + cont.getName() + 
                        "\nTamaño:\t\t" + cont.getTotalSpace() + "\n");
            }
            
            System.out.println("Opción 2");
            for(String cont : directory.list()){
                System.out.println("Archivo:\t" + cont);
            }
        } else
            System.out.println("El directorio no existe.");
        */
        
        Terminal cmd = new Terminal("C:\\Users\\Samuel\\Documents\\Lania");
        //System.out.println(cmd.dir());
        
        System.out.println("\nRecursivo:\n" + cmd.dirRecursive());
    }
}
