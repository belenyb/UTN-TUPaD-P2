/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author belenyardebuller
 */
public class Funciones {

    static Scanner scanner = new Scanner(System.in);

    static int returnValidInteger(String mensaje) {

        int valor = 0;
        boolean isValidInteger = false;

        while (!isValidInteger) {
            System.out.print(mensaje);
            try {
                valor = Integer.parseInt(scanner.nextLine());
                isValidInteger = true;
            } catch (NumberFormatException e) {
                System.out.println("Error. Por favor ingrese un número entero.");
            }
        }
        return valor;
    }

    public static double returnValidDouble(String mensaje) {
        double valor = 0;
        boolean isValidDouble = false;

        while (!isValidDouble) {
            System.out.print(mensaje);
            try {
                valor = Double.parseDouble(scanner.nextLine());
                isValidDouble = true;
            } catch (NumberFormatException e) {
                System.out.println("Error. Por favor ingrese un número válido.");
            }
        }

        return valor;
    }

    /**
     * Escribe un programa en Java que solicite al usuario un año y determine si
     * es bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100,
     * salvo que sea divisible por 400.
     *
     */
    public static void ejercicio1() {
        int year = returnValidInteger("Ingrese un año: ");

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("El año " + year + " es bisiesto.");
        } else {
            System.out.println("El año " + year + " no es bisiesto.");
        }
    }

    /**
     * Escribe un programa en Java que pida al usuario tres números enteros y
     * determine cuál es el mayor.
     *
     */
    public static void ejercicio2() {
        int mayor = 0;

        int a = returnValidInteger("Ingrese el primer número: ");
        int b = returnValidInteger("Ingrese el segundo número: ");
        int c = returnValidInteger("Ingrese el tercer número: ");

        if (a > b && a > c) {
            mayor = a;
        } else if (b > a && b > c) {
            mayor = b;
        } else {
            mayor = c;
        }

        System.out.println("El mayor es: " + mayor);

    }

    /**
     * Escribe un programa en Java que solicite al usuario su edad y clasifique
     * su etapa de vida según la siguiente tabla: Menor de 12 años: "Niño" Entre
     * 12 y 17 años: "Adolescente" Entre 18 y 59 años: "Adulto" 60 años o más:
     * "Adulto mayor"
     */
    public static void ejercicio3() {
        int age = returnValidInteger("Ingrese su edad: ");

        if (age < 12) {
            System.out.println("Eres un Niño");
        } else if (age <= 17) {
            System.out.println("Eres un Adolescente");
        } else if (age <= 59) {
            System.out.println("Eres un Adulto");
        } else {
            System.out.println("Eres un Adulto mayor");
        }
    }

    /**
     * Escribe un programa que solicite al usuario el precio de un producto y su
     * categoría (A, B o C). Luego, aplique los siguientes descuentos: Categoría
     * A: 10% de descuento Categoría B: 15% de descuento Categoría C: 20% de
     * descuento El programa debe mostrar el precio original, el descuento
     * aplicado y el precio final
     *
     */
    public static void ejercicio4() {
        String appliedDiscount = "";
        double productPriceWithDiscount = 0;

        System.out.print("Ingrese el precio del producto: ");
        double productPrice = Double.parseDouble(scanner.nextLine());

        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        String productCategory = scanner.nextLine();

        switch (productCategory) {
            case "A":
                appliedDiscount = "10%";
                productPriceWithDiscount = productPrice - (productPrice * 0.10);
                break;

            case "B":
                appliedDiscount = "15%";
                productPriceWithDiscount = productPrice - (productPrice * 0.15);
                break;

            case "C":
                appliedDiscount = "20%";
                productPriceWithDiscount = productPrice - (productPrice * 0.20);
                break;

            default:
                System.out.println("Error. Categoría inválida.");
                return;
        }

        System.out.println("Descuento aplicado: " + appliedDiscount);
        System.out.println("Precio final: " + productPriceWithDiscount);

    }

    /**
     * Escribe un programa que solicite números al usuario y sume solo los
     * números pares. El ciclo debe continuar hasta que el usuario ingrese el
     * número 0, momento en el que se debe mostrar la suma total de los pares
     * ingresados.
     */
    public static void ejercicio5() {
        int userInput = -1;
        int sumaPares = 0;

        while (userInput != 0) {
            userInput = returnValidInteger("Ingrese un número (0 para terminar): ");
            if (userInput != 0 && userInput % 2 == 0) {
                sumaPares += userInput;
            }
        }

        System.out.println("La suma de los números pares es: " + sumaPares);
    }

    /**
     * Escribe un programa que pida al usuario ingresar 10 números enteros y
     * cuente cuántos son positivos, negativos y cuántos son ceros.
     */
    public static void ejercicio6() {

        Scanner scan = new Scanner(System.in);

        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int contadorCeros = 0;
        int totalNumeros = 10;
        int num;

        for (int j = 0; j < totalNumeros; j++) {
            System.out.print("Ingrese un número: ");
            num = scan.nextInt();

            if (num > 0) {
                contadorPositivos++;
            } else if (num < 0) {
                contadorNegativos++;
            } else {
                contadorCeros++;
            }
        }

        System.out.println("Positivos:  " + contadorPositivos);
        System.out.println("Negativos:  " + contadorNegativos);
        System.out.println("Ceros:  " + contadorCeros);
    }

    /**
     * Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el
     * usuario ingresa un número fuera de este rango, debe seguir pidiéndole la
     * nota hasta que ingrese un valor válido.
     */
    public static void ejercicio7() {
        int grade;

        do {
            grade = returnValidInteger("Ingrese una nota (0-10): ");
            if (grade < 0 || grade > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10");
            }
        } while (grade < 0 || grade > 10);

        System.out.println("Nota guardada correctamente.");
    }

    /**
     * Ejercicio 8: Crea un método calcularPrecioFinal(double impuesto, double
     * descuento) que calcule el precio final de un producto en un e-commerce.
     * La fórmula es: PrecioFinal = PrecioBase + (PrecioBase×Impuesto) −
     * (PrecioBase×Descuento) PrecioFinal = PrecioBase + (PrecioBase \times
     * Impuesto) - (PrecioBase \times Descuento)
     *
     * @param precioBase
     * @param impuesto
     * @param descuento
     * @return
     */
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double impuestoDecimal = impuesto / 100.0;
        double descuentoDecimal = descuento / 100.0;
        return (precioBase + (precioBase * impuestoDecimal) - (precioBase * descuentoDecimal));
    }

    // Ejercicio 9: Composición de funciones para calcular costo de envío y total de compra.
    /**
     * 9a: calcularCostoEnvio(double peso, String zona): Calcula el costo de
     * envío basado en la zona de envío (Nacional o Internacional) y el peso del
     * paquete. Nacional: $5 por kg Internacional: $10 por kg
     *
     * @param peso
     * @param zona
     * @return
     */
    public static double calcularCostoEnvio(double peso, String zona) {
        double costoPorKg = 0;

        if (zona.equalsIgnoreCase("Nacional")) {
            costoPorKg = 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            costoPorKg = 10;
        } else {
            System.out.println("Zona inválida, se asigna costo 0.");
        }

        return peso * costoPorKg;
    }

    /**
     * 9b: calcularTotalCompra(double precioProducto, double costoEnvio): Usa
     * calcularCostoEnvio para sumar el costo del producto con el costo de
     * envío.
     *
     * @param precioProducto
     * @param CostoEnvio
     * @return
     */
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    /**
     * Ejercicio 10: Actualización de stock a partir de venta y recepción de
     * productos. Crea un método actualizarStock(int stockActual, int
     * cantidadVendida, int cantidadRecibida), que calcule el nuevo stock
     * después de una venta y recepción de productos: NuevoStock = StockActual −
     * CantidadVendida + CantidadRecibida
     *
     * @param stockActual
     * @param cantidadVendida
     * @param cantidadRecibida
     * @return
     */
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }

    // Ejercicio 11
    static final double DESCUENTO_ESPECIAL = 0.10;

    /**
     * 11. Cálculo de descuento especial usando variable global. Declara una
     * variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un método
     * calcularDescuentoEspecial(double precio) que use la variable global para
     * calcular el descuento especial del 10%.
     *
     * @param precio
     */
    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    /**
     * 12. Modificación de un array de precios y visualización de resultados. Crea
     * un programa que: a. Declare e inicialice un array con los precios de
     * algunos productos. b. Muestre los valores originales de los precios. c.
     * Modifique el precio de un producto específico. d. Muestre los valores
     * modificados.
     */
    public static void ejercicio12() {
        // a. Declarar e inicializar un array con los precios de algunos productos
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // b. Mostrar los valores originales de los precios
        System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }

        // c. Modificar el precio de un producto específico
        precios[2] = 129.99;

        // d. Mostrar los valores modificados
        System.out.println("Precios modificados:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }

    /** 13. Impresión recursiva de arrays antes y después de modificar un elemento.
     * Crea un programa que: a. Declare e inicialice un array con los precios de
     * algunos productos. b. Use una función recursiva para mostrar los precios
     * originales. c. Modifique el precio de un producto específico. d. Use otra
     * función recursiva para mostrar los valores modificados.
     * 
     */
    public static void ejercicio13() {
        // a. Declarar e inicializar el array
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        mostrarArrayRecursivo(precios, 0);

        // c. Modificar un valor específico
        precios[2] = 129.99;

        System.out.println("\nPrecios modificados:");
        mostrarArrayRecursivo(precios, 0);
    }

    // b/d. Función recursiva para mostrar los precios
    public static void mostrarArrayRecursivo(double[] array, int indice) {
        if (indice < array.length) {
            System.out.println("Precio: $" + array[indice]);
            mostrarArrayRecursivo(array, indice + 1); // llamada recursiva al siguiente índice
        }
        // caso base: cuando indice == array.length, se detiene la recursión
    }

}
