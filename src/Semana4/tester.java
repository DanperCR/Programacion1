/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana4;

/**
 *
 * @author cdrpa
 */
public class tester {
     public static void main(String[] args) {
        ImpuestoRenta2 s = new ImpuestoRenta2();
        double r = s.calcularImpuesto(3, 1000000);
        System.out.println(r);

    }
}
