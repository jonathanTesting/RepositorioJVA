/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos.llenar.un.arreglo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jrodriguez
 */
public class ArreglosLlenarUnArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
/////42. Programación en Java || Arreglos || Llenar un arreglo        
        
        Scanner entrada = new Scanner(System.in); 
        
        /*        int nElementos= Integer.parseInt(JOptionPane.showInputDialog("Engrresa la cantodad de Caracteres: "));
        
        char[] letras = new char[nElementos];
        
        System.out.println("Dilite los elementos del arreglo: ");
        for(int i=0;i<nElementos;i++){
        System.out.print((i+1)+"Digite un caracter: ");
        letras[i] = entrada.next().charAt(0);
        }
        System.out.println("\n LOs caracteres del areglo son: ");
        for(int i=0; i<nElementos;i++){
        System.out.print(letras[i]);
        }*/
        
        
        
//43. Programación en Java || Arreglos || Bucle for each        
        
        String[] nombres={"Lorena","Samuel","Anny","Omar","Nataly","Jecsy","Julian","Felipe","Andre","Iker"};
        
        for (String i : nombres) {
            //Se utiliza ".length" cuando no sabemos cuantos caracteres hay en el arreglo
            System.out.print(i + " /");
        }
        
        
        
        
    }
    
}
