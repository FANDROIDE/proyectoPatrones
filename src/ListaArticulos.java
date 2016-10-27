

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rey Hali
 */
import java.util.Iterator;
import java.util.LinkedList;

public class ListaArticulos {
	private LinkedList<Articulo> articulos;
	public ListaArticulos(){
		articulos=new LinkedList<Articulo>();
	}
	public void add(Articulo articulo){
		articulos.add(articulo);
	}
	public void Imprimir(){
		IteradorLista u= (IteradorLista) creaIterador();
		String cadena="";
		while(u.hasNext()){
                    System.out.println(u.next().toString());
                    //System.out.println("Primero");
                    
                   
                    
                    //cadena+=u.next().toString()+"\n";
		}
		//return cadena;
	}
	public Iterator<Articulo> creaIterador(){
		return new IteradorLista(articulos);
	}
       
        public void printRango(int i, int j){
           IteradorLista u= (IteradorLista) creaIterador();
            System.out.println(u.MostrarRango(i, j));
        }
         public void primero(){
           IteradorLista u= (IteradorLista) creaIterador();
             System.out.println(u.primero().toString());
        }
         public void ultimo(){
           IteradorLista u= (IteradorLista) creaIterador();
             System.out.println(u.ultimo().toString());
        }
        
     
}