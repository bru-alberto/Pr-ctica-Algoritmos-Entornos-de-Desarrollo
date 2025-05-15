package paquete;

public class Principal {

	public static void main(String[] args) {
		
        int[] numeros = new int[3];
        int[] resultadoFibonacci = new int[3];
        long[] resultadoFactorial = new long[3];
        boolean[] resultadoPrimos = new boolean[3];

        Algoritmos algoritmos = new Algoritmos() {}; // Instancia de Algoritmos

        // 1. Crear array "numeros" con 3 números aleatorios del 2 al 10 (sin Random)
        for (int i = 0; i < numeros.length; i++) {
            int numero;
            do {
                numero = (int) (Math.random() * 9) + 2; // Números entre 2 y 10
                // Simple check for duplicates (not very efficient, but simple for 3 elements)
                boolean repetido = false;
                for (int j = 0; j < i; j++) {
                    if (numeros[j] == numero) {
                        repetido = true;
                        break;
                    }
                }
                if (!repetido) {
                    break;
                }
            } while (true);
            numeros[i] = numero;
        }

        // 2. Calcular Fibonacci
        for (int i = 0; i < numeros.length; i++) {
            resultadoFibonacci[i] = algoritmos.fibonacci(numeros[i]);
        }

        // 3. Calcular Factorial
        for (int i = 0; i < numeros.length; i++) {
            resultadoFactorial[i] = algoritmos.factorial(numeros[i]);
        }

        // 4. Comprobar Primos
        for (int i = 0; i < numeros.length; i++) {
            resultadoPrimos[i] = algoritmos.primo(numeros[i]);
        }

         System.out.println("Hola");

	}

}
