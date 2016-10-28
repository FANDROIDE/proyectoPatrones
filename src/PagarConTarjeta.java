/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feliciano
 */
public class PagarConTarjeta extends Pagar{
        Pago pago;
    public PagarConTarjeta(){
        pago=new PagoTarjeta();
    }
    public int RealizarPago(){
        return pago.pagar();
    }
    
}
