package com.globallogic.app;

import java.util.Scanner;

public class If3 
{
	public static void main( String[] args )
    {
    	    	Scanner scanner = new Scanner(System.in);
    	
    	int compra = Integer.parseInt(scanner.nextLine());
    	
    	if(compra==300 || compra>350){
    		String descuento;
    		if(compra==300) {
    			descuento = "20";
    		}
    		else{
    			descuento = "25";
    		}
    		System.out.println("El descuento es de: " + descuento + "%");
    	}
    	else {
    		System.out.println("Sin descuentos, el total es: $" + compra);
    	}
    	
    }
}