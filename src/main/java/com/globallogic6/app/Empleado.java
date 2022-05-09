package com.globallogic6.app;


public class Empleado extends Persona{
	private String dni;
	private String nombre;
	private double sueldoBase;
	private int horasExtrasMes;
	private int tipoIRPF;
	private boolean casado;
	private int cantHijos;
	private static double importeHoraExtra;
	
	
	

	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getTipoIRPF() {
		return tipoIRPF;
	}
	public void setTipoIRPF(int tipoIRPF) {
		this.tipoIRPF = tipoIRPF;
	}
	
	public int getHorasExtrasMes() {
		return horasExtrasMes;
	}
	public void setHorasExtrasMes(int horasExtrasMes) {
		this.horasExtrasMes = horasExtrasMes;
	}
	
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
	public boolean isCasado() {
		return casado;
	}
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	
	public int getCantHijos() {
		return cantHijos;
	}
	public void setCantHijos(int cantHijos) {
		this.cantHijos = cantHijos;
	}

	public static double getImporteHoraExtra() {
		return importeHoraExtra;
	}
	public static void setImporteHoraExtra(double importeHoraExtra) {
		Empleado.importeHoraExtra = importeHoraExtra;
	}
	
	public double getComplementoHorasExtras() {
		double complemento;
		int horasExtra = this.getHorasExtrasMes();
		double importeHoraExtra = Empleado.getImporteHoraExtra();
				
		complemento = horasExtra * importeHoraExtra;
		
		return complemento;
	}
	
	public double getSueldoBruto () {
		double sueldoBruto;
		double sueldoBase = this.getSueldoBase();
		double complementoHorasExtra = this.getComplementoHorasExtras();
		
		sueldoBruto = sueldoBase + complementoHorasExtra;
		
		return sueldoBruto;
	}
	
	public double getRetenciones() {
		double porcentajeRetenciones = this.getTipoIRPF();
		boolean casado = this.isCasado();
		int cantHijos = this.getCantHijos();
		
		if (casado == true) {
			if(cantHijos !=0) {
				porcentajeRetenciones -= cantHijos + 2;
			}
			else{
				porcentajeRetenciones -= 2;
			}
		}
		else {
			if(cantHijos !=0) {
				porcentajeRetenciones -= cantHijos;
			}
		}
		
		return porcentajeRetenciones;
	}
	
	public void employeeToString() {
		System.out.println(dni + " " + nombre);
		System.out.println("Sueldo base: " + sueldoBase);
		System.out.println("Horas extra: " + horasExtrasMes);
		System.out.println("Tipo IRPF: " + tipoIRPF);
		
		if (this.casado == true) {System.out.println("Casado: S");}
		else {System.out.println("Casado: N");};
		System.out.println("Numero de Hijos: " + cantHijos);
	}
	
}