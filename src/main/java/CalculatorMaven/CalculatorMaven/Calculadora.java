package CalculatorMaven.CalculatorMaven;

public class Calculadora {
	private boolean estadoFuncionalidad[];
	
	public Calculadora() {
		estadoFuncionalidad = new boolean[10];
		estadoFuncionalidad[0] = false;
		estadoFuncionalidad[1] = false;
		estadoFuncionalidad[2] = false;
		estadoFuncionalidad[3] = false;
		estadoFuncionalidad[4] = false;
		estadoFuncionalidad[5] = false;
		estadoFuncionalidad[6] = false;
		estadoFuncionalidad[7] = false;
		estadoFuncionalidad[8] = false;
		estadoFuncionalidad[9] = false;		
	}
	
	public long suma(int a, int b) {
		//TODO desarrollar funcionalidad
		return 0;
	}

	public int resta(int a, int b) {
		//TODO desarrollar funcionalidad
		return 0;
	}
	
	public long multiplicacion(int a, int b) {
		//TODO desarrollar funcionalidad
		return 0;
	}
	
	public double division(int a, int b) {
		//TODO desarrollar funcionalidad
		return (b!=0)?(a/b):0;
		
	}
	
	public int modulo(int a, int b) {
		//TODO desarrollar funcionalidad
		return 0;
	}
	
	public long exponente(int a, int b) {
		//TODO desarrollar funcionalidad		
		return 0;
	}
	
	public long factorial(int a) {
		//TODO desarrollar funcionalidad
		return 0;
	}
	
	public boolean esPrimo(int a) {
		//TODO desarrollar funcionalidad
		return false;
	}
	
	public boolean esPar(int a) {
		//TODO desarrollar funcionalidad
		return false;
	}
	
	public boolean esImpar(int a) {
		//TODO desarrollar funcionalidad
		return false;
	}

	public boolean[] getEstadoFuncionalidad() {
		return estadoFuncionalidad;
	}

	public void setEstadoFuncionalidad(boolean[] estadoFuncionalidad) {
		this.estadoFuncionalidad = estadoFuncionalidad;
	}
	
	
}
