/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio12;

/**
 *
 * @author belenyardebuller
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Belén Yarde Buller", "27-37000000-1");
        Impuesto impuesto = new Impuesto(0.21);
        impuesto.setContribuyente(contribuyente);
        Calculadora calculadora = new Calculadora();
        calculadora.calcular(impuesto); // dependencia de uso (método recibe Impuesto)
    }
    
}
