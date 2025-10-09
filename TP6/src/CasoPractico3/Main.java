/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CasoPractico3;

/**
 *
 * @author belenyardebuller
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Crear al menos 3 profesores y 5 cursos.
        Profesor pr1 = new Profesor("PR001", "Ana López", "Programación");
        Profesor pr2 = new Profesor("PR002", "Carlos Pérez", "Bases de Datos");
        Profesor pr3 = new Profesor("PR003", "Lucía Gómez", "Redes");

        Curso c1 = new Curso("INF-101", "Programación I");
        Curso c2 = new Curso("INF-201", "Programación II");
        Curso c3 = new Curso("BD-101", "Bases de Datos I");
        Curso c4 = new Curso("RED-101", "Redes I");
        Curso c5 = new Curso("POO-301", "Programación Orientada a Objetos");

        // 2. Agregar profesores y cursos a la universidad.
        Universidad utn = new Universidad("Universidad Tecnológica Nacional");
        utn.agregarProfesor(pr1);
        utn.agregarProfesor(pr2);
        utn.agregarProfesor(pr3);
        utn.agregarCurso(c1);
        utn.agregarCurso(c2);
        utn.agregarCurso(c3);
        utn.agregarCurso(c4);
        utn.agregarCurso(c5);

        // 3. Asignar profesores a cursos usando asignarProfesorACurso().
        utn.asignarProfesorACurso(c1.getCodigo(), pr1.getId());
        utn.asignarProfesorACurso(c2.getCodigo(), pr1.getId());
        utn.asignarProfesorACurso(c3.getCodigo(), pr2.getId());
        utn.asignarProfesorACurso(c4.getCodigo(), pr3.getId());

        // 4. Listar cursos con su profesor y profesores con sus cursos.
        System.out.println("\n== Cursos con su profesor ==");
        utn.listarCursos();

        System.out.println("\n== Profesores con sus cursos ==");
        utn.listarProfesores();

        // 5. Cambiar el profesor de un curso y verificar que ambos lados quedan sincronizados.
        System.out.println("\n== Curso 4 antes de modificarse ==");
        c4.mostrarInfo();
        c4.setProfesor(pr2);
        System.out.println("\n== Curso 4 después de modificarse ==");
        c4.mostrarInfo();

        // 6. Remover un curso y confirmar que ya no aparece en la lista del profesor.
        System.out.println("\n== Cursos de profesor 2 antes de modificarse ==");
        pr2.listarCursos();
        utn.eliminarCurso(c4.getCodigo());
        System.out.println("\n== Cursos de profesor 2 después de modificarse ==");
        pr2.listarCursos();

        // 7. Remover un profesor y dejar profesor = null.
        utn.eliminarProfesor(pr2.getId());
        utn.listarCursos();

        // 8. Mostrar un reporte: cantidad de cursos por profesor
        System.out.println("\n== REPORTE ==");
        System.out.println("Cantidad de Cursos por Profesor: \n");
        for (Profesor p : utn.getProfesores()) {
            System.out.println("Profesor: " + p.getNombre());
            System.out.println("Cantidad de cursos: " + p.getCursos().size());
            System.out.println("=======");
        }
    }

}
