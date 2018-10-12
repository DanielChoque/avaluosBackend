package com.html.avaluos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ava_ConstructionDetail {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "constructionDetailId", nullable = false, updatable = false)
    private long constructionDetailId;
	@Column(columnDefinition = "text")
	private java.lang.String body="";
	public Ava_ConstructionDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getConstructionDetailId() {
		return constructionDetailId;
	}
	public void setConstructionDetailId(long constructionDetailId) {
		this.constructionDetailId = constructionDetailId;
	}
	public java.lang.String getBody() {
		return body;
	}
	public void setBody(java.lang.String body) {
		this.body = body;
	}
	@Override
	public String toString() {
		return "Ava_ConstructionDetail [constructionDetailId=" + constructionDetailId + ", body=" + body + "]";
	}	
}
