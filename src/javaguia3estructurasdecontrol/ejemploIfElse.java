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
public class ejemploIfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
        int num1;
        int num2;
        System.out.println("Escriba un primer numero");
        num1 = leer.nextInt();
        System.out.println("Escriba un segundo numero");
        num2 = leer.nextInt();
        if (num1>25 && num2>25){
            System.out.println("Los numeros son mayores a 25");
        }else
            System.out.println("Al menos uno de los numeros es mayor o igual a 25");
    }
    
}
