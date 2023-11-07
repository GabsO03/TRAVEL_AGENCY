package CodigoFuente;

import java.util.Scanner;

public class AgenciaViajes {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        int opcionprograma, numeroViajeros = 5;
        float gastosViajeros = 0, gastoTotal = 0, reparto = 0, v1=0, v2=0, v3=0, v4=0, v5=0; //Variables para Gabi
        boolean opcionuno = false, opciondos = false; //booleanas para avisar que los pasos se han cumplido.

            do {
                System.out.println("Selecione la opcion\n" +
                        "1. Introducir los gastos de los viajeros\n" +
                        "2. Calcular y mostrar repartos de gastos\n" +
                        "3. Salir");
                opcionprograma = escaner.nextInt();
                switch (opcionprograma) {
                    case 1: {  //Introduce el código aqui Jesus.

                        opcionuno = true;
                        break;

                    }
                    case 2: {
                        if (opcionuno) {
                            gastoTotal=(v1+v2+v3+v4+v5)/numeroViajeros;
                            System.out.println();
                            opciondos = true;
                        } else System.out.println("No has completado la opcion 1");
                        break;
                    }
                    case 3: { //Introduce el código aqui David.

                    }
                }
            }while (opcionprograma != 3) ;


        }
    }



