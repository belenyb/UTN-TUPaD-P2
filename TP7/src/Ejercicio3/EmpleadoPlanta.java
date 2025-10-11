/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author belenyardebuller
 */
public class EmpleadoPlanta extends Empleado {

    // Subclases: EmpleadoPlanta, EmpleadoTemporal
    private final double sueldoBase;
    private final int aniosAntiguedad;

    public EmpleadoPlanta(double sueldoBase, int aniosAntiguedad, String nombre) {
        super(nombre);
        this.sueldoBase = sueldoBase;
        this.aniosAntiguedad = aniosAntiguedad;
    }

    @Override
    public double calcularSueldo() {
        // A modo de ejemplo se plantea un 5% por año sobre el base por años de antigüedad
        double adicionalAntiguedad = sueldoBase * 0.05 * aniosAntiguedad;
        return sueldoBase + adicionalAntiguedad;
    }
}
