
package PrcticaExamen;

import java.util.Scanner;

public class Problema6 {
    public static void main(String[] args) {
	Problema6Tester op = new Problema6Tester();
	Scanner geometria = new Scanner(System.in);
	
	int lado, base, altura, radio, opcion, resultado1;
        double resultado2;
	boolean x = true;
	while(x){
		System.out.println("Seleccione la figura deseada a calcular");
		System.out.println("1. Cuadrado");
		System.out.println("2. Rectangulo");
		System.out.println("3. Circulo");
		System.out.println("4. Salir");
		opcion = geometria.nextInt();
		
		
		if(opcion == 4){
                    System.out.println("Se termino el proceso...");
                    break;
		}else {
                    switch (opcion){
                        case 1: 
                            System.out.println("Indique el valor que quiere darle al lado: " );
                            lado = geometria.nextInt();
                            resultado1 = op.AreaCuadrado(lado);
                            System.out.println("El area del cuadrado es: " + resultado1 + "cm");
                            break;
                        case 2:
                            System.out.println("Indique el valor que quiere darle a la base: " );
                            base = geometria.nextInt();
                            System.out.println("Indique el valor que quiere darle a la altura: " );
                            altura = geometria.nextInt();
                            resultado1 = op.AreaRectangulo(base, altura);
                            System.out.println("El area del rectangulo es: " + resultado1 + "cm");
                            break;
                       case 3:
                           System.out.println("Indique el valor que quiere darle al radio: " );
                           radio = geometria.nextInt();
                           resultado2 = op.AreaCirculo(radio);
                           System.out.println("El area del circulo es de" + resultado2 + "cm");
                           break;
                       default:
                           System.out.println("Operacion no valida");
                           
                           
                           
                            
                            
                        
                        
                        
                    }
                }
		
        }
	
		
	}
	
}
	
	
	
    

