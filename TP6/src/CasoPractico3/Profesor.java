/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasoPractico3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author belenyardebuller
 */
public class Profesor {

    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos = new ArrayList(); //  Asociación bidireccional N..1 (cada Curso tiene exactamente un Profesor responsable)

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public List<Curso> getCursos() {
        return Collections.unmodifiableList(cursos);
    }

    public void agregarCurso(Curso c) {
        if (c != null && !cursos.contains(c)) {
            cursos.add(c);
            if (c.getProfesor() != this) {
                c.setProfesor(this);
            }
        }
    }

    public void eliminarCurso(Curso c) {
        // Se saca el curso de la lista y se setea su profesor en null
        if (cursos.remove(c) && c.getProfesor() == this) {
            c.setProfesor(null);
        }
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("(El profesor no tiene cursos)");
            return;
        }
        System.out.println("Listado de cursos: \n");
        // Muestra códigos y nombres
        for (Curso curso : cursos) {
            curso.mostrarInfo();
        }

    }

    public void mostrarInfo() {
        // Imprime datos del profesor y cantidad de cursos
        System.out.println("Datos del profesor: \n" 
                + "Nombre: " + nombre 
                + "\nEspecialidad: " + especialidad 
                + "\nTotal cursos: " + cursos.size());
        System.out.println("\nDetalle cursos: ");
        for(Curso c : cursos){
            System.out.println(
                    "\nCódigo: " + c.getCodigo()
                    + "\nNombre:" + c.getNombre()
            );
        }
    }
}
