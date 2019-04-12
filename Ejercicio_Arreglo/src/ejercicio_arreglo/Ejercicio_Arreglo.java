/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_arreglo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jrodriguez
 */
public class Ejercicio_Arreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

 //Ejercicio - Leer 5 numeros, guardarlos en un arreglo y mostrarlos en el mismo orden y DSC.
        
        /*Scanner entrada = new Scanner(System.in);
        
        
        float[] numero = new float[5];
        int aux;
        
        System.out.println("Guadando los datos del arreglo: ");
        //Forma "Asendente"
        for(int i=0;i<5;i++){
        System.out.print((i+1)+". Digite un numero:");
        numero[i]=entrada.nextFloat(); /// aqui gradamos los datos
        }
        // Forma "Desendente"
        for (int i=0; i<numero.length/2; i++) {
        aux = (int) numero[i];
        numero[i] = numero[numero.length-1-i];
        numero[numero.length-1-i] = aux;
        }
        
        System.out.println("\nImprimir los elementos del areglo");
        for(float i:numero){
        System.out.println(i);
        
        }*/
        
/*
Ejercicio 3: 1. Leer 5 numero por tecaldo.
             2. Almacenarlos en un arreglo.
             3. Realizar la media de los numero positivos.
             4. Realizar la media de los numero negativos.
             5. Contar el numero de ceros.
 
        */
        /*Scanner entrada = new Scanner(System.in);
        Float numero[] = new Float[5];
        float mediaNumero_P,mediaNumero_N;
        float suma_p=0,suma_n=0,conter=0,suma_c=0;
        int conteo_positivos=0,conteo_negativos=0 ;
        
        for(int i=0;i<5;i++){
        System.out.print((i+1)+". Digite un numero:");
        numero[i]=entrada.nextFloat(); /// aqui gradamos los datos
        
        if(numero[i]>0){
        suma_p+=numero[i];//suma numeros positivos
        conteo_positivos++;
        }
        else if(numero[i]<0){
        suma_n+=numero[i];//Suma de numero Negativos
        conteo_negativos++;
        }
        else if(numero[i]==0){
        suma_c++;//Suma de ceros
        
        }
        
        }
        
        // La media de numeros positivos es
        if(conteo_positivos==0){
        System.out.println("NO se puede sacar la media de los numeros positivos");
        }
        else{mediaNumero_P=suma_p/conteo_positivos;
        System.out.println("la media de los numerp positivos es: " +mediaNumero_P);
        }
        
        // La media de numeros negativas es
        if(conteo_negativos==0){
        System.out.println("NO se puede sacar la media de los numeros negativos");
        }
        else{mediaNumero_N=suma_n/conteo_negativos;
        System.out.println("la media de los numerp negativos es: " +mediaNumero_N);
        }
        
        System.out.println("Cantidad de numeros ceros: " +suma_c);
        */
   
        
/////Ejercicio 4 1. Leer 10 numero por tecaldo.
//               2. Almacenarlos en un arreglo.
//               3. Se deben mostar en el siguiente orden El primero con el ultimo, el segundo con el penultimo
        
        
//        Scanner entrada = new Scanner(System.in);
//        
//        Integer numeros[] = new Integer[10];
//        
//        for(int i=0;i<0;i++){
//        System.out.print((i+1)+". Digite un numero:");
//        numeros[i]=entrada.nextInt(); /// aqui gradamos los datos
//        }
//        
//        for (int i = 0, j = numeros.length -1; j >= (numeros.length / 2) && i <= (numeros.length / 2); i++, j--) {
//            System.out.println(numeros[i] + "," + numeros[j]);
//        }
        
        
        
/// Sacar el numero mayor
        
//        //int[] numeros = {0, 200, 3, 4000, 50, 6, 7, 8, 9, 918};
//        int aux = 0;
//        
//        for (int i = 0; i < numeros.length; i++) {
//            
//                if(i == 0){
//                    aux = numeros[i];
//                }else  
//                    if (aux < numeros[i]) {
//                    aux = numeros[i];
//                    }
//        }
//        
//        System.out.println("Mayor es: " + aux);
        
        
        
// ///Ejercicio 5: leeer por teclado dos tablas de 10 numeros enteros y mesclarlos en una tercera de la forma:
//                  el 1º elemento del areglo A
//                  el 1º elemento del areglo b
//                  el 2º elemento del areglo A
//                  el 2º elemento del areglo b
//                
        
       
        Scanner entrada = new Scanner(System.in);
        int a[],b[],c[];
        
        a= new int[10];
        b= new int[10];
        c= new int[20];
        
        ///Pedir arerglo a
        System.out.println("Ingresar arreglo a");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+".Digite Numero: ");
            a[i]= entrada.nextInt();
        }
        ///Pedir arerglo b
        System.out.println("\nDigite segundo arreglo b");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+".Digite Numero: ");
            b[i]= entrada.nextInt();
        }
       
       //Ahora vamosa mezclar  los 2 arreglos  en el  arreglo c
        
        int j=0;
        
        for (int i = 0; i < 10; i++) {
            c[j]=a[i];///1ºA 2ºb
            j++;
            c[j]=b[i];///1ºB,2ºB
            j++;
        }
     
           System.out.print("\nEl tercer arregolo es: ");
        for (int i = 0; i < 20; i++) {
            System.out.print(c[i]+", ");
            
        }
        System.out.println();
        
        }
            
        }
        
        
        
        
        
        
        
        

    }
      
    
        
    
 }
    

