package Proyecto;


import java.util.Scanner;
import javax.swing.JOptionPane;

public class Conversion_Monedas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Conversor op1 = new Conversor();
        
        double num1;
        double num2;

        int opcion;

        while (true) {
            System.out.println("Conversor de monedas");
            System.out.println("1-colones a dolares\n"
                    + "2- euros a dolares\n");
            System.out.print("Ingrese una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1: {
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor actual del dolar: "));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite la cantidad de colones que desea cambiar:"));
                    op1.convertir1(num1, num2);
                    
                    break;
                }
                case 2: {
                     num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor actual del dolar: "));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite la cantidad de euros que desea cambiar:"));
                    op1.convertir2(num1, num2);
                    break;
                }
            }

        }

    }

}
