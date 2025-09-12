/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio13;

/**
 *
 * @author belenyardebuller
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario usuario = new Usuario("belenyb", "belen@mail.com");
        GeneradorQR generadorQr = new GeneradorQR();
        generadorQr.generar("Contenido del código QR", usuario); // Crea instancia de CodigoQR
    }
}
