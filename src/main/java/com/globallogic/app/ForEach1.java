package com.globallogic.app;


public class ForEach1 
{
	public static void main( String[] args )
    {
		int[] values = {1,2,3,4,5,6,7,8,9,10};
		for(int num:values) {
			System.out.println("Valor iterado: " + num);
		}
    }
}