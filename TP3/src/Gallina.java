/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author belenyardebuller
 */

//4. Gestión de Gallinas en Granja Digital
//a. Crear una clase Gallina con los atributos: idGallina, edad,
//huevosPuestos.
//Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado().
//Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y
//mostrar su estado.

public class Gallina {
    int idGallina;
    int edad;
    int huevosPuestos;
    
    void ponerHuevo(){
        huevosPuestos++;
    }
    
    void envejecer(){
        edad++;
    }
    
    void mostrarEstado(){
        System.out.println("Identificador gallina: " + idGallina);
        System.out.println("Edad: " + edad);
        System.out.println("Huevos puestos: " + huevosPuestos);
    }
}
