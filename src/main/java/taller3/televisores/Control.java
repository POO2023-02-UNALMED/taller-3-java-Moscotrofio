package taller3.televisores;

public class Control {
    TV tv;

    public void enlazar(TV tv) {
        tv.setControl(this);
        this.setTv(tv);
    }

    public TV getTv() {
        return this.tv;
    }
    public void setTv(TV tv) {
        this.tv = tv;
    }

    public void turnOn(){
        if (this != null) {
            this.tv.estado = true;
        }
    }
    public void turnOff() {
        if (this.tv != null) {
            this.tv.estado = false;
        }
    }

    public void canalUp() {
        if (this != null) {
            this.tv.canalUp();
        }
    }

    public void canalDown() {
        if (this != null) {
            this.tv.canalDown();
        }
    }

    public void volumenUp() {
        if (this != null) {
            this.tv.volumenUp();
        }
    }

    public void volumenDown() {
        if (this != null) {
            this.tv.volumenDown();
        }
    }
    

    public void setCanal(int canal) {
        if (this != null) {
            this.tv.setCanal(canal);
        }
    }

    public void setVolumen(int volumen) {
        if (this != null) {
            this.tv.setVolumen(volumen);
        }
    }
    
    public boolean getEstado() {
        return this.tv.estado;
    }

}
