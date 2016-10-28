
import java.util.Iterator;
import java.util.LinkedList;

public class IteradorLista implements Iterator{
	private int indice=0;
	private LinkedList<Articulo> conjunto;
	public IteradorLista(LinkedList c){
		conjunto=c;
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return indice<conjunto.size();
	}
	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return conjunto.get(indice++);
	}
        
	public String MostrarRango(int i, int j) {
		/*LinkedList<Articulo> conjuntoX = new LinkedList<Articulo>();
		if(j<conjunto.size()){
			while(i<=j){
				conjuntoX.add((Articulo) conjunto.get(i));				
			}
		}
		return conjuntoX;*/
		String concat="";
		if(j<conjunto.size()){
			while(i<=j){
				concat+=conjunto.get(i).toString()+"\n";
                                i++;
			}
		}
                //System.out.println(concat);
		return concat;
	}
}
