import java.util.Scanner;

public class NumerosMultiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        int limite = 0;
        String direccion = "";

        // Solicitar número
        while (true) {
            System.out.print("Ingrese un número (entre 1 y 20): ");
            numero = scanner.nextInt();
            if (numero >= 1 && numero <= 20) {
                break; // Salir del bucle si el número es válido
            } else {
                System.out.println("Número inválido. Debe ser un entero entre 1 y 20.");
            }
        }

        // Solicitar límite superior
        while (true) {
            System.out.print("Ingrese el límite superior (entre 1 y 20): ");
            limite = scanner.nextInt();
            if (limite >= 1 && limite <= 20) {
                break; // Salir del bucle si el límite es válido
            } else {
                System.out.println("Límite inválido. Debe ser un entero entre 1 y 20.");
            }
        }

        // Solicitar la dirección de los múltiplos
        while (true) {
            System.out.print("¿Desea los múltiplos en orden ascendente o descendente? (asc/desc): ");
            direccion = scanner.next().toLowerCase();
            if (direccion.equals("asc") || direccion.equals("desc")) {
                break; // Salir del bucle si la dirección es válida
            } else {
                System.out.println("Dirección no válida. Por favor, ingrese 'asc' o 'desc'.");
            }
        }

        // Mostrar los múltiplos en la dirección seleccionada hasta el límite
        System.out.println("Los múltiplos de " + numero + " hasta " + limite + " son:");
        if (direccion.equals("asc")) {
            int i = 1;
            while (numero * i <= limite) {
                System.out.println(numero * i);
                i++;
            }
        } else { // direccion.equals("desc")
            int i = limite / numero;
            while (i >= 1) {
                System.out.println(numero * i);
                i--;
            }
        }

        // Mostrar los múltiplos de 'numero' entre 0 y 100
        System.out.println("Los múltiplos de " + numero + " entre 0 y 100 son:");
        int j = 0;
        while (j <= 100) {
            System.out.println(j);
            j += numero; // Incrementar j en el valor de 'numero'
        }

        scanner.close();
    }
}