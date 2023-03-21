/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia3estructurasdecontrol;

import java.util.Scanner;

/**
 *
 * @author Leonel
 */
public class ejercicioExtra10 {

    /**
     * @param args the command line arguments
     */
    
    
    /*
    EJERCICIO ADIVINAR-MATH.RANDOM
    .Realice un programa para que el usuario adivine el resultado de una
    multiplicación entre dos números generados aleatoriamente entre 0 y 10.
    El programa debe indicar al usuario si su respuesta es o no correcta. En
    caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
    su respuesta nuevamente. Para realizar este ejercicio investigue como
    utilizar la función Math.random() de Java.
    */
    
    public static void main(String[] args) {
    Scanner leer = new java.util.Scanner(System.in).useDelimiter("\n");         
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        int i=num1*num2;
        System.out.println("el numero es:"+i);
        
        System.out.println("adivina el número multiplo de dos num del 0 al 10");
        int num3 = leer.nextInt();   
        while (num3!=i){
            System.out.println("Segui participando e ingresa un nuevo número");
            num3 = leer.nextInt();
        }
        System.out.println("Adivinaste!!");
         
         
     
             }
         }
     
     

 