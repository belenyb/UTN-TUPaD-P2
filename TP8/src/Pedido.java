
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author belenyardebuller
 */
public class Pedido implements Pagable {

    // 3. Clase Pedido: tiene una lista de productos, implementa Pagable y calcula el total del pedido
    private List<Producto> productos = new ArrayList<>();
    private EstadoPedido estado = EstadoPedido.CREADO; // Estado inicial al crear un pedido
    private Cliente cliente;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    public void cambiarEstado(EstadoPedido nuevoEstado) {
        if (nuevoEstado == null) {
            throw new RuntimeException("El estado no puede ser nulo.");
        }

        // Validación de estados del pedido
        if (estado == EstadoPedido.ENTREGADO && nuevoEstado != EstadoPedido.ENTREGADO) {
            throw new RuntimeException("No se puede modificar un pedido ya entregado.");
        }

        this.estado = nuevoEstado;
        try {
            cliente.notificarCambio("El pedido cambió a estado: " + nuevoEstado);
        } catch (Exception e) {
            System.err.println("Error al notificar al cliente: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Pedido{" + "productos=" + productos + ", estado=" + estado + ", cliente=" + cliente + '}';
    }

}
