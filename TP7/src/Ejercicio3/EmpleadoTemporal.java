/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author belenyardebuller
 */
public class EmpleadoTemporal extends Empleado {

    // Subclases: EmpleadoPlanta, EmpleadoTemporal
    private final int horasTrabajadas;
    private final double valorHora;

    public EmpleadoTemporal(int horasTrabajadas, double valorHora, String nombre) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * valorHora;
    }
}
