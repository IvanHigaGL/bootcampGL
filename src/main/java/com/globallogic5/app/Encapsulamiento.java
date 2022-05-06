package com.globallogic5.app;


public class Encapsulamiento
{	
	public static void main(String[] args){
		
		Gato gato1 = new Gato();
		gato1.setNombre("Garfield");
		gato1.setPatas(4);

		System.out.println("El nombre del gato es " + gato1.getNombre());
		System.out.println("El gato tiene " + gato1.getPatas() + " patas");
	}
}