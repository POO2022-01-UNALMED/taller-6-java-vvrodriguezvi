package vehiculos;
import java.util.*;


public class Pais {
	private String nombre;
	private static ArrayList<Pais> listaP = new ArrayList<Pais>(); 
	private int vehiculosFabricados = 0;
	
	// constructores
	
	public Pais(String nombre) {
		this.nombre = nombre;
		listaP.add(this);
	}
	public Pais() {      
		listaP.add(this);
	}
	
	// GETTERS AND SETTERS
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public static ArrayList<Pais> getListaP() {
		return listaP;
	}
	public static void setListaP(ArrayList<Pais> listaP) {
		Pais.listaP = listaP;
	}
	
	
	// PAIS MAS VENDEDOR
	
	public void fabricarVehiculo() {
		this.vehiculosFabricados++;
	}
	
	public int getVehiculosFabricados() {
		return this.vehiculosFabricados;
	}
	
	public static Pais paisMasVendedor() {
		Pais ganador = new Pais();
		for (int i = 0; i < listaP.size(); i++) {
			if (listaP.get(i).getVehiculosFabricados() > ganador.getVehiculosFabricados()) {
				ganador = listaP.get(i);
			}
		}
		return ganador;
	}
	
}
