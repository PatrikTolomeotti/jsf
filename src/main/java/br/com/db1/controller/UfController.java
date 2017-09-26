package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class UfController {
	private Uf uf;
	private Sexo sexo;

	public Uf[] getListaUf() {
		return uf.values();
	}
	
	public Uf getUf() {
		return uf;
	}
	
	public Sexo[] getListaSexo() {
		return sexo.values();
	}
	
	public Sexo getSexo() {
		return sexo;
	}
}
