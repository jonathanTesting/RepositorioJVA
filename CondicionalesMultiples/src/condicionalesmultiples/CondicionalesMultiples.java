/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalesmultiples;

import javax.swing.JOptionPane;

/**
 *
 * @author jrodriguez
 */
public class CondicionalesMultiples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declarar Variable 
        
        int dato;
        
        //Solicitudu de dato al usuario por medio del showInputDialog
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero: "));
        
        //Condicional Multiple o Switch
        
        switch(dato){
            case 1:JOptionPane.showMessageDialog(null,"ES el numero 1"+dato*1);
                break;
                
            case 2:JOptionPane.showMessageDialog(null,"ES el numero 2");
                break;
            
            case 3:JOptionPane.showMessageDialog(null,"ES el numero 3");
                break;
            
            case 4:JOptionPane.showMessageDialog(null,"ES el numero 4");
                break;     
                
        //Entrega de dato al usuario por medio del showMessageDialog
            default : JOptionPane.showMessageDialog(null,"El numero ingresado fue "+dato+" este no esta en el rando del 1 al 4");
        
        }
        
    }
    
}
