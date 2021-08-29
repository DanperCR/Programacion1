package Proyecto;

import javax.swing.JOptionPane;

public class CambioMoneda {

    float dolar;
    float colon;
    float euro;

    public static void main(String[] args) {
        float obj1;
        float obj2;
        float obj3;

        obj1 = Float.parseFloat(JOptionPane.showInputDialog("La cantidad de dolares para hacer la conversion: "));
        obj2 = Float.parseFloat(JOptionPane.showInputDialog("La cantidad de colones para hacer la conversion: "));
        obj3 = Float.parseFloat(JOptionPane.showInputDialog("La cantidad de euros para hacer la conversion: "));

        CambioMoneda_Tester op = new CambioMoneda_Tester();
        op.ConverDolCol(obj1);
        op.ConverColDol(obj2);
        op.ConverEurDol(obj3);
        op.ConverDolEur(obj1);
        op.ConverColEur(obj2);
        op.ConverEurCol(obj3);
        
        op.mostrarResultado();
                
        

        
    }
}
