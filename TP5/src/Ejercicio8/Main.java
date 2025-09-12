/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author belenyardebuller
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 8
        Usuario usuario = new Usuario("belenyb", "belen@mail.com");
        Documento doc = new Documento("Título documento", "Contenido del documento.", "xqwe2189f", "2025-08-01", usuario);
        System.out.println("Documento: " + doc.getTitulo());
        System.out.println("Usuario de la firma: " + doc.getFirmaDigital().getUsuario().getNombre());
        System.out.println("Hash de firma: " + doc.getFirmaDigital().getCodigoHash());
    }
    
}
