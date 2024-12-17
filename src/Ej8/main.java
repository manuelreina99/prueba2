package Ej8;

import java.util.Scanner;



public class main {

	
		
		
		 public static void main(String[] args) {
			 
		        Articulo[] articulos = new Articulo[100];
		        int numArticulos = 0;
		        Scanner scanner = new Scanner(System.in);
		        int opcion;

		        do {
		            System.out.println("\nGESTISIMAL");
		            System.out.println("1. Listado");
		            System.out.println("2. Alta");
		            System.out.println("3. Baja");
		            System.out.println("4. Modificación");
		            System.out.println("5. Entrada de mercancía");
		            System.out.println("6. Salida de mercancía");
		            System.out.println("7. Salir");
		            System.out.print("Seleccione una opción: ");
		            opcion = scanner.nextInt();

		            switch (opcion) {
		                case 1:
		                    System.out.println("\nLISTADO DE ARTÍCULOS:");
		                    for (int i = 0; i < numArticulos; i++) {
		                        System.out.println(articulos[i]);
		                    }
		                    break;

		                case 2:
		                    System.out.print("\nDescripción: ");
		                    scanner.nextLine();
		                    
		                    String descripcion = scanner.nextLine();
		                    
		                    System.out.print("Precio de Compra: ");
		                    
		                    double precioCompra = scanner.nextDouble();
		                    
		                    System.out.print("Precio de Venta: ");
		                    
		                    double precioVenta = scanner.nextDouble();
		                    
		                    System.out.print("Stock inicial: ");
		                    int stock = scanner.nextInt();
		                    
		                    articulos[numArticulos++] = new Articulo(descripcion, precioCompra, precioVenta, stock);
		                    
		                    System.out.println("Artículo añadido con éxito.");
		                    break;

		                case 3:
		                    System.out.print("\nCódigo del artículo a eliminar: ");
		                    int codigoEliminar = scanner.nextInt();
		                    boolean encontradoEliminar = false;
		                    for (int i = 0; i < numArticulos; i++) {
		                    	
		                        if (articulos[i].getCodigo() == codigoEliminar) {
		                            for (int j = i; j < numArticulos - 1; j++) {
		                                articulos[j] = articulos[j + 1];
		                            }
		                            numArticulos--;
		                            encontradoEliminar = true;
		                            System.out.println("Artículo eliminado.");
		                            break;
		                        }
		                    }
		                    if (!encontradoEliminar) {
		                        System.out.println("Artículo no encontrado.");
		                    }
		                    break;

		                case 4:
		                    System.out.print("\nCódigo del artículo a modificar: ");
		                    int codigoModificar = scanner.nextInt();
		                    Articulo articuloModificar = null;
		                    for (int i = 0; i < numArticulos; i++) {
		                        if (articulos[i].getCodigo() == codigoModificar) {
		                            articuloModificar = articulos[i];
		                            break;
		                        }
		                    }
		                    if (articuloModificar != null) {
		                        System.out.print("Nueva descripción: ");
		                        scanner.nextLine();
		                        articuloModificar.setDescripcion(scanner.nextLine());
		                        System.out.print("Nuevo precio de compra: ");
		                        articuloModificar.setPrecioCompra(scanner.nextDouble());
		                        System.out.print("Nuevo precio de venta: ");
		                        articuloModificar.setPrecioVenta(scanner.nextDouble());
		                        System.out.print("Nuevo stock: ");
		                        articuloModificar.setStock(scanner.nextInt());
		                        System.out.println("Artículo modificado.");
		                    } else {
		                        System.out.println("Artículo no encontrado.");
		                    }
		                    break;

		                case 5:
		                    System.out.print("\nCódigo del artículo para entrada de mercancía: ");
		                    int codigoEntrada = scanner.nextInt();
		                    System.out.print("Cantidad a añadir: ");
		                    int cantidadEntrada = scanner.nextInt();
		                    boolean encontradoEntrada = false;
		                    for (int i = 0; i < numArticulos; i++) {
		                        if (articulos[i].getCodigo() == codigoEntrada) {
		                            articulos[i].setStock(articulos[i].getStock() + cantidadEntrada);
		                            System.out.println("Stock actualizado.");
		                            encontradoEntrada = true;
		                            break;
		                        }
		                    }
		                    if (!encontradoEntrada) {
		                        System.out.println("Artículo no encontrado.");
		                    }
		                    break;

		                case 6:
		                    System.out.print("\nCódigo del artículo para salida de mercancía: ");
		                    
		                    int codigoSalida = scanner.nextInt();
		                    
		                    System.out.print("Cantidad a retirar: ");
		                    
		                    int cantidadSalida = scanner.nextInt();
		                    
		                    boolean encontradoSalida = false;
		                    
		                    for (int i = 0; i < numArticulos; i++) {
		                        if (articulos[i].getCodigo() == codigoSalida) {
		                        	
		                            if (articulos[i].getStock() >= cantidadSalida) {
		                            	
		                                articulos[i].setStock(articulos[i].getStock() - cantidadSalida);
		                                System.out.println("Stock actualizado.");
		                                
		                            } else {
		                                System.out.println("No hay suficiente stock para retirar esa cantidad.");
		                            }
		                            encontradoSalida = true;
		                            break;
		                        }
		                    }
		                    if (!encontradoSalida) {
		                        System.out.println("Artículo no encontrado.");
		                    }
		                    break;

		                case 7:
		                    System.out.println("Saliendo del programa.");
		                    break;

		                default:
		                    System.out.println("Opción no válida.");
		            }

		        } while (opcion != 7);

		        scanner.close();
		    }
		
		
	}


