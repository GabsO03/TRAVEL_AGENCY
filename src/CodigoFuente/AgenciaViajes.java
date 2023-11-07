package CodigoFuente;

import java.util.Scanner;

public class AgenciaViajes {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        int opcionprograma, numeroViajeros = 5;
        float gastosViajeros = 0, gastoTotal = 0, reparto = 0; //Variables para Gabi
        boolean opcionuno = false, opciondos = false; //booleanas para avisar que los pasos se han cumplido.
        do {
            System.out.println("Selecione la opcion\n" +
                    "1. Introducir los gastos de los viajeros\n" +
                    "2. Calcular y mostrar repartos de gastos\n" +
                    "3. Salir");
            opcionprograma = escaner.nextInt();
            switch (opcionprograma) {
                case 1: {  //Introduce el código aqui Jesus.
                    System.out.println("Ingrese los gastos de los viajeros (si no tienen gastos ingresear un -1)");
                    System.out.println("Gastos del primero viajero.");
                    gastosViajeros = 5;
                    int viajero = escaner.nextInt();
                    System.out.println("Gastos del segundo viajero.");
                    int viajero2 = escaner.nextInt();
                    if (viajero2 == -1) gastosViajeros = gastosViajeros - 1;
                    System.out.println("Gastos del tercer viajero.");
                    int viajero3 = escaner.nextInt();
                    if (viajero3 == -1) gastosViajeros = gastosViajeros - 1;
                    System.out.println("Gastos del cuarto viajero");
                    int viajero4 = escaner.nextInt();
                    if (viajero4 == -1) gastosViajeros = gastosViajeros - 1;
                    System.out.println("Gastos del quinto viajero.");
                    int viajero5 = escaner.nextInt();
                    if (viajero5 == -1) gastosViajeros = gastosViajeros - 1;
                    if (gastosViajeros == 1) System.out.println("Debes de introducir más viajeros.");
                    opcionuno = true;
                    break;
                }
                case 2: {
                    if (opcionuno) { //Introduce aqui el código Gabi.
                        opciondos = true;
                    } else System.out.println("No has completado la opcion 1");

                    break;

                }
                case 3: { //Introduce el código aqui David.

                }
            }
        }while(opcionprograma>3);
    }
}

