package CodigoFuente;

import java.util.Scanner;

public class pruebas {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        int opcion;
        int viajeros = 0;
        do {
            System.out.println("Selecione la opcion\n" +
                    "1. Introducir los gastos de los viajeros\n" +
                    "2. Calcular y mostrar repartos de gastos\n" +
                    "3. Salir");
            opcion = escaner.nextInt();
        } while (opcion > 3);
        do {
            if (opcion == 1) {
                System.out.println("ingrese los gastos de los viajeros si no tienen gastos ingresear un -1");
                System.out.println("gastos del primero viajero");
                viajeros = 5;
                int viajero = escaner.nextInt();
                System.out.println("gastos del segundo viajero");
                int viajero2 = escaner.nextInt();
                if (viajero2 == -1) viajeros = viajeros - 1;
                System.out.println("gastos del tercer viajero");
                int viajero3 = escaner.nextInt();
                if (viajero3 == -1) viajeros = viajeros - 1;
                System.out.println("gastos del cuarto viajero");
                int viajero4 = escaner.nextInt();
                if (viajero4 == -1) viajeros = viajeros - 1;
                System.out.println("gastos del quinto viajero");
                int viajero5 = escaner.nextInt();
                if (viajero5 == -1) viajeros = viajeros - 1;
                if (viajeros == 1) System.out.println("debes de introducir mas viajeros");
            }



    }while (viajeros == 1) ;
}
}
