package CodigoFuente;

import java.util.Scanner;

public class ViajesSierraSur {
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

    public static int sc(){
        Scanner escaner = new Scanner(System.in);
        int opcion= Integer.parseInt(escaner.nextLine());
        return opcion;
    }
    public static float leerViajero (float x, String orden){
        System.out.printf("Gastos %s viajero:\n", orden);
        x = sc();
        return x;
    }
    //Funcion case 2
    public static float gastoTotal (float v1, float v2, float v3, float v4, float v5, float gastoTotal) {
        if (v1!=-1) gastoTotal+=v1;
        if (v2!=-1) gastoTotal+=v2;
        if (v3!=-1) gastoTotal+=v3;
        if (v4!=-1) gastoTotal+=v4;
        if (v5!=-1) gastoTotal+=v5;
        return gastoTotal;
    }
    public static void resultadoViajero (String orden, float viajero, float mediaViajeros) {
            if (viajero < mediaViajeros) System.out.printf("El %s viajero pagó %.2f, debe pagar %.2f.\n", orden, viajero, (mediaViajeros - viajero));
            else System.out.printf("El %s viajero pagó %.2f deben pagarle %.2f.\n", orden, viajero, (viajero - mediaViajeros));
    }

    public static void salidaDatos (float v1, float v2, float v3, float v4, float v5, float gastosViajeros) {
        if (v1!=-1)resultadoViajero("primer", v1, gastosViajeros);
        if (v2!=-1)resultadoViajero("segundo", v2, gastosViajeros);
        if (v3!=-1)resultadoViajero("tercer", v3, gastosViajeros);
        if (v4!=-1)resultadoViajero("cuarto", v4, gastosViajeros);
        if (v5!=-1)resultadoViajero("quinto", v5, gastosViajeros);
    }

    public static void main (String[] args) {
        int opcionprograma,opcionViajero, numeroViajeros = 5;
        float gastosViajeros, gastoTotal = 0, viajero1 = 0, viajero2 = 0, viajero3 = 0, viajero4 = 0, viajero5 = 0;
        boolean opcionuno = false;
        do {
            menuPrincipal();
            opcionprograma = sc();
            switch (opcionprograma) {
                case 1: {
                    do {

                   preciosViajeros();
                        opcionViajero = sc();
                        switch (opcionViajero) {
                            case 1: {
                                viajero1+=leerViajero(viajero1, "primer");
                                if (viajero1==-1) numeroViajeros--;
                                break;
                            }
                            case 2: {
                                viajero2+=leerViajero(viajero1, "segundo");
                                if (viajero2==-1) numeroViajeros--;
                                break;
                            }
                            case 3: {
                                viajero3+=leerViajero(viajero1, "tercer");
                                if (viajero3==-1) numeroViajeros--;
                                break;
                            }
                            case 4: {
                                viajero4+=leerViajero(viajero1, "cuarto");
                                if (viajero4==-1) numeroViajeros--;
                                break;
                            }
                            case 5: {
                                viajero5+=leerViajero(viajero1, "quinto");
                                if (viajero5==-1) numeroViajeros--;
                                break;
                            }
                            case 6: {
                                System.out.println("Gastos viajeros guardados");
                                break;
                            }
                            default:
                                System.out.println("ERROR: opción no disponible.");
                        }
                    } while (opcionViajero != 6);
                    opcionuno = true;
                    break;
                }
                    case 2: {
                        if (opcionuno) {
                            System.out.println();
                            gastoTotal = gastoTotal(viajero1, viajero2, viajero3, viajero4, viajero5, gastoTotal);
                            gastosViajeros = gastoTotal/numeroViajeros;
                            System.out.printf("Han gastado %.2f en total. Con una media de %.2f.\n", gastoTotal,gastosViajeros);
                            salidaDatos( viajero1, viajero2, viajero3, viajero4, viajero5, gastosViajeros);
                        } else System.out.println ("No has completado la opción 1");
                        break;
                    }
                    case 3: {
                        System.out.println("Gracias por contar con nuestro equipo.");
                        break;
                    }
                    default: System.out.println("ERROR: Opción no disponible.");
                }
            } while (opcionprograma != 3) ;
        }
    }


