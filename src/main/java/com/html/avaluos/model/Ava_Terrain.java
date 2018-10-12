package com.html.avaluos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Ava_Terrain {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "terrainId", nullable = false, updatable = false)
    private long terrainId;
	@OneToOne
	private Ava_Ubication ubication;
	private double superficieTestimonioMt2;
	private double superficieLevantamientoMt2;
	private double frenteMt;
	private double fondoMt;
	private String forma;
	private String topografia;
	private String usoSueloUrabano;
	private String usoZona;
	private String resistenciaSuelo;
	private double anchoViaMt;
	private String materialVia;
	private String aceraPeatonal;
	private String transporte;
	private String tipoVia;
	private String colindanciaNorte;
	private String colindanciaEste;
	private String colindanciaOeste;
	private String colindanciaSur;
	public Ava_Terrain() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getTerrainId() {
		return terrainId;
	}
	public void setTerrainId(long terrainId) {
		this.terrainId = terrainId;
	}
	public Ava_Ubication getUbication() {
		return ubication;
	}
	public void setUbication(Ava_Ubication ubication) {
		this.ubication = ubication;
	}
	public double getSuperficieTestimonioMt2() {
		return superficieTestimonioMt2;
	}
	public void setSuperficieTestimonioMt2(double superficieTestimonioMt2) {
		this.superficieTestimonioMt2 = superficieTestimonioMt2;
	}
	public double getSuperficieLevantamientoMt2() {
		return superficieLevantamientoMt2;
	}
	public void setSuperficieLevantamientoMt2(double superficieLevantamientoMt2) {
		this.superficieLevantamientoMt2 = superficieLevantamientoMt2;
	}
	public double getFrenteMt() {
		return frenteMt;
	}
	public void setFrenteMt(double frenteMt) {
		this.frenteMt = frenteMt;
	}
	public double getFondoMt() {
		return fondoMt;
	}
	public void setFondoMt(double fondoMt) {
		this.fondoMt = fondoMt;
	}
	public String getForma() {
		return forma;
	}
	public void setForma(String forma) {
		this.forma = forma;
	}
	public String getTopografia() {
		return topografia;
	}
	public void setTopografia(String topografia) {
		this.topografia = topografia;
	}
	public String getUsoSueloUrabano() {
		return usoSueloUrabano;
	}
	public void setUsoSueloUrabano(String usoSueloUrabano) {
		this.usoSueloUrabano = usoSueloUrabano;
	}
	public String getUsoZona() {
		return usoZona;
	}
	public void setUsoZona(String usoZona) {
		this.usoZona = usoZona;
	}
	public String getResistenciaSuelo() {
		return resistenciaSuelo;
	}
	public void setResistenciaSuelo(String resistenciaSuelo) {
		this.resistenciaSuelo = resistenciaSuelo;
	}
	public double getAnchoViaMt() {
		return anchoViaMt;
	}
	public void setAnchoViaMt(double anchoViaMt) {
		this.anchoViaMt = anchoViaMt;
	}
	public String getMaterialVia() {
		return materialVia;
	}
	public void setMaterialVia(String materialVia) {
		this.materialVia = materialVia;
	}
	public String getAceraPeatonal() {
		return aceraPeatonal;
	}
	public void setAceraPeatonal(String aceraPeatonal) {
		this.aceraPeatonal = aceraPeatonal;
	}
	public String getTransporte() {
		return transporte;
	}
	public void setTransporte(String transporte) {
		this.transporte = transporte;
	}
	public String getTipoVia() {
		return tipoVia;
	}
	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}
	public String getColindanciaNorte() {
		return colindanciaNorte;
	}
	public void setColindanciaNorte(String colindanciaNorte) {
		this.colindanciaNorte = colindanciaNorte;
	}
	public String getColindanciaEste() {
		return colindanciaEste;
	}
	public void setColindanciaEste(String colindanciaEste) {
		this.colindanciaEste = colindanciaEste;
	}
	public String getColindanciaOeste() {
		return colindanciaOeste;
	}
	public void setColindanciaOeste(String colindanciaOeste) {
		this.colindanciaOeste = colindanciaOeste;
	}
	public String getColindanciaSur() {
		return colindanciaSur;
	}
	public void setColindanciaSur(String colindanciaSur) {
		this.colindanciaSur = colindanciaSur;
	}
	@Override
	public String toString() {
		return "Ava_Terrain [terrainId=" + terrainId + ", ubication=" + ubication + ", superficieTestimonioMt2="
				+ superficieTestimonioMt2 + ", superficieLevantamientoMt2=" + superficieLevantamientoMt2 + ", frenteMt="
				+ frenteMt + ", fondoMt=" + fondoMt + ", forma=" + forma + ", topografia=" + topografia
				+ ", usoSueloUrabano=" + usoSueloUrabano + ", usoZona=" + usoZona + ", resistenciaSuelo="
				+ resistenciaSuelo + ", anchoViaMt=" + anchoViaMt + ", materialVia=" + materialVia + ", aceraPeatonal="
				+ aceraPeatonal + ", transporte=" + transporte + ", tipoVia=" + tipoVia + ", colindanciaNorte="
				+ colindanciaNorte + ", colindanciaEste=" + colindanciaEste + ", colindanciaOeste=" + colindanciaOeste
				+ ", colindanciaSur=" + colindanciaSur + "]";
	}
}
