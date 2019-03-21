/*
Una compañia de venta de carros usando, paga a su personal de ventas un salario de $1000 mensual,
mas una comisiòn de $150 por cada carro vendido, mas el 5% del valor de la venta por carro.
Cada mes el capturista de la empresa ingresa en la computadora los datos pertinentes.
hacer un programa que calcule e imprima el salario mensula de un vendedor dado.
 */
package ejercicio_4;

import java.util.Scanner;

/**
 *
 * @author jrodriguez
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
         Scanner entrada =new Scanner (System.in);
         
         //Variavles 
         float salario, comision,Carros_v, total1, carros_v,venta_c,total2,Saldo_menusal;
         
         
         System.out.println("Carros Vendidos: ");
         carros_v = entrada.nextFloat();
         
         System.out.println("Ingrese el valor total de Carros vendidos: ");
         venta_c = entrada.nextFloat();
         
         salario = 1000;
         comision = 150;
         
         total1= carros_v*comision+salario;
         total2 = venta_c * 0.50f;
         
         Saldo_menusal=total1+total2;
         
         System.out.println("Saldo mensula: "+Saldo_menusal);
    
         
         
         
    }
    
}
