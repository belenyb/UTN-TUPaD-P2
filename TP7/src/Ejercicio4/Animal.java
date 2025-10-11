/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author belenyardebuller
 */
public class Animal {

    // Clase: Animal con método hacerSonido() y describirAnimal()
    public void hacerSonido() {
        System.out.println("Sonido genérico de animal");
    }

    public String describirAnimal() {
        return getClass().getSimpleName();
    }
}
