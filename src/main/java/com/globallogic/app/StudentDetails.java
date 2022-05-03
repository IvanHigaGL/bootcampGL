package com.globallogic.app;


public class StudentDetails 
{
	public void studentAge(int age){
		System.out.println("La edad del estudiante es " + age);
	}
	
    public static void main( String[] args )
    {
    	int age1 = 23; 
    	StudentDetails estudiante = new StudentDetails();
    	estudiante.studentAge(age1);
    }
}
