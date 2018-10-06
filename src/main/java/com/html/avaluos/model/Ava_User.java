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

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Ava_User {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IdUser", nullable = false, updatable = false)
    private long IdUser;
	private String name;
	private String lastName;
	private String ci;
	private String typeUser;
	@OneToMany(mappedBy ="user",cascade=CascadeType.ALL)
	@JsonBackReference
	private List<Ava_Phone> phones= new ArrayList<>();
	public Ava_User() {
		// TODO Auto-generated constructor stub
	}
	public long getIdUser() {
		return IdUser;
	}
	public void setIdUser(long idUser) {
		IdUser = idUser;
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
	public List<Ava_Phone> getPhones() {
		return phones;
	}
	public void setPhones(List<Ava_Phone> phones) {
		this.phones = phones;
	}
	@Override
	public String toString() {
		return "Ava_User [IdUser=" + IdUser + ", name=" + name + ", lastName=" + lastName + ", ci=" + ci + ", typeUser="
				+ typeUser + ", phones=" + phones + "]";
	}	
}
