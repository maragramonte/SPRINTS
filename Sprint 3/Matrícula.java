import java.util.Scanner;

public class Matrícula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int puntos = 0;
        boolean todasAfirmativas = true; // Bandera para verificar si todas las respuestas son afirmativas

        // Función para verificar respuestas
        boolean tieneHermanos = obtenerRespuesta(scanner, "¿Tiene hermanos en el centro? (sí=0 no=1):");
        if (tieneHermanos) {
            puntos += 40; // Asignar puntos por hermanos
        } else {
            todasAfirmativas = false; // Si hay un "no", cambiamos la bandera
        }

        boolean viveCerca = obtenerRespuesta(scanner, "¿Se aloja por los alrededores? (sí=0 no=1):");
        if (viveCerca) {
            puntos += 30; // Asignar puntos por vivir cerca
        } else {
            todasAfirmativas = false;
        }

        boolean familiaresTrabajan = obtenerRespuesta(scanner, "¿Alguno de tus familiares trabaja por los alrededores? (sí=0 no=1):");
        if (familiaresTrabajan) {
            puntos += 20; // Asignar puntos por familiares que trabajan cerca
        } else {
            todasAfirmativas = false;
        }

        boolean tieneDiscapacidad = obtenerRespuesta(scanner, "¿Tiene alguna enfermedad o discapacidad grave? (sí=0 no=1):");
        if (tieneDiscapacidad) {
            puntos += 10; // Asignar puntos por discapacidad
        } else {
            todasAfirmativas = false;
        }

        boolean familiaNumerosa = obtenerRespuesta(scanner, "¿Tienes familia numerosa? (sí=0 no=1):");
        if (familiaNumerosa) {
            puntos += 15; // Asignar puntos por familia numerosa
        } else {
            todasAfirmativas = false;
        }

        boolean familiaresEstudian = obtenerRespuesta(scanner, "¿Alguno de tus familiares ha estudiado en el centro? (sí=0 no=1):");
        if (familiaresEstudian) {
            puntos += 5; // Asignar puntos por familiares que han estudiado
        } else {
            todasAfirmativas = false;
        }

        // Mostrar el resultado final
        if (todasAfirmativas) {
            System.out.println("Total de puntos: " + puntos);
        } else {
            System.out.println("No se pueden contar los puntos debido a respuestas negativas.");
        }

        scanner.close();
    }

    // Método para obtener la respuesta del usuario
    private static boolean obtenerRespuesta(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        int respuesta = scanner.nextInt();
        return respuesta == 0; // Retorna true si la respuesta es "sí" (0)
    }
}
