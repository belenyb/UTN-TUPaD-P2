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
        estudiante.setNombre("Belen");
        estudiante.setApellido("Yarde Buller");
        estudiante.setCurso("Programación");
        estudiante.setCalificacion(8.0);
        estudiante.mostrarInfo();
        System.out.println("Modificando datos...");
        estudiante.subirCalificacion(2);
        estudiante.bajarCalificacion(3);
        estudiante.mostrarInfo();

        // Ejercicio 2
        System.out.println("\n=== Ejercicio 2 ===");
        Mascota mascota = new Mascota();
        mascota.setNombre("Crash");
        mascota.setEspecie("Mestizo");
        mascota.setEdad(4);
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
        gallina1.setIdGallina(1);
        gallina1.setEdad(3);
        gallina1.setHuevosPuestos(5);
        System.out.println("Datos iniciales de gallina " + gallina1.getIdGallina() + "...");
        gallina1.mostrarEstado();
        System.out.println("Simulando acciones de gallina " + gallina1.getIdGallina() + "...");
        gallina1.envejecer();
        gallina1.envejecer();
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        gallina1.envejecer();
        System.out.println("Se muestran los resultados...");
        gallina1.mostrarEstado();

        Gallina gallina2 = new Gallina();
        gallina2.setIdGallina(2);
        gallina2.setEdad(1);
        gallina2.setHuevosPuestos(2);
        System.out.println("Datos iniciales de gallina " + gallina2.getIdGallina() + "...");
        gallina2.mostrarEstado();
        System.out.println("Simulando acciones de gallina " + gallina2.getIdGallina() + "...");
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
        nave.setNombre("Apollo");
        nave.setCombustible(50);
        System.out.println("Estado inicial de " + nave.getNombre() + "...");
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
