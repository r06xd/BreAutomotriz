package com.relative.QuskiAutomotriz.ObjetosNegocio;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Resultado implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Id")
	private java.lang.String id;
	@org.kie.api.definition.type.Label("Valor")
	private java.lang.String valor;

	public Resultado() {
	}

	public java.lang.String getId() {
		return this.id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public java.lang.String getValor() {
		return this.valor;
	}

	public void setValor(java.lang.String valor) {
		this.valor = valor;
	}

	public Resultado(java.lang.String id,
			java.lang.String valor) {
		this.id = id;
		this.valor = valor;
	}

}