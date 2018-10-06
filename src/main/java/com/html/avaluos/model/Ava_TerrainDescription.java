package com.html.avaluos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ava_TerrainDescription {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "terrainDescriptionID", nullable = false, updatable = false)
    private long terrainDescriptionID;
	@Column(columnDefinition = "text")
	private java.lang.String body="";
	public Ava_TerrainDescription() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getTerrainDescriptionID() {
		return terrainDescriptionID;
	}
	public void setTerrainDescriptionID(long terrainDescriptionID) {
		this.terrainDescriptionID = terrainDescriptionID;
	}
	public java.lang.String getBody() {
		return body;
	}
	public void setBody(java.lang.String body) {
		this.body = body;
	}
	@Override
	public String toString() {
		return "Ava_TerrainDescription [terrainDescriptionID=" + terrainDescriptionID + ", body=" + body + "]";
	}
}
