package com.globallogic5.app;

import java.util.ArrayList;
import java.util.List;

public class Polimorfismo
{	
	public static void main(String[] args){
		
		Heladera heladera1 = new Heladera();
		Televisor televisor1 = new Televisor();
		Cafetera cafetera1 = new Cafetera();

		List <Electrodomestico> listaElect = new ArrayList<Electrodomestico>();
		listaElect.add(heladera1);
		listaElect.add(televisor1);
		listaElect.add(cafetera1);
		
		for(Electrodomestico e :listaElect) {
			e.encender();
		}
	}
}