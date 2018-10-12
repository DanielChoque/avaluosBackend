package com.html.avaluos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ava_Equipment {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "equipmentId", nullable = false, updatable = false)
    private long equipmentId;
	private String educacion;
	private String comercio;
	private String recreacion;
	public Ava_Equipment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getEquipmentId() {
		return equipmentId;
	}
	public void setEquipmentId(long equipmentId) {
		this.equipmentId = equipmentId;
	}
	public String getEducacion() {
		return educacion;
	}
	public void setEducacion(String educacion) {
		this.educacion = educacion;
	}
	public String getComercio() {
		return comercio;
	}
	public void setComercio(String comercio) {
		this.comercio = comercio;
	}
	public String getRecreacion() {
		return recreacion;
	}
	public void setRecreacion(String recreacion) {
		this.recreacion = recreacion;
	}
	@Override
	public String toString() {
		return "Ava_Equipment [equipmentId=" + equipmentId + ", educacion=" + educacion + ", comercio=" + comercio
				+ ", recreacion=" + recreacion + "]";
	}
	
}
