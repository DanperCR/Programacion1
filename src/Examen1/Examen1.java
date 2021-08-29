/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen1;

import java.util.Scanner;

public class Examen1 {

    public static void main(String[] args) {
        String nombre = "";
        int numProvincia = 0;       
        int poblaSanJose = 1404242;
        int poblaCartago = 490903;
        int poblaAlajuea = 848146;
        int poblaHeredia = 433677;
        int poblaGuanacaste = 326953;
        int poblaPuntarenas = 410929;
        int poblaLimon = 386662;
        int CantTrabajadores = 0;
        int TrabajconCovid = 0;
        int tienecreditos = 0;
        double MontoPromedio = 0.0d;
        int opcion;

        String Provincia = "";

        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println("Menu");
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Datos de la empresa: ");
            System.out.println("2. Imprimir los datos de la empresa");
            System.out.println("3. monto a prestar a la empresa y tasa de interes");
            System.out.println("4. salir");
            

            opcion = entrada.nextInt();

            if (opcion == 4) {
                System.out.println("Se termino el proceso");
                break;
            } else {
                switch (opcion) {
                    case 1: {
                        System.out.println("Menu");
                        System.out.println("Complete los datos:");
                        System.out.println("Nombre de la empresa:\n");
                        nombre = entrada.next();

                        System.out.println("\"Digite el nombre de la Provincia: "
                                + "\n " + "1.San Jose"
                                + "\n " + "2.Alajuela"
                                + "\n " + "3.Cartago"
                                + "\n " + "4.Heredia"
                                + "\n " + "5.Guanacaste"
                                + " \n " + "6.Puntarenas"
                                + "\n " + "7.Limon");
                        numProvincia = entrada.nextInt();

                        if (numProvincia == 1) {
                            Provincia = "Sanjose";
                        } else if (numProvincia == 2) {
                            Provincia = "Alajuela";
                        } else if (numProvincia == 3) {
                            Provincia = "Cartago";
                        } else if (numProvincia == 4) {
                            Provincia = "Heredia";
                        } else if (numProvincia == 5) {
                            Provincia = "Guanacaste";
                        } else if (numProvincia == 6) {
                            Provincia = "Puntarenas";
                        } else if (numProvincia == 7) {
                            Provincia = "Limon";
                        } else if (numProvincia < 1 || numProvincia > 7) {
                            System.out.println("Valor invalido");
                            break;
                        }

                        System.out.println("Cuantos trabajadores tiene la empresa a su disposicion: ");
                        CantTrabajadores = entrada.nextInt();
                        System.out.println("Cuantos de sus trabajadores han tenid Covid-19: ");
                        TrabajconCovid = entrada.nextInt();
                        System.out.println("Cual es el monto Promedio ");
                        MontoPromedio = entrada.nextDouble();
                        System.out.println("Tiene creditos? \"1\" si, \"0\" no: ");
                        tienecreditos = entrada.nextInt();

                        break;

                    }
                    case 2: {
                        System.out.println("Datos de la empresa:"
                                + "\n"
                                + "\n " + "Nombre de la empresa:" + " " + nombre
                                + "\n " + "Provincia donde reside es:" + " " + Provincia
                                + "\n " + "La cantidad de trabajadores es de " + CantTrabajadores + " " + "Empleados"
                                + "\n " + TrabajconCovid + " " + "Empleados han tenido Covid-19"
                                + "\n " + "El monto promedio por mes es de " + MontoPromedio + " " + "Colones");
                        if (tienecreditos == 1) {
                            System.out.println("La empresa cuenta con creditos");
                            System.out.println();
                        }
                        if (tienecreditos == 0) {
                            System.out.println(" La empresa no cuenta con creditos");
                            System.out.println();
                        }
                        if (TrabajconCovid > 20) {
                            System.out.println("Alerta: Favor de aumentar las normas de aseo en el ambiente labora ");
                            System.out.println();
                        }
                        break;
                    }

                    case 3: {

                        double MontoaPrestar = 0.0d;
                        double tasa = 0.0d;
                        
                        int pobProvincia = 0;
                        
                        //**Monto a prestar**\\

                        switch (numProvincia) {

                            case 1: {
                                pobProvincia = poblaSanJose;
                                break;
                            }
                            case 2: {
                                pobProvincia = poblaCartago;
                                break;
                            }
                            case 3: {
                                pobProvincia = poblaAlajuea;
                                break;
                            }
                            case 4: {
                                pobProvincia = poblaHeredia;
                                break;
                            }
                            case 5: {
                                pobProvincia = poblaGuanacaste;
                                break;
                            }
                            case 6: {
                                pobProvincia = poblaPuntarenas;
                                break;
                            }
                            case 7: {
                                pobProvincia = poblaLimon;
                                break;
                            }

                        }

                        double resultadoDiv = ((double)TrabajconCovid) / ((double)CantTrabajadores);
                        //**Calcular tasa de interes**\\
                        if(10 >CantTrabajadores && CantTrabajadores > 0){
                            tasa = 0.5d;
                            
                        }
                        else if(30 >CantTrabajadores && CantTrabajadores >= 10){
                            tasa = 0.4d;
                        }
                        else if(30 >= CantTrabajadores){
                            tasa = 0.3d;
                        }
                        if(tienecreditos == 1){
                            double sumatoria=0.0d;
                            short numDeCreditos=0;
                            double temp = 0.0d;
                            
                            do{
                                
                                System.out.println("Indique el valor del credito o -1 para salir");
                            temp = entrada.nextDouble();
                            if(temp != -1){
                                sumatoria =+ temp;
                                numDeCreditos++;
                            }
                            
                                
                            }
                            
                            
                            
                            while(temp== -1);
                            
                            double promedio = sumatoria/numDeCreditos;
                            double ajuste = promedio/100000d;
                            tasa = tasa + ajuste;
                            
                        
                            
                        }
                        
                       
                        
                        

                        MontoaPrestar = resultadoDiv * pobProvincia;

                        if (MontoaPrestar > 1000000d) {
                            MontoaPrestar = 1000000d;
                        }
                        System.out.println("MontoaPrestar:" + MontoaPrestar + "\n" + "Tasa: " + tasa);

                    }

                }

            }
        }
    }
}
