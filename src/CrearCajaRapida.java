/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feliciano
 */
public class CrearCajaRapida implements CrearCaja{

    @Override
   public Caja crearCaja(String Desc) {
       return new CajaRapida(Desc);}
    
}
