/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feliciano
 */
public class CrearCajaNormal implements CrearCaja{

    @Override
    public Caja crearCaja(String Desc){
    return new CajaNormal(Desc);
    }
    
}