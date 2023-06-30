/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Maluli
 */
public class tbTipoPago {
    private int idTipoPago;
    private String tipo_pago;

    public tbTipoPago() {
    }

    public tbTipoPago(int idTipoPago, String tipo_pago) {
        this.idTipoPago = idTipoPago;
        this.tipo_pago = tipo_pago;
    }

    public int getIdTipoPago() {
        return idTipoPago;
    }

    public void setIdTipoPago(int idTipoPago) {
        this.idTipoPago = idTipoPago;
    }

    public String getTipo_pago() {
        return tipo_pago;
    }

    public void setTipo_pago(String tipo_pago) {
        this.tipo_pago = tipo_pago;
    }
    
    
}
