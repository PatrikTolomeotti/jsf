package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ExercicioXHTML {
	
	private Integer primeiroValor;
	private Integer segundoValor;
	
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

	public void Calcular(){
		// https://www.youtube.com/watch?v=4jgmSts9OFU
	}
	
}
