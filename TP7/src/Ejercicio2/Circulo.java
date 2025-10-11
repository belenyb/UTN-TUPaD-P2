/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author belenyardebuller
 */
public class Circulo extends Figura {
    // Subclases: Círculo y Rectángulo implementan el cálculo del área
    private static final double PI = 3.14;
    private double radio;

    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return PI * radio * radio;
    }
}
