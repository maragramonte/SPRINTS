//Tenemos que diseñar ademas de implementar un programa para mostrar los multiples de un número.

import java.util.*;
public class MultiplesB{
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        // Solicitamos el número
        while (true) {
            System.out.println("Debe ingresar un numero (entre 1 & 20):");
            numero = scanner.nextInt();
            if (numero >= 1 && numero <= 20) {
                break; // Salir del bucle si el número es válido
            } else {
                System.out.println("Número inválido. Debe ser un entero entre 1 y 20.");
            }
        }

        // Mostrar los múltiplos de 'número' entre 0 y 100
        System.out.println("Los múltiplos de " + numero + " entre 0 y 100 son:");
        int i = 0;
        while (i <= 100) {
            System.out.println(i);
            i += numero; // Incrementar i en el valor de 'número'
        }

        scanner.close();
    }
}