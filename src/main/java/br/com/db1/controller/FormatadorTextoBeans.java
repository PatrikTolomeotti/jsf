package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class FormatadorTextoBeans {
	private String texto;
	private Integer opcoes;
	private String resultado;

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Integer getOpcoes() {
		return opcoes;
	}

	public void setOpcoes(Integer opcoes) {
		this.opcoes = opcoes;
	}
	
	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public void formatar() {
		FormatadorTexto formatador = new FormatadorTexto();
		switch(opcoes) {
		case 0:
			setResultado(formatador.maiusculo(texto));
		break;
		case 1:
			setResultado(formatador.minusculo(texto));
		break;
		default:
			throw new RuntimeException("Formatador não suportado");
		}
	}
}
