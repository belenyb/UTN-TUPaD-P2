/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasoPractico2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author belenyardebuller
 */
public class Biblioteca {

    private String nombre;
    private List<Libro> libros = new ArrayList<>(); // Composición 1 a N: una Biblioteca contiene múltiples libros

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Composición 1 a N: Se crean internamente los libros dentro de la clase contenedora (Biblioteca) a partir de datos primitivos:
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        if (anioPublicacion <= 0) {
            System.out.println("Año de publicación inválido");
            return;
        }
        if (isbn == null || titulo == null || autor == null) {
            System.out.println("Datos del libro inválidos");
            return;
        }
        if (buscarLibroPorIsbn(isbn) != null) {
            System.out.println("ISBN duplicado");
            return;
        }
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("(La biblioteca no tiene libros)");
            return;
        }
        System.out.println("Listado de libros: \n");
        for (Libro l : libros) {
            l.mostrarInfo();
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        if (isbn == null) {
            return null;
        }
        for (Libro l : libros) {
            if (isbn.equalsIgnoreCase(l.getIsbn())) {
                return l;
            }
        }
        return null;
    }

    public void eliminarLibro(String isbn) {
        if (isbn == null) {
            System.out.println("ISBN inválido");
            return;
        }
        Libro l = buscarLibroPorIsbn(isbn);
        if (l == null) {
            System.out.println("No se encontró un libro con ISBN '" + isbn + "'");
            return;
        }
        libros.remove(l);
        System.out.println("Libro con ISBN '" + isbn + "' eliminado.");
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public List<Libro> filtrarLibrosPorAnio(int anio) {
        List<Libro> resultado = new ArrayList<>();
        for (Libro l : libros) {
            if (l.getAnioPublicacion() == anio) {
                resultado.add(l);
            }
        }
        return resultado;
    }

    public void mostrarAutoresDisponibles() {
        if (libros.isEmpty()) {
            System.out.println("(Sin autores: no hay libros aún)");
            return;
        }
        java.util.LinkedHashSet<String> autoresUnicos = new java.util.LinkedHashSet<>();
        for (Libro l : libros) {
            Autor a = l.getAutor();
            autoresUnicos.add(a.getId() + " | " + a.getNombre() + " | " + a.getNacionalidad());
        }
        System.out.println("Autores en la biblioteca:");
        for (String linea : autoresUnicos) {
            System.out.println(" - " + linea);
        }
    }
}
