/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio9;

/**
 *
 * @author belenyardebuller
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 9
        Paciente paciente = new Paciente("Belen", "Medicus");
        Profesional profesional = new Profesional("Mariana", "Hepatología");
        CitaMedica citaMedica = new CitaMedica("2023-09-09", "19:00:00");
        citaMedica.setPaciente(paciente);
        citaMedica.setProfesional(profesional);
        citaMedica.mostrar();
    }
    
}
