/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrcticaExamen;

import java.util.Scanner;

/**
 *
 * @author cdrpa
 */
public class Problema1 {

    int num1;
    int num2;
    int num3;
    int num4;
    int suma;
    int resta;
    int multiplicacion;
    double division;

    public void LeerNumeros() {

        Scanner Sett = new Scanner(System.in);
        System.out.println("Favor digite un numero: ");
        num1 = Sett.nextInt();
        System.out.println("Favir digite otro numero ");
        num2 = Sett.nextInt();
        System.out.println("Favir digite otro numero ");
        num3 = Sett.nextInt();
        System.out.println("Favir digite otro numero ");
        num4 = Sett.nextInt();

    }

    public void sumar() {
        suma = num1 + num2 + num3 + num4;

    }

    public void restar() {
        resta = num1 - num2 - num3 - num4;

    }

    public void multiplicar() {
        multiplicacion = num1 * num2 * num3 * num4;

    }
    public void dividir(){
        division = num1 / num2 / num3 / num4;
 
    }
    
    
    public void MostraResultado() {
        System.out.println("La suma es =  " +  suma  );
        System.out.println("La resta es =  " +  resta  );
        System.out.println("La multiplicacion es =  " +  multiplicacion  );
        System.out.println("La division es =  " +  division  );
        
    }

}
