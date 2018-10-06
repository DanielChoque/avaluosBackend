package com.html.avaluos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ava_LegalDocument {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "legalDocumentId", nullable = false, updatable = false)
    private Long legalDocumentId;
	private String testimonioPropiedad;
	private String folioReal;
	private String fechaRegistroDR;
	private String notario;
	private String gravamenes;
	public Ava_LegalDocument() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getLegalDocumentId() {
		return legalDocumentId;
	}
	public void setLegalDocumentId(Long legalDocumentId) {
		this.legalDocumentId = legalDocumentId;
	}
	public String getTestimonioPropiedad() {
		return testimonioPropiedad;
	}
	public void setTestimonioPropiedad(String testimonioPropiedad) {
		this.testimonioPropiedad = testimonioPropiedad;
	}
	public String getFolioReal() {
		return folioReal;
	}
	public void setFolioReal(String folioReal) {
		this.folioReal = folioReal;
	}
	public String getFechaRegistroDR() {
		return fechaRegistroDR;
	}
	public void setFechaRegistroDR(String fechaRegistroDR) {
		this.fechaRegistroDR = fechaRegistroDR;
	}
	public String getNotario() {
		return notario;
	}
	public void setNotario(String notario) {
		this.notario = notario;
	}
	public String getGravamenes() {
		return gravamenes;
	}
	public void setGravamenes(String gravamenes) {
		this.gravamenes = gravamenes;
	}
	@Override
	public String toString() {
		return "Ava_LegalDocument [legalDocumentId=" + legalDocumentId + ", testimonioPropiedad=" + testimonioPropiedad
				+ ", folioReal=" + folioReal + ", fechaRegistroDR=" + fechaRegistroDR + ", notario=" + notario
				+ ", gravamenes=" + gravamenes + "]";
	}	
}
