package taller3.televisores;

public class Control {
    private TV tv;

    public void enlazar(TV tv) {
        tv.setControl(this);
        this.setTv(tv);
    }

    public TV getTv() {
        return tv;
    }
    public void setTv(TV tv) {
        this.tv = tv;
    }

    public void turnOn(){
        if (tv != null) {
            this.tv.estado = true;
        }
    }
    public void turnOff() {
        if (tv != null) {
            tv.estado = false;
        }
    }

    public void canalUp() {
        if (tv != null) {
            tv.canalUp();
        }
    }

    public void canalDown() {
        if (tv != null) {
            tv.canalDown();
        }
    }

    public void volumenUp() {
        if (tv != null) {
            tv.volumenUp();
        }
    }

    public void volumenDown() {
        if (tv != null) {
            tv.volumenDown();
        }
    }
    

    public void setCanal(int canal) {
        if (tv != null) {
            tv.setCanal(canal);
        }
    }

    public void setVolumen(int volumen) {
        if (tv != null) {
            tv.setVolumen(volumen);
        }
    }
    
    public boolean getEstado() {
        return tv.estado;
    }

}
