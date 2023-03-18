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
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, opcion;
        boolean salir = false;
        
        do {
            System.out.print("Introduzca el primer número: ");
            num1 = leer.nextInt();
            System.out.print("Introduzca el segundo número: ");
            num2 = leer.nextInt();
            System.out.println("------Menú------");
            System.out.println("1: sumar");
            System.out.println("2: restar");
            System.out.println("3: multiplicar");
            System.out.println("4: dividir");
            System.out.println("5: salir");
            System.out.print("Elija una opción: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("El resultado de la suma es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("El resultado de la resta es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("El resultado de la multiplicación es: " + (num1 * num2));
                    break;
                case 4:
                    //if (num2 == 0) {
                      //  System.out.println("No se puede dividir por cero.");
                    //}// else {
                        System.out.println("El resultado de la división es: " + ((double) num1 / num2));
                    //}
                    break;
                case 5:
                    System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
                    String respuesta = leer.next();
                    if (respuesta.equalsIgnoreCase("S")) {
                        salir = true;
                        System.out.println("Adiós!");
                    }
                   
            }
        } while (!salir);
        
        leer.close();
    }
}
    
    

