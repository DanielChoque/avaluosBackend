package com.html.avaluos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ava_TerrainTechnicalCalculation {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "terrainTechnicalCalculationId", nullable = false, updatable = false)
    private long terrainTechnicalCalculationId;
	private double superficieM2;
	private double valorInicialM2;
	private double valorInicialTotal;
	private double coefUsoTerreno;
	private double coefGeotecniaLote;
	private double coefViasAcceso;
	private double coefServiciosZona;
	private double coefComercializacion;
	private double coefTotal;
	private double valorFinalTerreno;
	public Ava_TerrainTechnicalCalculation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getTerrainTechnicalCalculationId() {
		return terrainTechnicalCalculationId;
	}
	public void setTerrainTechnicalCalculationId(long terrainTechnicalCalculationId) {
		this.terrainTechnicalCalculationId = terrainTechnicalCalculationId;
	}
	public double getSuperficieM2() {
		return superficieM2;
	}
	public void setSuperficieM2(double superficieM2) {
		this.superficieM2 = superficieM2;
	}
	public double getValorInicialM2() {
		return valorInicialM2;
	}
	public void setValorInicialM2(double valorInicialM2) {
		this.valorInicialM2 = valorInicialM2;
	}
	public double getValorInicialTotal() {
		return valorInicialTotal;
	}
	public void setValorInicialTotal(double valorInicialTotal) {
		this.valorInicialTotal = valorInicialTotal;
	}
	public double getCoefUsoTerreno() {
		return coefUsoTerreno;
	}
	public void setCoefUsoTerreno(double coefUsoTerreno) {
		this.coefUsoTerreno = coefUsoTerreno;
	}
	public double getCoefGeotecniaLote() {
		return coefGeotecniaLote;
	}
	public void setCoefGeotecniaLote(double coefGeotecniaLote) {
		this.coefGeotecniaLote = coefGeotecniaLote;
	}
	public double getCoefViasAcceso() {
		return coefViasAcceso;
	}
	public void setCoefViasAcceso(double coefViasAcceso) {
		this.coefViasAcceso = coefViasAcceso;
	}
	public double getCoefServiciosZona() {
		return coefServiciosZona;
	}
	public void setCoefServiciosZona(double coefServiciosZona) {
		this.coefServiciosZona = coefServiciosZona;
	}
	public double getCoefComercializacion() {
		return coefComercializacion;
	}
	public void setCoefComercializacion(double coefComercializacion) {
		this.coefComercializacion = coefComercializacion;
	}
	public double getCoefTotal() {
		return coefTotal;
	}
	public void setCoefTotal(double coefTotal) {
		this.coefTotal = coefTotal;
	}
	public double getValorFinalTerreno() {
		return valorFinalTerreno;
	}
	public void setValorFinalTerreno(double valorFinalTerreno) {
		this.valorFinalTerreno = valorFinalTerreno;
	}
	@Override
	public String toString() {
		return "Ava_TerrainTechnicalCalculation [terrainTechnicalCalculationId=" + terrainTechnicalCalculationId
				+ ", superficieM2=" + superficieM2 + ", valorInicialM2=" + valorInicialM2 + ", valorInicialTotal="
				+ valorInicialTotal + ", coefUsoTerreno=" + coefUsoTerreno + ", coefGeotecniaLote=" + coefGeotecniaLote
				+ ", coefViasAcceso=" + coefViasAcceso + ", coefServiciosZona=" + coefServiciosZona
				+ ", coefComercializacion=" + coefComercializacion + ", coefTotal=" + coefTotal + ", valorFinalTerreno="
				+ valorFinalTerreno + "]";
	}
		
}
