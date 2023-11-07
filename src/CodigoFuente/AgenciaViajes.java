package CodigoFuente;

import java.util.Scanner;

public class AgenciaViajes {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        int opcionprograma, numeroViajeros = 5;
        float gastosViajeros = 0, gastoTotal = 0, reparto = 0; //Variables para Gabi
        boolean opcionuno = false;  //booleanas para avisar que los pasos se han cumplido.
        do {
            System.out.println("Selecione la opcion\n" +
                    "1. Introducir los gastos de los viajeros.\n" +
                    "2. Calcular y mostrar repartos de gastos.\n" +
                    "3. Salir.");
            opcionprograma = escaner.nextInt();
            switch (opcionprograma) {
                case 1: {  //Introduce el código aqui Jesus.
                    System.out.println("Ingrese los gastos de los viajeros (si no tienen gastos ingresear un -1)");
                    System.out.println("Gastos del primero viajero.");
                    numeroViajeros =5;
                    int viajero = escaner.nextInt();
                    System.out.println("Gastos del segundo viajero.");
                    int viajero2 = escaner.nextInt();
                    if (viajero2 == -1) numeroViajeros--;
                    System.out.println("Gastos del tercer viajero.");
                    int viajero3 = escaner.nextInt();
                    if (viajero3 == -1)  numeroViajeros-- ;
                    System.out.println("Gastos del cuarto viajero");
                    int viajero4 = escaner.nextInt();
                    if (viajero4 == -1)  numeroViajeros--;
                    System.out.println("Gastos del quinto viajero.");
                    int viajero5 = escaner.nextInt();
                    if (viajero5 == -1)  numeroViajeros--;
                    if (numeroViajeros == 1) System.out.println("Debes de introducir más viajeros.");
                    opcionuno = true;
                    break;
                }
                case 2: {
                    if (opcionuno) { //Introduce aqui el código Gabi.
                        System.out.println("Aquí se calcula  y muestra el reparto");

                    } else System.out.println("No has completado la opción 1");

                    break;

                }
                case 3: { //Introduce el código aqui David.


                }
                default:

                    System.out.println("Has salido del programa");
                    opcionprograma =3;
            }
            System.out.println();
        }while(opcionprograma!=3);
    }
}

