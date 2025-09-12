/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author belenyardebuller
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad; // Composición CuentaBancaria -> Clave Seguridad
    private Titular titular; // Asociación bidireccional 1..1
    
    // Composición: Se crea internamente la instancia a través de parámetros
    // primitivos del constructor:
    public CuentaBancaria(String cbu, double saldo, String codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigo, ultimaModificacion);
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if(titular != null && titular.getCuentaBancaria() != this) {
            titular.setCuentaBancaria(this);
        }
    }
    
    public void mostrar() {
        System.out.println(
                "Cuenta Bancaria:"
                + "\nCBU: " + cbu
                + "\nSaldo: " + saldo
                + "\nClave de seguridad: " + claveSeguridad.getCodigo()
                + "\nTitular: " + titular.getNombre()
        );
    }
    
}
