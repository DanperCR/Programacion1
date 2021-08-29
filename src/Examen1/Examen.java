package Examen1;

import java.util.Scanner;

public class Examen {

    public static void main(String[] args) {
        String nombre = "";
        String provincia = "";
        int numProvincia = 0;
        int CantTrabajadores = 0;
        int TrabajconCovid = 0;
        double ingresoxMes = 0.0d;
        int creditos = 0;
        double MontoPromedio = 0.0d;
        int opcion;
        double MontoaPrestar = 0.0d;
        int poblaSanJose = 1404242;
        int poblaCartago = 490903;
        int poblaAlajuea = 848146;
        int poblaHeredia = 433677;
        int poblaGuanacaste = 326953;
        int poblaPuntarenas = 410929;
        int poblaLimon = 386662;
        

        Scanner entrada = new Scanner(System.in);
        

       
        while(true) {
            System.out.println("Menu");
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Datos de la empresa: ");
            System.out.println("2. Imprimir los datos de la empresa");
            System.out.println("3. Cantidad de personas por provincia");
            System.out.println("4. monto a prestar a la empresa y tasa de interes");
            

            opcion = entrada.nextInt();

            
                switch (opcion) {
                    case 1: {
                        System.out.println("\n");
                        System.out.println("Menu");
                        System.out.println("Complete los datos:");
                        System.out.println("Nombre de la empresa: ");
                        nombre = entrada.next();
                        System.out.println("\"Digite el nombre de la Provincia: 1.San Jose \"\n"
                                + "                + \"\\n 2. Alajuela \"\n"
                                + "                + \"\\n 3. Cartago \"\n"
                                + "                + \"\\n 4. heredia \"\n"
                                + "                + \"\\n 5. Guanacaste \"\n"
                                + "                + \"\\n 6.Limon\");");
                        numProvincia = entrada.nextInt();
                        System.out.println("Cuantos trabajadores tiene la empresa a su disposicion: ");
                        CantTrabajadores = entrada.nextInt();
                        System.out.println("Cuantos de sus trabajadores han tenido Covid-19: ");
                        TrabajconCovid = entrada.nextInt();
                        System.out.println("Cual es el monto Promedio ");
                        MontoPromedio = entrada.nextDouble();
                        System.out.println("Tiene creditos? \"1\" si, \"0\" no: ");
                        creditos = entrada.nextInt();
                        break;
                    }
                    case 2: {
                        System.out.println("Datos de la empresa:"
                                + "\n"
                                + "\n " + "Nombre de la empresa" + " " + nombre
                                + "\n " + "Provincia donde reside" + " " + provincia
                                + "\n " + "La cantidad de trabajadores es de " + CantTrabajadores + " " + "Empleados"
                                + "\n " + TrabajconCovid + " " + "Empleados han tenido Covid-19"
                                + "\n " + "El monto promedio por mes es de " + MontoPromedio + " " + "Colones");
                        if (creditos == 1) {
                            System.out.println("La empresa cuenta con creditos");
                            System.out.println();
                        }
                       
                        if (creditos == 0) {
                            System.out.println(" La empresa no cuenta con creditos");
                            System.out.println();
                        }
                        if (TrabajconCovid > 20) {
                            System.out.println("Alerta: Favor de aumentar las normas de aseo en el ambiente laboral ");
                            System.out.println();
                        }
                        break;
                    }
                    case 3: {
                        double monto = 0.0d;
                        float tasa = 0.0f;

                        

                        switch (numProvincia) {

                            case 1: {
                                MontoaPrestar = (TrabajconCovid / CantTrabajadores) * poblaSanJose;
                                System.out.println(MontoaPrestar);
                                break;
                            }
                            case 2: {
                                MontoaPrestar = (TrabajconCovid / CantTrabajadores) * poblaCartago;
                                System.out.println(MontoaPrestar);
                                break;
                            }
                            case 3: {
                                MontoaPrestar = (TrabajconCovid / CantTrabajadores) * poblaAlajuea;
                                System.out.println(MontoaPrestar);
                                break;
                            }
                            case 4: {
                                MontoaPrestar = (TrabajconCovid / CantTrabajadores) * poblaHeredia;
                                System.out.println(MontoaPrestar);
                                break;
                            }
                            case 5: {
                                MontoaPrestar = (TrabajconCovid / CantTrabajadores) * poblaGuanacaste;
                                System.out.println(MontoaPrestar);
                                break;
                            }
                            case 6: {
                                MontoaPrestar = (TrabajconCovid / CantTrabajadores) * poblaPuntarenas;
                                System.out.println(MontoaPrestar);
                                break;
                            }
                            case 7: {
                                MontoaPrestar = (TrabajconCovid / CantTrabajadores) * poblaLimon;
                                System.out.println(MontoaPrestar);
                                break;
                            }
                        }
                        if (monto > 1000000d) {
                            monto = 1000000d;
                        }
                        System.out.println("Monto: " + monto + " Tasa " + tasa);

                    }

                    break;
                }

                break;
            }

        }

    }


