package taller3.televisores;

public class TV {
    Marca marca;
    int canal = 1;
    int precio = 500;
    boolean estado;
    int volumen = 1;
    Control control;

    private static int numTV;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        numTV++;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    public Marca getMarca() {
        return marca;
    }

    public void setCanal(int canal) {
        if (estado) {
            if (canal <= 120) {
                if (canal >= 1) {
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
        return precio;
    }

    public void setVolumen(int volumen) {
        if (estado) {
            if (volumen <= 7) {
                if (volumen >= 0) {
                    this.volumen = volumen;
                }
            }
        }
    }
    public int getVolumen(){
        return volumen;
    }

    public void setControl(Control control) {
        this.control = control;
    }
    public Control getControl() {
        return control;
    }

    public void setNumTV(int numTV) {
        TV.numTV = numTV;
    }
    public int getNumTV() {
        return TV.numTV;
    }
    
    public void turnOn() {
        estado = true;
    }
    public void turnOff() {
        estado = false;
    }

    public boolean getEstado() {
        return estado;
    }

    public void canalUp() {
        if (estado) {
            if (canal < 120) {
                canal++;
            }
        }

    }

    public void canalDown() {
        if (estado) {
            if (canal > 1) {
                canal--;
            }
        }
    }

    public void volumenUp() {
        if (estado) {
            if (volumen < 7) {
                volumen++;
            }
        }
    }

    public void volumenDown() {
        if (estado) {
            if (volumen > 0) {
                volumen--;
            }
        }
    }
}