package taller3.televisores;

public class Control {
	
	private TV tv;
	
	public void turnOn() {
		
		this.tv.turnOn();
	}
	
	public void turnOff() {
		
		this.tv.turnOff();
	}
	
	public void canalUp() {
		
		tv.canalUp();
	}
	
	public void canalDown() {
		
		tv.canalDown();
	}
	
	public void volumenUp() {
		
		tv.volumenUp();
	}
	
	public void volumenDown() {
		
		tv.volumenDown();
	}
	
	public void setCanal(int canal) {
		
		tv.setCanal(canal);
	}
	
	public void setVolumen(int volumen) {
		
		tv.setVolumen(volumen);
	}
	
	public void enlazar(TV televisor) {
		
		this.tv = televisor;
		
		this.tv.setControl(this);
		
	}
	
	public TV getTv() {
		
		return tv;
	}
	
	public void setTv(TV obj) {
		
		tv = obj;
	}

}