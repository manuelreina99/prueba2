package Ej5;

public class Ameba {
    private int peso;

    // Constructor
    public Ameba() {
        this.peso = 3; 
    }

   
    public void come(int microgramos) {
    	
        if (microgramos > 0) {
        	
            this.peso += microgramos - 1; 
        }
    }

    
    public void come(Ameba otraAmeba) {
        if ( otraAmeba.peso > 0) {
        	
            this.peso += otraAmeba.peso - 1; 
            otraAmeba.peso = 0; 
        }
    }

    
    public int getPeso() {
    	
        return this.peso;
    }

    
    @Override
    public String toString() {
        return "Ameba con peso de " + peso + " microgramos";
    }
}
