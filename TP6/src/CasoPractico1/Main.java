/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CasoPractico1;

import java.util.List;

/**
 *
 * @author belenyardebuller
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Crear al menos cinco productos con diferentes categorías y agregarlos al inventario.
        Producto p1 = new Producto("A001", "Yerba Mate 1kg", 2500, 4, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("A002", "Agua Mineral Villavicencio", 1800, 10, CategoriaProducto.ALIMENTOS);
        Producto p3 = new Producto("E001", "iPhone 14 Pro Max", 1800000, 5, CategoriaProducto.ELECTRONICA);
        Producto p4 = new Producto("H001", "Acolchado King Size Arredo", 450000, 4, CategoriaProducto.HOGAR);
        // Creado con constructor sobrecargado que asigna id automáticamente
        Producto p5 = new Producto("Zapatillas Nike AirMax", 225000, 2, CategoriaProducto.ROPA);

        Inventario inventario = new Inventario();
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        
        // 2. Listar todos los productos mostrando su información y categoría.
        inventario.listarProductos();
        
        // 3. Buscar un producto por ID y mostrar su información.
        Producto productoBuscadoPorId = inventario.buscarProductoPorId(p2.getId());
        System.out.println(productoBuscadoPorId);
        
        // 4. Filtrar y mostrar productos que pertenezcan a una categoría específica.
        List<Producto> productosFiltradosPorCategoria = inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        System.out.println(productosFiltradosPorCategoria);
        
        // 5. Eliminar un producto por su ID y listar los productos restantes.
        inventario.eliminarProducto(p3.getId());
        inventario.listarProductos();
        
        // 6. Actualizar el stock de un producto existente.
        inventario.actualizarStock(p2.getId(), 20);
        
        // 7. Mostrar el total de stock disponible.
        int totalStock = inventario.obtenerTotalStock();
        System.out.println("Total de stock disponible: " + totalStock);
        
        // 8. Obtener y mostrar el producto con mayor stock.
        Producto productoConMayorStock = inventario.obtenerProductoConMayorStock();
        System.out.println("Producto con mayor stock: " + productoConMayorStock);
        
        // 9. Filtrar productos con precios entre $1000 y $3000.
        List<Producto> productosFiltradosPorPrecio = inventario.filtrarProductosPorPrecio(1000, 3000);
        System.out.println("Productos entre $1000 y $3000: " + productosFiltradosPorPrecio);
        
        // 10. Mostrar las categorías disponibles con sus descripciones.
        inventario.mostrarCategoriasDisponibles();
    }
    
}
