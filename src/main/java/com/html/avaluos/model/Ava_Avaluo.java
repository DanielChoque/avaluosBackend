package com.html.avaluos.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Ava_Avaluo {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
	private long avaluoId;	
	@OneToOne
	private Ava_User userAvaluador;
	@OneToMany(mappedBy ="avaluo",cascade=CascadeType.ALL)	
	private List<Ava_AvaluoImage> avaluoImages =new ArrayList<>();
	public Ava_Avaluo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getAvaluoId() {
		return avaluoId;
	}
	public void setAvaluoId(long avaluoId) {
		this.avaluoId = avaluoId;
	}
	public Ava_User getUserAvaluador() {
		return userAvaluador;
	}
	public void setUserAvaluador(Ava_User userAvaluador) {
		this.userAvaluador = userAvaluador;
	}
	public List<Ava_AvaluoImage> getAvaluoImages() {
		return avaluoImages;
	}
	public void setAvaluoImages(List<Ava_AvaluoImage> avaluoImages) {
		this.avaluoImages = avaluoImages;
	}
	@Override
	public String toString() {
		return "Ava_Avaluo [avaluoId=" + avaluoId + ", userAvaluador=" + userAvaluador + ", avaluoImages="
				+ avaluoImages + "]";
	}
		
}
