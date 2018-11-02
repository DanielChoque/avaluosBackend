package com.html.avaluos.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ava_Image {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IdImage", nullable = false, updatable = false)
	private long IdImage;
	@Column(columnDefinition = "text")
	private java.lang.String name;
	private String type;
	private Date date;
	private String observation;
	public Ava_Image() {
		// TODO Auto-generated constructor stub
	}
	public long getIdImage() {
		return IdImage;
	}
	public void setIdImage(long idImage) {
		IdImage = idImage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getObservation() {
		return observation;
	}
	public void setObservation(String observation) {
		this.observation = observation;
	}
	@Override
	public String toString() {
		return "Ava_Image [IdImage=" + IdImage + ", name=" + name + ", type=" + type + ", date=" + date
				+ ", observation=" + observation + "]";
	}
	 
}
