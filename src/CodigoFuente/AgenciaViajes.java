package CodigoFuente;

import java.util.Scanner;

public class AgenciaViajes {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        int opcionprograma,opcionViajero, numeroViajeros = 5, viajero1 = 0, viajero2 = 0, viajero3 = 0, viajero4 = 0, viajero5 = 0;
        float gastosViajeros = 0, gastoTotal = 0, reparto = 0; //Variables para Gabi
        boolean opcionuno = false;  //booleanas para avisar que los pasos se han cumplido.
        do {
            System.out.println("Seleccione una opcion:\n" +
                    "1. Introducir los gastos de los viajeros.\n" +
                    "2. Calcular y mostrar repartos de gastos.\n" +
                    "3. Salir.");
            opcionprograma = Integer.parseInt(escaner.nextLine());
            switch (opcionprograma) {
                case 1: {  //Introduce el código aqui Jesus.
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
                                viajero1 = Integer.parseInt(escaner.nextLine());
                                if (viajero1 == -1) {
                                    numeroViajeros--;
                                    viajero1 = 0;
                                }
                                break;

                            }
                            case 2: {
                                System.out.println("Gastos del segundo viajero.");
                                viajero2 = Integer.parseInt(escaner.nextLine());
                                if (viajero2 == -1) {
                                    numeroViajeros--;
                                    viajero2 = 0;
                                }
                                break;
                            }
                            case 3: {
                                System.out.println("Gastos del tercer viajero.");
                                viajero3 = Integer.parseInt(escaner.nextLine());
                                if (viajero3 == -1) {
                                    numeroViajeros--;
                                    viajero3 = 0;
                                }
                                break;
                            }
                            case 4: {
                                System.out.println("Gastos del cuarto viajero");
                                viajero4 = Integer.parseInt(escaner.nextLine());
                                if (viajero4 == -1) {
                                    numeroViajeros--;
                                    viajero4 = 0;
                                }
                                break;
                            }
                            case 5: {
                                System.out.println("Gastos del quinto viajero");
                                viajero5 = Integer.parseInt(escaner.nextLine());
                                if (viajero5 == -1) {
                                    numeroViajeros--;
                                    viajero5 = 0;
                                }
                                break;
                            }
                            case 6: {
                                System.out.println("Gastos viajeros guardados");
                            }
                            default:
                                System.out.println("Error no has introducido ningun Gasto.");

                                opcionuno = true;
                        }
                    } while (opcionViajero != 6);
                }







                    case 2: {
                        if (opcionuno) { //Introduce aqui el código Gabi.
                            System.out.println();

                            gastosViajeros = (float) (viajero1 + viajero2 + viajero3 + viajero4 + viajero5) / numeroViajeros;
                            gastoTotal = viajero1 + viajero2 + viajero3 + viajero4 + viajero5;
                            System.out.println("Han gastado " + gastoTotal + " en total.");
                            if (viajero1 < gastosViajeros)
                                System.out.println("El primer viajero debe pagar " + (gastosViajeros - viajero1));
                            else System.out.println("Al primer viajero deben pagarle " + (viajero1 - gastosViajeros));
                            if (viajero2 < gastosViajeros)
                                System.out.println("El segundo viajero debe pagar " + (gastosViajeros - viajero2));
                            else System.out.println("Al segundo viajero deben pagarle " + (viajero2 - gastosViajeros));
                            if (viajero3 < gastosViajeros)
                                System.out.println("El tercer viajero debe pagar " + (gastosViajeros - viajero3));
                            else System.out.println("Al tercer viajero deben pagarle " + (viajero3 - gastosViajeros));
                            if (viajero4 < gastosViajeros)
                                System.out.println("El cuarto viajero debe pagar " + (gastosViajeros - viajero4));
                            else System.out.println("Al cuarto viajero deben pagarle " + (viajero4 - gastosViajeros));
                            if (viajero5 < gastosViajeros)
                                System.out.println("El quinto viajero debe pagar " + (gastosViajeros - viajero5));
                            else System.out.println("Al quinto viajero deben pagarle " + (viajero5 - gastosViajeros));
                        } else System.out.println("No has completado la opción 1");

                        break;

                    }
                    case 3: {
                        System.out.println("Gracias por contar con nuestro equipo.");
                    }
                    default: System.out.println("Has salido del programa");
                }
                System.out.println();
            } while (opcionprograma != 3) ;
        }
    }


