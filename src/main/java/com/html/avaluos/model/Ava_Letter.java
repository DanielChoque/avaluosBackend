package com.html.avaluos.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Ava_Letter {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "letterId", nullable = false, updatable = false)
    private long letterId;
	private String nameDirected;
	private String cargoDirected;
	private String companyName;
	private String ref;
	@Column(columnDefinition = "text")
	private java.lang.String body="";
	private Date date;
	@OneToOne
	private Ava_Ubication ubication;	
	@OneToOne
	private Ava_User userBorrower;	
	@OneToOne
	private Ava_User userOwner;
	public Ava_Letter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getLetterId() {
		return letterId;
	}
	public void setLetterId(long letterId) {
		this.letterId = letterId;
	}
	public String getNameDirected() {
		return nameDirected;
	}
	public void setNameDirected(String nameDirected) {
		this.nameDirected = nameDirected;
	}
	public String getCargoDirected() {
		return cargoDirected;
	}
	public void setCargoDirected(String cargoDirected) {
		this.cargoDirected = cargoDirected;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public java.lang.String getBody() {
		return body;
	}
	public void setBody(java.lang.String body) {
		this.body = body;
	}
	public Ava_Ubication getUbication() {
		return ubication;
	}
	public void setUbication(Ava_Ubication ubication) {
		this.ubication = ubication;
	}
	public Ava_User getUserBorrower() {
		return userBorrower;
	}
	public void setUserBorrower(Ava_User userBorrower) {
		this.userBorrower = userBorrower;
	}
	public Ava_User getUserOwner() {
		return userOwner;
	}
	public void setUserOwner(Ava_User userOwner) {
		this.userOwner = userOwner;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Ava_Letter [letterId=" + letterId + ", nameDirected=" + nameDirected + ", cargoDirected="
				+ cargoDirected + ", companyName=" + companyName + ", ref=" + ref + ", body=" + body + ", date=" + date
				+ ", ubication=" + ubication + ", userBorrower=" + userBorrower + ", userOwner=" + userOwner + "]";
	}	
}
