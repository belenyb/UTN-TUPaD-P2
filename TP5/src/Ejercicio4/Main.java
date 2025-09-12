/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author belenyardebuller
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 4
        Cliente cliente = new Cliente("Belén Yarde Buller", "37000000");
        Banco banco = new Banco("Galicia", "30-50000173-5");
        TarjetaDeCredito tarjetaDeCredito = new TarjetaDeCredito("4517698809093472", "2023-09-09T00:00:00.000Z", banco);
        cliente.setTarjetaDeCredito(tarjetaDeCredito); // Solo un setter necesario
        cliente.mostrar();    
    }
}
