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
EJERCICIO LETRA VOCAL
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
la función equals() de la clase String.
*/
public class ejercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese una letra ");
        String letra = (leer.nextLine());
       // letra= toLowerCase(letra);

        if (letra.equalsIgnoreCase("a")) {
            System.out.println("La letra ingresada es una vocal");

        } else if (letra.equalsIgnoreCase("e")) {
            System.out.println(" La letra ingresada es una vocal");

        } else if (letra.equalsIgnoreCase("i")) {
            System.out.println(" La letra ingresada es una vocal");
        } else if (letra.equalsIgnoreCase("o")) {
            System.out.println(" La letra ingresada es una vocal");
        } else if (letra.equalsIgnoreCase("u")) {
            System.out.println(" La letra ingresada es una vocal");
        } else {
           System.out.println("La letra ingresada es una consonante");
        }
    }
}
    
    

 