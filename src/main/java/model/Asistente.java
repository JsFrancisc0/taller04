package model;

import java.util.*;

public class Asistente {

	private Collection<Entrada> entradas;
	private String nombre;
	private String email;
	private String preferenciasMusicales;

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return this.email;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPreferenciasMusicales() {
		return this.preferenciasMusicales;
	}

	/**
	 * 
	 * @param preferenciasMusicales
	 */
	public void setPreferenciasMusicales(String preferenciasMusicales) {
		this.preferenciasMusicales = preferenciasMusicales;
	}

	@Override
	public String toString() {
		return getNombre()+","+getEmail()+","+getPreferenciasMusicales();
	}
}