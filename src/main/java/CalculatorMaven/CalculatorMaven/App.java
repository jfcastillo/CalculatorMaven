package CalculatorMaven.CalculatorMaven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
	public static void main(String[] args) {
		System.out.println("Calculadora ICESI");
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		boolean continuar = true;
		Calculadora calculadora = new Calculadora();
		do {
			try {

				System.out.println("Que operación desea realizar?");
				System.out.println("1. Suma");
				System.out.println("2. Resta");
				System.out.println("3. Multiplicación");
				System.out.println("4. División");
				System.out.println("5. Modulo");
				System.out.println("6. Exponente");
				System.out.println("7. Factorial");
				System.out.println("8. Es Primo");
				System.out.println("9. Es Par");
				System.out.println("10. Es Impar");
				System.out.println("11. Salir");

				int opcion = Integer.parseInt(lector.readLine());
				switch (opcion) {
				case 1:
					if (calculadora.getEstadoFuncionalidad()[0]) {
						System.out.println("Digite el primero número a sumar");
						int a1 = Integer.parseInt(lector.readLine());
						System.out.println("Digite el segundo número a sumar");
						int b1 = Integer.parseInt(lector.readLine());

						long resultado1 = calculadora.suma(a1, b1);
						System.out.println("Resultado: " + resultado1);

					} else {
						System.out.println("Funcionalidad no implementada");
					}
					break;
				case 2:
					if (calculadora.getEstadoFuncionalidad()[1]) {
						System.out.println("Digite el minuendo");
						int a2 = Integer.parseInt(lector.readLine());
						System.out.println("Digite el sustraendo");
						int b2 = Integer.parseInt(lector.readLine());

						int resultado2 = calculadora.resta(a2, b2);
						System.out.println("Resultado: " + resultado2);
					} else {
						System.out.println("Funcionalidad no implementada");
					}
					break;
				case 3:
					if (calculadora.getEstadoFuncionalidad()[2]) {
						System.out.println("Digite el primer número a multiplicar");
						int a3 = Integer.parseInt(lector.readLine());
						System.out.println("Digite el segundo número a multiplicar");
						int b3 = Integer.parseInt(lector.readLine());

						long resultado3 = calculadora.multiplicacion(a3, b3);
						System.out.println("Resultado: " + resultado3);
					} else {
						System.out.println("Funcionalidad no implementada");
					}
					break;
				case 4:
					if (calculadora.getEstadoFuncionalidad()[3]) {
						System.out.println("Digite el dividendo");
						int a4 = Integer.parseInt(lector.readLine());
						System.out.println("Digite el divisor");
						int b4 = Integer.parseInt(lector.readLine());

						double resultado4 = calculadora.division(a4, b4);
						System.out.println("Resultado: " + resultado4);
					} else {
						System.out.println("Funcionalidad no implementada");
					}
					break;
				case 5:
					if (calculadora.getEstadoFuncionalidad()[4]) {
						System.out.println("Digite el dividendo");
						int a5 = Integer.parseInt(lector.readLine());
						System.out.println("Digite el divisor");
						int b5 = Integer.parseInt(lector.readLine());

						int resultado5 = calculadora.modulo(a5, b5);
						System.out.println("Resultado: " + resultado5);
					} else {
						System.out.println("Funcionalidad no implementada");
					}
					break;
				case 6:
					if (calculadora.getEstadoFuncionalidad()[5]) {
						System.out.println("Digite la base");
						int a6 = Integer.parseInt(lector.readLine());
						System.out.println("Digite el exponente");
						int b6 = Integer.parseInt(lector.readLine());

						long resultado6 = calculadora.exponente(a6, b6);
						System.out.println("Resultado: " + resultado6);
					} else {
						System.out.println("Funcionalidad no implementada");
					}
					break;
				case 7:
					if (calculadora.getEstadoFuncionalidad()[6]) {
						System.out.println("Digite número a calcular factorial");
						int a7 = Integer.parseInt(lector.readLine());
						long resultado7 = calculadora.factorial(a7);
						System.out.println("Resultado: " + resultado7);
					} else {
						System.out.println("Funcionalidad no implementada");
					}
					break;
				case 8:
					if (calculadora.getEstadoFuncionalidad()[7]) {
						System.out.println("Digite número para validar si es primo");
						int a8 = Integer.parseInt(lector.readLine());
						boolean resultado8 = calculadora.esPrimo(a8);
						System.out.println("Resultado: " + resultado8);
					} else {
						System.out.println("Funcionalidad no implementada");
					}
					break;
				case 9:
					if (calculadora.getEstadoFuncionalidad()[8]) {
						System.out.println("Digite número para validar si es par");
						int a9 = Integer.parseInt(lector.readLine());
						boolean resultado9 = calculadora.esPar(a9);
						System.out.println("Resultado: " + resultado9);
					} else {
						System.out.println("Funcionalidad no implementada");
					}
					break;
				case 10:
					if (calculadora.getEstadoFuncionalidad()[9]) {
						System.out.println("Digite número para validar si es impar");
						int a10 = Integer.parseInt(lector.readLine());
						boolean resultado10 = calculadora.esImpar(a10);
						System.out.println("Resultado: " + resultado10);
					} else {
						System.out.println("Funcionalidad no implementada");
					}
					break;
				case 11:
					continuar = false;
					break;

				default:
					System.out.println("Por favor digite una opción valida. Un número entre 1 y 11");
					break;
				}

			} catch (NumberFormatException e) {
				System.out.println("Por favor digite un número entero");
			} catch (IOException e) {
				e.printStackTrace();
			}

		} while (continuar);

		System.out.println("Bye");

	}
}
