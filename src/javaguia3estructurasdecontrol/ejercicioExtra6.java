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

/*
EJERCICIO PROMEDIO ALTURA   
Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.

*/
public class ejercicioExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de personas a promediar");
        int cant = leer.nextInt();
        double suma = 0, sumatotal = 0;
        int s = 0; //t = 0;

        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese la altura de la persona en mts");
            double medida = leer.nextDouble();
            sumatotal = sumatotal + medida;
            //t++;
            if (medida < 1.60) {
                suma = suma + medida;
                s++;

            }

        }
        System.out.println("El promedio general es: " + (sumatotal / cant));
        System.out.println("El promedio de las personas que miden menos de 1.60m es: " + (suma / s));
    }

}
      
    

 