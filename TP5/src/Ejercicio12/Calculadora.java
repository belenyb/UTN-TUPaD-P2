/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio12;

/**
 *
 * @author belenyardebuller
 */
public class Calculadora {
    public void calcular(Impuesto impuesto) {
        final int montoEjemplo = 500000;
        double total = montoEjemplo + montoEjemplo * impuesto.getMonto();
        System.out.println("Impuesto aplicado a " + impuesto.getContribuyente().getNombre() + ": " + impuesto.getMonto() + "\nTotal: " + total);
    }
}