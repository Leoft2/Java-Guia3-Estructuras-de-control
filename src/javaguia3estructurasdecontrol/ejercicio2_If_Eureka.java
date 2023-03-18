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
public class ejercicio2_If_Eureka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase o una palabra");
        String respuesta = leer.nextLine();
        if (respuesta.equalsIgnoreCase("eureka")) 
        {
            System.out.println("CORRECTO");
        } else 
        {
            System.out.println("INCORRECTO");
        }
    } 
}
    
    

