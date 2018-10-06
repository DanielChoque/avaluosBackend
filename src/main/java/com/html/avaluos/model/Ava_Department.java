package com.html.avaluos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ava_Department {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "departmentId", nullable = false, updatable = false)
    private long departmentId;
	private String name;
	public Ava_Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Ava_Department [departmentId=" + departmentId + ", name=" + name + "]";
	}
}
