/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoexcepciones;

/**
 *
 * @author Samuel
 */
public class ProyectoExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = new int[5];
        for(int i=0; i <= 5; i++)
        {
            try
            {
                arreglo[i] = i;
            } catch(Exception ex)
            {
                System.out.println("Hubo un error: " + ex.getMessage());
            }
        }
    }
    
}
