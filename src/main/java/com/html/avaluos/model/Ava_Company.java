package com.html.avaluos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Ava_Company {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "companyId", nullable = false, updatable = false)
    private long companyId;
	String nameCompany;
	String nit;	
	String chargeCompany;	//Ava_User responsibleCompany;
	@OneToOne
	Ava_Ubication ubicationCompany;
	public Ava_Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}
	public String getNameCompany() {
		return nameCompany;
	}
	public void setNameCompany(String nameCompany) {
		this.nameCompany = nameCompany;
	}
	public String getNit() {
		return nit;
	}
	public void setNit(String nit) {
		this.nit = nit;
	}
	public String getChargeCompany() {
		return chargeCompany;
	}
	public void setChargeCompany(String chargeCompany) {
		this.chargeCompany = chargeCompany;
	}
	public Ava_Ubication getUbicationCompany() {
		return ubicationCompany;
	}
	public void setUbicationCompany(Ava_Ubication ubicationCompany) {
		this.ubicationCompany = ubicationCompany;
	}
	@Override
	public String toString() {
		return "Ava_Company [companyId=" + companyId + ", nameCompany=" + nameCompany + ", nit=" + nit
				+ ", chargeCompany=" + chargeCompany + ", ubicationCompany=" + ubicationCompany + "]";
	}	
}
