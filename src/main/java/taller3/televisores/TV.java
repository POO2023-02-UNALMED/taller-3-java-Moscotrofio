package taller3.televisores;
public class TV {
    Marca marca;
    int canal = 1;
    int precio = 500;
    boolean estado;
    int volumen = 1;
    Control control;

    static int numTV;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        numTV++;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    public Marca getMarca() {
        return this.marca;
    }

    public void setCanal(int canal) {
        if (this.estado) {
            if (canal <= 120) {
                if (volumen >= 1) {
                    this.canal = canal;
                }
            }
        }
    }
    public int getCanal(){
        return canal;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public int getPrecio(){
        return this.precio;
    }

    public void setVolumen(int volumen) {
        if (this.estado) {
            if (volumen <= 7) {
                if (volumen >= 0) {
                    this.volumen = volumen;
                }
            }
        }
    }
    public int getVolumen(){
        return this.volumen;
    }

    public void setControl(Control control) {
        this.control = control;
    }
    public Control getControl() {
        return this.control;
    }

    public void setNumTV(int numTV) {
        TV.numTV = numTV;
    }
    public int getNumTV() {
        return TV.numTV;
    }
    
    public void turnOn() {
        this.estado = true;
    }
    public void turnOff() {
        this.estado = false;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void canalUp() {
        if (this.estado) {
            if (this.canal < 120) {
                this.canal++;
            }
        }

    }

    public void canalDown() {
        if (this.estado) {
            if (this.canal > 1) {
                this.canal--;
            }
        }
    }

    public void volumenUp() {
        if (this.estado) {
            if (this.volumen < 7) {
                this.volumen++;
            }
        }
    }

    public void volumenDown() {
        if (this.estado) {
            if (this.volumen > 0) {
                this.volumen--;
            }
        }
    }
}