/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author belenyardebuller
 */
public class TransferenciaBancaria implements PagoConDescuento {

    private String titular;
    private String banco;
    // Se plantea un 15% de descuento para pagos por transferencia bancaria
    private final double DESCUENTO = 0.15;

    public TransferenciaBancaria(String titular, String banco) {
        this.titular = titular;
        this.banco = banco;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    @Override
    public double aplicarDescuento(double monto) {
        double total = monto * (1 - DESCUENTO);
        System.out.println("Descuento del 15% aplicado con transferencia bancaria de " + titular + " desde entidad bancaria " + banco);
        return total;
    }

    @Override
    public void procesarPago(double monto) {
        try {
            if (monto <= 0) {
                throw new IllegalArgumentException("Monto inválido");
            }
            double montoFinal = aplicarDescuento(monto);
            System.out.println("Procesando pago de $" + montoFinal + " con transferencia bancaria de " + titular + " desde entidad bancaria " + banco);
        } catch (IllegalArgumentException e) {
            System.err.println("Error al procesar pago: " + e.getMessage());
        }
    }

}
