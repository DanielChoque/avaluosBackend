package com.html.avaluos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ava_TerrainDetail {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "terrainDetailId", nullable = false, updatable = false)
    private long terrainDetailId;
	@Column(columnDefinition = "text")
	private java.lang.String body="";
	public Ava_TerrainDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getTerrainDetailId() {
		return terrainDetailId;
	}
	public void setTerrainDetailId(long terrainDetailId) {
		this.terrainDetailId = terrainDetailId;
	}
	public java.lang.String getBody() {
		return body;
	}
	public void setBody(java.lang.String body) {
		this.body = body;
	}
	@Override
	public String toString() {
		return "Ava_TerrainDetail [terrainDetailId=" + terrainDetailId + ", body=" + body + "]";
	}
	
}
