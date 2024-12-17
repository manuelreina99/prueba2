package Ej7;

public class Incidencia {
	
	    private static int contador = 1; 
	    private int codigo;
	    private int puesto;
	    private String estado;
	    private String resolucion;

	    // Constructor
	    public Incidencia(int puesto) {
	        this.codigo = contador++;
	        this.puesto = puesto;
	        this.estado = "pendiente";
	        this.resolucion = ""; 
	    }

	   
	    public void resolver(String resolucion) {
	        this.resolucion = resolucion;
	        this.estado = "resuelta";
	    }

	
	    public int getCodigo() {
	        return codigo;
	    }

	    public int getPuesto() {
	        return puesto;
	    }

	    public String getEstado() {
	        return estado;
	    }

	    public String getResolucion() {
	        return resolucion;
	    }

	 
	    @Override
	    public String toString() {
	        return "Incidencia " + codigo + " - Puesto " + puesto + ": " + estado + " " + resolucion ;
	    }
}
