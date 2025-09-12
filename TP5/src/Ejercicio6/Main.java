/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author belenyardebuller
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 6
        Mesa mesa = new Mesa(5, 10);
        Reserva reserva = new Reserva("2023-09-09", "19:00:00", mesa);
        Cliente cliente = new Cliente("Belén", "1590902929");
        reserva.setCliente(cliente);
        reserva.mostrar();
    }
    
}
