/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscondicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author jrodriguez
 */
public class EjerciciosCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//Ejercicio: Hacer un programa que lea un numero entero y muestre si el numero es multiplo de 10 
        
        /*        //Declarar Variable
        
        int numero;
        
        //Solicitudu de dato al usuario por medio del showInputDialog
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        if(numero%10 == 0){
        JOptionPane.showMessageDialog(null,"El numero "+numero+" ese multiplo de '10'" );
        
        }
        else{
        JOptionPane.showMessageDialog(null,"El numero "+numero+" no es multiplo de 10");
        
        }*/
       
 //Ejercicio 2: Pedir dos numeros y decir cual es mayor o si son iguales
        /*
        int numero1,numero2;
        
        numero1= Integer.parseInt(JOptionPane.showInputDialog("Digite numero 1: "));
        numero2= Integer.parseInt(JOptionPane.showInputDialog("Digite numero 2: "));
        
        
        if(numero1==numero2){
        JOptionPane.showMessageDialog(null,"Los dos numeros ingresdaos son iguales: "+numero1+"/"+numero2);
        
        }
        
        else if (numero1 > numero2) {
        JOptionPane.showMessageDialog(null, "EL Numero "+numero1+" es mayor que el numero "+numero2);
        }
        
        else if (numero1 < numero2) {
        JOptionPane.showMessageDialog(null, "El Numero "+numero1+" es menor que el numero "+numero2);
        }
        */

//Crear un programa que solicite una letra e imprima si la letra ingresada es Mayuscula o Minuscula 
        
        /*char letra;
        
        //Esta funcion ".charAt(0)" sirve para gurdar un string en un caracter
        letra= JOptionPane.showInputDialog("Digite Caracter: ").charAt(0);
        
        //Se utiliza el metodo "isUpperCase" del Character
        if(Character.isUpperCase(letra)){
        JOptionPane.showMessageDialog(null,"MAyusculas");
        
        }
        
        else{
        JOptionPane.showMessageDialog(null,"Minusculas");
        }*/
/*
Un obrero necesita calculara  su salario semanal, el cual se otibe de la siguiente manera:
Si trabaja 40 horas o menios se le paga $16 por hora.
Si trabaja mas de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra 
*/
        
        /* int horas_t, salariototal,salariototal2,mayor;
        
        horas_t = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de horas"));
        
        
        if(horas_t <= 40){
        salariototal2=horas_t *16;
        }
        else{
        salariototal= (40*16)+(horas_t-40)*20;
        
        JOptionPane.showMessageDialog(null, salariototal);
        
        
        }*/
        
        
/*
Hacer un programa que tome dos numero y diga si ambos son pares o impares 
*/
        /*float numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite dos numero: "));
        
        if (numero%2 == 0){
        JOptionPane.showMessageDialog(null,numero+" Son numeros Pares1");
        }
        else if (numero%2 != 0) {
        JOptionPane.showMessageDialog(null,numero+" Son numeros impares");
        
        }*/
    
 /*
Pedir tres numeros y mostrarlos ordenados de mayor a menor
        */
        
        /*       int n1,n2,n3;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("digite numero 1: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("digite numero 2: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("digite numero 3: "));
        
        if((n1>n2) && (n2>n3)){
        JOptionPane.showMessageDialog(null," Son"+n1+"-"+n2+"-"+n3);
        }
        else if((n1>n3) && (n3>n2)){
        JOptionPane.showMessageDialog(null," Son"+n1+"-"+n3+"-"+n2);
        }
        else if((n2>n1) && (n1>n3)){
        JOptionPane.showMessageDialog(null," Son"+n3+"-"+n1+"-"+n3);
        }
        
        else if((n2>n3) && (n3>n1)){
        JOptionPane.showMessageDialog(null," Son"+n2+"-"+n3+"-"+n1);
        }
        else if((n3>n1) && (n1>n2)){
        JOptionPane.showMessageDialog(null," Son"+n3+"-"+n1+"-"+n2);
        }
        else{
        JOptionPane.showMessageDialog(null," Son"+n3+"-"+n2+"-"+n1);
        }*/
        
 //Pedir un numero entero 0 y 99 999 y decir cuantas cifras tiene
        
        
        /*        //Tamaño de caracteres en JAVA
        String sMiCadena;
        sMiCadena = JOptionPane.showInputDialog("Ingresar un numero entero de 0 a 99");
        
        //With "length" They can get a string of characters
        JOptionPane.showMessageDialog(null,"Numero Ingresaso es: "+sMiCadena+" el cual tiene "+sMiCadena.length()+" cifras");*/
        
// Pedir el dia, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo que todos los meses son de 30 dias.
        
        
        /*int dia,mes,año;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("ingresar DIA: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingresar MES: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Ingresar AÑO: "));
        
        
        if((dia >=1)&&(dia >=30)){
        
        if((mes>=1)&&(mes<=12)){
        
        }
        if(año!=0){
        
        }
        
        JOptionPane.showMessageDialog(null,"La fecha Ingresada es: "+dia+"/"+mes+"/"+año);
        
        }
        
        else{
        JOptionPane.showMessageDialog(null,"DIA: "+dia+" MES: "+""+mes+" AÑO: "+año + " La fecha Ingresada es No es correcta");
        
        }*/
        
// Pedir el dia, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 32 dias. Sin años bisiestos.
        
        /*        int dia,mes,año;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("ingresar DIA: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingresar MES: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Ingresar AÑO: "));
        
        //Date
        if((dia >=1)&&(dia<=30)){
        // JOptionPane.showMessageDialog(null,"Dia es ciorrecto: "+dia);
        
        }
        else if((dia ==32)){
        //JOptionPane.showMessageDialog(null,"Dia es Bisiesto: "+dia);
        }
        
        else{
        JOptionPane.showMessageDialog(null,"Dia ingresaso es INCORRECTO: "+dia);
        }
        
        //MONTh
        if((mes >=1)&&(mes<=12)){
        //JOptionPane.showMessageDialog(null,"Mes es correcto: "+mes);
        }
        else if((mes ==28)){
        JOptionPane.showMessageDialog(null,"Dia y Mes ingresado es Bisiesto: "+dia);
        }
        else{
        //JOptionPane.showMessageDialog(null,"Mes ingresado es INCORRECTO: "+mes);
        }
        
        //Years
        
        if(año !=0){
        //JOptionPane.showMessageDialog(null,"Año es correcto: "+año);
        }
        else{
        JOptionPane.showMessageDialog(null,"AÑO ingresado es INCORRECTO: "+año);
        }
        
        
        
        if((dia ==32)&&(mes ==28)){
        JOptionPane.showMessageDialog(null,"La fecha es corecta pero es Bisiesto: "+dia+"/"+mes+"/"+año);
        }
        else{
        JOptionPane.showMessageDialog(null,"La fecha ingresada es in corecta: "+dia+"/"+mes+"/"+año);
        }*/
        
    
/*Costruir un programa que simule el funcionamiento de una calculadora que pueda realizar las cuadtro operaciones arutmeticas basicas 
 (suma, resta, producto y divicion) con valores aritmeticos enteros. el usuario debera especificar la operacion con el primer caracter 
        del primer parametro de la linea de comnado:
        
        1. S 0 s para la suma  
        2. R o r para la resta
        3. P,p M 0 m para el producto.
        3. D o d para divicion. 
        */    
    
        /*int numero1, numero2,sum,res,mult,div;
        char operador;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("ingresar primer numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar segundo numero: "));
        
        operador = JOptionPane.showInputDialog("Ingrese la operacion que quiere realizar: ").charAt(0);
        
        switch(operador){
        //suma
        case 's':
        case 'S': sum = numero1 + numero2;
        JOptionPane.showMessageDialog(null,"La suma es: " +sum);
        break;
        
        //Resta
        case 'r':
        case 'R': res = numero1 - numero2;
        JOptionPane.showMessageDialog(null,"La suma es: " +res);
        break;
        
        //Multiplicacion
        case 'P':
        case 'p':
        case 'M': mult= numero1 * numero2;
        JOptionPane.showMessageDialog(null,"La suma es: " +mult);
        
        break;
        
        //Divicion
        
        case 'd':
        case 'D': div = numero1/numero2;
        JOptionPane.showMessageDialog(null,"La suma es: " +div);
        
        break;
        
        default : JOptionPane.showMessageDialog(null,"Operador ingresado incorrecto");   */                  
        

//Pedir una nota de 0 a 10 y mostrarla de forma: Insuficiente, suficiente, Bien, Notable y sobresaliente
        
        /*   int nota;
        
        nota= Integer.parseInt(JOptionPane.showInputDialog("ingresar Nota de 0 a 10: "));
        
        
        if((nota !=0)&&(nota <=2)){
        JOptionPane.showMessageDialog(null,"Su nota es Insuficiente : "+nota);
        }
        
        else if((nota >=3)&&(nota <=4)){
        JOptionPane.showMessageDialog(null,"Su nota es Suficiente : "+nota);
        }
        else if ((nota >=5)&&(nota <=6)){
        JOptionPane.showMessageDialog(null,"Su nota es Bien : "+nota);
        }
        else if ((nota >=7)&&(nota <=8)){
        JOptionPane.showMessageDialog(null,"Su nota es Notable : "+nota);
        }
        
        else if ((nota >=9)&&(nota <=10)){
        JOptionPane.showMessageDialog(null,"Su nota es Sobresaliente : "+nota);
        }
        
        else{
        JOptionPane.showMessageDialog(null,"La nota ingresada no es valida. debe ingresar una nota 0 a 10  : "+nota);
        }
        */

       
/*
   HACER UN PROGRAMA QUE SIMULE UN CAJERO AOTOMATICO CON UN SALDO INICIAL DE 1000 DOLARES, CON EL SIGUINETE MENU DE OPCIONES:
       
        1. INGRESAR DINERO A LA CUENTA 
        2. RETIRAR DINERO DE LA CUENTA
        3. SALIR 
        
        */
   
        final int saldo_i =1000;
        int opcion;
        float ingreso,retiro,salir, saldo_actual;
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"Bienvenidos al Banco JJR\n"
        + " 1. INGRESAR DINERO A LA CUENTA\n"
        + " 2. RETIRAR DINERO DE LA CUENTA\n"
        + " 3. SALIR"));
        
        switch(opcion){

        //INGRESAR DINERO A LA CUENTA
        case 1: ingreso = Float.parseFloat(JOptionPane.showInputDialog(null,"Por favor ingresar Dinero:"));
                saldo_actual = saldo_i +ingreso;
                JOptionPane.showMessageDialog(null,"Saldo actual es: " +saldo_actual); 
        break;
            
        //RETIRAR DINERO DE LA CUENTA    
        case 2: retiro= Float.parseFloat(JOptionPane.showInputDialog(null,"Por favor el monto a Retirar:"));
                if(retiro >saldo_i ){
                        JOptionPane.showMessageDialog(null,"El saldo ingresado supera el moto disponible"); 
                
              }
                else {
                       saldo_actual= saldo_i - retiro; 
                       JOptionPane.showMessageDialog(null,"Dinero disponible para retiro es: "+saldo_actual); 
              }
              break;
            
        //Salir  
        case 3:
            JOptionPane.showMessageDialog(null,"¡Vuelva Pronto!");
        break;    
        
        
        default : JOptionPane.showMessageDialog(null,"Operador ingresado incorrecto");   
        }    
        
        
        
        
        
        
        
        
        
        
    
                
                
        }  
        
    }
        
       
        
    
    

