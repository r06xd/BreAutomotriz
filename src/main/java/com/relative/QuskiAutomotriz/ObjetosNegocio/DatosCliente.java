package com.relative.QuskiAutomotriz.ObjetosNegocio;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class DatosCliente implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("IdentificacionCliente")
	private java.lang.String identificacionCliente;

	@org.kie.api.definition.type.Label("FechaNacimiento")
	private java.lang.String fechaNacimiento;

	@org.kie.api.definition.type.Label("ScoreDeudor")
	private java.lang.Integer scoreDeudor;

	@org.kie.api.definition.type.Label("ActividadEconomica")
	private java.lang.String actividadEconomica;

	@org.kie.api.definition.type.Label("TotalPatrimonio")
	private java.lang.Double totalPatrimonio;

	@org.kie.api.definition.type.Label("NumeroDeudas")
	private java.lang.Integer numeroDeudas;

	@org.kie.api.definition.type.Label("TotalDeudas")
	private java.lang.Double totalDeudas;

	@org.kie.api.definition.type.Label("TotalIngresos")
	private java.lang.Double totalIngresos;

	@org.kie.api.definition.type.Label("IngresosNetos")
	private java.lang.Double ingresosNetos;

	@org.kie.api.definition.type.Label("LiquidezBruta")
	private java.lang.Double liquidezBruta;

	@org.kie.api.definition.type.Label("LiquidezNeta")
	private java.lang.Double liquidezNeta;

	@org.kie.api.definition.type.Label("CarteraCastigada")
	private java.lang.Double carteraCastigada;

	@org.kie.api.definition.type.Label("DemandaJudicial")
	private java.lang.Double demandaJudicial;

	@org.kie.api.definition.type.Label("CVencida60D")
	private java.lang.Double cVencida60D;

	@org.kie.api.definition.type.Label("CVencida90D")
	private java.lang.Double cVencida90D;

	public DatosCliente() {
	}

	public java.lang.String getIdentificacionCliente() {
		return this.identificacionCliente;
	}

	public void setIdentificacionCliente(java.lang.String identificacionCliente) {
		this.identificacionCliente = identificacionCliente;
	}

	public java.lang.String getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(java.lang.String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public java.lang.Integer getScoreDeudor() {
		return this.scoreDeudor;
	}

	public void setScoreDeudor(java.lang.Integer scoreDeudor) {
		this.scoreDeudor = scoreDeudor;
	}

	public java.lang.String getActividadEconomica() {
		return this.actividadEconomica;
	}

	public void setActividadEconomica(java.lang.String actividadEconomica) {
		this.actividadEconomica = actividadEconomica;
	}

	public java.lang.Double getTotalPatrimonio() {
		return this.totalPatrimonio;
	}

	public void setTotalPatrimonio(java.lang.Double totalPatrimonio) {
		this.totalPatrimonio = totalPatrimonio;
	}

	public java.lang.Integer getNumeroDeudas() {
		return this.numeroDeudas;
	}

	public void setNumeroDeudas(java.lang.Integer numeroDeudas) {
		this.numeroDeudas = numeroDeudas;
	}

	public java.lang.Double getTotalDeudas() {
		return this.totalDeudas;
	}

	public void setTotalDeudas(java.lang.Double totalDeudas) {
		this.totalDeudas = totalDeudas;
	}

	public java.lang.Double getTotalIngresos() {
		return this.totalIngresos;
	}

	public void setTotalIngresos(java.lang.Double totalIngresos) {
		this.totalIngresos = totalIngresos;
	}

	public java.lang.Double getIngresosNetos() {
		return this.ingresosNetos;
	}

	public void setIngresosNetos(java.lang.Double ingresosNetos) {
		this.ingresosNetos = ingresosNetos;
	}

	public java.lang.Double getLiquidezBruta() {
		return this.liquidezBruta;
	}

	public void setLiquidezBruta(java.lang.Double liquidezBruta) {
		this.liquidezBruta = liquidezBruta;
	}

	public java.lang.Double getLiquidezNeta() {
		return this.liquidezNeta;
	}

	public void setLiquidezNeta(java.lang.Double liquidezNeta) {
		this.liquidezNeta = liquidezNeta;
	}

	public java.lang.Double getCarteraCastigada() {
		return this.carteraCastigada;
	}

	public void setCarteraCastigada(java.lang.Double carteraCastigada) {
		this.carteraCastigada = carteraCastigada;
	}

	public java.lang.Double getDemandaJudicial() {
		return this.demandaJudicial;
	}

	public void setDemandaJudicial(java.lang.Double demandaJudicial) {
		this.demandaJudicial = demandaJudicial;
	}

	public java.lang.Double getcVencida60D() {
		return this.cVencida60D;
	}

	public void setcVencida60D(java.lang.Double cVencida60D) {
		this.cVencida60D = cVencida60D;
	}

	public java.lang.Double getcVencida90D() {
		return this.cVencida90D;
	}

	public void setcVencida90D(java.lang.Double cVencida90D) {
		this.cVencida90D = cVencida90D;
	}

	public DatosCliente(java.lang.String identificacionCliente,
			java.lang.String fechaNacimiento, java.lang.Integer scoreDeudor,
			java.lang.String actividadEconomica,
			java.lang.Double totalPatrimonio, java.lang.Integer numeroDeudas,
			java.lang.Double totalDeudas,
			java.lang.Double totalIngresos,
			java.lang.Double ingresosNetos, java.lang.Double liquidezBruta,
			java.lang.Double liquidezNeta, java.lang.Double carteraCastigada,
			java.lang.Double demandaJudicial, java.lang.Double cVencida60D,
			java.lang.Double cVencida90D) {
		this.identificacionCliente = identificacionCliente;
		this.fechaNacimiento = fechaNacimiento;
		this.scoreDeudor = scoreDeudor;
		this.actividadEconomica = actividadEconomica;
		this.totalPatrimonio = totalPatrimonio;
		this.numeroDeudas = numeroDeudas;
		this.totalDeudas = totalDeudas;
		this.totalIngresos = totalIngresos;
		this.ingresosNetos = ingresosNetos;
		this.liquidezBruta = liquidezBruta;
		this.liquidezNeta = liquidezNeta;
		this.carteraCastigada = carteraCastigada;
		this.demandaJudicial = demandaJudicial;
		this.cVencida60D = cVencida60D;
		this.cVencida90D = cVencida90D;
	}

}