package pruebas;

import java.util.Iterator;
import java.util.Scanner;

public class pruebas_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//rellenar a mano
		
		prueba1 alumno1= new prueba1("manuel", 25);
		prueba1[] alumnosPrueba1s= new prueba1[5];
		

		for(int i=0 ; i<alumnosPrueba1s.length; i++) {
			
			alumnosPrueba1s[i]= alumno1;
			
		}
		
		for( prueba1 a: alumnosPrueba1s) {
			
			System.out.println(a);
			
			
		}
		
		
		//rellenar con lecturas
		Scanner scanner = new Scanner(System.in);
		
		prueba1[] alumnoslectura= new prueba1[5];
		String nombreString;
		int edad;
		
		for(int i=0; i<alumnoslectura.length; i++) {
			
			System.out.println("introduce nombre");
			nombreString= scanner.next();
			System.out.println("introduce edad");
			edad=scanner.nextInt();
			
			alumnoslectura[i]= new prueba1(nombreString, edad);
		}
		
		for(prueba1 a : alumnoslectura) {
			
			System.out.println(a);
			
			
		}
		
		
		//eliminar el elemento 	que quiera
		
		System.out.println("introduzca elemento a eliminar");
		
		int elemento_a_eliminar= scanner.nextInt();
		
		for (int i = elemento_a_eliminar; i < alumnoslectura.length -1; i++) {
            alumnoslectura[i] = alumnoslectura[i + 1];
        }
		
		for(prueba1 a: alumnoslectura) {
			
			System.out.println(a);
		}
	}

}
