package com.html.avaluos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ava_UserAdmin {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userAdminId", nullable = false, updatable = false)
    private long userAdminId=0;
	private String nameAdmin="";
	private String password="";
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
	@Override
	public String toString() {
		return "Ava_UserAdmin [userAdminId=" + userAdminId + ", nameAdmin=" + nameAdmin + ", password=" + password
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nameAdmin == null) ? 0 : nameAdmin.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + (int) (userAdminId ^ (userAdminId >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ava_UserAdmin other = (Ava_UserAdmin) obj;
		if (nameAdmin == null) {
			if (other.nameAdmin != null)
				return false;
		} else if (!nameAdmin.equals(other.nameAdmin))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userAdminId != other.userAdminId)
			return false;
		return true;
	}
	
}
