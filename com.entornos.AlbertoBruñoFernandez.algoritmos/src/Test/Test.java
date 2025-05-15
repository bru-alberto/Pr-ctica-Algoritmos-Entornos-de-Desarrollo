package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import paquete.Algoritmos;

class Test {

    @Test
    void testFibonacciCero() {
        Algoritmos algoritmos = new Algoritmos() {};
        int valorEsperado = 0;
        int valorObtenido = algoritmos.fibonacci(0);
        assertEquals(valorEsperado, valorObtenido);
    }

    @Test
    void testFibonacciUno() {
        Algoritmos algoritmos = new Algoritmos() {};
        int valorEsperado = 1;
        int valorObtenido = algoritmos.fibonacci(1);
        assertEquals(valorEsperado, valorObtenido);
    }

    @Test
    void testFibonacciCinco() {
        Algoritmos algoritmos = new Algoritmos() {};
        int valorEsperado = 5;
        int valorObtenido = algoritmos.fibonacci(5);
        assertEquals(valorEsperado, valorObtenido);
    }

    @Test
    void testFactorialCero() {
        Algoritmos algoritmos = new Algoritmos() {};
        long valorEsperado = 1;
        long valorObtenido = algoritmos.factorial(0);
        assertEquals(valorEsperado, valorObtenido);
    }

    @Test
    void testFactorialUno() {
        Algoritmos algoritmos = new Algoritmos() {};
        long valorEsperado = 1;
        long valorObtenido = algoritmos.factorial(1);
        assertEquals(valorEsperado, valorObtenido);
    }

    @Test
    void testFactorialTres() {
        Algoritmos algoritmos = new Algoritmos() {};
        long valorEsperado = 6;
        long valorObtenido = algoritmos.factorial(3);
        assertEquals(valorEsperado, valorObtenido);
    }

    @Test
    void testPrimoCuatro() {
        Algoritmos algoritmos = new Algoritmos() {};
        boolean valorEsperado = false;
        boolean valorObtenido = algoritmos.primo(4);
        assertEquals(valorEsperado, valorObtenido);
    }

    @Test
    void testPrimoCinco() {
        Algoritmos algoritmos = new Algoritmos() {};
        boolean valorEsperado = true;
        boolean valorObtenido = algoritmos.primo(5);
        assertEquals(valorEsperado, valorObtenido);
    }

    @Test
    void testPrimoOnce() {
        Algoritmos algoritmos = new Algoritmos() {};
        boolean valorEsperado = true;
        boolean valorObtenido = algoritmos.primo(11);
        assertEquals(valorEsperado, valorObtenido);
    }

    @Test
    void testFibonacciExcepcion() {
        Algoritmos algoritmos = new Algoritmos() {};
        assertThrows(IllegalArgumentException.class, () -> algoritmos.fibonacci(-1));
    }

    @Test
    void testFactorialExcepcion() {
        Algoritmos algoritmos = new Algoritmos() {};
        assertThrows(IllegalArgumentException.class, () -> algoritmos.factorial(-1));
    }

    @Test
    void testPrimoExcepcion() {
        Algoritmos algoritmos = new Algoritmos() {};
        assertThrows(IllegalArgumentException.class, () -> algoritmos.primo(1));
	}

}
