package tp4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author belenyardebuller
 */
//Atributos:
//● int id: Identificador único del empleado.
//● String nombre: Nombre completo.
//● String puesto: Cargo que desempeña.
//● double salario: Salario actual.
//● static int totalEmpleados: Contador global de empleados creados.
public class Empleado {

    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;

    // GETTERS & SETTERS
    public int getId() {
        return id;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // CONSTRUCTORES SOBRECARGADOS
    // Uno que reciba todos los atributos como parámetros.
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        Empleado.totalEmpleados++;
    }

    // Otro que reciba solo nombre y puesto, asignando un id automático y un 
    // salario por defecto.
    public Empleado(String nombre, String puesto) {
        Empleado.totalEmpleados++;
        this.id = Empleado.totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 100.0;
    }

    // METODOS SOBRECARGADOS
    // Uno que reciba un porcentaje de aumento.
    public void actualizarSalario(double porcentajeAumento) {
        if (porcentajeAumento <= 0) {
            throw new IllegalArgumentException("El porcentaje de aumento debe ser un valor positivo.");
        }
        double aumentoSalario = this.salario * (porcentajeAumento / 100);
        double nuevoSalario = this.salario + aumentoSalario;
        this.setSalario(nuevoSalario);
    }

    // Otro que reciba una cantidad fija a aumentar.
    public void actualizarSalario(int cantidadAumento) {
        if (cantidadAumento <= 0) {
            throw new IllegalArgumentException("La cantidad de aumento debe ser un valor positivo.");
        }
        double nuevoSalario = this.salario + cantidadAumento;
        this.setSalario(nuevoSalario);
    }

    // METODO toString()
    @Override
    public String toString() {
        return "Empleado: " + id + "\nNombre: " + nombre + "\nPuesto: " + puesto + "\nSalario: " + salario;
    }

    // METODO ESTATICO 
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

}
