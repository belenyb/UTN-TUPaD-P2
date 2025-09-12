/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author belenyardebuller
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 10
        Titular titular = new Titular("Belén Yarde Buller", "37000000");
        CuentaBancaria cuentaBancaria = new CuentaBancaria("27-37000000-1", 340000.45, "Codigo123", "2023-09-09");
        cuentaBancaria.setTitular(titular);
        cuentaBancaria.mostrar();
    }
    
}
