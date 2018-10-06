package com.html.avaluos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ava_TechnicalDocuments {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "technicalDocumentsId", nullable = false, updatable = false)
    private long technicalDocumentsId;
	private String planoLote;
	private String codigoCatastral;
	private String planosArquitectonicos;
	private String impuestoYear;
	@Column(columnDefinition = "text")
	private java.lang.String obs="";
	public Ava_TechnicalDocuments() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getTechnicalDocumentsId() {
		return technicalDocumentsId;
	}
	public void setTechnicalDocumentsId(long technicalDocumentsId) {
		this.technicalDocumentsId = technicalDocumentsId;
	}
	public String getPlanoLote() {
		return planoLote;
	}
	public void setPlanoLote(String planoLote) {
		this.planoLote = planoLote;
	}
	public String getCodigoCatastral() {
		return codigoCatastral;
	}
	public void setCodigoCatastral(String codigoCatastral) {
		this.codigoCatastral = codigoCatastral;
	}
	public String getPlanosArquitectonicos() {
		return planosArquitectonicos;
	}
	public void setPlanosArquitectonicos(String planosArquitectonicos) {
		this.planosArquitectonicos = planosArquitectonicos;
	}
	public String getImpuestoYear() {
		return impuestoYear;
	}
	public void setImpuestoYear(String impuestoYear) {
		this.impuestoYear = impuestoYear;
	}
	public java.lang.String getObs() {
		return obs;
	}
	public void setObs(java.lang.String obs) {
		this.obs = obs;
	}
	@Override
	public String toString() {
		return "Ava_TechnicalDocuments [technicalDocumentsId=" + technicalDocumentsId + ", planoLote=" + planoLote
				+ ", codigoCatastral=" + codigoCatastral + ", planosArquitectonicos=" + planosArquitectonicos
				+ ", impuestoYear=" + impuestoYear + ", obs=" + obs + "]";
	}
}
