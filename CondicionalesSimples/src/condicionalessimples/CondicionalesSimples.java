    /*
    La sentencia if:

    if (condicional){
        Instruccion1;
    }
    else{ 
        Intruccion2;
    }
    */
    package condicionalessimples;

    import javax.swing.JOptionPane;

    /**
    *
    * @author jrodriguez
    */
    public class CondicionalesSimples {
    private static Object interger;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Variable
        int numero , dato =5;

        //Ingresar datos por ventanas emergentes con JOptionPane.showInputDialog("")
        //Hay que parseralo a Interger a entero "Integer.parseInt" 
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresar un numero: "));
        /*
        == : Igualdad
        != : Diferente
        >  : Mayor
        >= : Mayor o igual
        <  : Menor
        <= : Menor o igual
        */
        

        if(numero < dato){

            JOptionPane.showMessageDialog(null,"El numero ingresado fue "+numero+" este es menor que: "+dato);
        }
        else{
            JOptionPane.showMessageDialog(null,"El numero ingresado fue "+numero+" este es mayor que: "+dato);
            
        }          

        
        
    }
    
}
