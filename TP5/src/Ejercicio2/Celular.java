/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author belenyardebuller
 */
public class Celular {

    private String imei;
    private String marca;
    private String modelo;
    // Agregación: Una clase está compuesta por otra, pero esta puede existir por separado:
    private Bateria bateria;
    private Usuario usuario; // Asociación bidireccional 1..1

    // Agregación: Se pasa la instancia como parámetro en el constructor.
    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public String getImei() {
        return imei;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        String usuarioInfo = (usuario != null)
                ? usuario.getNombre() + " (" + usuario.getDni() + ")"
                : "sin usuario";
        return "Celular{"
                + "imei='" + imei + '\''
                + ", marca='" + marca + '\''
                + ", modelo='" + modelo + '\''
                + ", bateria=" + bateria
                + // OK: Bateria no referencia a Celular/Usuario
                ", usuario=" + usuarioInfo
                + '}';
    }

}
