package com.globallogic6.app;

import java.util.Scanner;

public class ClasesObjetos
{	
	public static void main(String[] args){
		
		Scanner scanner1 = new Scanner(System.in);
		//importeHorasExtra
		System.out.println("Ingese importe Horas extra");
		Empleado.setImporteHoraExtra(Double.parseDouble(scanner1.nextLine()));
		createEmployeeList();
		
	}
	
	public static void createEmployeeList() {
		
		Scanner scanner = new Scanner(System.in);
		int cantEmpleados;
		Empleado[] empleados = null;
		
		System.out.println("Ingese cant de empleados, debe ser menor o igual a 20");
    	cantEmpleados = Integer.parseInt(scanner.nextLine());
		
    	while(cantEmpleados > 20) {
    		System.out.println("Cantidad de empleados incorrecta, debe ser menor o igual a 20");
    		cantEmpleados = Integer.parseInt(scanner.nextLine());
    	}
    	System.out.println("Cantidad de empleados a ingresar: " + cantEmpleados);
    	
    	for(int i = 0; i<cantEmpleados ;i++) {
    		
    		//dni
    		System.out.println("Ingese DNI");
    		empleados[i].setDni(scanner.nextLine());
    		
    		//nombre
    		System.out.println("Ingese Nombre");
    		empleados[i].setNombre(scanner.nextLine());
    		
    		//sueldoBase
    		System.out.println("Ingese sueldo base");
    		empleados[i].setDni(scanner.nextLine());
    	
    		//horasExtras
    		System.out.println("Ingese horas extras realizadas");
    		empleados[i].setDni(scanner.nextLine());
    		
    		//tipoIRPF
    		System.out.println("Ingese tipo IRPF");
    		empleados[i].setDni(scanner.nextLine());
    		
    		//casado
    		System.out.println("Ingese true si esta casado y false si no lo esta");
    		empleados[i].setDni(scanner.nextLine());
    		
    		//cantHijos
    		System.out.println("Ingese cantidad de hijos");
    		empleados[i].setDni(scanner.nextLine());
    		
    		
    	}
    	
	}
}