package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class FormatadorReais {
	private Double reais;
	private Double resultado;

	public Double getReais() {
		return reais;
	}

	public void setReais(Double reais) {
		this.reais = reais;
	}
	
	public void formatar() {
		setReais(resultado);
	}
}
