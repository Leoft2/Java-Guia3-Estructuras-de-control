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
public class ejercicio1_If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num1; 
        System.out.println("Ingrese un numero para determinar si es par o impar");
        num1=leer.nextInt();
        if (num1%2==0){
            System.out.println("El numero es par");
            }
        else 
            System.out.println("El numero es impar"); 
         
        
    }
    
}
    
