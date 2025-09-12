/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author belenyardebuller
 */
public class Reserva {

    private String fecha;
    private String hora;
    private Cliente cliente; // Asociación unidireccional Reserva -> Cliente
    private Mesa mesa; // Agregación

    // Agregación: se pasa la instancia como parámtro en el constructor
    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void mostrar() {
        System.out.println("Reserva: "
                + "\n- Fecha: " + fecha
                + "\n- Hora: " + hora
                + "\n- Cliente: " + cliente.getNombre()
                + "\n- Mesa nro: " + mesa.getNumero()
        );
    }
}
