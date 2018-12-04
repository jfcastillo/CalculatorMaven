package CalculatorMaven.CalculatorMaven;

public class Calculadora {
	private boolean estadoFuncionalidad[];
	
	public Calculadora() {
		estadoFuncionalidad = new boolean[10];
		estadoFuncionalidad[0] = true;
		estadoFuncionalidad[1] = true;
		estadoFuncionalidad[2] = true;
		estadoFuncionalidad[3] = true;
		estadoFuncionalidad[4] = true;
		estadoFuncionalidad[5] = true;
		estadoFuncionalidad[6] = true;
		estadoFuncionalidad[7] = true;
		estadoFuncionalidad[8] = true;
		estadoFuncionalidad[9] = true;		
	}
	
	public long suma(int a, int b) {
		//TODO desarrollar funcionalidad
		return a+b;
	}

	public int resta(int a, int b) {
		//TODO desarrollar funcionalidad
		return a-b;
	}
	
	public long multiplicacion(int a, int b) {
		//TODO desarrollar funcionalidad
		return a*b;
	}
	
	public double division(int a, int b) {
		//TODO desarrollar funcionalidad
		return a/b;
	}
	
	public int modulo(int a, int b) {
		//TODO desarrollar funcionalidad
		return a % b;
	}
	
	public long exponente(int a, int b) {
		//TODO desarrollar funcionalidad		
		return (long) Math.pow(a, b);
	}
	
	public long factorial(int a) {
		//TODO desarrollar funcionalidad
		if(a == 0) {
			return 1;
		}
		
		int result = 1;
		for (int i = 2; i <= a; i++) {
			result *= i;
		}
		return result;
	}
	
	public boolean esPrimo(int a) {
		//TODO desarrollar funcionalidad
		if(a == 1 || a == 2) {
			return true;
		}
		
		if(a % 2 == 0) {
			return false;
		}			
		
		for (int i = 2; i < a; i++) {
			if(a % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public boolean esPar(int a) {
		//TODO desarrollar funcionalidad
		return a % 2 == 0;
	}
	
	public boolean esImpar(int a) {
		//TODO desarrollar funcionalidad
		return a % 2 == 1;
	}

	public boolean[] getEstadoFuncionalidad() {
		return estadoFuncionalidad;
	}

	public void setEstadoFuncionalidad(boolean[] estadoFuncionalidad) {
		this.estadoFuncionalidad = estadoFuncionalidad;
	}
	
	
}
