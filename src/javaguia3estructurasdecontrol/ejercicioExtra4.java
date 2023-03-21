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
EJERCICIO NUMERO ROMANO
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
muestre su equivalente en romano
*/

public class ejercicioExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero del 1 al 10");
        int num = leer.nextInt();
        switch (num) {
            case 1:
                System.out.println("El 1 es I en romano");
                break;
            case 2:
                System.out.println("El 2 es II en romano");
                break;
            case 3:
                System.out.println("El 3 es III en romano");
                break;
            case 4:
                System.out.println("El 4 es IV en romano");
                break;
            case 5:
                System.out.println("El 5 es V en romano");
                break;
            case 6:
                System.out.println("El 6 es VI en romano");
                break;
            case 7:
                System.out.println("El 7 es VII en romano");
                break;
            case 8:
                System.out.println("El 8 es VIII en romano");
                break;
            case 9:
                System.out.println("El 9 es IX en romano");
                break;
            case 10:
                System.out.println("El 10 es X en romano");
                break;
            default:
                System.out.println("El numero no esta entre 1 y 10");
                
        }

    }

} 
    
    

