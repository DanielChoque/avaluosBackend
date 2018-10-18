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
public class Ava_CompanyUser {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
	private long companyUserId;
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn
    @JsonBackReference
    private Ava_Company company;
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn   
    private Ava_User user;
	public Ava_CompanyUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getCompanyUserId() {
		return companyUserId;
	}
	public void setCompanyUserId(long companyUserId) {
		this.companyUserId = companyUserId;
	}
	public Ava_Company getCompany() {
		return company;
	}
	public void setCompany(Ava_Company company) {
		this.company = company;
	}
	public Ava_User getUser() {
		return user;
	}
	public void setUser(Ava_User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Ava_CompanyUser [companyUserId=" + companyUserId + ", company=" + company + ", user=" + user + "]";
	}
	
}
