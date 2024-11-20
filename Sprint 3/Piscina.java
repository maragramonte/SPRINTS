import java.util.Scanner;

public class Piscina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar datos de la piscina 1
        System.out.println("Ingrese el largo de la piscina 1:");
        double largo1 = scanner.nextDouble();
        System.out.println("Ingrese el ancho de la piscina 1:");
        double ancho1 = scanner.nextDouble();
        System.out.println("Ingrese la profundidad de la piscina 1:");
        double profundidad1 = scanner.nextDouble();

        // Solicitar datos de la piscina 2
        System.out.println("Ingrese el largo de la piscina 2:");
        double largo2 = scanner.nextDouble();
        System.out.println("Ingrese el ancho de la piscina 2:");
        double ancho2 = scanner.nextDouble();
        System.out.println("Ingrese la profundidad de la piscina 2:");
        double profundidad2 = scanner.nextDouble();

        // Calcular el área de cada piscina
        double area1 = largo1 * ancho1;
        double area2 = largo2 * ancho2;

        System.out.println("Área de la piscina 1: " + area1);
        System.out.println("Área de la piscina 2: " + area2);

        // Calcular el volumen de agua que pueden almacenar las piscinas
        double volumen1 = area1 * profundidad1;
        double volumen2 = area2 * profundidad2;

        System.out.println("Volumen de la piscina 1: " + volumen1);
        System.out.println("Volumen de la piscina 2: " + volumen2);

        // Calcular el ancho total de ambas piscinas juntas
        double anchoTotal = ancho1 + ancho2;
        System.out.println("Ancho total de ambas piscinas: " + anchoTotal);

        // Calcular el área total de ambas piscinas juntas
        double areaTotal = area1 + area2;
        System.out.println("Área total de ambas piscinas: " + areaTotal);

        // Calcular el volumen total de agua entre ambas piscinas
        double volumenTotal = volumen1 + volumen2;
        System.out.println("Volumen total de ambas piscinas juntas: " + volumenTotal);

        // Intercambiar los valores de las profundidades
        double profundidadTem = profundidad1;
        profundidad1 = profundidad2;
        profundidad2 = profundidadTem;

        // Calcular el nuevo volumen de cada piscina con la nueva profundidad
        double volumenNuevo1 = area1 * profundidad1;
        double volumenNuevo2 = area2 * profundidad2;

        System.out.println("Volumen de la primera piscina con la nueva profundidad: " + volumenNuevo1);
        System.out.println("Volumen de la segunda piscina con la nueva profundidad: " + volumenNuevo2);
        
        scanner.close(); // Cerrar el escáner
    }
}