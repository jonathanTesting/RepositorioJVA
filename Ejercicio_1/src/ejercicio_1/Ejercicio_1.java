
package ejercicio_1;

import java.util.Scanner;

/**
 *
 * @author jrodriguez
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        
 /*
 HAcer un programa que calcule e imprima la suma de tres numero
 */
        //Variables
        /*
        float nota1, nota2, nota3, suma;
        
        // Guardarlas tres notas 
        System.out.println("Digitar Numero: ");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();
        
        suma = nota1+nota2+nota3;
        
        System.out.println("\nEl toatal es: "+suma);*/
        
  /*
 Hacer un programa que calcule e imprima el salario semanal de un empleado a partir de sus horas semanales trabajadas y de su salario por horas.  
 */      
        
        //Variables
        
        float horas,sxh,calculo;
        
        Scanner sc=new Scanner (System.in);
        
        System.out.println("Ingrese horas trabajadas en la semana:");
        horas=sc.nextFloat();
        
        System.out.println("Ingrese salario por hora");
        sxh=sc.nextFloat();
        
        calculo= horas*sxh;
        
        System.out.println("el sueldo semanal es: " + calculo);
      
        
    }
    
}
