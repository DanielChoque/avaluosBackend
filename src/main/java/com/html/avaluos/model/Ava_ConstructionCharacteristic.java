package com.html.avaluos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ava_ConstructionCharacteristic {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "constructionCharacteristicId", nullable = false, updatable = false)
    private long constructionCharacteristicId;
	private String uso;
	private String ocupacion;
	private String tipo;
	private String estado;
	private int antiguedad;
	private int vidaUtil;
	private int vidaUtilRemanente;
	public Ava_ConstructionCharacteristic() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getConstructionCharacteristicId() {
		return constructionCharacteristicId;
	}
	public void setConstructionCharacteristicId(long constructionCharacteristicId) {
		this.constructionCharacteristicId = constructionCharacteristicId;
	}
	public String getUso() {
		return uso;
	}
	public void setUso(String uso) {
		this.uso = uso;
	}
	public String getOcupacion() {
		return ocupacion;
	}
	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	public int getVidaUtil() {
		return vidaUtil;
	}
	public void setVidaUtil(int vidaUtil) {
		this.vidaUtil = vidaUtil;
	}
	public int getVidaUtilRemanente() {
		return vidaUtilRemanente;
	}
	public void setVidaUtilRemanente(int vidaUtilRemanente) {
		this.vidaUtilRemanente = vidaUtilRemanente;
	}
	@Override
	public String toString() {
		return "Ava_ConstructionCharacteristic [constructionCharacteristicId=" + constructionCharacteristicId + ", uso="
				+ uso + ", ocupacion=" + ocupacion + ", tipo=" + tipo + ", estado=" + estado + ", antiguedad="
				+ antiguedad + ", vidaUtil=" + vidaUtil + ", vidaUtilRemanente=" + vidaUtilRemanente + "]";
	}
}
