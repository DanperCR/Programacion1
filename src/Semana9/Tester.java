
package Semana9;

import java.util.Scanner;

/**
 *
 * @author cdrpa
 */
public class Tester {
    String Nombre_Empresa = "Gallito";
    public static void main(String[] args) {
        
        double taza = 0.5;
        Repaso repaso = new Repaso();
        
        repaso.calcularImpuesto(3, 10000, taza);
        Scanner escaner = new Scanner(System.in);
        escaner.nextInt();
    }
    
}
 