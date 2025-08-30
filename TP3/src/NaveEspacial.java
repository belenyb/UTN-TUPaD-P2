/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author belenyardebuller
 */

//5. Simulación de Nave Espacial
//Crear una clase NaveEspacial con los atributos: nombre, combustible.
//Métodos requeridos: despegar(), avanzar(distancia),
//recargarCombustible(cantidad), mostrarEstado().
//Reglas: Validar que haya suficiente combustible antes de avanzar y evitar que
//se supere el límite al recargar.
//Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin
//recargar, luego recargar y avanzar correctamente. Mostrar el estado al final.

public class NaveEspacial {
    String nombre;
    int combustible;

    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " ha despegado.");
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }

    public void avanzar(double distancia) {
        double consumo = distancia * 2; // por cada km se consumen 2 de combustible
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzó " + distancia + " km.");
        } else {
            System.out.println("No hay suficiente combustible para avanzar " + distancia + " km.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad <= 100) { // 100 como máximo
            combustible += cantidad;
            System.out.println("Se recargaron " + cantidad + " unidades de combustible.");
        } else {
            combustible = 100;
            System.out.println("La nave alcanzó su capacidad máxima de combustible (100).");
        }
    }

    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Combustible: " + combustible);
    }
}
