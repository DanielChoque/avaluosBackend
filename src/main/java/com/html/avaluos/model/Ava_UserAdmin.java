package com.html.avaluos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Ava_UserAdmin {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userAdminId", nullable = false, updatable = false)
    private long userAdminId=0;
	private String nameAdmin="";
	private String password="";
	@OneToOne
	private Ava_User userAvaluador;
	public Ava_UserAdmin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getUserAdminId() {
		return userAdminId;
	}
	public void setUserAdminId(long userAdminId) {
		this.userAdminId = userAdminId;
	}
	public String getNameAdmin() {
		return nameAdmin;
	}
	public void setNameAdmin(String nameAdmin) {
		this.nameAdmin = nameAdmin;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Ava_User getUserAvaluador() {
		return userAvaluador;
	}
	public void setUserAvaluador(Ava_User userAvaluador) {
		this.userAvaluador = userAvaluador;
	}
	@Override
	public String toString() {
		return "Ava_UserAdmin [userAdminId=" + userAdminId + ", nameAdmin=" + nameAdmin + ", password=" + password
				+ ", userAvaluador=" + userAvaluador + "]";
	}
		
}
