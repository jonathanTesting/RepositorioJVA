/*
Construir un programa que calcule y muestre por pantalla 
las raices de la ecuacion de sengundo grado de coeficientes reales.

 */
package ejercicio_8;

import java.util.Scanner;

/**
 *
 * @author jrodriguez
 */
public class Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float a,b,c,paso1,paso2,paso3,x1,x2;// Defino el tipo de varible 
        //Datos de entrada
        //Pido los valores de a,b y c al usuario
        System.out.print("Ingrese valor de a: ");
        a=entrada.nextFloat();
        
        System.out.print("Ingrese valor de b: ");
        b=entrada.nextFloat();
        
        System.out.print("Ingrese valor de c: ");
        c=entrada.nextFloat();
        
        //Proceso
        paso1=(-1)*b;// -b
        paso2=(b*b)-(4*a*c);   // b^2-4*a*c
        float raiz =(float)Math.sqrt(paso2); // √(paso2)
        paso3=2*a;    // 2.a 
        x1=(paso1+raiz)/paso3;
        x2=(paso1-raiz)/paso3;
        
         //Mostramos los valores de x1 y x2 por  pantalla
        System.out.println("Valor de X1: "+x1);
        System.out.println("Valor de X2: "+x2);

    }
    
}
