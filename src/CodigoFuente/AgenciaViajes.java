package CodigoFuente;

import java.util.Scanner;

public class AgenciaViajes {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        int opcionprograma, numeroViajeros = 5, viajero=0, viajero2=0, viajero3=0, viajero4=0, viajero5=0;
        float gastosViajeros = 0, gastoTotal = 0, reparto = 0; //Variables para Gabi
        boolean opcionuno = false;  //booleanas para avisar que los pasos se han cumplido.
        do {
            System.out.println("Seleccione una opcion:\n" +
                    "1. Introducir los gastos de los viajeros.\n" +
                    "2. Calcular y mostrar repartos de gastos.\n" +
                    "3. Salir.");
            opcionprograma = escaner.nextInt();
            switch (opcionprograma) {
                case 1: {  //Introduce el código aqui Jesus.
                    System.out.println("Ingrese los gastos de los viajeros (si no tienen gastos ingresear un -1)");
                    System.out.println();
                    System.out.println("Gastos del primer viajero.");
                    numeroViajeros =5;
                    viajero = escaner.nextInt();
                    System.out.println("Gastos del segundo viajero.");
                    viajero2 = escaner.nextInt();
                    if (viajero2 == -1) numeroViajeros--;
                    System.out.println("Gastos del tercer viajero.");
                    viajero3 = escaner.nextInt();
                    if (viajero3 == -1)  numeroViajeros-- ;
                    System.out.println("Gastos del cuarto viajero");
                    viajero4 = escaner.nextInt();
                    if (viajero4 == -1)  numeroViajeros--;
                    System.out.println("Gastos del quinto viajero.");
                    viajero5 = escaner.nextInt();
                    if (viajero5 == -1)  numeroViajeros--;
                    if (numeroViajeros == 1) System.out.println("Debes de introducir más viajeros.");
                    opcionuno = true;
                    break;
                }
                case 2: {
                    if (opcionuno) { //Introduce aqui el código Gabi.

                        gastosViajeros=(float)(viajero+viajero2+viajero3+viajero4+viajero5)/numeroViajeros;
                        gastoTotal=viajero+viajero2+viajero3+viajero4+viajero5;
                        System.out.println("Han gastado "+gastoTotal+" en total.");
                        if (viajero<gastosViajeros) System.out.println("El primer viajero debe pagar "+(gastosViajeros-viajero));
                        else System.out.println("Al primer viajero deben pagarle "+(viajero-gastosViajeros));
                        if (viajero2<gastosViajeros) System.out.println("El segundo viajero debe pagar "+(gastosViajeros-viajero2));
                        else System.out.println("Al segundo viajero deben pagarle "+(viajero2-gastosViajeros));
                        if (viajero3<gastosViajeros) System.out.println("El tercer viajero debe pagar "+(gastosViajeros-viajero3));
                        else System.out.println("Al tercer viajero deben pagarle "+(viajero3-gastosViajeros));
                        if (viajero4<gastosViajeros) System.out.println("El cuarto viajero debe pagar "+(gastosViajeros-viajero4));
                        else System.out.println("Al cuarto viajero deben pagarle "+(viajero4-gastosViajeros));
                        if (viajero5<gastosViajeros) System.out.println("El quinto viajero debe pagar "+(gastosViajeros-viajero5));
                        else System.out.println("Al quinto viajero deben pagarle "+(viajero5-gastosViajeros));
                    } else System.out.println("No has completado la opción 1");

                    break;

                }
                case 3:
                    System.out.println("Gracias por contar con nuestro equipo.");
                default:

                    System.out.println("Has salido del programa");
                    opcionprograma =3;
            }
            System.out.println();
        }while(opcionprograma!=3);
    }
}

