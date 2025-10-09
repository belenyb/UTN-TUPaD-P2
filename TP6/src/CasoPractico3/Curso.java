/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasoPractico3;

/**
 *
 * @author belenyardebuller
 */
public class Curso {

    private String codigo;
    private String nombre;
    private Profesor profesor; // Asociación bidireccional 1..N (un Profesor dicta muchos Cursos)

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor p) {
        // Asigna/cambia el profesor sincronizando ambos lados
        if (this.profesor == p) {
            return; // Ya está seteado
        }        // Si tenía profesor previo, quitarse de su lista
        if (this.profesor != null) {
            this.profesor.eliminarCurso(this);
        }
        this.profesor = p;
        if (p != null && !p.getCursos().contains(this)) {
            p.agregarCurso(this);
        }
    }

    public void mostrarInfo() {
        // Muestra código, nombre y nombre del profesor (si tiene)
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Profesor: " + (profesor != null ? profesor.getNombre() : "(sin asignar)"));
    }
}
