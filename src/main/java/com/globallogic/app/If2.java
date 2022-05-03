package com.globallogic.app;

import java.util.Scanner;

public class If2 
{
	public static void main( String[] args )
    {
    	char letter;
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	String letterString = scanner.nextLine();
    	
    	char[] letterCharArray = letterString.toCharArray();
    	
    	letter = letterCharArray[0];
    	
    	if(Character.isUpperCase(letter))
    	{
    		System.out.println("Es una letra mayuscula");
    	}
    	else if(Character.isLowerCase(letter)){
    		System.out.println("Es una letra minuscula");
    	}
    	
    }
}