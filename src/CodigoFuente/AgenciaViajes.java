package CodigoFuente;

import java.util.Scanner;

public class AgenciaViajes {
    public static void menuPrincipal(){
        System.out.println("Seleccione una opcion:\n" +
                "1. Introducir los gastos de los viajeros.\n" +
                "2. Calcular y mostrar repartos de gastos.\n" +
                "3. Salir.");
    }
    public static void  preciosViajeros(){
        System.out.println("Introduce el viajero que quiere introducir gastos o 6 para salir;\n" +
                "1.Primer viajero \n" +
                "2.Segundo viajero \n" +
                "3.Tercer viajero \n" +
                "4.Cuarto viajero \n" +
                "5.Quinto viajero \n" +
                "6.Salir");
    }


    public static void opcion1(int opcionViajero) {
        int viajero1 = 0, viajero2 = 0, viajero3 = 0, viajero4 = 0, viajero5 = 0, numeroViajeros = 5;
        boolean opcionuno = false;


        switch (opcionViajero) {
            case 1: {
                System.out.println("Gastos del primer viajero.");
                viajero1 = sc();
                if (viajero1 == -1) {
                    numeroViajeros--;
                    viajero1 = 0;
                }
                break;

            }
            case 2: {
                System.out.println("Gastos del segundo viajero.");
                viajero2 = sc();
                if (viajero2 == -1) {
                    numeroViajeros--;
                    viajero2 = 0;
                }
                break;
            }
            case 3: {
                System.out.println("Gastos del tercer viajero.");
                viajero3 = sc();
                if (viajero3 == -1) {
                    numeroViajeros--;
                    viajero3 = 0;
                }
                break;
            }
            case 4: {
                System.out.println("Gastos del cuarto viajero");
                viajero4 =sc();
                if (viajero4 == -1) {
                    numeroViajeros--;
                    viajero4 = 0;
                }
                break;
            }
            case 5: {
                System.out.println("Gastos del quinto viajero");
                viajero5 = sc();
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


    }
    public static int sc(){
        Scanner escaner = new Scanner(System.in);
        int opcion= Integer.parseInt(escaner.nextLine());
        return opcion;
    }

    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        int opcionprograma,opcionViajero, numeroViajeros = 5, viajero1 = 0, viajero2 = 0, viajero3 = 0, viajero4 = 0, viajero5 = 0;
        float gastosViajeros, gastoTotal; //Variables para Gabi
        boolean opcionuno = false;  //booleanas para avisar que los pasos se han cumplido.
        do {
            menuPrincipal();
            opcionprograma = sc();
            switch (opcionprograma) {
                case 1: {  //Introduce el código aqui Jesus.
                    do {

                   preciosViajeros();



                        opcionViajero = sc();
                        opcion1(opcionViajero);
                    } while (opcionViajero != 6);
                    opcionuno = true;
                }


                    case 2: {
                        if (opcionuno) {
                            System.out.println();

                            gastosViajeros = (float) (viajero1 + viajero2 + viajero3 + viajero4 + viajero5) / numeroViajeros;
                            gastoTotal = viajero1 + viajero2 + viajero3 + viajero4 + viajero5;
                            System.out.println ("Han gastado " + gastoTotal + " en total. Con una media de "+gastosViajeros);

                            if (viajero1 < gastosViajeros) System.out.println("El primer viajero pagó "+viajero1+" debe pagar " + (gastosViajeros - viajero1));
                            else System.out.println ("El primer viajero pagó "+viajero1+" deben pagarle " + (viajero1 - gastosViajeros));

                            if (viajero2 < gastosViajeros) System.out.println("El segundo viajero pagó "+viajero2+" debe pagar " + (gastosViajeros - viajero2));
                            else System.out.println ("El segundo viajero pagó "+viajero2+" deben pagarle " + (viajero2 - gastosViajeros));

                            if (numeroViajeros>2) {
                                if (viajero3 < gastosViajeros)
                                    System.out.println("El tercer viajero pagó "+viajero3+" debe pagar " + (gastosViajeros - viajero3));
                                else
                                    System.out.println("El tercer viajero pagó "+viajero3+" deben pagarle " + (viajero3 - gastosViajeros));
                            }

                            if (numeroViajeros>3){
                                if (viajero4 < gastosViajeros)
                                    System.out.println("El cuarto viajero pagó "+viajero4+" debe pagar " + (gastosViajeros - viajero4));
                                else
                                    System.out.println("El cuarto viajero pagó "+viajero4+" deben pagarle " + (viajero4 - gastosViajeros));
                            }

                            if (numeroViajeros>4){
                                if (viajero5 < gastosViajeros)
                                    System.out.println("El quinto viajero pagó "+viajero5+" debe pagar " + (gastosViajeros - viajero5));
                                else
                                    System.out.println("El quinto viajero pagó "+viajero5+" deben pagarle " + (viajero5 - gastosViajeros));
                            }

                        } else System.out.println ("No has completado la opción 1");
                        break;
                    }
                    case 3: {
                        System.out.println("Gracias por contar con nuestro equipo.");
                    }
                    default: System.out.println("Has salido del programa");
                }
            } while (opcionprograma != 3) ;
        }
    }


