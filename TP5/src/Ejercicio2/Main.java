/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author belenyardebuller
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 2
        Bateria bateria = new Bateria("Samsung-BX100", 4500);
        Celular celular = new Celular("123456789012345", "Samsung", "Galaxy S24", bateria);
        Usuario usuario = new Usuario("Ana López", "40111222");
        // Basta con un solo setter para establecer la relación
        usuario.setCelular(celular);
        System.out.println(usuario.toString());
        System.out.println(celular.toString());
    }
    
}
