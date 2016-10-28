import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rey Hali
 */
public class Articulo {
    private int precio;
    public Articulo (){
         Random rnd = new Random();
    this.precio=rnd.nextInt();
    }
    @Override
    public String toString(){
    return "";
    }
    public int getPrecio(){
    return precio;
    }
}