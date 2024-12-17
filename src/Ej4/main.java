package Ej4;

import java.io.Serial;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
	
		
		System.out.println("introduzca opcion");
		System.out.println(" 1.- pedir pizza");
		System.out.println(" 2.- entregar pizza");
		System.out.println("-1.- salir del programa");
		
		int n= scanner.nextInt();
		ArrayList<pizza> lista= new ArrayList<>();
		
		
		while(n!= -1) {
			
			if (n==1) {
				
				System.out.println("introduzca tipo de pizza");
				String t= scanner.next();
				
				System.out.println("introduzca tamaño de pizza");
				String tam=scanner.next();
				
				System.out.println("introduzca nombre");
				String nombre= scanner.next();
				
				pizza i= pizza.pedirPizza(t, tam, nombre);
				System.out.println(i);
				
				lista.add(i);
				
				
				
			}else if (n==2) {
				
				System.out.println("introduzca el nombre del cliente al que se le entrega la pizza");
				
				String nombre= scanner.next();
				
				for( pizza a: lista) {
					
					if(a.getCliente().equals(nombre)) {
						
						a.setEstado(estado.servida);
						
					}
					
				}
				
			}else {
				System.out.println("el numero introducido no es correcto");
				break;
			}
			
		
		System.out.println("introduzca opcion");
		System.out.println(" 1.- pedir pizza");
		System.out.println(" 2.- entregar pizza");
		System.out.println("-1.- salir del programa");
		
		n= scanner.nextInt();
		
		
		}
		
		System.out.println("ha salido del programa \n");
		
		for(pizza a: lista) {
			System.out.println(a);
		}
		
		
		
	}

}
