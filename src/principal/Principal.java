package principal;
import calculos.Conversion;
import modelos.Historial;
import modelos.Moneda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Conversion conversion = new Conversion();
        List<Historial> historial = new ArrayList<>();

        int opcion = 0;

        while (opcion != 9) {
            System.out.println("""
                    [[============|||||||||||||||||||||============]]
                    | 1) Dolar ----> Peso argentino
                    | 2) Peso argentino ----> Dolar
                    | 3) Dolar ----> Real brasileño
                    | 4) Real brasileño ----> Dolar
                    | 5) Dolar ----> Peso colombiano
                    | 6) Peso colombiano ----> Dolar
                    | 7) Convierte tu moneda
                    | 8) Ver historial de conversiones
                    | 9) Salir
                    [[============|||||||||||||||||||||============]]
                    """);

            System.out.print("Ingrese una opción: ");
            opcion = lectura.nextInt();
            if (opcion == 9) {
                System.out.println("¡Saliendo del convertidor!");
                break;
            }
            Moneda moneda = new Moneda();

            switch (opcion) {
                case 1:
                    moneda.setMonedaDeCambio("USD");
                    moneda.setMonedaACambiar("ARS");
                    break;
                case 2:
                    moneda.setMonedaDeCambio("ARS");
                    moneda.setMonedaACambiar("USD");
                    break;
                case 3:
                    moneda.setMonedaDeCambio("USD");
                    moneda.setMonedaACambiar("BRL");
                    break;
                case 4:
                    moneda.setMonedaDeCambio("BRL");
                    moneda.setMonedaACambiar("USD");
                    break;
                case 5:
                    moneda.setMonedaDeCambio("USD");
                    moneda.setMonedaACambiar("COP");
                    break;
                case 6:
                    moneda.setMonedaDeCambio("COP");
                    moneda.setMonedaACambiar("USD");
                    break;
                case 7:
                    lectura.nextLine();
                    System.out.print("Ingrese la moneda origen (ej. USD): ");
                    String origen = lectura.nextLine().trim();
                    if (origen.length() == 3 ) {
                        origen = origen.substring(0,3).toUpperCase();
                    } else {
                        System.out.println("Código inválido. Debe tener solo 3 caracteres exactos. Intente de nuevo. \n");
                        continue;
                    }
                    System.out.print("Ingrese la moneda destino (ej. PEN): ");
                    String destino = lectura.nextLine().trim();
                    if (destino.length() == 3) {
                        destino = destino.substring(0,3).toUpperCase();
                    } else {
                        System.out.println("Código inválido. Debe tener solo 3 caracteres exactos. Intente de nuevo.\n");
                        continue;
                    }
                    moneda.setMonedaDeCambio(origen);
                    moneda.setMonedaACambiar(destino);
                    break;
                case 8:
                    if (historial.isEmpty()) {
                        System.out.println("No hay conversiones realizadas aún. \n");
                    } else {
                        System.out.println("\n[[===|||||||| [HISTORIAL DE CONVERSIONES] ||||||||===]]\n");
                        for (Historial h : historial) {
                            System.out.println(h.getMensaje());
                        }
                        System.out.println("\n[[============|||||||||||||||||||||============]]\n");
                    }
                    continue;
                default:
                    System.out.println("Opción inválida, intenta nuevamente.");
                    continue;
            }
            System.out.print("Indique el monto a convertir: ");
            double monto = lectura.nextDouble();
            moneda.setConversion(monto);
            double resultado = conversion.convertir(moneda);
            if (resultado > 0) {
                System.out.println("El valor de " + moneda.getConversion() + " [" +
                        moneda.getMonedaDeCambio() + "] corresponde al valor final de => "
                        + resultado + " [" + moneda.getMonedaACambiar() + "] \n");
                historial.add(new Historial(
                        moneda.getConversion(),
                        moneda.getMonedaDeCambio(),
                        resultado,
                        moneda.getMonedaACambiar()
                ));
            } else {
                System.out.println("No se pudo completar la conversión.");
            }

            System.out.println();
        }
        lectura.close();
    }
}