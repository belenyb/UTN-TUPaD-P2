/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author belenyardebuller
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tarea: Crear lista de empleados, invocar calcularSueldo() polimórficamente, usar instanceof para clasificar
        List<Empleado> listaEmpleados = new ArrayList<>();
        
        // Creamos algunos empleados
        Empleado e1 = new EmpleadoPlanta(500, 8, "Marcela López");
        Empleado e2 = new EmpleadoPlanta(200, 1, "Roberto García");
        Empleado e3 = new EmpleadoTemporal(100, 580, "Sofía Martínez");
        
        // Agregamos los empleados a la lista de empleados
        listaEmpleados.add(e1);
        listaEmpleados.add(e2);
        listaEmpleados.add(e3);
        
        // Inicializamos contadores para cada tipo de empleado
        int cantPlanta = 0;
        int cantTemporal = 0;
        
        // Recorremos la lista de empleados
        for (Empleado e : listaEmpleados) {
            double sueldo = e.calcularSueldo(); // Calculamos sueldo polimórficamente

            // Clasificamos con instanceof
            String tipo;
            if (e instanceof EmpleadoPlanta) {
                tipo = "Planta";
                cantPlanta++;
            } else if (e instanceof EmpleadoTemporal) {
                tipo = "Temporal";
                cantTemporal++;
            } else {
                tipo = "Desconocido";
            }

            System.out.println("Empleado: " + e.getNombre() + " \n--- Sueldo: " + sueldo + "\n--- Tipo: " + tipo);
        }
        
        System.out.println("===REPORTE=== \nDel total de empleados, hay " + cantPlanta + " de planta y " + cantTemporal + " de tipo temporal.");
    }
    
}
