package CalculatorMaven.CalculatorMaven;

public class Calculadora {
	private boolean estadoFuncionalidad[];
	
	public Calculadora() {
		estadoFuncionalidad = new boolean[10];
		estadoFuncionalidad[0] = false;
		estadoFuncionalidad[1] = true;
		estadoFuncionalidad[2] = true;
		estadoFuncionalidad[3] = true;
		estadoFuncionalidad[4] = false;
		estadoFuncionalidad[5] = false;
		estadoFuncionalidad[6] = true;
		estadoFuncionalidad[7] = false;
		estadoFuncionalidad[8] = false;
		estadoFuncionalidad[9] = false;		
	}
	
	public long suma(int a, int b) {
		//TODO desarrollar funcionalidad
		return 0;
	}

	public int resta(int a, int b) {
		return (a-b);
	}
	
	public long multiplicacion(int a, int b) {
		//TODO desarrollar funcionalidad
		return a*b;
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
		int r=1;
		for(int i=1;i<=a;i++) {
			r*=i;
		}
		return r;
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
