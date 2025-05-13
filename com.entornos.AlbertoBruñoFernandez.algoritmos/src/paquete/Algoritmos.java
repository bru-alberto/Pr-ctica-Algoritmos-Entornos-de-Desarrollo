package paquete;

public abstract class  Algoritmos {
	/**
	 * Clase abstracta que contiene métodos para calcular Fibonacci, factorial y verificar si un número es primo.
	 */
	

	    /**
	     * Calcula el número de Fibonacci para un número dado.
	     *
	     * @param numero El número para el cual se calcula el Fibonacci.
	     * @return El número de Fibonacci correspondiente.
	     * @throws IllegalArgumentException Si el número es menor que 0.
	     */
	    public int fibonacci(int numero) {
	        if (numero < 0) {
	            throw new IllegalArgumentException("El número debe ser mayor o igual que 0");
	        }
	        if (numero <= 1) {
	            return numero;
	        }
	        int a = 0;
	        int b = 1;
	        for (int i = 2; i <= numero; i++) {
	            int temp = a + b;
	            a = b;
	            b = temp;
	        }
	        return b;
	    }

	    /**
	     * Calcula el factorial de un número dado.
	     *
	     * @param numero El número para el cual se calcula el factorial.
	     * @return El factorial del número.
	     * @throws IllegalArgumentException Si el número es menor que 0.
	     */
	    public int factorial(int numero) {
	        if (numero < 0) {
	            throw new IllegalArgumentException("El número debe ser mayor o igual que 0");
	        }
	        if (numero == 0) {
	            return 1;
	        }
	        int resultado = 1;
	        for (int i = 1; i <= numero; i++) {
	            resultado *= i;
	        }
	        return resultado;
	    }

	    /**
	     * Verifica si un número es primo.
	     *
	     * @param numero El número a verificar.
	     * @return true si el número es primo, false si no lo es.
	     * @throws IllegalArgumentException Si el número es menor que 2.
	     */
	    public boolean primo(int numero) {
	        if (numero < 2) {
	            throw new IllegalArgumentException("El número debe ser mayor o igual que 2");
	        }
	        for (int i = 2; i <= Math.sqrt(numero); i++) {
	            if (numero % i == 0) {
	                return false;
	            }
	        }
	        return true;
    }

	}

