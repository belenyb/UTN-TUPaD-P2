/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author belenyardebuller
 */
public abstract class Empleado {

    // Clase abstracta: Empleado con método calcularSueldo()
    private final String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double calcularSueldo();
}
