package CodigoFuente;

import java.util.Scanner;

public class AgenciaViajes {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        int opcionprograma, numeroViajeros=0;
        float gastosViajeros = 0, gastoTotal =0, reparto = gastoTotal/ numeroViajeros;
        System.out.println("Introduce el número de viajeros");
        numeroViajeros = Integer.parseInt(escaner.nextLine());
        if (numeroViajeros<1 || numeroViajeros>5){
            System.out.println("Valor no valido, un viaje debe tener de 1 a 5 viajeros");
        } else {
            do {
                System.out.println("Selecione la opcion\n" +
                        "1. Introducir los gastos de los viajeros\n" +
                        "2. Calcular y mostrar repartos de gastos\n" +
                        "3. Salir");
                opcionprograma = escaner.nextInt();
            } while (opcionprograma > 3);
            do {
                if (opcionprograma == 1) {
                    System.out.println("ingrese los gastos de los viajeros si no tienen gastos ingresear un -1");
                    System.out.println("gastos del primero viajero");
                    gastosViajeros = 5;
                    int viajero = escaner.nextInt();
                    System.out.println("gastos del segundo viajero");
                    int viajero2 = escaner.nextInt();
                    if (viajero2 == -1) gastosViajeros = gastosViajeros - 1;
                    System.out.println("gastos del tercer viajero");
                    int viajero3 = escaner.nextInt();
                    if (viajero3 == -1) gastosViajeros = gastosViajeros - 1;
                    System.out.println("gastos del cuarto viajero");
                    int viajero4 = escaner.nextInt();
                    if (viajero4 == -1) gastosViajeros = gastosViajeros - 1;
                    System.out.println("gastos del quinto viajero");
                    int viajero5 = escaner.nextInt();
                    if (viajero5 == -1) gastosViajeros = gastosViajeros - 1;
                    if (gastosViajeros == 1) System.out.println("debes de introducir mas viajeros");
                }


            } while (gastosViajeros == 1);
        }
    }
}

