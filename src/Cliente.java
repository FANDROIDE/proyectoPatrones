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
import java.util.Random;

public class Cliente {
    private ListaArticulos lista;
    public Cliente(){
        lista = new ListaArticulos();
        Random rnd = new Random();
        int a=(int)(rnd.nextDouble()*20+5);
        for(int g=0;g<=a;g++){
            lista.add(new Articulo());
        }
        //uno=lista.laLista();
        int ll=(int)(rnd.nextDouble()*2+1);
        if(ll==1){
        //crear pago electronico
        }
        else{
        //crear pago monetario
        } 
    }
    public int getNumArticulos(){
        Iterator<Articulo> i= lista.creaIterador();
        int n=0;
        while(i.hasNext()){
            n++;
            i.next();
        }
        return n;
    }
    public int getTotal(){
        Iterator<Articulo> i= lista.creaIterador();
        int tot=0;
        while(i.hasNext()){
            tot+=i.next().getPrecio();
        }
        return tot;
    }
}