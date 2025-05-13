package paquete;

public class Principal {

	public static void main(String[] args) {
		
			Algoritmos A1 = new Algoritmos() {};
			// Creamos array
			int numeros[] = new int[3];
			//int num = 0;
			
			//Damos valores aleatorios.
			for(int i = 0; i < numeros.length; i++) {
				numeros[i] = (int)(Math.random()*(10 - 2 + 1)+2);
			}
			
			//Creamos array donde se guardaran los numeros de fibonacci
			int resultadoFibonacci[] = new int[numeros.length];
			
			//Calcular numero de fibonacci
			for(int i = 0; i < numeros.length; i++) {
				resultadoFibonacci[i] = A1.fibonacci(numeros[i]);
			}
			
			
			
			//Creamos array donde se guardaran los numeros de factorial
			int resultadoFactorial[] = new int[numeros.length];
			
			//Calcular factorial
			for(int i = 0; i < numeros.length; i++) {
				resultadoFactorial[i] = A1.factorial(numeros[i]);
			}
			
			
			
			//Creamos array donde se guardaran los numeros de factorial
			boolean resultadoPrimo[] = new boolean[numeros.length];
			
			//Identificar primos
			for(int i = 0; i < numeros.length; i++) {
				resultadoPrimo[i] = A1.primo(numeros[i]);
			}
			
			System.out.println("Fin de test");

	}

}
