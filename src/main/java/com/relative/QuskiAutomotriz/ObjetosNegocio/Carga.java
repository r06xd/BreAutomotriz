package com.relative.QuskiAutomotriz.ObjetosNegocio;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Carga implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("XmlDatosCliente")
	private com.relative.QuskiAutomotriz.ObjetosNegocio.XmlDatosCliente xmlDatosCliente;

	@org.kie.api.definition.type.Label("XmlDatosOperacion")
	private com.relative.QuskiAutomotriz.ObjetosNegocio.XmlDatosOperacion xmlDatosOperacion;

	public Carga() {
	}

	public com.relative.QuskiAutomotriz.ObjetosNegocio.XmlDatosCliente getXmlDatosCliente() {
		return this.xmlDatosCliente;
	}

	public void setXmlDatosCliente(
			com.relative.QuskiAutomotriz.ObjetosNegocio.XmlDatosCliente xmlDatosCliente) {
		this.xmlDatosCliente = xmlDatosCliente;
	}

	public com.relative.QuskiAutomotriz.ObjetosNegocio.XmlDatosOperacion getXmlDatosOperacion() {
		return this.xmlDatosOperacion;
	}

	public void setXmlDatosOperacion(
			com.relative.QuskiAutomotriz.ObjetosNegocio.XmlDatosOperacion xmlDatosOperacion) {
		this.xmlDatosOperacion = xmlDatosOperacion;
	}

	public Carga(
			com.relative.QuskiAutomotriz.ObjetosNegocio.XmlDatosCliente xmlDatosCliente,
			com.relative.QuskiAutomotriz.ObjetosNegocio.XmlDatosOperacion xmlDatosOperacion) {
		this.xmlDatosCliente = xmlDatosCliente;
		this.xmlDatosOperacion = xmlDatosOperacion;
	}

}