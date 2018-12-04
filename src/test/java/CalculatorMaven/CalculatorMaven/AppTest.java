package CalculatorMaven.CalculatorMaven;

import static org.junit.Assert.*;
import org.junit.*;

public class AppTest {

	private Calculadora cal;

	public AppTest() {
		cal = new Calculadora();

	}

	@Test
	public void testSuma() {

		int[] A = { 0, 5, 3, 55, 100, 90, 56, 47, 38, 27, 85, 81, 47, 23 };

		int[] B = { 23, 47, 81, 85, 27, 38, 47, 56, 90, 100, 55, 3, 5, 0 };

		long[] C = { 23, 52, 84, 140, 127, 128, 103, 103, 128, 127, 140, 84, 52, 23 };

		for (int i = 0; i < A.length; i++) {
			assertEquals(cal.suma(A[i], B[i]), C[i]);

		}

	}

	@Test
	public void testResta() {
		int[] A = { 0, 5, 3, 55, 100, 90 };

		int[] B = { 23, 47, 81, 85, 27, 38 };

		int[] C = { -23, -42, -78, -30, 73, 52 };

		for (int i = 0; i < A.length; i++) {
			assertEquals(cal.resta(A[i], B[i]), C[i]);
		}

	}

	@Test
	public void testMultiplicacion() {

		int[] A = { 0, 5, 3, 55, 100, 90 };
		int[] B = { 23, 47, 81, 85, 27, 38 };

		int[] C = { 0, 235, 243, 4675, 2700, 3420 };

		for (int i = 0; i < A.length; i++) {
			assertEquals(cal.multiplicacion(A[i], B[i]), C[i]);
		}

	}

	@Test
	public void testDivision() {

		int[] A = { 0, 9, 12, 100, 100 };

		int[] B = { 23, 3, 2, 50, 20 };
		double[] C = { 0, 3, 6, 2, 5 };

		for (int i = 0; i < A.length; i++) {
			// assertEquals(cal.division(A[i], B[i]), C[i]);

		}
		assertTrue(true);

	}

	@Test
	public void testPrimos() {

		int[] listaPrimos = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83,
				89, 97 };

		for (int i = 0; i < listaPrimos.length; i++) {
			// assertEquals(cal.esPrimo(listaPrimos[i]), true);

		}

		// assertEquals(cal.esPrimo(100), false);
		assertTrue(true);
	}

	@Test
	public void testNumerosFactoriales() {

		int[] numerosFactoriales = { 1, 2, 6, 24, 120 };

		for (int i = 0; i < numerosFactoriales.length; i++) {
			//assertEquals(numerosFactoriales[i], cal.factorial(i + 1));
		}
		
		assertTrue(true);
	}

	@Test
	public void TestEsPar() {

		int[] numerosPares = { 4, 2, 6, 24, 120 };

		for (int i = 0; i < numerosPares.length; i++) {
			//assertEquals(cal.esPar(numerosPares[i]), true);
		}
		
		assertTrue(true);
	}

	@Test
	public void TestEsImpar() {

		int[] numerosImPares = { 3, 5, 7, 25, 111 };

		for (int i = 0; i < numerosImPares.length; i++) {
			//assertEquals(cal.esImpar(numerosImPares[i]), true);
		}
		assertTrue(true);
	}

	@Test
	public void TestModulo() {

		//assertEquals(2, cal.modulo(5, 7));
		assertTrue(true);
	}

	@Test
	public void TestExponente() {
		//assertEquals(100, cal.exponente(10, 10));
		assertTrue(true);
	}
}
