/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author belenyardebuller
 */
public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor; // Asociación unidireccional Libro -> Autor
    private Editorial editorial; // Agregación

    // Agregación - Implementación: 
    // Se pasa la instancia como parámetro en el constructor
    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Autor getAutor() {
        return autor;
    }
    
    public void mostrar() {
        System.out.println("Libro: " + titulo + " - Autor: " + autor.getNombre() + " - Editorial: " + editorial.getNombre());
    }
}
