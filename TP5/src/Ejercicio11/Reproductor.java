/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11;

/**
 *
 * @author belenyardebuller
 */
public class Reproductor {
    // Dependencia de uso
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo: " + cancion.getTitulo() + " (" + cancion.getArtista().getNombre() + ") " + " 🎶🎶🎶");
    }

}
