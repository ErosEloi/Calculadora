package br.com.calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class CalculadoraTeste {

	
	
	//Teste para Soma
	@Test
	public void SomaTest() {
		Calculadora calculadora = new Calculadora();
		int a = 5;
		int b = 7;
		
		double resultadoEsperado = 12; //resultado esperado do metodo
		double resultadoReal = calculadora.soma(a, b);
		
		//Comparacao dos resultados
		assertEquals(resultadoEsperado, resultadoReal, 0.0001); 
		
	}
	
	//Teste para Subtracao
	@Test
	public void SubtracaoTest() {
		Calculadora calculadora = new Calculadora();
		double a = 5;
		double b = 7;
		
		double resultadoEsperado = 2;//resultado esperado do metodo
		double resultadoReal = calculadora.subtracao(a, b);
		
		//Comparacao dos resultados
		assertEquals(resultadoEsperado, resultadoReal, 0.001);
	}
	
	//Teste para multipicacao
	@Test
	public void multiplicacaoTest() {
		Calculadora calculadora = new Calculadora();
		double a = 5;
		double b = 7;
		
		double resultadoEsperado = 35;//resultado esperado do metodo
		double resultadoReal = calculadora.multiplicacao(a, b);
		
		//Comparacao dos resultados
		assertEquals(resultadoEsperado, resultadoReal, 0.001);
	}
	
	//Teste para Divisao
	@Test
	public void divisaoTeste() {
		Calculadora calculadora = new Calculadora();
		double a = 10;
		double b = 2;
		
		double resultadoEsperado = 5;//resultado esperado do metodo
		double resultadoReal = calculadora.divisao(a, b);
		
		//Comparacao dos resultados
		assertEquals(resultadoEsperado, resultadoReal, 0.001);
	}

}
