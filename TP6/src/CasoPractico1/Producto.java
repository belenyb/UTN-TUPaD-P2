/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasoPractico1;

/**
 *
 * @author belenyardebuller
 */
public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;
    
    // Static
    private static int autoId = 0;
    private static String nextId() { return "P" + autoId++; }

    
    // Constructores
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
    
    // Constructor sobrecargado: genera id automáticamente
    public Producto(String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this(nextId(), nombre, precio, cantidad, categoria);
    }

    // Constructor sobrecargado: crea productos con stock 0 por defecto
    public Producto(String id, String nombre, double precio, CategoriaProducto categoria) {
        this(id, nombre, precio, 0, categoria);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProducto categoria) {
        this.categoria = categoria;
    }

    public void mostrarInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Producto{id='" + id + '\''
                + ", nombre='" + nombre + '\''
                + ", precio=$" + String.format("%.2f", precio)
                + ", cantidad=" + cantidad
                + ", categoria=" + categoria
                + '}';
    }
}
