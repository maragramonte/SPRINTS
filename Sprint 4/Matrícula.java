import java.util.Scanner;

public class Matrícula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int puntos = 0;
        boolean todasAfirmativas = true;

        String[] preguntas = {
            "¿Tiene hermanos en el centro? (sí=0 no=1):",
            "¿Se aloja por los alrededores? (sí=0 no=1):",
            "¿Alguno de tus familiares trabaja por los alrededores? (sí=0 no=1):",
            "¿Tiene alguna enfermedad o discapacidad grave? (sí=0 no=1):",
            "¿Tienes familia numerosa? (sí=0 no=1):",
            "¿Alguno de tus familiares ha estudiado en el centro? (sí=0 no=1):"
        };

        int[] puntosPorPregunta = {40, 30, 20, 10, 15, 5};

        int i = 0;
        do {
            boolean respuesta = obtenerRespuesta(scanner, preguntas[i]);
            if (respuesta) {
                puntos += puntosPorPregunta[i];
                System.out.println("¡Respuesta afirmativa! Puntos acumulados: " + puntos);
            } else {
                todasAfirmativas = false;
                System.out.println("Respuesta negativa, no se suman puntos.");
            }
            i++;
        } while (i < preguntas.length);

        // Mostrar el resultado final
        if (todasAfirmativas) {
            System.out.println("Total de puntos: " + puntos);
        } else {
            System.out.println();
        }

        scanner.close();
    }

    private static boolean obtenerRespuesta(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        int respuesta = scanner.nextInt();
        return respuesta == 0; // Devuelve true si la respuesta es "sí" (0)
    }
}
