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
    @Column(name = "IdAvaluo", nullable = false, updatable = false)
	private long IdAvaluo;
	@OneToMany(mappedBy ="avaluo",cascade=CascadeType.ALL)	
	private List<Ava_Image> images=new ArrayList<>();
	@OneToOne
	private Ava_User userAvaluador;
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
	public List<Ava_Image> getImages() {
		return images;
	}
	public void setImages(List<Ava_Image> images) {
		this.images = images;
	}
	public Ava_User getUserAvaluador() {
		return userAvaluador;
	}
	public void setUserAvaluador(Ava_User userAvaluador) {
		this.userAvaluador = userAvaluador;
	}
	@Override
	public String toString() {
		return "Ava_Avaluo [IdAvaluo=" + IdAvaluo + ", images=" + images + ", userAvaluador=" + userAvaluador + "]";
	}	
}
