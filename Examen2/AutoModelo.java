
package Examen2;


public class AutoModelo {
    Motor motor;
    private String modelo;
    private String estilo;
    private String color;
    private int año;
    private boolean cocheVendido;

    public AutoModelo(Motor motor, String modelo, String estilo, String color, int año, boolean cocheVendido) {
        this.motor = motor;
        this.modelo = modelo;
        this.estilo = estilo;
        this.color = color;
        this.año = año;
        this.cocheVendido = cocheVendido;
    }

    public AutoModelo(String modelo, String estilo, String color, int años) {
        
    }

    

   

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
  
    }
    
     
