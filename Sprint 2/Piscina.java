import java.util.Scanner;
public class Piscina {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        
        // Solicitar datos de la piscina 1
        System.out.println("Ingrese el largo de la piscina 1:");
        final int largo1 = scanner.nextInt();
        System.out.println("Ingrese el ancho de la piscina 1:");
        final int ancho1 = scanner.nextInt();
        System.out.println("Ingrese la profundidad de la piscina 1:");
        int profundidad1 = scanner.nextInt();

        // Solicitar datos de la piscina 2
        System.out.println("Ingrese el largo de la piscina 2:");
        final int largo2 = scanner.nextInt();
        System.out.println("Ingrese el ancho de la piscina 2:");
        final int ancho2 = scanner.nextInt();
        System.out.println("Ingrese la profundidad de la piscina 2:");
        int profundidad2 = scanner.nextInt();

        // Calcular el área de cada piscina
        final int area1 = largo1 * ancho1;
        final int area2 = largo2 * ancho2;

        System.out.println("Área de la piscina 1: " + area1);
        System.out.println("Área de la piscina 2: " + area2);

        // Calcular el volumen de agua que pueden almacenar las piscinas
        final int volumen1 = area1 * profundidad1;
        final int volumen2 = area2 * profundidad2;

        System.out.println("Volumen de la piscina 1: " + volumen1);
        System.out.println("Volumen de la piscina 2: " + volumen2);

        // Calcular el ancho total de ambas piscinas juntas
        final int anchoTotal = ancho1 + ancho2;
        System.out.println("Ancho total de ambas piscinas: " + anchoTotal);

        // Calcular el área total de ambas piscinas juntas
        final int areaTotal = area1 + area2; // Corrección aquí para sumar las áreas
        System.out.println("Área total de ambas piscinas: " + areaTotal);

        // Calcular el volumen total de agua entre ambas piscinas
        final int volumenTotal = volumen1 + volumen2;
        System.out.println("Volumen total de ambas piscinas juntas: " + volumenTotal);

        // Intercambiar los valores de las profundidades
        final int profundidadTem = profundidad1;
        profundidad1 = profundidad2;
        profundidad2 = profundidadTem;

        // Calcular el nuevo volumen de cada piscina con la nueva profundidad
        final int volumenNuevo1 = area1 * profundidad1;
        final int volumenNuevo2 = area2 * profundidad2;

        System.out.println("Volumen de la primera piscina con la nueva profundidad: " + volumenNuevo1);
        System.out.println("Volumen de la segunda piscina con la nueva profundidad: " + volumenNuevo2);
        
        scanner.close(); // Cerrar el escáner
    }
}