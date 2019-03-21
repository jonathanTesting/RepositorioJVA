/*
Construir un programa que dado el numero de horas =?
devuleve el numero de semanas, dias, horas equivalestes 
 */
package ejercicio_7;

import java.util.Scanner;

/**
 *
 * @author jrodriguez
 */
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int horas_t,semanas,dias,horas;
        
        System.out.println("Ingrese el total de horas: ");
        horas_t= entrada.nextInt();
        
        semanas = horas_t /168 ;
        dias = horas_t%168/24;
        horas =horas_t%24;
        
        System.out.println("\nEquivalente de Horas es: ");
        System.out.println("semanas: "+semanas);
        System.out.println("dias: "+dias);
        System.out.println("horas: "+horas);
         
    }
    
}
