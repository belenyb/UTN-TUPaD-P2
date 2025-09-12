/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author belenyardebuller
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 1
        Titular titular = new Titular("Belén Yarde Buller", "37123456");
        Pasaporte pasaporte = new Pasaporte("A123456", "2023-09-09T00:00:00.000Z", "urlimagen", "jpg");
        System.out.println(pasaporte);
        System.out.println(titular);
        // Asociamos Titular <-> Pasaporte con un solo un setter:
        titular.setPasaporte(pasaporte); 
        System.out.println(pasaporte);
        System.out.println(titular);
        System.out.println(pasaporte.getFoto());
    }
    
}
