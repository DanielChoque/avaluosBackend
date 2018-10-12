package com.html.avaluos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Ava_ZoneInfrastructure {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "zoneInfrastructureId", nullable = false, updatable = false)
    private long zoneInfrastructureId;
	private boolean agua;
	private boolean luz;
	private boolean telefono;
	private boolean alcantarillado;
	private boolean gas;
	public Ava_ZoneInfrastructure() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getZoneInfrastructureId() {
		return zoneInfrastructureId;
	}
	public void setZoneInfrastructureId(long zoneInfrastructureId) {
		this.zoneInfrastructureId = zoneInfrastructureId;
	}
	public boolean isAgua() {
		return agua;
	}
	public void setAgua(boolean agua) {
		this.agua = agua;
	}
	public boolean isLuz() {
		return luz;
	}
	public void setLuz(boolean luz) {
		this.luz = luz;
	}
	public boolean isTelefono() {
		return telefono;
	}
	public void setTelefono(boolean telefono) {
		this.telefono = telefono;
	}
	public boolean isAlcantarillado() {
		return alcantarillado;
	}
	public void setAlcantarillado(boolean alcantarillado) {
		this.alcantarillado = alcantarillado;
	}
	public boolean isGas() {
		return gas;
	}
	public void setGas(boolean gas) {
		this.gas = gas;
	}
	@Override
	public String toString() {
		return "Ava_ZoneInfrastructure [zoneInfrastructureId=" + zoneInfrastructureId + ", agua=" + agua + ", luz="
				+ luz + ", telefono=" + telefono + ", alcantarillado=" + alcantarillado + ", gas=" + gas + "]";
	}
}
