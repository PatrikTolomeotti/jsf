package br.com.db1.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CalculadoraBeans {
	private Integer primeiroValor;
	private Integer segundoValor;
	private Integer resultado;
	private Integer operador;

	public CalculadoraBeans() {

	}

	public Integer getPrimeiroValor() {
		return primeiroValor;
	}

	public void setPrimeiroValor(Integer primeiroValor) {
		this.primeiroValor = primeiroValor;
	}

	public Integer getSegundoValor() {
		return segundoValor;
	}

	public void setSegundoValor(Integer segundoValor) {
		this.segundoValor = segundoValor;
	}

	public Integer getResultado() {
		return resultado;
	}

	public void setResultado(Integer resultado) {
		this.resultado = resultado;
	}

	public Integer getOperador() {
		return operador;
	}

	public void setOperador(Integer operador) {
		this.operador = operador;
	}

	public void calcular() {
		Calculadora calculadora = new Calculadora();
		switch (operador) {
		case 0:
			setResultado(calculadora.somar(primeiroValor, segundoValor));
			break;
		case 1:
			setResultado(calculadora.subtrair(primeiroValor, segundoValor));
			break;
		case 2:
			setResultado(calculadora.multiplicar(primeiroValor, segundoValor));
			break;
		case 3:
			setResultado(calculadora.dividir(primeiroValor, segundoValor));
			break;
		default:
			throw new RuntimeException("Esse operador não é suportado");
		}
	}
}
