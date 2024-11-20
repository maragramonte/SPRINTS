## 2ª SEMANA ##

#### SEGUNDO EJERCICIO ####

Necesitamos diseñar un programa que realice una serie de cálculos

- Primero nos pide que cálculemos el área de ambas piscinas.
- Luego nos pide el cálculo que puedan almacenar cada piscina
- Tras hacer esto, nos pide el ancho y el largo  del espacio que ocuparan ambas piscinas si las ponemos al lado de la otra.
- También nos pide el área que ocuparan las dos piscinas cuando están al lado de la otra.
- Además de que tambien nos pide el volumen de agua que pueden almacenar entre las dos piscinas
- Por último nos dice que el programa debe intercambiar los valores de profundidad de ambas piscinas, despues debera calcular y mostrar el valor del volumen de agua que puedan encajar las nuevas medidas en ambas piscinas

### AUTOEVALUACIÓN ###
ALGORITMO

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

CÓDIGO JAVA

![Algoritmo](/"file:///C:/Users/marac/Pictures/Screenshots/Captura%20de%20pantalla%202024-10-23%20181014.png")
![Algoritmo](/"file:///C:/Users/marac/Pictures/Screenshots/Captura%20de%20pantalla%202024-10-23%20181042.png")
![Algoritmo](/"file:///C:/Users/marac/Pictures/Screenshots/Captura%20de%20pantalla%202024-10-23%20181124.png")

AUTOEVALUACIÓN

Robusto:A mi parecer el programa funciona sin problemas 

Ordenador y claro: He ido poniendo comentarios para poder entender y comprender el proceso en la medida de ver que era lo que tenia que ir haciendo paso a paso y asi ir mejorando poco a poco.

Indentaciones: El codigo del programa esta correctamente indentat

Correcto: Hace todos los puntos que se piden

Puntuación final: 2