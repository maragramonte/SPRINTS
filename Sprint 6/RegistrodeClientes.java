import java.util.Scanner;

public class RegistrodeClientes {
    
    // Métodos para la validación
    public static boolean validarId(int id) {
        return id >= 111 && id <= 999;
    }
    
    public static boolean validarEdad(int edad) {
        return edad >= 14 && edad <= 120;
    }
    
    public static boolean validarTipoVenta(int tipo) {
        return tipo >= 0 && tipo <= 3;
    }
    
    public static boolean validarImporte(int importe) {
        return importe >= 0 && importe <= 1000;
    }
    
    public static boolean validarTelefono(long telefono) {
        return String.valueOf(telefono).length() == 9 && telefono >= 111111111 && telefono <= 999999999;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean datosValidos = false;

        while (!datosValidos) {
            // Pedimos los datos del cliente
            System.out.print("Introduzca el ID del cliente: ");
            int id = scanner.nextInt();
            
            // Validar ID
            if (!validarId(id)) {
                System.out.println("Error: ID debe estar entre 111 y 999. Intente de nuevo.");
                continue; // Vuelve al inicio del bucle
            }
            
            System.out.print("Introduzca la edad del cliente: ");
            int edad = scanner.nextInt();
            
            // Validar edad
            if (!validarEdad(edad)) {
                System.out.println("Error: Edad debe estar entre 14 y 120 años. Intente de nuevo.");
                continue; // Vuelve al inicio del bucle
            }
            
            // Mostramos por pantalla las opciones de tipo de venta
            System.out.println("Tipos de venta?:");
            System.out.println("venta libre (0)");
            System.out.println("pensionista (1)");
            System.out.println("carné joven (2)");
            System.out.println("socio (3)");
            System.out.print(": ");
            int tipoVenta = scanner.nextInt();
            
            // Validar tipo de venta
            if (!validarTipoVenta(tipoVenta)) {
                System.out.println("Error: Tipo de venta debe estar entre 0 y 3. Intente de nuevo.");
                continue; // Vuelve al inicio del bucle
            }
            
            System.out.print("Introduzca el importe de la compra: ");
            int importe = scanner.nextInt();
            
            // Validar importe
            if (!validarImporte(importe)) {
                System.out.println("Error: Importe debe estar entre 0 y 1000. Intente de nuevo.");
                continue; // Vuelve al inicio del bucle
            }
            
            System.out.print("Introduzca el teléfono de contacto del cliente (9 dígitos): ");
            long telefono = scanner.nextLong();
            
            // Validar teléfono
            if (!validarTelefono(telefono)) {
                System.out.println("Error: Teléfono debe tener exactamente 9 dígitos y estar entre 111111111 y 999999999. Intente de nuevo.");
                continue; // Vuelve al inicio del bucle
            }
            
            // En el caso de que lleguemos aquí significa que todos los datos son válidos
            datosValidos = true;
            
            // Mostramos por pantalla el resumen de los datos introducidos en una sola línea
            String tipoVentaTexto;
            switch (tipoVenta) {
                case 0:
                    tipoVentaTexto = "venta libre";
                    break;
                case 1:
                    tipoVentaTexto = "pensionista";
                    break;
                case 2:
                    tipoVentaTexto = "carné joven";
                    break;
                case 3:
                    tipoVentaTexto = "socio";
                    break;
                default:
                    tipoVentaTexto = "desconocido"; // No debería llegar aquí debido a la validación
                    break;
            }
            
            // Se resumen los datos en una sola línea
            System.out.println("\n--- Resumen de los datos del cliente ---");
            System.out.println("ID: " + id + ", Edad: " + edad + ", Tipo de venta: " + tipoVentaTexto + 
                               ", Importe: " + importe + ", Teléfono: " + telefono);
        }

        // Cerramos el scanner
        scanner.close();
    }
}