/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author belenyardebuller
 */
public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte; // Asociación 1..1

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Asociación 1..1 bidireccional Pasaporte <-> Titular
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        // Revisa si hay vínculos previos para no entrar en un bucle infinito
        if (pasaporte != null && pasaporte.getTitular() != this) {
            // Establece el vínculo en el otro lado si hace falta
            pasaporte.setTitular(this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    @Override
    public String toString() {
        return """
               ---
               Titular: 
               Nombre: """ + nombre
                + "\nDni: " + dni
                + "\nPasaporte: " + (pasaporte != null ? pasaporte.getNumero() : "Sin pasaporte");
    }

}

