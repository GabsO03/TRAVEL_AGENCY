package CodigoFuente;

import java.util.Scanner;



public class AgenciaViajes {
    //Función para mostrar el resultado de cada uno
    public static void resultadoViajero (String orden, float viajero, float mediaViajeros) {
        if (viajero < mediaViajeros) System.out.printf("El %s viajero pagó %.2f, debe pagar %.2f.\n", orden, viajero, (mediaViajeros - viajero));
        else System.out.printf("El %s viajero pagó %.2f deben pagarle %.2f.\n", orden, viajero, (viajero - mediaViajeros));
    }


    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        int opcionprograma, opcionViajero, numeroViajeros = 5;
        float gastosViajeros, gastoTotal, viajero1 = 0, viajero2 = 0, viajero3 = 0, viajero4 = 0, viajero5 = 0;
        boolean opcionuno = false;

        System.out.println("Hola, bienvenid@ a ");

        do {
            System.out.println();
            System.out.println("Seleccione una opcion:\n" +
                    "1. Introducir los gastos de los viajeros.\n" +
                    "2. Calcular y mostrar repartos de gastos.\n" +
                    "3. Salir.");
            opcionprograma = Integer.parseInt(escaner.nextLine());
            switch (opcionprograma) {
                case 1: {
                    opcionuno = true;
                    do {
                        System.out.println("Introduce el viajero que quiere introducir gastos o 6 para salir;\n" +
                                "1.Primer viajero \n" +
                                "2.Segundo viajero \n" +
                                "3.Tercer viajero \n" +
                                "4.Cuarto viajero \n" +
                                "5.Quinto viajero \n" +
                                "6.Salir");


                        opcionViajero = Integer.parseInt(escaner.nextLine());
                        switch (opcionViajero) {
                            case 1: {
                                System.out.println("Gastos del primer viajero.");
                                viajero1 += Integer.parseInt(escaner.nextLine());
                                if (viajero1 == -1) {
                                    numeroViajeros--;
                                    viajero1 = 0;
                                }
                                break;

                                    }
                            case 2: {
                                System.out.println("Gastos del segundo viajero.");
                                viajero2 += Integer.parseInt(escaner.nextLine());
                                if (viajero2 == -1) {
                                    numeroViajeros--;
                                    viajero2 = 0;
                                }
                                break;
                            }
                            case 3: {
                                System.out.println("Gastos del tercer viajero.");
                                viajero3 += Integer.parseInt(escaner.nextLine());
                                if (viajero3 == -1) {
                                    numeroViajeros--;
                                    viajero3 = 0;
                                }
                                break;
                            }
                            case 4: {
                                System.out.println("Gastos del cuarto viajero");
                                viajero4 += Integer.parseInt(escaner.nextLine());
                                if (viajero4 == -1) {
                                    numeroViajeros--;
                                    viajero4 = 0;
                                }
                                break;
                            }
                            case 5: {
                                System.out.println("Gastos del quinto viajero");
                                viajero5 += Integer.parseInt(escaner.nextLine());
                                if (viajero5 == -1) {
                                    numeroViajeros--;
                                    viajero5 = 0;
                                }
                                break;
                            }
                            case 6: {
                                System.out.println("Gastos viajeros guardados");
                                break;
                            }
                            default:
                                System.out.println("ERROR: opción no disponible.");

                        }
                    } while (opcionViajero != 6); break;
                }
                case 2: {
                            if (opcionuno) {
                            System.out.println();
                            gastoTotal = viajero1 + viajero2 + viajero3 + viajero4 + viajero5;
                            gastosViajeros = gastoTotal/numeroViajeros;
                            System.out.printf("Han gastado %.2f en total. Con una media de %.2f.\n", gastoTotal,gastosViajeros);

                            resultadoViajero("primer", viajero1, gastosViajeros);
                            resultadoViajero("segundo", viajero2, gastosViajeros);
                            if (numeroViajeros>2) resultadoViajero("tercer", viajero3, gastosViajeros);
                            if (numeroViajeros>3) resultadoViajero("cuarto", viajero4, gastosViajeros);
                            if (numeroViajeros>4) resultadoViajero("quinto", viajero5, gastosViajeros);
                            break;

                            } else {
                                System.out.println("No has completado la opción 1");
                                break;
                            }
                        }
                case 3 : {
                    System.out.println("Gracias por contar con nuestro equipo.");
                    break;
                }
                default: System.out.println("Opción no disponible.");
                }
            } while (opcionprograma != 3) ;
        }
    }


