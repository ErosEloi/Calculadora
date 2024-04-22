package br.com.calculadora;

import entities.Variaveis;

public class Calculadora {

	// soma
	public double soma(double a, double b) {
		Variaveis var = new Variaveis(a, b);
		return var.a + var.b;
	}

	// subtracao
	public double subtracao(double a, double b) {
		Variaveis var = new Variaveis(a, b);
		return Math.abs(var.a - var.b);
	}

	// divisao
	public double divisao(double a, double b) {
		Variaveis var = new Variaveis(a, b);
		if (b == 0) {
			System.out.println("Divisao por zero nao e permitida");
		}
		return var.a / var.b;

	}

	// multiplicacao
	public double multiplicacao(double a, double b) {
		Variaveis var = new Variaveis(a, b);
		return var.a * var.b;
	}

}
