import java.util.Scanner;
import java.util.ArrayList;

public class FidelizacionClientes {

    public static void main(String[] args) {
        // Llamada al método principal que simula el proceso de fidelización de clientes
        fidelizacionClientes();
    }

    public static void fidelizacionClientes() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> clientes = new ArrayList<>(); // Lista para almacenar los datos de los clientes
        String continuar = "sí"; // Controla si continuar o no con el ingreso de nuevos clientes

        System.out.println("Bienvenido al programa de Fidelización de Clientes.");

        while (continuar.equalsIgnoreCase("sí")) {
            // Pedir la edad, con validación de intentos
            int edad = pedirDatoInt(scanner, "Introduce la edad del cliente: ");
            if (edad == -1) {
                System.out.println("No se pudo obtener la edad. Terminando el ingreso de datos.");
                break;
            }

            // Limpiar el buffer del scanner antes de leer el nombre
            scanner.nextLine(); 

            // Pedir el nombre
            System.out.print("Introduce el nombre del cliente: ");
            String nombre = scanner.nextLine();

            // Almacenar los datos del cliente en la lista
            String datosCliente = "Nombre: " + nombre + ", Edad: " + edad + " años.";
            clientes.add(datosCliente);

            // Mostrar los datos introducidos
            System.out.println("Datos del cliente:");
            System.out.println(datosCliente);

            // Preguntar si se desea agregar otro cliente
            System.out.print("¿Quieres introducir otro cliente? (sí/no): ");
            continuar = scanner.nextLine();
        }

        // Mostrar los datos registrados al final
        System.out.println("Datos de clientes registrados:");
        for (String cliente : clientes) {
            System.out.println(cliente);
        }

        scanner.close(); // Cerrar el scanner al final
    }

    public static int pedirDatoInt(Scanner scanner, String mensaje) {
        int intentos = 3;
        while (intentos > 0) {
            System.out.print(mensaje);
            if (scanner.hasNextInt()) {
                return scanner.nextInt(); // Si la entrada es un número entero, lo retorna
            } else {
                scanner.next(); // Limpiar el buffer del scanner
                intentos--; // Decrementar intentos
                if (intentos > 0) {
                    System.out.println("Entrada inválida. Te quedan " + intentos + " intentos.");
                } else {
                    System.out.println("Número de intentos agotados.");
                    return -1; // Si se agotan los intentos, retornar -1
                }
            }
        }
        return -1; // En caso de que se acaben los intentos
    }
}