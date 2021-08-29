
package PracticaDeExamen2;


public class Parlante {
    boolean habilitado;
    int volumen;
    char tipo; //I Izq, D Der y S Sub

    public Parlante(boolean habilitado, int volumen, char tipo) {
        this.habilitado = habilitado;
        this.volumen = volumen;
        this.tipo = tipo;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    
    
}
