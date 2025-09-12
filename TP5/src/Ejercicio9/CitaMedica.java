/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

/**
 *
 * @author belenyardebuller
 */
public class CitaMedica {

    private String fecha;
    private String hora;
    private Paciente paciente; // Asociación unidireccional CitaMedica -> Paciente
    private Profesional profesional; // Asociación unidireccional CitaMedica -> Profesional

    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    public void mostrar() {
        System.out.println("Cita médica de: "
                + paciente.getNombre()
                + " (" + paciente.getObraSocial() + ")"
                + "\nFecha y hora: " + fecha + " " + hora
                + "\n Profesional: " + profesional.getNombre()
                + " (" + profesional.getEspecialidad() + ")"
        );
    }

}
