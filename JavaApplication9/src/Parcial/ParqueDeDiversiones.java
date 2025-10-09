/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcial;

/**
 *
 * @author belenyardebuller
 */
public class ParqueDeDiversiones {
    public static double TARIFA_ENTRADA = 50.0;
    private String nombre;

    public ParqueDeDiversiones(String nombre) {
        this.nombre = nombre;
    }

    public static String getHorarioApertura() {
        return "El parque abre a las 10:00 AM";
    }

    public void imprimirTicket() {
        System.out.println("Valor de la entrada: $" + this.TARIFA_ENTRADA);
    }
}
