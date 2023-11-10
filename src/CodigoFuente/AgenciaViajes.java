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
    public static void resultadoViajero (String orden, float viajero, float mediaViajeros) {
        if (viajero < mediaViajeros) System.out.printf("El %s viajero pagó %.2f, debe pagar %.2f.\n", orden, viajero, (mediaViajeros - viajero));
        else System.out.printf("El %s viajero pagó %.2f deben pagarle %.2f.\n", orden, viajero, (viajero - mediaViajeros));
    }


    public static void opcion1(int opcionViajero) {
        int viajero1 = 0, viajero2 = 0, viajero3 = 0, viajero4 = 0, viajero5 = 0, numeroViajeros = 5;
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
                viajero4 = sc();
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


        } }
    public static int sc(){
     Scanner sc = new Scanner(System.in);
     int opcion = Integer.parseInt(sc.nextLine());
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
                        opcionViajero =sc();
                        opcion1(opcionViajero);
                    } while (opcionViajero != 6);
                    opcionuno = true;
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
