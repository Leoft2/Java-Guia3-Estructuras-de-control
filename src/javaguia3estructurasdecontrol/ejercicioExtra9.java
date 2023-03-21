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
EJERCICIO DIVISION-RESTAS??
Simular la división usando solamente restas. Dados dos números enteros
mayores que uno, realizar un algoritmo que calcule el cociente y el
residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
obtener un resultado menor que el divisor, este resultado es el residuo, y
el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es
3.
¿Aún no lo entendiste? Recomendamos googlear división con restas
sucesivas.

*/


public class ejercicioExtra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    double num1,num2,i;           
    i=0;      
    System.out.println("ingresar numero a dividendo y divisor");
    num1 = leer.nextDouble();
    num2 = leer.nextDouble();    
      while(num1>=0){         
         num1=num1-num2;
         i=i+1;}
      System.out.println("El cociente es; "+ (i-1));
      System.out.println("El resto es:" + (num1+num2));
    }
    
}
  