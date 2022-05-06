package com.globallogic5.app;


public class Heladera extends Electrodomestico
{	
	private double capacidad;
	private boolean tieneFreezer;
	private double capacidadFreezer;
	
	public void guardarElemento(String elemento) {
		System.out.println("Se agrego el elemento: " + elemento);
	}
	
	public void extraerElemento(String elemento) {
		System.out.println("Se extrajo el elemento: " + elemento);
	}
	
	//Polimorfismo
	public void encender() {
		System.out.println("Encendiendo heladera");
	}
}