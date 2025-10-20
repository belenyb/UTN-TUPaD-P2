
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author belenyardebuller
 */
public class ManejoDeExcepciones {

    // 1. División segura: Solicitar dos números y dividirlos. 
    public static void dividir() {
        // Se utiliza try-with-resources para cerrar el Scanner automáticamente
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el primer número: ");
            final int num1 = scanner.nextInt();

            System.out.print("Ingrese el segundo número: ");
            final int num2 = scanner.nextInt();

            // Manejar ArithmeticException si el divisor es cero.
            if (num2 == 0) {
                throw new ArithmeticException("División por cero no permitida.");
            }

            System.out.println(num1 + "/" + num2 + " = " + (double) num1 / num2);

        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException: Debe ingresar números enteros válidos.");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());

        }

    }

    // 2. Conversión de cadena a número.
    // Leer texto del usuario e intentar convertirlo a int. Manejar NumberFormatException si no es válido.
    public static void textoAInteger() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el texto a convertir: ");
            String texto = scanner.nextLine();
            int numero = Integer.parseInt(texto);
            System.out.println("El número entero es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: El texto ingresado no es un número válido.");
        }
    }

    // 3. Lectura de archivo.
    // Leer un archivo de texto y mostrarlo. Manejar FileNotFoundException si el archivo no existe.
    public static void leerArchivo() {
        try (Scanner scanner = new Scanner(System.in)) {
            String ruta = "src/archivo-de-prueba.html";

            try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
                String linea;
                System.out.println("\n--- Contenido del archivo ---");
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }
                System.out.println("\n--- Fin del archivo ---");

            } catch (FileNotFoundException e) {
                System.out.println("Error: El archivo no existe o la ruta es incorrecta.");
            } catch (IOException e) {
                System.out.println("Error al leer el archivo: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }

    // 4. Excepción personalizada
    // Crear EdadInvalidaException. Lanzarla si la edad es menor a 0 o mayor a 120. Capturarla y mostrar mensaje.
    public static void validarEdad() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();

            if (edad < 0 || edad > 120) {
                // Lanza excepción EdadInvalidaException
                throw new EdadInvalidaException("La edad debe estar entre 0 y 120 años.");
            }

            System.out.println("Edad válida: " + edad + " años.");

        } catch (EdadInvalidaException e) {
            System.out.println("EdadInvalidaException: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: El valor ingresado no es un número válido.");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    // 5. Uso de try-with-resources
    // Leer un archivo con BufferedReader usando try-with-resources. Manejar IOException correctamente.
    public static void leerArchivoTryWithResources() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese la ruta del archivo a leer: ");
            String rutaArchivo = scanner.nextLine();

            try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
                String linea;
                System.out.println("\nContenido del archivo:");
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }
            } catch (IOException e) {
                System.out.println("Error al leer el archivo: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }

}
