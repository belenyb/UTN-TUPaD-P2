/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author belenyardebuller
 */
public class TarjetaDeCredito implements PagoConDescuento {

    // 4. Ampliar con interfaces Pago y PagoConDescuento para distintos medios 
    // de pago (TarjetaCredito, PayPal), con métodos procesarPago(double) 
    // y aplicarDescuento(double)
    private String titular;
    // Se plantea un 10% de descuento para pagos con tarjeta de crédito
    private final double DESCUENTO = 0.10;

    public TarjetaDeCredito(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public double aplicarDescuento(double monto) {
        double total = monto * (1 - DESCUENTO);
        System.out.println("Descuento del 10% aplicado con tarjeta de crédito de " + titular);
        return total;
    }

    @Override
    public void procesarPago(double monto) {
        try {
            if (monto <= 0) {
                throw new IllegalArgumentException("Monto inválido");
            }
            double montoFinal = aplicarDescuento(monto);
            System.out.println("Procesando pago de $" + montoFinal + " con tarjeta de " + titular);
        } catch (IllegalArgumentException e) {
            System.err.println("Error al procesar pago: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "titular=" + titular + '}';
    }

}
