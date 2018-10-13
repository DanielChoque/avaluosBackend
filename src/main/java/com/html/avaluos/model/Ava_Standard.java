package com.html.avaluos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ava_Standard {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "standardId", nullable = false, updatable = false)
    private long standardId;
	private String llave;
	private String valor;
	private String type;
	private String description;	
	public Ava_Standard() {		
	}
	public long getStandardId() {
		return standardId;
	}
	public void setStandardId(long standardId) {
		this.standardId = standardId;
	}
	public String getLlave() {
		return llave;
	}
	public void setLlave(String llave) {
		this.llave = llave;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Ava_Standard [standardId=" + standardId + ", llave=" + llave + ", valor=" + valor + ", type=" + type
				+ ", description=" + description + "]";
	}

}
