/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import javax.swing.JOptionPane;

/**
 *
 * @author jrodriguez
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        int numero=0;
        int factorial=1;
        
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingresar un numero: "));
        
        while(numero!=0){
            factorial*=numero;
            numero--;
          
            
         }
        JOptionPane.showMessageDialog(null, "El numero factorial Es: "+factorial);
    }
    
}
