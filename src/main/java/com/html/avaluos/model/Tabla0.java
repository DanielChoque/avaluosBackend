package com.html.avaluos.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Tabla0 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private Long Id;
	// @Column(columnDefinition = "text")
	private String Tipo_Inmueble;
	private String Superficie_Lote;
	private String Superficie_Construida;
	private String Valor_Impositivo_Mt2;
	private String Valor_Comercial_Mt2;
	private String Valor_Comercial_Mt2_Construido;
	private String Valor_Catastral_Mt2_Construido;
	private String Anos_Vida;
	private String Factor_Inclinacion;
	private String Factor_Forma;
	private String Factor_Comerciabilidad;
	private String Foto1;
	private String Foto2;
	private Date Fecha;
	private String Tipo_Cambio;
	public Tabla0() {
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getTipo_Inmueble() {
		return Tipo_Inmueble;
	}
	public void setTipo_Inmueble(String tipo_Inmueble) {
		Tipo_Inmueble = tipo_Inmueble;
	}
	public String getSuperficie_Lote() {
		return Superficie_Lote;
	}
	public void setSuperficie_Lote(String superficie_Lote) {
		Superficie_Lote = superficie_Lote;
	}
	public String getSuperficie_Construida() {
		return Superficie_Construida;
	}
	public void setSuperficie_Construida(String superficie_Construida) {
		Superficie_Construida = superficie_Construida;
	}
	public String getValor_Impositivo_Mt2() {
		return Valor_Impositivo_Mt2;
	}
	public void setValor_Impositivo_Mt2(String valor_Impositivo_Mt2) {
		Valor_Impositivo_Mt2 = valor_Impositivo_Mt2;
	}
	public String getValor_Comercial_Mt2() {
		return Valor_Comercial_Mt2;
	}
	public void setValor_Comercial_Mt2(String valor_Comercial_Mt2) {
		Valor_Comercial_Mt2 = valor_Comercial_Mt2;
	}
	public String getValor_Comercial_Mt2_Construido() {
		return Valor_Comercial_Mt2_Construido;
	}
	public void setValor_Comercial_Mt2_Construido(String valor_Comercial_Mt2_Construido) {
		Valor_Comercial_Mt2_Construido = valor_Comercial_Mt2_Construido;
	}
	public String getValor_Catastral_Mt2_Construido() {
		return Valor_Catastral_Mt2_Construido;
	}
	public void setValor_Catastral_Mt2_Construido(String valor_Catastral_Mt2_Construido) {
		Valor_Catastral_Mt2_Construido = valor_Catastral_Mt2_Construido;
	}
	public String getAnos_Vida() {
		return Anos_Vida;
	}
	public void setAnos_Vida(String anos_Vida) {
		Anos_Vida = anos_Vida;
	}
	public String getFactor_Inclinacion() {
		return Factor_Inclinacion;
	}
	public void setFactor_Inclinacion(String factor_Inclinacion) {
		Factor_Inclinacion = factor_Inclinacion;
	}
	public String getFactor_Forma() {
		return Factor_Forma;
	}
	public void setFactor_Forma(String factor_Forma) {
		Factor_Forma = factor_Forma;
	}
	public String getFactor_Comerciabilidad() {
		return Factor_Comerciabilidad;
	}
	public void setFactor_Comerciabilidad(String factor_Comerciabilidad) {
		Factor_Comerciabilidad = factor_Comerciabilidad;
	}
	public String getFoto1() {
		return Foto1;
	}
	public void setFoto1(String foto1) {
		Foto1 = foto1;
	}
	public String getFoto2() {
		return Foto2;
	}
	public void setFoto2(String foto2) {
		Foto2 = foto2;
	}
	public Date getFecha() {
		return Fecha;
	}
	public void setFecha(Date fecha) {
		Fecha = fecha;
	}
	public String getTipo_Cambio() {
		return Tipo_Cambio;
	}
	public void setTipo_Cambio(String tipo_Cambio) {
		Tipo_Cambio = tipo_Cambio;
	}
	@Override
	public String toString() {
		return "Tabla0 [Id=" + Id + ", Tipo_Inmueble=" + Tipo_Inmueble + ", Superficie_Lote=" + Superficie_Lote
				+ ", Superficie_Construida=" + Superficie_Construida + ", Valor_Impositivo_Mt2=" + Valor_Impositivo_Mt2
				+ ", Valor_Comercial_Mt2=" + Valor_Comercial_Mt2 + ", Valor_Comercial_Mt2_Construido="
				+ Valor_Comercial_Mt2_Construido + ", Valor_Catastral_Mt2_Construido=" + Valor_Catastral_Mt2_Construido
				+ ", Anos_Vida=" + Anos_Vida + ", Factor_Inclinacion=" + Factor_Inclinacion + ", Factor_Forma="
				+ Factor_Forma + ", Factor_Comerciabilidad=" + Factor_Comerciabilidad + ", Foto1=" + Foto1 + ", Foto2="
				+ Foto2 + ", Fecha=" + Fecha + ", Tipo_Cambio=" + Tipo_Cambio + "]";
	}	
}
