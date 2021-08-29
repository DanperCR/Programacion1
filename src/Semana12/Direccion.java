
package Semana12;


public class Direccion {
    String pais;
    String provincia;
    String canton;
    String distrito;
    String detalle;
    
    public Direccion(){
        pais = "CR";
    }
    public Direccion(String pais, String provincia){
        this.pais = pais;
        this.provincia = provincia; 
        
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
    
}
