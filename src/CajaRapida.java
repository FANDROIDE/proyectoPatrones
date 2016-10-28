
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
int na=0;
int tiempo=0;
    public CajaRapida(String des) {
        super(des);
        lista=new ListaClientes();
    }

    @Override
    public String realizarCobro() {
        String s="";
       Cliente a;
        Iterator<Cliente> i=lista.creaIterador();
          a=i.next();
      total+=a.getTotal();
      int aa=a.getPago();
      na=a.getNumArticulos();
      try{
         Thread.sleep(1000*aa+(na*50));
         tiempo+=1000*aa+(na*50);
     }
      catch (Exception e){
      }
      lista.remove(a);
      s="caja rapida total pagado: "+total+" numero de articulos "+na+" metodo de pago:"+aa;
     return s; 
    }
     @Override
    public void AgregarClientes(Cliente cliente){
        lista.add(cliente);
    }

    @Override
    public boolean vacio() {
    Iterator<Cliente> i=lista.creaIterador();
        return !i.hasNext();
    }
     public int getTotal(){
      return total;
    }
     
    public int getTiempo(){
        return tiempo;
    };
    public int getTotalArticulos(){
      return na;
    }
}
