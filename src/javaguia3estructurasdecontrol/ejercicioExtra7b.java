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
public class ejercicioExtra7b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numros a introducir");
        int num = leer.nextInt();
        int cont = 0;
        int min = 0;
        int max = 0;
        int suma = 0;
        
        do {
             System.out.println("Ingresar numero");
              int num2 = leer.nextInt();
        if (cont == 0 ) {
            min = num2;
            max = num2;
        }
        if (min  > num2)  {
            min = num2;
        }
        if (max < num2)  {
            max = num2;
        }
        cont ++;
        suma += num2;
        } while (cont != num);  
         System.out.println("El promedio es de " + suma / num);
         System.out.println("El valor minimo es " + min);
         System.out.println("El valor maximo es " + max);
       }
    }
    

