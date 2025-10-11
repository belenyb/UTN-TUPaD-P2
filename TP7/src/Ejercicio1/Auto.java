/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author belenyardebuller
 */
public class Auto extends Vehiculo {

    // Subclase: Auto con atributo adicional cantidadPuertas, sobrescribe mostrarInfo()
    private int cantidadPuertas;

    public Auto(int cantidadPuertas, String marca, String modelo) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Información del auto: \n---Cantidad de puertas: " + cantidadPuertas);

    }

}
