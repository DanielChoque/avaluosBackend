package com.html.avaluos.model;

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
	private String ref;
	@Column(columnDefinition = "text")
	private java.lang.String body="";		
	@OneToOne
	private Ava_User userSolicitante;	
	@OneToOne
	private Ava_User userPropietario;
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
	public Ava_User getUserSolicitante() {
		return userSolicitante;
	}
	public void setUserSolicitante(Ava_User userSolicitante) {
		this.userSolicitante = userSolicitante;
	}
	public Ava_User getUserPropietario() {
		return userPropietario;
	}
	public void setUserPropietario(Ava_User userPropietario) {
		this.userPropietario = userPropietario;
	}
	@Override
	public String toString() {
		return "Ava_Letter [letterId=" + letterId + ", ref=" + ref + ", body=" + body + ", userSolicitante="
				+ userSolicitante + ", userPropietario=" + userPropietario + "]";
	}	
}
