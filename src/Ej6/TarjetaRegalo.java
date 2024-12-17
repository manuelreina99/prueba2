package Ej6;

import java.util.Random;

public class TarjetaRegalo {
	
	private double saldo;
	private int numero;
	
	
	Random random = new Random();
	
	int[] numeros= {0,1,2,3,4,5,6,7,8,9};
	
	
	public TarjetaRegalo(double saldo) {
		super();
		
		this.saldo = saldo;
		this.numero = random.nextInt(10000, 99999); //genera nunmero aleatorio de 5 cifras
		
	}
	
	public void pagar(int dinero) {
		
		
		if(saldo-dinero<=0) {
			
			System.out.println("no tiene saldo");
		}else {
			saldo=saldo-dinero;
		}
		
	}
	
	public static TarjetaRegalo fusionataTarjetaRegalo(TarjetaRegalo n, TarjetaRegalo p ){
		
		double saldofinal= p.saldo + n.saldo;
		
		TarjetaRegalo res= new TarjetaRegalo(saldofinal);
		
		p.setSaldo(0);
		n.setSaldo(0);

		return res;
		
	}

	@Override
	public String toString() {
		return "TarjetaRegalo [saldo=" + saldo + ", numero=" + numero + "]";
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
	
	
		
	
	

}
