/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author belenyardebuller
 */
public class Propietario {

    private String nombre;
    private String dni;
    private Computadora computadora; // Asociación bidireccional 1..1

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
        if (computadora != null && computadora.getPropietario() != this) {
            computadora.setPropietario(this);
        }
    }

    public void mostrar() {
        System.out.println("Propietario:"
                + "\n- nombre: " + nombre
                + "\n- computadora: " + computadora.getMarca() + " "
                + computadora.getNumeroSerie());
    }
}
