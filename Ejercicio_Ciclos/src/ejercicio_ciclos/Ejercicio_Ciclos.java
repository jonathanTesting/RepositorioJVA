/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author jrodriguez
 */
public class Ejercicio_Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*        int numero;
        int contador=0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresar numero: "));
        
        while(numero >=0){
        if(numero <=0){
        }
        System.out.println("Numero Ingresado fue:"+numero);
        numero = Integer.parseInt(JOptionPane.showInputDialog("Numero:  "));
        contador++;
        
        }
        JOptionPane.showMessageDialog(null,"Total de numeros digitados: "+contador);
        
        */
       
 /*
Ejercicio 5:Realizar un juego para adivinara un numero para ello
        1. generamos un numero aleatorio de 0-100
        2. Pediremos si el numero indicado es mayo o menor segun sea con respecto a N
        el proceso terminara cuando el usuario acierte y mostar el numeo de acierto 
        
        */      
        /*         int numero,aleatorio,contador=0;
        
        aleatorio = (int)(Math.random()*100);
        System.out.println(aleatorio);
        
        do{
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:  "));
        
        if(aleatorio >numero ){
        System.out.println("Digite un numero mayor:");
        }
        else{
        System.out.println("Digite un numero menor: ");
        }
        contador++;
        
        }while(numero != aleatorio);
        System.out.println("Eres un genio adivinaste el numero en "+contador+ " intetos");*/
           
        
        
        /*        int numero=0,sumador=0;
        boolean flag=true;
        
        
        while(flag){
        System.out.println(numero);
        //numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresar numero: "));
        sumador=sumador+numero;
        
        if(numero ==0)
        {
        System.out.println("El resultado es: ");
        System.out.println(sumador);
        flag=false;
        }
        
        }*/

/*Guarda en una variable numero_magico el valor 12345679 (sin el 8)
        Lee por pantalla otro numero_usuario, especifica que sea entre 1 y 9 (asegúrate que es un número)
        Multiplica el numero_usuario por 9 en sí mismo
        Multiplica el numero_magico por el numero_usuario en sí mismo
        Finalmente muestra el valor final del numero_magico por pantalla  */      
        
        /*        int numero_magico = 12345679,numero_usuario=1,total,total2;
        
        /////
        System.out.println("Numero Magico: "+numero_magico);
        
        //Lee por pantalla otro numero_usuario, especifica que sea entre 1 y 9 (asegúrate que es un número)
        numero_usuario = (int)(Math.random()*10);
        System.out.println("Numero Usuarios: "+numero_usuario);
        
        //Multiplica el numero_usuario por 9 en sí mismo
        total2=numero_usuario*9;
        
        //Multiplica el numero_magico por el numero_usuario en sí mismo
        total=numero_magico*numero_usuario;
        System.out.println(total);
        
        //Finalmente muestra el valor final del numero_magico por pantalla
        System.out.println("Valor Final Numero Magico:  "+total2*total);*/

        
//Ejercicio 10: Pedir 10 numeros y escribir la suma total//
        
      /*int asignador=0;
        int Contador=0;
        
        while(Contador <10){
        Contador++;
        asignador +=Integer.parseInt(JOptionPane.showInputDialog("Ingrese ª"+Contador+" numero"));
        
        }
        
        JOptionPane.showMessageDialog(null,"La suma de los 10 numero ingresados es: "+asignador);*/
        
//Ejercicio 11: Diseñar un programa que muestre el producto de los 10 primeros numero impares..
        
        /*        long producto =1;//Para multiplicacion
        
        for (int i=1;i<=20;i+=2){
        producto*=i;//Multiplicacion iterativa
        }
        System.out.println(producto);*/
        
        
//Ejercicio 12: Pedir un numero y sacar el factorial
        
        
        /*        int numero=0;
        int factorial=1;
        
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingresar un numero: "));
        
        while(numero!=0){
        factorial*=numero;
        numero--;
        
        
        }
        JOptionPane.showMessageDialog(null, "Paila"+factorial);
        */
        
        
//Ejercicio 14 pedir 10 sueldos mostrar su suma y cuantos hay mayores de 1000
        
        /* int sueldo = 0;
        int suma = 0;
        int Contador=0;
        int cantidad_s =0;
        
        while(Contador <3){
        Contador++;
        sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese sueldo ª"+Contador));
        suma += sueldo;
        
        if(sueldo >=1000){
        cantidad_s++;
        System.out.println(sueldo);
        }
        else if(sueldo <-1){
        JOptionPane.showMessageDialog(null," EL sueldo ingresado es negativo");
        }
        
        }
        JOptionPane.showMessageDialog(null,"La suma de los 10 sueldos es: $" + suma);
        JOptionPane.showMessageDialog(null,"La cantidad de suldos mayor a 1000 son: " + cantidad_s);
        */
        

        
 //Ejercicio 15: Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden mas de 1.75
        
        
        
        int edad, contador_em=0;
        int suma_e=0,contador_am=0;
        float altura, suma_a=0,mediaEdad,mediaAltura;
    
        for(int i=1 ;i<6;i++){
                edad = Integer.parseInt(JOptionPane.showInputDialog("Alumno ª"+i+"\nDigite su Edad"));
                altura = Float.parseFloat(JOptionPane.showInputDialog("Alumno ª"+i+"\nDigite su Altura")); 
                
                suma_e+= edad;
                suma_a+= (float)altura;
               
            if(edad >18){
               contador_em++;
            }
            
             if((float)altura >1.75){
               contador_am++;
            } 
       }
        
       mediaEdad = (float)suma_e/5;   
       mediaAltura = (float)suma_a/5;  
       
       
        System.out.println("La edad promedia es: " +mediaEdad);
        System.out.println("La estatura promedia es : " +mediaAltura);
        System.out.println("La cantidad de Alumnos mayores de 18 años es: " +contador_em);
        System.out.println("La cantidad de Alumnos que miden mas 1.75 es: " + contador_am);
           
            
       
           /*JOptionPane.showMessageDialog(null,"La edad promedia es: " + mediaEdad);
           JOptionPane.showMessageDialog(null,"La estatura promedia es : " + mediaAltura);
           JOptionPane.showMessageDialog(null,"La cantidad de Alumnos mayores de 18 años es: " + contador_em);
           JOptionPane.showMessageDialog(null,"La cantidad de Alumnos que miden mas 1.75 es: " + contador_am);   */
                    
       
           
        }  
                           
          
        
    
        
    
    
        
        
        
        
        
    }
    

