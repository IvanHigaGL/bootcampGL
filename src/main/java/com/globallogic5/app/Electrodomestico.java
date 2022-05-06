package com.globallogic5.app;


public class Electrodomestico 
{	private String marca;
    private double peso;
    private char consumo;
    private String color;
	
	public void encender() {
		System.out.println("Encendiendo electrodomestico");
	}
	
	public void apagar() {
		System.out.println("Apagando electrodomestico");
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}