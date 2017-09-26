package br.com.db1.controller;

public class Calculadora {
	public Integer somar(Integer primeiroValor, Integer segundoValor) {
		return primeiroValor+segundoValor;
	}
	
	public Integer subtrair(Integer primeiroValor, Integer segundoValor) {
		return primeiroValor-segundoValor;
	}
	
	public Integer multiplicar(Integer primeiroValor, Integer segundoValor) {
		return primeiroValor*segundoValor;
	}
	
	public Integer dividir(Integer primeiroValor, Integer segundoValor) {
		return primeiroValor/segundoValor;
	}
}
