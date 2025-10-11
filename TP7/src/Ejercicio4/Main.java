/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author belenyardebuller
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tarea: Crear lista de animales y mostrar sus sonidos con polimorfismo
        List<Animal> listaAnimales = new ArrayList<>();

        // Creamos los animales
        Animal a1 = new Perro();
        Animal a2 = new Gato();
        Animal a3 = new Vaca();

        // Agregamos los animales a la lista de animales
        listaAnimales.add(a1);
        listaAnimales.add(a2);
        listaAnimales.add(a3);

        for (Animal a : listaAnimales) {
            System.out.print(a.describirAnimal() + ": ");
            a.hacerSonido(); // // Mostramos sus sonidos con polimorfismo
        }
    }

}
