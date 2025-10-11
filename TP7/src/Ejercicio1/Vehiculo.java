/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author belenyardebuller
 */
public class Vehiculo {

    // Clase base: Vehículo con atributos marca, modelo y método mostrarInfo()
    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarInfo() {
        System.out.println("Información del vehículo: \n---Marca: " + marca + "\n---Modelo: " + modelo);
    }
}
