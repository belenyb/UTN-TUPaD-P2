/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import Ejercicio2.Celular;

/**
 *
 * @author belenyardebuller
 */
public class Usuario {

    private String nombre;
    private String dni;
    private Celular celular; // Asociación bidireccional 1..1

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
        if (celular != null && celular.getUsuario() != this) {
            celular.setUsuario(this);
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        String celInfo = (celular != null)
                ? celular.getMarca() + " " + celular.getModelo() + " [" + celular.getImei() + "]"
                : "sin celular";
        return "Usuario{"
                + "nombre='" + nombre + '\''
                + ", dni='" + dni + '\''
                + ", celular=" + celInfo
                + '}';
    }

}
