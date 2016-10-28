
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feliciano
 */
public class Fachada {
    ArrayList<Caja> arrCajas;
    ArrayList<Cliente> arrClientes;
    int cr,cn,nc;
    public Fachada(int cr,int cn,int nc){
        arrCajas=new ArrayList<Caja>();
        arrClientes=new ArrayList<Cliente>();
        this.cr=cr;
        this.cn=cn;
        this.nc=nc;
        for(int x=0;x<cr;x++){
            arrCajas.add(new CrearCajaRapida().crearCaja("Caja Rapida n: "+x+1));
        }    
        for(int x=0;x<cn;x++){
            arrCajas.add(new CrearCajaNormal().crearCaja("Caja Normal n: "+x+1));
        }
        for(int x=0;x<nc;x++){
            arrClientes.add(new Cliente());
        }
        for(int x=0;x<nc;x++){
            arrClientes.get(x);
            if(arrClientes.get(x).getNumArticulos()<=8){
                arrCajas.get(0).AgregarClientes(arrClientes.get(x));
            }
            if(arrClientes.get(x).getNumArticulos()>8){
                arrCajas.get(cr).AgregarClientes(arrClientes.get(x));
            }
        }
    }
    public void crearCliente(){
            Cliente c=new Cliente();
            if(c.getNumArticulos()<=8){
                arrCajas.get(0).AgregarClientes(c);
            }
            if(c.getNumArticulos()>8){
                arrCajas.get(cr).AgregarClientes(c);
            }
    }
    public void comenzarSimulacion(){
        System.out.println("se inicia la simulacion");
        Datos m= Datos.getInstancia();
        while(!arrCajas.get(cr).vacio()){
            arrCajas.get(cr).realizarCobro();
           // m.Actualizar("hola");
        }
    }
    
}
