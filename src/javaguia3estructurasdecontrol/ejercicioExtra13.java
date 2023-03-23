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
public class ejercicioExtra13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la escalera");
        System.out.print("Tamaño: ");
         int num = leer.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            System.out.println("");
        }
   }
    }
    

