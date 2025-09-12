/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author belenyardebuller
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 7
        Motor motor = new Motor("Hibrido", "H123-345F");
        Vehiculo vehiculo = new Vehiculo("ABC123", "Focus", motor);
        Conductor conductor = new Conductor("Belén", "LIC123");
        vehiculo.setConductor(conductor);
        vehiculo.mostrar();
    }
    
}
