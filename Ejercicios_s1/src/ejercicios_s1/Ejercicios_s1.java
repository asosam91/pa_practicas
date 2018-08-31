/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_s1;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class Ejercicios_s1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lee = new Scanner(System.in);
        
        while (true)
        {
            System.out.println("\nDía");
            int day = lee.nextInt();
            
            if(day < 32 && day > 0)
            {
                System.out.println("Mes");
                int month = lee.nextInt();
                
                if(month <= 12 && month > 0)
                {
                    System.out.println("Año");
                    int year = lee.nextInt();

                    int day_week = getDayWeek(day, month, year);
                    System.out.println("El día " + day +" del mes " + month + 
                        " de " + year + " fue " + 
                        getDayString(day_week));
                    
                    printCalendar(month, year);
                } else {
                    System.out.println("Mes no válido");
                }
            } else {
                System.out.println("Día no válido");
            }
        }
    }
    
    private static int getDayWeek(int day, int month, int year)
    {        
        int y0 = year - (int)((14 - month) / 12);
        int x = y0 + (int)(y0/4) - (int)(y0/100) + (int)(y0/400);
        int m0 = month + 12 * (int)((14 - month) / 12) - 2;
        int d0 = (day + x + (int)(31*m0) / 12) % 7;
               
        return d0;
    }
    
    private static void printCalendar(int month, int year)
    {
        System.out.println(getMonth(month) + " " + year);
        System.out.println("Do Lu Ma Mi Ju Vi Sa");
        
        int starting_day = getDayWeek(1, month, year);
        int dm = 1;
        
        // Semanas
        for(int i = 0; i < 5; i++)
        {
            String week = "";
            // Días
            for(int j = 0; j < 7; j++)
            {
                // Indentización
                if(j < starting_day && i == 0)
                {
                    week += "   ";
                } else if((j >= starting_day || i > 0) 
                        && dm <= getMonthMaxDays(month))
                {
                    if(dm < 10)
                        week += " ";
                        
                    week += dm + " ";                    
                    dm++;
                }
            }
            
            System.out.println(week);
        }
    }
    
    private static String getDayString(int day)
    {
        String[] days_week = {"Domingo", "Lunes", "Martes", "Miércoles", 
            "Jueves", "Viernes", "Sábado"};
        
        return days_week[day];
    }
    
    private static String getMonth(int month)
    {
        String[] months = {"Enero", "Febrero", "Marzo", "Abril", 
            "Mayo", "Junio", "Julio", "Agosto", "Septiembre", 
            "Octubre", "Noviembre", "Diciembre"};
        
        return months[month - 1];
    }
    
    private static int getMonthMaxDays(int month)
    {
        int[] months = {31, 28, 31, 30, 
            31, 30, 31, 31, 30, 
            31, 30, 31};
        
        return months[month - 1];
    }
}
