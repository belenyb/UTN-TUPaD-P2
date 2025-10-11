/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author belenyardebuller
 */
public abstract class Figura {
    // Clase abstracta: Figura con método calcularArea() y atributo nombre
    private String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    // Método abstracto - debe implementarse en subclases
    public abstract double calcularArea();
}
