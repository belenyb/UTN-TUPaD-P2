/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4;

/**
 *
 * @author belenyardebuller
 */
public class TP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instancie varios objetos usando ambos constructores.
        Empleado empleado1 = new Empleado(1, "Belen", "Frontend Developer", 200);
        Empleado empleado2 = new Empleado(2, "Santiago", "Backend Developer", 350);
        Empleado empleado3 = new Empleado("Martina", "QA Analyst");
        Empleado empleado4 = new Empleado("Lucas", "UX Designer");

        // Aplique los métodos actualizarSalario() sobre distintos empleados.
        // Probá distintos escenarios para validar el comportamiento de los
        // métodos sobrecargados.
        System.out.println("======");
        System.out.println("Actualizando datos de empleados...");
        try {
            empleado1.actualizarSalario(20.0);
            empleado2.actualizarSalario(50);
            empleado3.actualizarSalario(15.0);
            // Se fuerza el error para testear validaciones
            empleado4.actualizarSalario(-20);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al actualizar salario de empleado con id " + empleado4.getId() + ": " + e);
        }

        // Imprima la información de cada empleado con toString().
        System.out.println("======");
        System.out.println("Mostrando datos de empleados...");
        System.out.println(empleado1.toString());
        System.out.println("======");
        System.out.println(empleado2.toString());
        System.out.println("======");
        System.out.println(empleado3.toString());
        System.out.println("======");
        System.out.println(empleado4.toString());
        System.out.println("======");

        // Muestre el total de empleados creados con mostrarTotalEmpleados()
        System.out.println("Total empleados:");
        System.out.println(Empleado.mostrarTotalEmpleados());
    }

}
