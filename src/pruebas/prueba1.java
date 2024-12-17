package pruebas;

public class prueba1 {
	
	
	private String nombre;
	private int edad;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	public prueba1(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "prueba1 [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
	
	
	
}
