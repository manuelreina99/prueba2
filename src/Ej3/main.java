package Ej3;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CuentaCorriente p1= new CuentaCorriente("Manuel", "67354800B" );
		CuentaCorriente p2= new CuentaCorriente(500);
		CuentaCorriente p3= new CuentaCorriente(50, 0, "43696200A");
		System.out.println(p1);
		
		p1.MeterDinero(50);
		
		System.out.println(p1);
		
		p1.SacarDinero(100);
		
		System.out.println(p1);
		
		p1.SacarDinero(80);
		
		System.out.println(p1);
		
		Banco b1 = new Banco("santander");
		
		CuentaCorriente p4= new CuentaCorriente("Pepe", "43795609A", b1);
		
		
	System.out.println(p4);
		
		
	}

}
