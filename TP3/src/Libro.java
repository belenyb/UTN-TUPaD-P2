
import java.time.Year;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author belenyardebuller
 */

//3. Encapsulamiento con la Clase Libro
//a. Crear una clase Libro con atributos privados: titulo, autor,
//añoPublicacion.
//Métodos requeridos: Getters para todos los atributos. Setter con validación
//para añoPublicacion.
//Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con
//uno válido, mostrar la información final.

public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        int añoActual = Year.now().getValue(); 
        // Se toma 1450 como un año aproximado de invención de la imprenta
        if (añoPublicacion > 1450 && añoPublicacion <= añoActual) {
            this.añoPublicacion = añoPublicacion;
        } else {
            System.out.println("Año de publicación inválido: " + añoPublicacion);
        }
    }
    
    
}
