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
    private String descripcion;
    private int numMaxArticulos;
    private ListaClientes lista;
    public Caja (String des){}
    public void AgregarClientes(Cliente cliente){}
    public abstract void realizarCobro();
}