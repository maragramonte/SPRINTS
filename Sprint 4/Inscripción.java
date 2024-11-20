import java.util.Scanner;

public class Inscripcion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Registro del niño
        int numeroRegistro;
        while (true) {
            System.out.print("Ingrese el número de registro del niño (1-500): ");
            numeroRegistro = scanner.nextInt();
            if (numeroRegistro >= 1 && numeroRegistro <= 500) {
                break; // Salir del bucle si el número es válido
            } else {
                System.out.println("Número de registro inválido. Debe estar entre 1 y 500.");
            }
        }

        int puntos = 0;
        boolean todasAfirmativas = true;

        // Array de preguntas y sus respectivos puntos
        String[] preguntas = {
            "¿Tiene alguna hermana en el centro? (sí=0 no=1):",
            "¿Reside en la zona de la escuela? (sí=0 no=1):",
            "¿El progenitor o progenitora desempeñan su labor en la región educativa? (sí=0 no=1):",
            "¿Presenta alguna discapacidad o enfermedad crónica? (sí=0 no=1):",
            "¿Se encuentra en una familia numerosa o monoparental? (sí=0 no=1):",
            "¿El padre, madre o algún hermano son ex-alumnos? (sí=0 no=1):"
        };

        // Puntos correspondientes a cada pregunta
        int[] puntosPorPregunta = {40, 30, 20, 10, 15, 5};

        int i = 0; // Inicialización del índice
        while (i < preguntas.length) {
            boolean respuesta = obtenerRespuesta(scanner, preguntas[i]);
            if (respuesta) {
                puntos += puntosPorPregunta[i];
                System.out.println("¡Respuesta afirmativa! Puntos acumulados: " + puntos);
            } else {
                todasAfirmativas = false;
                System.out.println("Respuesta negativa, no se suman puntos.");
            }
            i++; // Incrementar el índice
        }

        // Mostrar el resultado final
        System.out.println("Número de registro del niño: " + numeroRegistro);
        if (todasAfirmativas) {
            System.out.println("Total de puntos: " + puntos);
        } else {
            System.out.println("No se pueden contar los puntos debido a respuestas negativas.");
        }

        scanner.close();
    }

    private static boolean obtenerRespuesta(Scanner scanner, String mensaje) {
        int respuesta;
        while (true) {
            System.out.print(mensaje);
            respuesta = scanner.nextInt();
            if (respuesta == 0 || respuesta == 1) {
                return respuesta == 0; // Retorna true si la respuesta es "sí" (0)
            } else {
                System.out.println("Respuesta inválida. Debe ser 0 o 1.");
            }
        }
    }
}
 
