/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CasoPractico2;

import java.util.List;

/**
 *
 * @author belenyardebuller
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Creamos una biblioteca.
        Biblioteca biblioteca = new Biblioteca("Biblioteca Académica UTN");

        // 2. Crear al menos tres autores
        Autor a1 = new Autor("AU001", "Gabriel García Márquez", "Colombia");
        Autor a2 = new Autor("AU002", "Camila Sosa Villada", "Argentina");
        Autor a3 = new Autor("AU003", "Isabel Allende", "Chile");

        // 3. Agregar 5 libros asociados a alguno de los Autores a la biblioteca. 
        biblioteca.agregarLibro("ISBN-001", "Cien años de soledad", 1967, a1);
        biblioteca.agregarLibro("ISBN-002", "La novia de Sandro", 2015, a2);
        biblioteca.agregarLibro("ISBN-003", "La casa de los espíritus", 1982, a3);
        biblioteca.agregarLibro("ISBN-004", "Eva Luna", 1987, a3);
        biblioteca.agregarLibro("ISBN-005", "Las malas", 2019, a2);

        // 4. Listar todos los libros con su información y la del autor. 
        biblioteca.listarLibros();

        // 5. Buscar un libro por su ISBN y mostrar su información. 
        Libro libroBuscadoPorISBN = biblioteca.buscarLibroPorIsbn("ISBN-002");
        System.out.println(libroBuscadoPorISBN);

        // 6. Filtrar y mostrar los libros publicados en un año específico. 
        List<Libro> librosFiltradosPorAnio = biblioteca.filtrarLibrosPorAnio(1982);
        System.out.println("Libros filtrados por año 1982: " + librosFiltradosPorAnio);

        // 7. Eliminar un libro por su ISBN y listar los libros restantes.
        biblioteca.eliminarLibro("ISBN-004");
        biblioteca.listarLibros();

        // 8. Mostrar la cantidad total de libros en la biblioteca. 
        int totalLibros = biblioteca.obtenerCantidadLibros();
        System.out.println("Total de libros en la biblioteca: " + totalLibros);
        
        // 9. Listar todos los autores de los libros disponibles en la biblioteca.
        biblioteca.mostrarAutoresDisponibles();
    }

}
