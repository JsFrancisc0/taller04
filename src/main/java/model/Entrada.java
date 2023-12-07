package model;

public class Entrada {

	private Asistente asistente;
	private int precioVip;
	private int precioGeneral;

	public int getPrecioVip() {
		return this.precioVip;
	}

	/**
	 * 
	 * @param precioVip
	 */
	public void setPrecioVip(int precioVip) {
		this.precioVip = precioVip;
	}

	public int getPrecioGeneral() {
		return this.precioGeneral;
	}

	/**
	 * 
	 * @param precioGeneral
	 */
	public void setPrecioGeneral(int precioGeneral) {
		this.precioGeneral = precioGeneral;
	}

}