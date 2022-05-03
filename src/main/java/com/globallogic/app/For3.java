package com.globallogic.app;

import java.util.ArrayList;
import java.util.List;

public class For3 
{
	public static void main( String[] args )
    {
		List <String> diasDeLaSemana =  new ArrayList<String>();
    	diasDeLaSemana.add("Lunes");
    	diasDeLaSemana.add("Martes");
    	diasDeLaSemana.add("Miercoles");
    	diasDeLaSemana.add("Jueves");
    	diasDeLaSemana.add("Viernes");
    	diasDeLaSemana.add("Sabado");
    	diasDeLaSemana.add("Domingo");
		int contador = diasDeLaSemana.size();
    	for(int i=0;i<contador;i++) {
    		System.out.println("Dia de la semana: " + diasDeLaSemana.get(i));
    	}
    	
    }
}