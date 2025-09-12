/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio11;

/**
 *
 * @author belenyardebuller
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Artista artista = new Artista("Subalterna", "Rock alternativo");
        Cancion cancion = new Cancion("Sobre los paisajes grises");
        cancion.setArtista(artista);
        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion);
    }

}
