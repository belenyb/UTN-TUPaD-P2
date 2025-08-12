/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio8;

import java.util.Scanner;

/**
 *
 * @author belenyardebuller
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número entero: ");
//      int primer_entero = Integer.parseInt(scanner.nextLine());     // ejercicio a
        double primer_entero = Double.parseDouble(scanner.nextLine());  // ejercicio b
        System.out.print("Ingrese el segundo número entero: ");
//      int segundo_entero = Integer.parseInt(scanner.nextLine());    // ejercicio a
        double segundo_entero = Double.parseDouble(scanner.nextLine());    // ejercicio b
        System.out.println(primer_entero + "/" + segundo_entero + "=" + primer_entero/segundo_entero);
    }
    
}
