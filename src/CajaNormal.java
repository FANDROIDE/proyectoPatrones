import java.util.Iterator;
import java.util.LinkedList;

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
int total=0;
    public CajaNormal(String des) {
        super(des);
        lista=new ListaClientes();
    }

    @Override
    public void realizarCobro() {
        // System.out.println("aqui esta2");
        Cliente a;
        Iterator<Cliente> i=lista.creaIterador();
      //while(i.hasNext()){
          a=i.next();
     
      total+=a.getTotal();
      int aa=a.getPago();
      int na=a.getNumArticulos();
      try{
         Thread.sleep(1000*aa+(na*80));
     }
      catch (Exception e){
      }
      lista.remove(a);
     //int aa=a.getPago();
     //sleep(aa);
      System.out.println("caja normal total pagado: "+total+" numero de articulos "+na+" metodo de pago:"+aa);
      }
    //}
    public boolean vacio(){
        Iterator<Cliente> i=lista.creaIterador();
        return !i.hasNext();
    }
    @Override
    public void AgregarClientes(Cliente cliente){
        lista.add(cliente);
    }
    
}