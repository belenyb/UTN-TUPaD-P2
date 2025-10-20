/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author belenyardebuller
 */
public class PayPal implements Pago {

    // 4. Ampliar con interfaces Pago y PagoConDescuento para distintos medios 
    // de pago (TarjetaCredito, PayPal), con métodos procesarPago(double) 
    // y aplicarDescuento(double)
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void procesarPago(double monto) {
        try {
            if (monto <= 0) {
                throw new IllegalArgumentException("Monto inválido");
            }
            System.out.println("Procesando pago de $" + monto + " con cuenta PayPal de " + email);
        } catch (IllegalArgumentException e) {
            System.err.println("Error al procesar pago: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "PayPal{" + "email=" + email + '}';
    }

}
