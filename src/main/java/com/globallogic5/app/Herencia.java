package com.globallogic5.app;


public class Herencia
{	
	public static void main(String[] args){
		Electrodomestico elect1 = new Electrodomestico();
		Heladera heladera1 = new Heladera();
		elect1.setMarca("Brand1");
		elect1.setColor("Rojo");
		heladera1.setMarca("Brand2");
		heladera1.setColor("Azul");
		
		System.out.println("La marca del electrodomestico es " + elect1.getMarca() + " y el color es " + elect1.getColor());
		elect1.encender();
		
		System.out.println("La marca de la heladera es " + heladera1.getMarca() + " y el color es " + heladera1.getColor());
		heladera1.encender();
	}
}