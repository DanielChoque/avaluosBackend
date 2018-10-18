package com.html.avaluos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Ava_AvaluoImage {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
	private long avaluoImageId;
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn
    @JsonBackReference
    private Ava_Avaluo avaluo;
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn
   
    private Ava_Image image;
	public Ava_AvaluoImage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getAvaluoImageId() {
		return avaluoImageId;
	}
	public void setAvaluoImageId(long avaluoImageId) {
		this.avaluoImageId = avaluoImageId;
	}
	public Ava_Avaluo getAvaluo() {
		return avaluo;
	}
	public void setAvaluo(Ava_Avaluo avaluo) {
		this.avaluo = avaluo;
	}
	public Ava_Image getImage() {
		return image;
	}
	public void setImage(Ava_Image image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Ava_AvaluoImage [avaluoImageId=" + avaluoImageId + ", avaluo=" + avaluo.getAvaluoId() + ", image=" + image.getIdImage() + "]";
	}
	
	
}
