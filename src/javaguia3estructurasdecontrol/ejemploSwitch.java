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
public class ejemploSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);

    	int opcion;

    	System.out.println("Ingrese una opción");

    	opcion = leer.nextInt();

    	switch (opcion) {
        	case 1:
           System.out.println("La bomba es una bomba de Agua");
           break;

        	case 2:
           System.out.println("La bomba es de Gasolina");
            break;
                case 3:
           System.out.println("La bomba es de Hormigón");
            break;
            case 4:
           System.out.println("La bomba es de Pasta");
            break;
        	default:
           System.out.println("No existe un valor valido de bomba");
        }
        } 
}
    
    

