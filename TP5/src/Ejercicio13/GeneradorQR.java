/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio13;

/**
 *
 * @author belenyardebuller
 */
public class GeneradorQR {
    // Dependencia de Creación: crea un CodigoQR en el método y no lo guarda como atributo.

    public void generar(String valor, Usuario usuario) {
        CodigoQR qr = new CodigoQR(valor);
        qr.setUsuario(usuario); // Asociación unidireccional CodigoQR -> Usuario
        System.out.println("QR generado exitosamente para usuario: " + qr.getUsuario().getNombre());
    }
}