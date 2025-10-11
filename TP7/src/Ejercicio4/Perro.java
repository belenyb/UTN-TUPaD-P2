/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author belenyardebuller
 */
public class Perro extends Animal {

    // Subclases: Perro, Gato, Vaca sobrescriben hacerSonido() con @Override
    @Override
    public void hacerSonido() {
        System.out.println("Guau guau");
    }
}
