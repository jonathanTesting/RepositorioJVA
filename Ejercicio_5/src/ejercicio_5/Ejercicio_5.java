/*
La calificacion de un estudiante de informatica se calcula con base a las calificaciones de cuatro aspectos de su reandimiento academico:
1. Participacion
2. Primer examen Parcial
3. Segundo examen parcial
4. Examne final

Sabiendo que las calificaciones anteriores entran  la calificacion final con ponderaciones del:

1. Participacion = 10%
2. Primer examen Parcial = 25%
3. Segundo examen parcial =25%
4. Examne final = 40%

Hacer un programa que calcule e imprima la calificacion final obtenida por un estudiante.

 */
package ejercicio_5;

import java.util.Scanner;

/**
 *
 * @author jrodriguez
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada =new Scanner (System.in);
        
        //Variables 
        
        float Parti,Par_1,Par_2,Examen_f,total;
        
        System.out.println("Ingrese Calificacion de Participacion");
        Parti =entrada.nextFloat();
        
        System.out.println("Ingrese Calificacion del primer Parcial: ");
        Par_1 = entrada.nextFloat();
       
        System.out.println("Ingrese Calificacion del segundo Parcial: ");
        Par_2 = entrada.nextFloat();
        
        System.out.println("Ingrese Calificacion del Examen Final: ");
        Examen_f = entrada.nextFloat();
        
        
        Parti = Parti*0.10f;
        Par_1 = Par_1*0.25f;
        Par_2 = Par_2*0.25f;
        Examen_f= Examen_f*0.40f;
        
        
        total = Parti+Par_1+Par_2+Examen_f;
        
        System.out.println("La calificacion Final es: "+total);
        
        
        
        
        
    }
    
}
