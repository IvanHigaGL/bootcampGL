package com.globallogic5.app;


public class Cafetera extends Electrodomestico
{	
	private double litros;
	
	public void elegirSabor(String sabor) {
		System.out.println("El sabor del cafe es: " + sabor);
	}
	
	//Polimorfismo
	public void encender() {
		System.out.println("Encendiendo cafetera");
	}
}