package Ej5;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	 
	        Ameba ameba1 = new Ameba();
	        System.out.println(ameba1);

	        
	        ameba1.come(6);
	        System.out.println("Despues de comer 6 microgramos: " + ameba1);

	      
	        Ameba ameba2 = new Ameba();
	        System.out.println(ameba2);

	       
	        ameba1.come(ameba2);
	        System.out.println("Despues de que ameba1 come a ameba2:");
	        System.out.println("Ameba1: " + ameba1);
	        System.out.println("Ameba2: " + ameba2);

	        
	        ameba2.come(4);
	        System.out.println("Despues de que ameba2 come 4 microgramos: " + ameba2);
	    }
	
		

	}


