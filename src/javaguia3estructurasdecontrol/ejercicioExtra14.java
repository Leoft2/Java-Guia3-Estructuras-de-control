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
public class ejercicioExtra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias");
        int familias = leer.nextInt();
        int tHijos = 0, tEdades = 0;
        for (int i = 0; i < familias; i++) {
            System.out.println("Ingrese la cantidad de hijos");
            int hijos = leer.nextInt();
            tHijos += hijos;
            for (int j = 0; j < hijos; j++) {
                System.out.println("Ingrese del hijo " + (j + 1));
                int edad = leer.nextInt();
                tEdades += edad;
            }
        }
        System.out.println("La media de hijos por familia es " + ((double)tHijos / familias));
        System.out.println("La media de edades de los hijos es  " + ((double)tEdades / tHijos));
  }
    }
    

