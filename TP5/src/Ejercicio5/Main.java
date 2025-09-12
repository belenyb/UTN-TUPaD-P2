/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author belenyardebuller
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 5
        Propietario propietario = new Propietario("Belén", "37000000");
        // La clase Placa Madre no se crea en el Main sino directamente desde el constructor
        // de la clase Computadora
        Computadora computadora = new Computadora("HP", "HP123-X321", "Micro ATX", "Intel b760");
        computadora.setPropietario(propietario); // Solo un setter necesario
        computadora.mostrar();
    }
    
}
