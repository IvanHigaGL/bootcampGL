package com.globallogic5.app;


public class Televisor extends Electrodomestico
{	
	private double pulgadas;
	private String resolucion;
	
	public void cambiarCanal (int canal) {
		System.out.println("Cambiando al canal: " + canal);
	}
}