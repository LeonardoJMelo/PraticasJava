package com.leonardo.aula4.exercicio3;

public class Trapezio {
	private double baseMaior;
	private double baseMenor;
	private double altura;
	
	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}
	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getBaseMaior() {
		return this.baseMaior;
	}
	public double getBaseMenor() {
		return this.baseMenor;
	}
	public double getAltura() {
		return this.altura;
	}
	public double calcularArea() {
		double area = (this.getBaseMaior()+this.getBaseMenor())/2*this.getAltura();
		return area;
	}

}
