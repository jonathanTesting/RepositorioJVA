/*
 Hacer un programa que calcule el cuadardo de una suma 
 */
package ejercicio_6;

import java.util.Scanner;

/**
 *
 * @author jrodriguez
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner cin =new Scanner (System.in);
         int a,b,cuadrado;
        
         System.out.print("\nDigite el primer numeros: ");
         a=cin.nextInt();
         
         System.out.print("\nDigite el segundo numeros: ");
         b=cin.nextInt();
         
         
         cuadrado=(a*a)+(b*b)+(2*a*b);
         
         System.out.println("El cuadrado de la Suma es: "+cuadrado);

    }
    
}
