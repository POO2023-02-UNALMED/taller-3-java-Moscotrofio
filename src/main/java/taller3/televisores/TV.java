package taller3.televisores;

public class TV {
	
	private static int numTV;
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	
	public TV (Marca obj, boolean encendido) {

		numTV++;
		marca = obj;
		estado = encendido;
	}
	
	public Marca getMarca() {
		
		return marca;
	}
	
	public void setMarca(Marca obj) {
		
		marca = obj;
	}
	
        public int getCanal() {
		
		return canal;
	}
	
	public void setCanal(int num) {
		
		if (this.estado == true && num >= 1 && num <= 120) {
			
			canal = num;
			
		}
	}
	
	public int getPrecio() {
		
		return precio;
	}
	
	public void setPrecio(int valor) {
		
		precio = valor;
	}
	
        public int getVolumen() {
		
		return volumen;
	}
	
	public void setVolumen(int num) {
		
		if (this.estado == true && num >= 0 && num <= 7 ) {
			
			volumen = num;
		}
	}
	
    public Control getControl() {
		
		return control;
	}
	
	public void setControl(Control obj) {
		
		control = obj;
	}
	
	public void turnOn() {
		
		this.estado = true;
		
	}
	
	public void turnOff() {
		
		this.estado = false;
		
	}
	
	public boolean getEstado() {
		
		return estado;
	}
	
	public void canalDown() {
		
		if (estado == true && canal > 1 && canal <= 120 ) {
			
			canal--;
		}
	}
	
    public void volumenDown() {
    	
    	if (estado == true && volumen > 0 && volumen <= 7) {
    		
    		volumen--;
    	}
	}
    
    public void canalUp() {
    	
    	if (estado == true && canal < 120 && canal >= 1 ) {
    		
    		canal++;
    	}
    }
    
    public void volumenUp() {
    	
    	if (estado == true && volumen < 7 && volumen >= 0) {
    		
    		volumen++;
    	}
    }
    
    public static void setNumTV(int num) {
	    
	    TV.numTV = num;
    }
    
    public static int getNumTV() {
    	
    	return TV.numTV;
    }
}