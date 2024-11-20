import java.util.Scanner;

public class Saludxpersona {
    private static final double TEMP_BAJA = 38.0;
    private static final double TEMP_MEDIA = 39.0;
    private static final double DOSIS_PARACETAMOL_MG = 15.0;
    private static final double DOSIS_PARACETAMOL_ADULTO = 500.0;
    private static final double TEMP_HOSPITAL = 40.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Introduce la temperatura del niño (°C): ");
        double temperatura = scanner.nextDouble();
        System.out.print("Introduce la edad del niño (años): ");
        int edad = scanner.nextInt();
        System.out.print("Introduce el peso del niño (kg): ");
        double peso = scanner.nextDouble();

        // Comprobación de la temperatura y acción a tomar
        if (temperatura < TEMP_BAJA) {
            System.out.println("El niño esta bien");
        } else if (temperatura < TEMP_MEDIA) {
            System.out.println("Se recomineda darle un baño con agua fría");
        } else {
            if (edad < 3) {
                System.out.println("Tienes que ir al médico");
            } else if (edad < 12) {
                double dosisParacetamol = DOSIS_PARACETAMOL_MG * peso;
                System.out.println("Dosis de Paracetamol: " + dosisParacetamol + " mg cada 8 horas");
            } else {
                System.out.println("Dosis de Paracetamol: " + DOSIS_PARACETAMOL_ADULTO + " mg cada 8 horas");
            }

            if (temperatura >= TEMP_HOSPITAL) {
                System.out.println("Aviso: Con mas de 40º llevarlo al hospital");
            }
        }

        scanner.close();
    }
}