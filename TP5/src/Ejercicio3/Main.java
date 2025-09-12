/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author belenyardebuller
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 3
        Autor autor = new Autor("Jorge Luis Borges", "Argentina");
        Editorial editorial = new Editorial("Sudamericana", "Humberto Primo 555, Capital Federal");
        Libro libro = new Libro("El hacedor", "950-04-0163-0", editorial);
        libro.setAutor(autor);
        libro.mostrar();    
    }
    
}
