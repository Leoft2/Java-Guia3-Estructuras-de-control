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
Ejercicio equivalencia tiempo
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo,
si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día,
2 horas.
*/

public class ejercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double time,horas,dias;
        String salir,pl,ul;
        System.out.println("ingresar timepo en minutos"); 
        time = leer.nextDouble();
        dias = Math.floor(time/1440);
       // horas = ((time/1440)-dias)*24;
        horas = (time%1440)/60;
        System.out.println("las horas son: " + horas);
        System.out.println("lod dias son: " + dias);
    }
    
} 
