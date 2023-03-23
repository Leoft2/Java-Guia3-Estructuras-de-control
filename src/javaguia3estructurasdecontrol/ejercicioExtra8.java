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
public class ejercicioExtra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int cont = 0;
        int par = 0;
        int impar = 0;
        
        do {
             System.out.println("Ingrese un numero");
            int nums = leer.nextInt();
           if (nums  > 0)  {
            cont ++;
         
             if (nums % 2 == 0) {
                 par ++;
            } else {
                 impar ++;
             }  
              } if (nums % 5 == 0) {
                break;
            } 
        } while (true);
        System.out.println("Cantidad de numeros leidos " + cont);
        System.out.println("Pares " + par);
        System.out.println("Impares " + impar);
 }
    }
    

 