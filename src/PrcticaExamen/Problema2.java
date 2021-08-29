package PrcticaExamen;

import java.util.Scanner;

public class Problema2 {

    public static void main(String[] args) {
        Problema2Tester op = new Problema2Tester();

        Scanner inicio = new Scanner(System.in);

        int n1, n2, n3, n4, resultado, opcion;
        double resultado2;
        float resultado3;

        boolean Ca = true;

        while (Ca) {
            System.out.println("Menu");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Factorial");
            System.out.println("6. Promedio");
            System.out.println("7. Numero Maximo");
            System.out.println("8. Invertir Lista");
            System.out.println("9. Salir");
            System.out.println("Seleccione una Opcion: ");
            opcion = inicio.nextInt();

            if (opcion == 9) {
                System.out.println("Se termino el proceso...");
                break;
            } else {
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese un valor: ");
                        n1 = inicio.nextInt();
                        System.out.println("Ingrese un valor: ");
                        n2 = inicio.nextInt();
                        System.out.println("Ingrese un valor: ");
                        n3 = inicio.nextInt();
                        System.out.println("Ingrese un valor: ");
                        n4 = inicio.nextInt();
                        resultado = op.sumar(n1, n2, n3, n4);
                        System.out.println("La suma es: " + resultado);
                        break;
                    case 2:
                         System.out.println("Ingrese un valor: ");
                        n1 = inicio.nextInt();
                        System.out.println("Ingrese un valor: ");
                        n2 = inicio.nextInt();
                        System.out.println("Ingrese un valor: ");
                        n3 = inicio.nextInt();
                        System.out.println("Ingrese un valor: ");
                        n4 = inicio.nextInt();
                        resultado = op.restar(n1, n2, n3, n4);
                        System.out.println("La resta es: " + resultado);
                        break;
                    case 3:
                         System.out.println("Ingrese un valor: ");
                        n1 = inicio.nextInt();
                        System.out.println("Ingrese un valor: ");
                        n2 = inicio.nextInt();
                        System.out.println("Ingrese un valor: ");
                        n3 = inicio.nextInt();
                        System.out.println("Ingrese un valor: ");
                        n4 = inicio.nextInt();
                        resultado = op.mulriplicar(n1, n2, n3, n4);
                        System.out.println("La multiplicacion es: " + resultado);
                        break;
                    case 4:
                        System.out.println("Ingrese un valor: ");
                        n1 = inicio.nextInt();
                        System.out.println("Ingrese un valor: ");
                        n2 = inicio.nextInt();
                        System.out.println("Ingrese un valor: ");
                        n3 = inicio.nextInt();
                        System.out.println("Ingrese un valor: ");
                        n4 = inicio.nextInt();
                        resultado = op.dividir(n1, n2, n3, n4);
                        System.out.println("La division es: " + resultado);
                        break;
                    case 5:
                         System.out.println("Ingrese un valor: ");
                        n1 = inicio.nextInt();
                        resultado2 = op.factorial(n1);
                        System.out.println("El factorial es: " + resultado2);
                        break;
                    case 6:
                        System.out.println("Ingrese un valor: ");
                        n1 = inicio.nextInt();
                        System.out.println("Ingrese un valor: ");
                        n2 = inicio.nextInt();
                        System.out.println("Ingrese un valor: ");
                        n3 = inicio.nextInt();
                        System.out.println("Ingrese un valor: ");
                        n4 = inicio.nextInt();
                        resultado3 = op.promedio(n1, n2, n3, n4);
                        System.out.println("El promedio es: " + resultado3);
                        break;
                        
                    default:
                        System.out.println("Opcione no valida");
                           
                        
                       
                        
                    
                        

                }
            }

        }

    }
}
