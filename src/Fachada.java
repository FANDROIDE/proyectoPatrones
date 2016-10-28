
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
    public Fachada(int nc){
        arrCajas=new ArrayList<Caja>();
        arrClientes=new ArrayList<Cliente>();
        this.cr=cr;
        this.cn=cn;
        this.nc=nc;
            arrCajas.add(new CrearCajaRapida().crearCaja("Caja Rapida n: "+1));
        
            arrCajas.add(new CrearCajaNormal().crearCaja("Caja Normal n: "+1));
        
        for(int x=0;x<nc;x++){
            arrClientes.add(new Cliente());
        }
        for(int x=0;x<nc;x++){
            arrClientes.get(x);
            if(arrClientes.get(x).getNumArticulos()<=8){
                arrCajas.get(0).AgregarClientes(arrClientes.get(x));
                System.out.println("cajas rapidas");
            }
            if(arrClientes.get(x).getNumArticulos()>8){
                arrCajas.get(1).AgregarClientes(arrClientes.get(x));
                System.out.println("cajas normales");
            }
        }
    }
    public void crearCliente(){
            Cliente c=new Cliente();
            if(c.getNumArticulos()<=8){
                arrCajas.get(0).AgregarClientes(c);
            }
            if(c.getNumArticulos()>8){
                arrCajas.get(1).AgregarClientes(c);
            }
    }
    public void comenzarSimulacion(){
        System.out.println("se inicia la simulacion");
        Datos m= Datos.getInstancia();
        Runnable proceso1 =Datos.getInstancia();
        new Thread(proceso1).start();
        float tot1=0;
        int na1=0;
        int tiempo1=0;
        float tot2=0;
        int na2=0;
        int tiempo2=0;
        while(!arrCajas.get(0).vacio()){
            String s=arrCajas.get(0).realizarCobro();
            System.out.println(s);
            tot1+=arrCajas.get(0).getTotal();
            na1+=arrCajas.get(0).getTotalArticulos();
            tiempo1+=arrCajas.get(0).getTiempo();
           m.Actualizar(s);
        }
        while(!arrCajas.get(1).vacio()){
            String s=arrCajas.get(1).realizarCobro();
            System.out.println(s);
            tot2+=arrCajas.get(1).getTotal();
            na2+=arrCajas.get(1).getTotalArticulos();
            tiempo2+=arrCajas.get(1).getTiempo();
           m.Actualizar(s);
        }
        tiempo1=tiempo1/1000;
        tiempo2=tiempo2/1000;
        m.Actualizar("caja rapida: \n\t"+"total de articulos "+na1+" \n\t total de ganancia "+tot1+" \n\t tiempo ocupado: "+tiempo1+" \n\t ganancia por minuto:"+(tot1/tiempo1));
        m.Actualizar("caja normal: \n\t"+"total de articulos "+na2+" \n\t total de ganancia "+tot2+" \n\t tiempo ocupado: "+tiempo2+" \n\t ganancia por minuto:"+(tot2/tiempo2));
    }   
}
