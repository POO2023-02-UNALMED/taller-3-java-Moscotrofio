public class Control {
    TV tv;

    public void turnOff() {
        tv.estado = false;
    }

    public boolean getEstado() {
        return this.tv.estado;
    }

    public void canalUp() {
        this.tv.canalUp();
    }

    public void canalDown() {
        this.tv.canalDown();
    }

    public void volumenUp() {
        this.tv.volumenUp();
    }

    public void volumenDown() {
        this.tv.volumenDown();
    }
    

    public void setCanal(int canal) {
        this.tv.canal = canal;
    }

    public void setVolumen(int volumen) {
        this.tv.volumen = volumen;
    }

    public void enlazar(TV tv) {
        this.tv = tv;
        this.tv.control = this;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }

    public TV getTv() {
        return this.tv;
    }
}
