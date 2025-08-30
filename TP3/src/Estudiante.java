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
    String nombre;
    String apellido;
    String curso;
    double calificacion;
    
    void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
    }
    
    void subirCalificacion(double puntos){
        calificacion += puntos;
    }
    
    void bajarCalificacion(double puntos){
        calificacion -= puntos;
    }
}
