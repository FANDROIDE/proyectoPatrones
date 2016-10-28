
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
public class CajaRapida extends Caja{
int total=0;
    public CajaRapida(String des) {
        super(des);
        lista=new ListaClientes();
    }

    @Override
    public void realizarCobro() {
     Cliente a;
        Iterator<Cliente> i=lista.creaIterador();
      while(i.hasNext()){
          a=i.next();
     
      total+=a.getTotal();
      
    }
    }
     @Override
    public void AgregarClientes(Cliente cliente){
        lista.add(cliente);
    }
}
