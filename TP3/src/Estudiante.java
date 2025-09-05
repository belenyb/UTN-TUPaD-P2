/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author belenyardebuller
 */

//1. Registro de Estudiantes
//a. Crear una clase Estudiante con los atributos: nombre, apellido, curso,
//calificación.
//Métodos requeridos: mostrarInfo(), subirCalificacion(puntos),
//bajarCalificacion(puntos).
//Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir
//calificaciones.


public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCurso() {
        return curso;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
    }
    
    public void subirCalificacion(double puntos){
        calificacion += puntos;
    }
    
    public void bajarCalificacion(double puntos){
        calificacion -= puntos;
    }
}
