package Ej6;



public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TarjetaRegalo n = new TarjetaRegalo(50);
		TarjetaRegalo p = new TarjetaRegalo(20);
		
		
		System.out.println(n);
		System.out.println(p);
		

		
		TarjetaRegalo res= TarjetaRegalo.fusionataTarjetaRegalo(n, p);
		
		System.out.println(res);
		System.out.println(n);
		System.out.println(p);
		
	}

}
