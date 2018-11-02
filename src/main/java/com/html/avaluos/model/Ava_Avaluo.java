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
	@OneToOne
	private Ava_Company company;
	@OneToOne
	private Ava_Letter letter;
	@OneToOne
	private Ava_User userCompany;
	@OneToOne
	private Ava_User userPrestatario ;	
	@OneToOne
	private Ava_User userPropietario;
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
	public Ava_Company getCompany() {
		return company;
	}
	public void setCompany(Ava_Company company) {
		this.company = company;
	}
	public Ava_Letter getLetter() {
		return letter;
	}
	public void setLetter(Ava_Letter letter) {
		this.letter = letter;
	}
	public Ava_User getUserCompany() {
		return userCompany;
	}
	public void setUserCompany(Ava_User userCompany) {
		this.userCompany = userCompany;
	}
	public Ava_User getUserPrestatario() {
		return userPrestatario;
	}
	public void setUserPrestatario(Ava_User userPrestatario) {
		this.userPrestatario = userPrestatario;
	}
	public Ava_User getUserPropietario() {
		return userPropietario;
	}
	public void setUserPropietario(Ava_User userPropietario) {
		this.userPropietario = userPropietario;
	}
	@Override
	public String toString() {
		return "Ava_Avaluo [avaluoId=" + avaluoId + ", userAvaluador=" + userAvaluador + ", avaluoImages="
				+ avaluoImages + ", company=" + company + ", letter=" + letter + ", userCompany=" + userCompany
				+ ", userPrestatario=" + userPrestatario + ", userPropietario=" + userPropietario + "]";
	}	
}
