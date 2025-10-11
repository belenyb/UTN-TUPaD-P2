/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2;

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
        // Tarea: Crear un array de figuras y mostrar el área de cada una usando polimorfismo.
        List<Figura> arrayFiguras = new ArrayList<>();
        
        // Creamos figuras 
        Circulo c1 = new Circulo(10, "Círculo 1");
        Circulo c2 = new Circulo(20, "Círculo 2");
        Rectangulo r1 = new Rectangulo("Rectángulo 1", 5, 10);
        
        // Agregamos las figuras al array de figuras
        arrayFiguras.add(c1);
        arrayFiguras.add(c2);
        arrayFiguras.add(r1);
        
        // Mostramos el área de cada una usando polimorfismo
        for (Figura f : arrayFiguras) {
            System.out.println("Área de " + f.getNombre() + ": " + f.calcularArea());
        }
    }
    
}
