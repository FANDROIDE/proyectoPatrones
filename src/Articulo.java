/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rey Hali
 */
public class Articulo {
    private String nombre,cantidad;
    private String precio;
    public Articulo (String n, String c, String p){
    this.nombre=n;
    this.cantidad=c;
    this.precio=p;
    }
    @Override
    public String toString(){
    return "Nombre: "+this.nombre+"\tCantidad: "+this.cantidad+"\tPrecio "+this.precio;
    }
}
