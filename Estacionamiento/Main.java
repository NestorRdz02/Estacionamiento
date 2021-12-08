package Estacionamiento;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Tarjeta> tarjetasUsuario = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int i = 0;
        boolean op = true;
        while (op) {
            System.out.println(
                    "Menu de opciones:\n" +
                            " 0 Registrar tarjeta\n" +
                            " 1 Registrar entrada\n" +
                            " 2 Registrar salida\n" +
                            " 3 Obtener factura anterior\n" +
                            " 4 Carros estacionados\n" +
                            " 5 Ver datos de tarjetas\n" +
                            " 6 Detener programa");
            switch (sc.nextInt()) {
                case 0 -> {
                    i += 1;
                    System.out.println("Ingresa el nombre:");
                    String n = sc.nextLine();
                    System.out.println("Ingresa la dirección:");
                    String d = sc.nextLine();
                    System.out.println("Ingresa el telefono:");
                    String t = sc.nextLine();
                    System.out.println("Ingresa el RFC:");
                    String r = sc.nextLine();
                    System.out.println("Su ID es: " + i);
                    int rnd = i;
                    tarjetasUsuario.add(new Tarjeta(n, d, t, r, rnd));

                }
                case 1 -> {
                    System.out.println("Ingresa el ID de tu tarjeta");
                    /*
                     * Tarjeta x= c.buscarTarjeta(sc.next());
                     * if(x==null){
                     * System.out.println("No está registrado");
                     * }else{
                     * 
                     * }
                     */
                }
                case 5 -> {
                    System.out.println(tarjetasUsuario);
                }
                case 6 -> op = false;
                default -> System.out.println("Opción inválida");
            }
        }

    }
}
