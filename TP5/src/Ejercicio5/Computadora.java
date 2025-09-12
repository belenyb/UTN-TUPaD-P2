/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author belenyardebuller
 */
public class Computadora {

    private String marca;
    private String numeroSerie;
    private Propietario propietario; // Asociación bidireccional 1..1
    private PlacaMadre placaMadre; // Composición

    public Computadora(String marca, String numeroSerie, String modelo, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        // Se crea internamente la instancia a través de parámetros
        // primitivos del constructor:
        this.placaMadre = new PlacaMadre(modelo, chipset);
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public String getMarca() {
        return marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }

    public void mostrar() {
        System.out.println("Computadora:"
                + "\n- Marca: " + marca
                + "\n- Número de serie: " + numeroSerie
                + "\n- Placa madre: " + placaMadre.getModelo()
                + "\n- Propietario: " + propietario.getNombre() + ", DNI: "
                + propietario.getDni());
    }

}
