package Ej3;

public class CuentaCorriente {
	
	private double saldo;
	private double limite_descubierto;
	public String nombre;
	String dni;
	private String nombre_banco;
	private Banco banco;
	
	
	public CuentaCorriente(String nombre, String dni) {
		super();
		
		this.nombre = nombre;
		this.dni = dni;
		this.saldo=0;
		this.limite_descubierto= -50;
	}
	
	
	public CuentaCorriente(double saldo) {
		super();
		this.saldo = saldo;
		this.limite_descubierto = 0;
	}
	

	public CuentaCorriente(double saldo, double limite_descubierto, String dni) {
		super();
		this.saldo = saldo;
		this.limite_descubierto = limite_descubierto;
		this.dni = dni;
	}
	
	public CuentaCorriente(String nombre, String dni, Banco banco) {
		super();
		
		this.nombre = nombre;
		this.dni = dni;
		this.saldo=0;
		this.limite_descubierto= -50;
		this.banco= banco;
		this.nombre_banco= banco.getNombre();
	}
	
	




	public double SacarDinero(double n) {
		
		if( saldo <= limite_descubierto) {
			System.out.println("usted no puede sacar mas dinero");
			
			
		}else if(saldo-n <= limite_descubierto) {
			
			System.out.println("usted no puede sacar mas dinero");
			
		
		}else {
			this.saldo -=n;
		}	
		
			
		return n;
			
		
	}


	public void MeterDinero(double n) {
		
		this.saldo +=n;
	}


	


	public String getNombre_banco() {
		return nombre_banco;
	}




	public void setNombre_banco(String nombre_banco) {
		this.nombre_banco = nombre_banco;
	}




	public void setLimite_descubierto(double limite_descubierto) {
		this.limite_descubierto = limite_descubierto;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	@Override
	public String toString() {
		return "CuentaCorriente [saldo=" + saldo + ", limite_descubierto=" + limite_descubierto + ", nombre=" + nombre
				+ ", dni=" + dni + ", nombre_banco=" + nombre_banco + ", banco=" + banco + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
