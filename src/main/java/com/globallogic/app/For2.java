package com.globallogic.app;

public class For2 
{
	public static void main( String[] args )
    {
		int contador = 0;
    	for(int i=1;i<=10000;i++) {
    		if(i%20==0) {
    			contador++;
    		}
    	}
    	System.out.println("Valor del contador: " + contador);
    }
}