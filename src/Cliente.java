/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feliciano
 */
import java.util.LinkedList;
import java.util.Random;

public class Cliente {
    int cantidad;
    public LinkedList<Articulo> uno;
    public Cliente(){
        ListaArticulos lista = new ListaArticulos();
        Random rnd = new Random();
        int a=(int)(rnd.nextDouble()*20+5);
        for(int g=0;g<=a;g++){
            lista.add(new Articulo());
        }
        uno=lista.laLista();
        int ll=(int)(rnd.nextDouble()*2+1);
        if(ll==1){
        //crear pago electronico
        }
        else{
        //crear pago monetario
        } 
    }
    public int getNumArticulos(){
    return uno.size();
    }
    public LinkedList<Articulo> getLista(){
    return uno;  
    }
}