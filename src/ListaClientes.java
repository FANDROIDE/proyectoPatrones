/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feliciano
 */

import java.util.Iterator;
import java.util.LinkedList;
/**
 *
 * @author Rey Hali
 */
public class ListaClientes {
    private LinkedList<Cliente> clientes;
    public ListaClientes(){
    clientes=new LinkedList<Cliente>();
    }
    
    public void add(Cliente cliente){
		clientes.add(cliente);
	}
    public void remove(Cliente cliente){
        clientes.remove(cliente);
    }
    public Iterator<Cliente> creaIterador(){
		return new IteradorLista(clientes);
	}
    
    public LinkedList listaDeClientes(){
    return clientes;
    }
}