/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author belenyardebuller
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // Parte 1
//        // Crear cliente
//        Cliente cliente = new Cliente("Belén Yarde Buller", "belen@example.com");
//
//        // Crear productos
//        Producto p1 = new Producto("Notebook Lenovo", 850000);
//        Producto p2 = new Producto("Mouse inalámbrico", 15000);
//        Producto p3 = new Producto("Auriculares Bluetooth", 30000);
//
//        // Crear pedido y agregar productos
//        Pedido pedido = new Pedido(cliente);
//        pedido.agregarProducto(p1);
//        pedido.agregarProducto(p2);
//        pedido.agregarProducto(p3);
//
//        // Mostrar total del pedido
//        System.out.println("\nTotal del pedido: $" + pedido.calcularTotal());
//
//        // Probar diferentes medios de pago
//        System.out.println("Pago con Tarjeta de Crédito:");
//        TarjetaDeCredito tarjeta = new TarjetaDeCredito(cliente.getNombre());
//        tarjeta.procesarPago(pedido.calcularTotal());
//
//        System.out.println("Pago con Transferencia Bancaria:");
//        TransferenciaBancaria transferencia = new TransferenciaBancaria(cliente.getNombre(), "Banco Santander");
//        transferencia.procesarPago(pedido.calcularTotal());
//
//        System.out.println("Pago con PayPal:");
//        PayPal paypal = new PayPal(cliente.getEmail());
//        paypal.procesarPago(pedido.calcularTotal());
//
//        // Probar cambio de estado del pedido y notificación al cliente
//        System.out.println("Cambio de estado del pedido:");
//        pedido.cambiarEstado(EstadoPedido.PAGADO);
//        pedido.cambiarEstado(EstadoPedido.EN_PREPARACION);
//        pedido.cambiarEstado(EstadoPedido.ENVIADO);
//        pedido.cambiarEstado(EstadoPedido.ENTREGADO);
//
//        // Mostrar resumen final
//        System.out.println("\nPedido finalizado:");
//        System.out.println(pedido);
        
        // Parte 2
//        ManejoDeExcepciones.dividir();
//        ManejoDeExcepciones.textoAInteger();
//        ManejoDeExcepciones.leerArchivo();
//        ManejoDeExcepciones.validarEdad();
        ManejoDeExcepciones.leerArchivoTryWithResources();
    }

}
