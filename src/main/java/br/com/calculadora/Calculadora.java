package br.com.calculadora;

public class Calculadora {

	public double soma(double a, double b) {
		double resultado = a + b;
		return resultado;
	}
	
	public double subtracao(double a, double b) {
		double resultado = a - b;
		return Math.abs(resultado);
	}
	
	public double divisao(double a, double b) {
		double resultado = a / b;
		return resultado;
	}
	
	public double multiplicacao(double a, double b) {
		double resultado = a * b;
		return resultado;
	}
	
}
