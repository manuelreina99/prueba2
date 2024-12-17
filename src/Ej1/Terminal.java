package Ej1;

public class Terminal {
	
	
	private String numero;
	private int tiempo;

	

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Nº" + numero + " - " + tiempo + "s de conversacion";
	}
	
	public void llama(Terminal terminal, int t) {
		this.tiempo+=t;
		terminal.tiempo += t;
		
	}

	public Terminal(String numero) {
		super();
		this.numero = numero;
		this.tiempo = 0;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

}
