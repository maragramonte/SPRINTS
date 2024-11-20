public class SaludMarta {
    public static void main(String[] args) {
        // Definir e inicializar las variables
        double temperatura = 39.5;  // Temperatura del niño (en grados Celsius)
        int edad = 5;  // Edad del niño (en años)
        double peso = 20.0;  // Peso del niño (en kilos)
        double dosisParacetamol;  // Dosis recomendada de paracetamol

        // Comprobación de la temperatura y acción a tomar
        if (temperatura < 38) {
            // Si la temperatura es menor de 38 grados
            System.out.println("El niño está bien");
        } else if (temperatura < 39) {
            // Si la temperatura es menor que 39 grados
            System.out.println("Es recomendable darle un baño para bajar temperatura");
        } else {
            // Si la temperatura es mayor o igual a 39 grados
            if (edad < 3) {
                // Si la edad es menor de 3 años
                System.out.println("Tienes que consultar al médico");
            } else if (edad < 12) {
                // Si la edad es menor de 12 años
                dosisParacetamol = 15 * peso;  // Dosis de paracetamol: 15 mg por cada kilo de peso
                System.out.println("Dosis de Paracetamol: " + dosisParacetamol + " mg cada 8 horas");
            } else {
                // Si la edad es mayor o igual a 12 años
                dosisParacetamol = 500;  // Dosis fija de paracetamol: 500 mg
                System.out.println("Dosis de Paracetamol: " + dosisParacetamol + " mg cada 8 horas");
            }

            // Verificar si la temperatura es mayor o igual a 40 grados
            if (temperatura >= 40) {
                System.out.println("Aviso: Para más de 40 es necesario llevarlo al hospital");
            }
        }
    }
}
