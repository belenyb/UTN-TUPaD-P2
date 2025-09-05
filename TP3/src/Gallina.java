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
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }
    
    public void ponerHuevo(){
        huevosPuestos++;
    }
    
    public void envejecer(){
        edad++;
    }
    
    public void mostrarEstado(){
        System.out.println("Identificador gallina: " + idGallina);
        System.out.println("Edad: " + edad);
        System.out.println("Huevos puestos: " + huevosPuestos);
    }
}
