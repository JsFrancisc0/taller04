package model;

import java.util.ArrayList;

public class EventoMusical {

	private String nombre;
	private String fecha;
	private String lugar;
	private ArrayList<Artista> artistasAsociados;

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

	public String getFecha() {
		return this.fecha;
	}

	/**
	 * 
	 * @param fecha
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getLugar() {
		return this.lugar;
	}

	/**
	 * 
	 * @param lugar
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public ArrayList<Artista> getArtistasAsociados() {
		return this.artistasAsociados;
	}

	/**
	 * 
	 * @param artistasAsociados
	 */
	public void setArtistasAsociados(ArrayList<Artista> artistasAsociados) {
		this.artistasAsociados = artistasAsociados;
	}

    public void agregarArtista(Artista artista){
        getArtistasAsociados().add(artista);
    }

	@Override
	public String toString() {
		return getNombre()+","+getFecha()+","+getLugar()+","+getArtistasAsociados();
	}
}