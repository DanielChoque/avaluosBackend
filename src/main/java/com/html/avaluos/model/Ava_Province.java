package com.html.avaluos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Ava_Province {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "provinceId", nullable = false, updatable = false)
	private int provinceId;
	private String name;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "department_id")
    private Ava_Department department;
	public Ava_Province() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Ava_Department getDepartment() {
		return department;
	}
	public void setDepartment(Ava_Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Ava_Province [provinceId=" + provinceId + ", name=" + name + ", department=" + department + "]";
	}	
}
