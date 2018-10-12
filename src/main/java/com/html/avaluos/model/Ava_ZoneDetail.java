package com.html.avaluos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Ava_ZoneDetail {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "zoneDetailId", nullable = false, updatable = false)
    private long zoneDetailId;
	@Column(columnDefinition = "text")
	private java.lang.String body="";
	public Ava_ZoneDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getZoneDetailId() {
		return zoneDetailId;
	}
	public void setZoneDetailId(long zoneDetailId) {
		this.zoneDetailId = zoneDetailId;
	}
	public java.lang.String getBody() {
		return body;
	}
	public void setBody(java.lang.String body) {
		this.body = body;
	}
	@Override
	public String toString() {
		return "Ava_ZoneDetail [zoneDetailId=" + zoneDetailId + ", body=" + body + "]";
	}	
}
