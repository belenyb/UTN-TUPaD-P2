/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author belenyardebuller
 */

//2. Registro de Mascotas
//a. Crear una clase Mascota con los atributos: nombre, especie, edad.
//Métodos requeridos: mostrarInfo(), cumplirAnios().
//Tarea: Crear una mascota, mostrar su información, simular el paso del tiempo y
//verificar los cambios.

public class Mascota {
    String nombre;
    String especie;
    int edad;
    
    void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
    }
    
    void cumplirAnios(){
        edad++;
    }
}
