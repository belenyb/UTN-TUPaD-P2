/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio5;
import java.util.Scanner;

/**
 *
 * @author belenyardebuller
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número entero: ");
        int primer_entero = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese el segundo número entero: ");
        int segundo_entero = Integer.parseInt(scanner.nextLine());
        int suma = primer_entero + segundo_entero;
        int resta = primer_entero - segundo_entero;
        int multiplicacion = primer_entero * segundo_entero;
        double division = (double) primer_entero / segundo_entero;
        System.out.println(primer_entero + "+" + segundo_entero + "=" + suma);
        System.out.println(primer_entero + "-" + segundo_entero + "=" + resta);
        System.out.println(primer_entero + "*" + segundo_entero + "=" + multiplicacion);
        System.out.println(primer_entero + "/" + segundo_entero + "=" + division);
    }
    
}
