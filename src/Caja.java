/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rey Hali
 */
public abstract class Caja {
    protected String descripcion;
    protected int numMaxArticulos;
    protected ListaClientes lista;
    public Caja (String des){}
    public void AgregarClientes(Cliente cliente){}
    public abstract String realizarCobro();
    public abstract int getTotal();
    public abstract int getTotalArticulos();
    public abstract int getTiempo();
    public abstract boolean vacio();
}