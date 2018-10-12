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
public class Ava_Phone {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IdPhone", nullable = false, updatable = false)
	 private long IdPhone;
	 private String number;
	 private String typePhone;
	 @ManyToOne(fetch=FetchType.EAGER)
	 @JoinColumn(name="ID_USER")
	 @JsonBackReference
	 private Ava_User user;
	public Ava_Phone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIdPhone() {
		return IdPhone;
	}
	public void setIdPhone(long idPhone) {
		IdPhone = idPhone;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getTypePhone() {
		return typePhone;
	}
	public void setTypePhone(String typePhone) {
		this.typePhone = typePhone;
	}
	public Ava_User getUser() {
		return user;
	}
	public void setUser(Ava_User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Ava_Phone [IdPhone=" + IdPhone + ", number=" + number + ", typePhone=" + typePhone + ", user=" + user
				+ "]";
	}
	 
}
