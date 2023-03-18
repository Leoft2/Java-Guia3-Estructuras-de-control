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
public class ejercicio4_If_Substring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba una frase o palabra");
        String respuesta = leer.nextLine();
        if (respuesta.substring(0,1).equals("A")) 
        {
            System.out.println("CORRECTO");
        } else 
        {
            System.out.println("INCORRECTO");
        }
    }
    } 
    

