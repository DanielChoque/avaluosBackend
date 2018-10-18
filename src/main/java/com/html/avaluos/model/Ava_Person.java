package com.html.avaluos.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Ava_Person {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "personId", nullable = false, updatable = false)
    private long personId;
	private String ci;
	private String name;
	private String lastName;
	private String type;
	private String occupation;
	private Date birtday;
	@OneToOne
	private Ava_Ubication ubication;
	public Ava_Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getPersonId() {
		return personId;
	}
	public void setPersonId(long personId) {
		this.personId = personId;
	}
	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public Date getBirtday() {
		return birtday;
	}
	public void setBirtday(Date birtday) {
		this.birtday = birtday;
	}
	public Ava_Ubication getUbication() {
		return ubication;
	}
	public void setUbication(Ava_Ubication ubication) {
		this.ubication = ubication;
	}
	@Override
	public String toString() {
		return "Ava_Person [personId=" + personId + ", ci=" + ci + ", name=" + name + ", lastName=" + lastName
				+ ", type=" + type + ", occupation=" + occupation + ", birtday=" + birtday + ", ubication=" + ubication
				+ "]";
	}	
}
