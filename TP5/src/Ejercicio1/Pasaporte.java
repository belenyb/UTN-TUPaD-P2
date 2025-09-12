/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author belenyardebuller
 */
public class Pasaporte {
    private final String numero;
    private final String fechaEmision;
    private Titular titular; // Asociación 1..1
    private Foto foto; // Composición

    public Pasaporte(String numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato); // Se crea en el constructor y no hay setter
    }

    // Asociación 1..1 bidireccional Titular <-> Pasaporte
    public void setTitular(Titular titular) {
        this.titular = titular;
        // Revisa si hay vínculos previos para no entrar en un bucle infinito
        if (titular != null && titular.getPasaporte() != this) {
            // Establece el vínculo en el otro lado si hace falta
            titular.setPasaporte(this);
        }
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    public Titular getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return """
               ---
               Pasaporte: 
               Numero: """ + numero
                + "\nFecha de emisión: " + fechaEmision
                + "\nTitular: " + (titular != null ? titular.getNombre() : "Sin titular");
    }

}
