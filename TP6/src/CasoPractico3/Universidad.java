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
public class Universidad {

    private String nombre;
    private List<Profesor> profesores = new ArrayList();
    private List<Curso> cursos = new ArrayList();

    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Profesor> getProfesores() {
        return Collections.unmodifiableList(profesores);
    }

    public List<Curso> getCursos() {
        return Collections.unmodifiableList(cursos);
    }

    public void agregarProfesor(Profesor p) {
        if (p == null) {
            System.out.println("Profesor inválido");
            return;
        }
        // Si existe el profesor, termina la ejecución de la función
        if (buscarProfesorPorId(p.getId()) != null) {
            System.out.println("Ya existe un profesor con id '" + p.getId() + "'");
            return;
        }
        // Si no existe, se agrega
        profesores.add(p);
        System.out.println("Profesor agregado: " + p.getNombre());
    }

    public void agregarCurso(Curso c) {
        if (c == null) {
            System.out.println("Curso inválido");
        }
        // Si existe el curso, termina la ejecución de la función
        if (buscarCursoPorCodigo(c.getCodigo()) != null) {
            System.out.println("Ya existe un curso con código " + c.getCodigo());
        }
        // Si no existe, se agrega
        cursos.add(c);
        System.out.println("Curso agregado: " + c.getNombre());
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);
        if (curso == null) {
            System.out.println("No existe curso con código " + codigoCurso);
        }
        if (profesor == null) {
            System.out.println("No existe profesor con id " + idProfesor);
        }
        if (profesor == null || curso == null) {
            System.out.println("Datos inválidos. No es posible asignar profesor a curso");
            return;
        }
        // Usa setProfesor del curso.
        curso.setProfesor(profesor);
        System.out.println("Profesor " + profesor.getNombre() + " asignado a curso " + curso.getNombre());
    }

    public void listarProfesores() {
        if (profesores.isEmpty()) {
            System.out.println("Listado de profesores vacío");
            return;
        }
        System.out.println("Listado de profesores: \n");
        for (Profesor p : profesores) {
            p.mostrarInfo();

        }
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("Listado de cursos vacío");
            return;
        }
        System.out.println("Listado de cursos: \n");
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }

    public Profesor buscarProfesorPorId(String id) {
        if (id == null) {
            System.out.println("ID inválido");
            return null;
        }
        for (Profesor p : profesores) {
            if (p.getId() == id) {
                return p;
            }
        }
        System.out.println("Profesor con id " + id + " no encontrado.");
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        if (codigo == null) {
            System.out.println("Código inválido");
            return null;
        }
        for (Curso c : cursos) {
            if (c.getCodigo() == codigo) {
                return c;
            }
        }
        System.out.println("Curso con código " + codigo + " no encontrado.");
        return null;
    }

    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso == null) {
            System.out.println("No existe curso con codigo " + codigo);
            return;
        }
        // Debe romper la relación con su profesor si la hubiera.
        if (curso.getProfesor() != null) {
            curso.setProfesor(null);
        }
        cursos.remove(curso);
        System.out.println("Curso con codigo " + codigo + " eliminado.");
    }

    public void eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor == null) {
            System.out.println("No existe profesor con id " + id);
            return;
        }
        // Antes de remover, dejar null los cursos que dictaba.
        List<Curso> copiaCursos = new ArrayList<>(profesor.getCursos());
        for (Curso c : copiaCursos) {
            c.setProfesor(null);
        }
        profesores.remove(profesor);
        System.out.println("Profesor con id " + id + " eliminado.");
    }
}
