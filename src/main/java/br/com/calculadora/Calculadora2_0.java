package br.com.calculadora;

import entities.Variaveis;

public class Calculadora2_0 {

	public double potencia(double base, double expoente) {
		Variaveis var = new Variaveis(base, expoente);
		return Math.pow(var.a, var.b);
	}
}
