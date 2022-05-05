package com.globallogic.app;


public class ForEach3 
{
	public static void main( String[] args )
    {
		String textToRead = "Bootcamp 2020";
		for(char letter:textToRead.toCharArray()) {
			System.out.println("Letra: " + letter);
		}
    }
}