package Ej3;

public class Banco {
	
	private String nombre;
	private double capital;
	private String direccion;
	
	
	
	public double getCapital() {
		return capital;
	}
	
	public void setCapital(double capital) {
		this.capital = capital;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getNombre() {
		return nombre;
	}

	public Banco(String nombre, double capital) {
		super();
		this.nombre = nombre;
		this.capital = capital;
		
	}
	
	public Banco(String nombre) {
		super();
		this.nombre = nombre;
		this.capital = 5200000;
		
	}

	@Override
	public String toString() {
		return "Banco [nombre=" + nombre + ", capital=" + capital + ", direccion=" + direccion + "]";
	}
	
	
	
	
	
	
	
	
}
