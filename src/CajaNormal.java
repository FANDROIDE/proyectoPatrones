
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rey Hali
 */
public class CajaNormal extends Caja{

    public CajaNormal(String des) {
        super(des);
    }

    @Override
    public void realizarCobro() {
        Iterator<Cliente> i=lista.creaIterador();
        while(i.hasNext()){
            
        }
    }
    public void AgregarClientes(Cliente cliente){
        lista.add(cliente);
    }
    
}
