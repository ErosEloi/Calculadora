package br.com.calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class Calculadora2_0Teste {

	// teste para potencia
	@Test
	public void potenciaTeste() {
		Calculadora2_0 calculadora = new Calculadora2_0();
		double a = 3;
		double b = 2;

		double resultadoEsperado = 9;// resultado esperado do metodo
		double resultadoReal = calculadora.potencia(a, b);

		// Comparacao dos resultados
		assertEquals(resultadoEsperado, resultadoReal, 0.001);
	}

}
