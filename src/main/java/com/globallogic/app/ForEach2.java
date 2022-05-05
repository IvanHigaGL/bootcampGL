package com.globallogic.app;


public class ForEach2 
{
	public static void main( String[] args )
    {
		String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
		for(String dia:dias) {
			System.out.println("Dia de la semana: " + dia);
		}
    }
}