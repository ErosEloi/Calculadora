package br.com.calculadora;

public class Calculadora {

	// soma
	public double soma(double a, double b) {
		return a + b;
	}

	// subtracao
	public double subtracao(double a, double b) {
		return Math.abs(a - b);
	}

	// divisao
	public double divisao(double a, double b) {
		if(b == 0) {
			throw new IllegalArgumentException("Divisao por zero nao e permitida");
		}
		return a / b;
		
	}

	// multiplicacao
	public double multiplicacao(double a, double b) {
		return a* b;
	}

}
