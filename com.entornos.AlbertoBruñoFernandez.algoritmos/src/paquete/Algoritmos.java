package paquete;

public class Algoritmos {
	 /**
     * Calcula el número de Fibonacci para un entero dado.
     *
     * @param numero El número entero para calcular su secuencia de Fibonacci. Debe ser >= 0.
     * @return El número de Fibonacci correspondiente.
     * @throws IllegalArgumentException si el número es negativo.
     */
    public static long fibonacci(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo para Fibonacci.");
        }
        if (numero == 0) {
            return 0;
        }
        if (numero == 1) {
            return 1;
        }

        long a = 0;
        long b = 1;
        long temp;

        for (int i = 2; i <= numero; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

}
