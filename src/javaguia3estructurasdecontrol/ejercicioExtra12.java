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
public class ejercicioExtra12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 10; i ++){
            for (int j = 0; j < 10; j ++) {
                for (int k = 0; k < 10; k ++) {
                        if (String.valueOf(i).equals("3")) {
                          System.out.println("E" + "-" + j + "-" + k);
                    } else if (String.valueOf(j).equals("3")) {
                        System.out.println(i + "-" + "E" + "-" + k);
                    } else if (String.valueOf(k).equals("3")) {
                        System.out.println(i + "-" + j + "-" + "E");
                    } else {
                        System.out.println(i + "-" + j + "-" + k);
                    }
                }
            }
        }
   }

    }
    

 