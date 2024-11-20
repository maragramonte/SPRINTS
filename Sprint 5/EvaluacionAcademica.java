/* Si edad = 0:
    Mostrar "Educación Infantil"
Si edad = 1:
    Mostrar "Educación Primaria - Ciclo Inicial"
Si edad = 2:
    Mostrar "Educación Primaria - Ciclo Medio"
Si edad = 3:
    Mostrar "Educación Primaria - Ciclo Superior"
De lo contrario:
    Mostrar "Curso adecuado"
 */
import java.util.*;
public class EvaluacionAcademica {
    public static void main(String[] args) {
    // Definir e inicializar las variables
    double notaProva = 6.5;  // Nota de la prueba
    int numeroLliuraments = 75;  // Porcentaje de entregas realizadas
    int TOTAL_LLIURAMENTS = 100;  // Total de entregas
    double notaLLiuraments = 0;  // Nota para las entregas
    double notaPractiques = 7;  // Nota de prácticas
    double notaFinal;  // Nota final
    boolean noSeguidaAC = false;  // Si no se siguió la evaluación continua
    
    // Comprobación del estado de la prueba
    if (notaProva < 7) {
    System.out.println("Aviso: Esta suspendido por la prueba final");
    } else if (numeroLliuraments < 70) {
    System.out.println("Aviso: Esta suspendido. No has seguido la evaluación continua.");
    noSeguidaAC = true;  // No siguió la evaluación continua
    } else if (numeroLliuraments == TOTAL_LLIURAMENTS) {
    notaLLiuraments = 10;
    } else if (numeroLliuraments >= 90) {
    notaLLiuraments = 8;
    } else if (numeroLliuraments >= 80) {
    notaLLiuraments = 6;
    } else if (numeroLliuraments >= 70) {
    notaLLiuraments = 4;
    }
    
    // Calcular la nota final: 20% de la prueba, 10% de las entregas y 70% de las prácticas
    notaFinal = (0.20 * notaProva) + (0.10 * notaLLiuraments) + (0.70 * notaPractiques);
    
    // Mostrar la recomendación final
    if (notaFinal < 5) {
    if (noSeguidaAC) {
    System.out.println("Recomendación: Es necesario seguir evaluación continua.");
    } else {
    System.out.println("Recomendación: Realiza los ejercicios preparatorios para la PAF2.");
    }
    }
    
    System.out.println("Nota final: " + notaFinal);
    }
    }