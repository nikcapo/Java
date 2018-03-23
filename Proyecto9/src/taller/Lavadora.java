package taller;

import taller.Motor;

public class Lavadora {
	private int id;
	private Motor motor;
	private String marca;
	private float precio;
	private int iva = 21;

	public Lavadora(int id, Motor motor, String marca, float precio) {
		super();
		this.id = id;
		this.motor = motor;
		this.marca = marca;
		this.precio = precio;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String toString() {
		return "Codigo: " + id + ", Motor: "
				+ motor.getFabricante() +" Marca: " + marca + ", Precio: "
				+ precio + "Euros.";
	}

}
