/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author belenyardebuller
 */
public class Vehiculo {

    private String patente;
    private String modelo;
    private Motor motor; // Agregación Vehículo -> Motor
    private Conductor conductor; // Asociación bidireccional 1..1

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() != this) {
            conductor.setVehiculo(this);
        }
    }

    public void mostrar() {
        System.out.println("Vehículo: " + modelo + 
                "\nMotor: " + motor.getTipo() + 
                "\nConductor: " + conductor.getNombre() + 
                ", licencia: " + conductor.getLicencia());
    }
}
