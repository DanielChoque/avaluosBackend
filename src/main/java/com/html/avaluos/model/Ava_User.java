package com.html.avaluos.model;

import java.util.ArrayList;
import java.util.Date;
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
public class Ava_User {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userId", nullable = false, updatable = false)
    private long userId;
	private String name;
	private String lastName;
	private String ci;
	private String typeUser;
	private String occupation;
	private String titleUser;
	private Date birthday;
	@OneToMany(mappedBy ="user",cascade=CascadeType.ALL)	
	private List<Ava_Phone> phones= new ArrayList<>();
	@OneToOne
	private Ava_Ubication ubication;	
	public Ava_User() {
		// TODO Auto-generated constructor stub
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
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
	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}
	public String getTypeUser() {
		return typeUser;
	}
	public void setTypeUser(String typeUser) {
		this.typeUser = typeUser;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public List<Ava_Phone> getPhones() {
		return phones;
	}
	public void setPhones(List<Ava_Phone> phones) {
		this.phones = phones;
	}
	public Ava_Ubication getUbication() {
		return ubication;
	}
	public void setUbication(Ava_Ubication ubication) {
		this.ubication = ubication;
	}
	public String getTitleUser() {
		return titleUser;
	}
	public void setTitleUser(String titleUser) {
		this.titleUser = titleUser;
	}
	@Override
	public String toString() {
		return "Ava_User [userId=" + userId + ", name=" + name + ", lastName=" + lastName + ", ci=" + ci + ", typeUser="
				+ typeUser + ", occupation=" + occupation + ", titleUser=" + titleUser + ", birthday=" + birthday
				+ ", phones=" + phones + ", ubication=" + ubication + "]";
	}	
}
