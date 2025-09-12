/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio14;

/**
 *
 * @author belenyardebuller
 */
public class EditorVideo {
        // Dependencia de Creación: crea un Render en el método y no lo guarda como atributo.

        public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato);
        render.setProyecto(proyecto); // Asociación unidireccional Render -> Proyecto
        System.out.println("Render generado exitosamente para proyecto: " + render.getProyecto().getNombre());
    }
}


