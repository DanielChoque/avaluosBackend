package com.html.avaluos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Ava_Ubication {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ubicationId", nullable = false, updatable = false)
    private long ubicationId;
	private String zona="";
	private String urbanizacion="";
	private String tipoDireccion="";
	private String direccion="";	
	private String numero="";
	private String adicionales="";
	private String manzana="";
	private String lote="";
	@OneToOne
	private Ava_Municipality ava_Municipality;
	public Ava_Ubication() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getUbicationId() {
		return ubicationId;
	}
	public void setUbicationId(long ubicationId) {
		this.ubicationId = ubicationId;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	public String getUrbanizacion() {
		return urbanizacion;
	}
	public void setUrbanizacion(String urbanizacion) {
		this.urbanizacion = urbanizacion;
	}
	public String getTipoDireccion() {
		return tipoDireccion;
	}
	public void setTipoDireccion(String tipoDireccion) {
		this.tipoDireccion = tipoDireccion;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getAdicionales() {
		return adicionales;
	}
	public void setAdicionales(String adicionales) {
		this.adicionales = adicionales;
	}
	public String getManzana() {
		return manzana;
	}
	public void setManzana(String manzana) {
		this.manzana = manzana;
	}
	public String getLote() {
		return lote;
	}
	public void setLote(String lote) {
		this.lote = lote;
	}
	public Ava_Municipality getAva_Municipality() {
		return ava_Municipality;
	}
	public void setAva_Municipality(Ava_Municipality ava_Municipality) {
		this.ava_Municipality = ava_Municipality;
	}
	@Override
	public String toString() {
		return "Ava_Ubication [ubicationId=" + ubicationId + ", zona=" + zona + ", urbanizacion=" + urbanizacion
				+ ", tipoDireccion=" + tipoDireccion + ", direccion=" + direccion + ", numero=" + numero
				+ ", adicionales=" + adicionales + ", manzana=" + manzana + ", lote=" + lote + ", ava_Municipality="
				+ ava_Municipality + "]";
	}	
}
