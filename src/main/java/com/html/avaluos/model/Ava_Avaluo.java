package com.html.avaluos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ava_Avaluo {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IdAvaluo", nullable = false, updatable = false)
	private long IdAvaluo;
	public Ava_Avaluo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIdAvaluo() {
		return IdAvaluo;
	}
	public void setIdAvaluo(long idAvaluo) {
		IdAvaluo = idAvaluo;
	}
	@Override
	public String toString() {
		return "Ava_Avaluo [IdAvaluo=" + IdAvaluo + "]";
	}
}
