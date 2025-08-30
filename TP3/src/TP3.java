/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author belenyardebuller
 */
public class TP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 1
        System.out.println("=== Ejercicio 1 ===");
        Estudiante estudiante = new Estudiante();
        estudiante.nombre = "Belen";
        estudiante.apellido = "Yarde Buller";
        estudiante.curso = "Programación";
        estudiante.calificacion = 8.0;
        estudiante.mostrarInfo();
        System.out.println("Modificando datos...");
        estudiante.subirCalificacion(2);
        estudiante.bajarCalificacion(3);
        estudiante.mostrarInfo();

        // Ejercicio 2
        System.out.println("\n=== Ejercicio 2 ===");
        Mascota mascota = new Mascota();
        mascota.nombre = "Crash";
        mascota.especie = "Mestizo";
        mascota.edad = 4;
        mascota.mostrarInfo();
        System.out.println("Modificando datos...");
        mascota.cumplirAnios();
        mascota.cumplirAnios();
        mascota.cumplirAnios();
        mascota.mostrarInfo();

        // Ejercicio 3
        System.out.println("\n=== Ejercicio 3 ===");
        Libro libro = new Libro();
        libro.setTitulo("Rayuela");
        libro.setAutor("Julio Cortázar");
        System.out.println("Se pasa un valor inválido a setAñoPublicacion...");
        libro.setAñoPublicacion(0);
        System.out.println("Se pasa un valor válido a setAñoPublicacion...");
        libro.setAñoPublicacion(1963);
        System.out.println("Se muestran los resultados...");
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Año de publicación: " + libro.getAñoPublicacion());

        // Ejercicio 4
        System.out.println("\n=== Ejercicio 4 ===");
        Gallina gallina1 = new Gallina();
        gallina1.idGallina = 1;
        gallina1.edad = 3;
        gallina1.huevosPuestos = 5;
        System.out.println("Datos iniciales de gallina " + gallina1.idGallina + "...");
        gallina1.mostrarEstado();
        System.out.println("Simulando acciones de gallina " + gallina1.idGallina + "...");
        gallina1.envejecer();
        gallina1.envejecer();
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        gallina1.envejecer();
        System.out.println("Se muestran los resultados...");
        gallina1.mostrarEstado();

        Gallina gallina2 = new Gallina();
        gallina2.idGallina = 2;
        gallina2.edad = 1;
        gallina2.huevosPuestos = 2;
        System.out.println("Datos iniciales de gallina " + gallina2.idGallina + "...");
        gallina2.mostrarEstado();
        System.out.println("Simulando acciones de gallina " + gallina2.idGallina + "...");
        gallina2.envejecer();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.envejecer();
        gallina2.envejecer();
        gallina2.envejecer();
        System.out.println("Se muestran los resultados...");
        gallina2.mostrarEstado();

        // Ejercicio 5
        System.out.println("\n=== Ejercicio 5 ===");
        NaveEspacial nave = new NaveEspacial();
        nave.nombre = "Apollo";
        nave.combustible = 50;
        System.out.println("Estado inicial de " + nave.nombre + "...");
        nave.mostrarEstado();
        
        System.out.println("Intentar avanzar sin recargar...");
        nave.avanzar(30);

        System.out.println("Recargar y avanzar correctamente...");
        nave.recargarCombustible(40);
        nave.avanzar(20);

        System.out.println("Se muestran los resultados...");
        nave.mostrarEstado();

    }

}
