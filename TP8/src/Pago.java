/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author belenyardebuller
 */
public interface Pago {

    // 4. Ampliar con interfaces Pago y PagoConDescuento para distintos medios 
    // de pago (TarjetaCredito, PayPal), con métodos procesarPago(double) 
    // y aplicarDescuento(double)
    void procesarPago(double monto);

}
