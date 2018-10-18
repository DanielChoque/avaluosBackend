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
    @Column(nullable = false, updatable = false)
	 private long phoneId;
	 private String numberPhone;
	 private String typePhone;
	 @ManyToOne(fetch=FetchType.EAGER)
	 @JoinColumn
	 @JsonBackReference
	 private Ava_User user;
	public Ava_Phone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(long phoneId) {
		this.phoneId = phoneId;
	}
	public String getNumberPhone() {
		return numberPhone;
	}
	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
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
		return "Ava_Phone [phoneId=" + phoneId + ", numberPhone=" + numberPhone + ", typePhone=" + typePhone + "]";
	}		 
}
