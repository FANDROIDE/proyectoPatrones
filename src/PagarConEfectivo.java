/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feliciano
 */
public class PagarConEfectivo extends Pagar{
        Pago pago;
    public PagarConEfectivo(){
        pago=new PagoEfectivo();
    }
    public int RealizarPago(){
        return pago.pagar();
    }
    
}
