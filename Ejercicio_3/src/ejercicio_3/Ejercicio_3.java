/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author jrodriguez
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada =new Scanner (System.in);
        
        int dolares, luis, guillermo,juan, cantidad;
        
        System.out.println("Ingresar Cantidad de Dolares");
        dolares = entrada.nextInt();
       
        
       guillermo = dolares;
       luis = dolares /2;
       juan = (luis+guillermo)/2;
       cantidad = guillermo + luis + juan; 
        
       System.out.println("\nGuillerno tiene: "+guillermo);
       System.out.println("\nluis tiene: "+luis);
       System.out.println("\nJuan tiene: "+juan);
       System.out.println("\nCantidad de dinero: "+cantidad);
        
        
       
        
    }
    
}
