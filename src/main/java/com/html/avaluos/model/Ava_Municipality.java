package com.html.avaluos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Ava_Municipality {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "municipalityId", nullable = false, updatable = false)
    private long municipalityId;
	private String name;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "province_id")
    private Ava_Province ava_Province;
	public Ava_Municipality() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getMunicipalityId() {
		return municipalityId;
	}
	public void setMunicipalityId(long municipalityId) {
		this.municipalityId = municipalityId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Ava_Province getAva_Province() {
		return ava_Province;
	}
	public void setAva_Province(Ava_Province ava_Province) {
		this.ava_Province = ava_Province;
	}
	@Override
	public String toString() {
		return "Ava_Municipality [municipalityId=" + municipalityId + ", name=" + name + ", ava_Province="
				+ ava_Province + "]";
	}

}
