package Proyecto;

public class CambioMoneda_Tester {

double conversion1;
double conversion2;
double conversion3;
double conversion4;
double conversion5;
double conversion6;


    public void ConverDolCol(float dolar) {
         conversion1 = dolar * 621.20f;

        

    }

    public void ConverColDol(float colon) {
         conversion2 = colon * 0.0016f;

        

    }

    public void ConverEurDol(float euro) {
         conversion3 = euro * 1.18f;

        

    }

    public void ConverDolEur(float dolar) {
         conversion4 = dolar * 0.85f;

       

    }

    public void ConverColEur(float colon) {
         conversion5 = colon * 0.0014f;

        

    }

    public void ConverEurCol(float euro) {
         conversion6 = euro * 733.70f;
       

    }

    public void mostrarResultado() {
        System.out.println("La conversion de dolares a colones es:"+conversion1);
        System.out.println("La conversion de colones a dolares  es:"+conversion2);
        System.out.println("La conversion de euros a dolares es:"+conversion3);
        System.out.println("La conversion de dolares a euros es:"+conversion4);
        System.out.println("La conversion de colones a euros es:"+conversion5);
        System.out.println("La conversion de euros a colones es:"+conversion6);

    }
}
