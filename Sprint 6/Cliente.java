import java.util.Scanner;

// Excepción personalizada para los errores de entrada
class DatosInvalidosException extends Exception {
    public DatosInvalidosException(String mensaje) {
        super(mensaje);
    }
}

public class Cliente {

    // Método para validar el ID
    public static int pedirId(Scanner scanner) throws DatosInvalidosException {
        System.out.print("Introduzca el ID del cliente: ");
        int id = scanner.nextInt();
        if (id <= 0) {
            throw new DatosInvalidosException("ID inválido. El ID debe ser un número positivo.");
        }
        return id;
    }

    // Método para validar la edad
    public static int pedirEdad(Scanner scanner) throws DatosInvalidosException {
        System.out.print("Introduzca la edad del cliente: ");
        int edad = scanner.nextInt();
        if (edad < 18 || edad > 100) {
            throw new DatosInvalidosException("Edad inválida. La edad debe estar entre 18 y 100 años.");
        }
        return edad;
    }

    // Método para mostrar las opciones de tipo de venta
    public static void mostrarOpcionesVenta() {
        System.out.println("\nOpciones de Venta:");
        System.out.println("1 - Venta libre");
        System.out.println("2 - Pensionista");
        System.out.println("3 - Joven carné");
        System.out.println("4 - Socios");
    }

    // Método para validar el tipo de venta
    public static int pedirTipoVenta(Scanner scanner) throws DatosInvalidosException {
        mostrarOpcionesVenta();
        System.out.print("Seleccione el tipo de venta (1-4): ");
        int tipoVenta = scanner.nextInt();
        if (tipoVenta < 1 || tipoVenta > 4) {
            throw new DatosInvalidosException("Tipo de venta inválido. Debe ser un número entre 1 y 4.");
        }
        return tipoVenta;
    }

    // Método para validar el importe
    public static double pedirImporte(Scanner scanner) throws DatosInvalidosException {
        System.out.print("Introduzca el importe de la compra: ");
        double importe = scanner.nextDouble();
        if (importe <= 0) {
            throw new DatosInvalidosException("Importe inválido. El importe debe ser mayor que 0.");
        }
        return importe;
    }

    // Método para validar el teléfono
    public static String pedirTelefono(Scanner scanner) throws DatosInvalidosException {
        System.out.print("Introduzca el teléfono de contacto del cliente (10 dígitos): ");
        scanner.nextLine(); // Limpiar el buffer de entrada
        String telefono = scanner.nextLine();
        if (!telefono.matches("\\d{10}")) {
            throw new DatosInvalidosException("Teléfono inválido. Debe tener exactamente 10 dígitos.");
        }
        return telefono;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre de la tienda
        System.out.print("Introduzca el nombre de la tienda: ");
        String nombreTienda = scanner.nextLine();

        // Variables para almacenar los datos del cliente
        int id = 0;
        int edad = 0;
        int tipoVenta = 0;
        double importe = 0;
        String telefono = "";

        // Bucle principal de entrada de datos con manejo de excepciones
        boolean datosValidos = false;
        while (!datosValidos) {
            try {
                id = pedirId(scanner);
                edad = pedirEdad(scanner);
                tipoVenta = pedirTipoVenta(scanner);
                importe = pedirImporte(scanner);
                telefono = pedirTelefono(scanner);
                datosValidos = true; // Si todos los datos son válidos, salimos del bucle
            } catch (DatosInvalidosException e) {
                // Si alguna excepción es lanzada, mostramos el error y seguimos pidiendo los datos
                System.out.println("Error: " + e.getMessage());
            }
        }

        // Mostrar resumen de los datos del cliente
        System.out.println("\n--- Resumen del Cliente ---");
        System.out.println("Nombre de la tienda: " + nombreTienda);
        System.out.println("ID del cliente: " + id);
        System.out.println("Edad del cliente: " + edad);
        System.out.println("Tipo de venta: " + obtenerDescripcionTipoVenta(tipoVenta));
        System.out.println("Importe de la compra: " + importe);
        System.out.println("Teléfono de contacto: " + telefono);

        scanner.close();
    }

    // Método para devolver la información del tipo de venta
    public static String obtenerDescripcionTipoVenta(int tipoVenta) {
        switch (tipoVenta) {
            case 1:
                return "Venta libre";
            case 2:
                return "Pensionista";
            case 3:
                return "Joven carné";
            case 4:
                return "Socios";
            default:
                return "Tipo desconocido";
        }
        
    }
}