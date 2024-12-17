package Ej4;

public class pizza {
	
	private String cliente;
	private estado estado;
	private tipo tipo;
	private tamanyo tamanyo;
	private static int pedidas;
	private static int servidas;
	
	
	public pizza(String tipo, String tamanyo, String cliente) {
		super();
		this.cliente=cliente;
		this.estado = this.estado.pedida;
		this.tipo = this.tipo.valueOf(tipo);
		this.tamanyo = this.tamanyo.valueOf(tamanyo);
		
	}
	
	public static pizza pedirPizza(String tipo, String tamanyo, String nombre) {
		
		
		pizza n = new pizza(tipo, tamanyo, nombre);
		pedidas=pedidas+1;
		
		return n;
	}
	
	public void servirPizza(pizza n) {
		
		servidas++;
		
	}
	
	public int numPedidas() {
		
		return pedidas;
	}
	
	public int numServidas() {
		
		return servidas;
	}
	
	
	

	public estado getEstado() {
		return estado;
	}

	public void setEstado(estado estado) {
		this.estado = estado;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "pizza [cliente=" + cliente + ", estado=" + estado + ", tipo=" + tipo + ", tamanyo=" + tamanyo + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
