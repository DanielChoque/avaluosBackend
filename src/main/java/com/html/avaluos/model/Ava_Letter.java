package com.html.avaluos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ava_Letter {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "letterId", nullable = false, updatable = false)
    private long letterId;
	private String ref;
	@Column(columnDefinition = "text")
	private java.lang.String body="";	
	public Ava_Letter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getLetterId() {
		return letterId;
	}
	public void setLetterId(long letterId) {
		this.letterId = letterId;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public java.lang.String getBody() {
		return body;
	}
	public void setBody(java.lang.String body) {
		this.body = body;
	}
	@Override
	public String toString() {
		return "Ava_Letter [letterId=" + letterId + ", ref=" + ref + ", body=" + body + "]";
	}	
}
