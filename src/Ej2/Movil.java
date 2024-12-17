package Ej2;

import Ej1.Terminal;

public class Movil {
	
	private int tiempo;
	private String numero;
	private tarifa tarifa;
	private double coste;
	
	
	
	public int getTiempo() {
		return tiempo;
	}
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public tarifa getTarifa() {
		return tarifa;
	}
	public void setTarifa(tarifa tarifa) {
		this.tarifa = tarifa;
	}
	public double getCoste() {
		return coste;
	}
	public void setCoste(double coste) {
		this.coste = coste;
	}
	
	
	public void llama(Movil movil, int t) {
		this.tiempo+=t;
		movil.tiempo += t;
		
		if(this.tarifa.equals(tarifa.rata)) {
			
			this.coste+= 0.001 * t;
			
		}else if(this.tarifa.equals(tarifa.mono)) {
			
			this.coste+= 0.002 * t;
			
		}else {
			
			this.coste+= 0.005 * t;
			
		}
		
	}
	
	
	
	public Movil( String numero, String tarifa) {
		super();
		this.tarifa = this.tarifa.valueOf(tarifa);
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Nº " + numero + " - " + tiempo + "s de conversacion " + "tarificados "+ coste + " euros";
	}
	
	
	

}
