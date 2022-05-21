package vehiculos;


public class Vehiculo {
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre; // como llaman al vehiculo
	private long precio;
	private long peso;
	private String traccion;
	private Fabricante fabricante;
	private static int cantidadVehiculos = 0;
	//private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	
	
	// contructores
	
	public Vehiculo() {
		cantidadVehiculos++;
	}
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, long precio, long peso,
			String traccion, Fabricante fabricante) {
	
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		cantidadVehiculos++;
		
	}

	// Getters and Setters
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getPrecio() {
		return precio;
	}

	public void setPrecio(long precio) {
		this.precio = precio;
	}

	public long getPeso() {
		return peso;
	}

	public void setPeso(long peso) {
		this.peso = peso;
	}

	public String getTraccion() {
		return traccion;
	}

	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	// Cantidad Vehiculos
	
	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}
	public static void setCantidadVehiculos(int cantidadVehiculos) {
		Vehiculo.cantidadVehiculos = cantidadVehiculos;
	

	// Vehiculos por tipo
	
	
	}
	public static String vehiculosPorTipo() {
		return  "Automoviles: " + Automovil.cantidadAutomoviles() + "\n" +
				"Camionetas: " + Camioneta.cantidadCamionetas() + "\n" +
				"Camiones: " + Camion.cantidadCamiones();
				
	}
	
}