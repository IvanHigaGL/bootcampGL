package com.globallogic.app;


public class While2 
{
	public static void main( String[] args )
    {
		int i = 1;
		while(i<=50) {
			if(i%2==0) {
				System.out.println("Valor iterado: " + i + " par");
			}
			else {
				System.out.println("Valor iterado: " + i + " impar");
			}
			i++;
		}
    }
}