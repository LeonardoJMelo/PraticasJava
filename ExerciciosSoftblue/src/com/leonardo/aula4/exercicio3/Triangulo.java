package com.leonardo.aula4.exercicio3;

public class Triangulo {
	private double base;
	private double altura;
	
	public void setBase(double base) {
		this.base = base;
	}
	public double getBase() {
		return this.base;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getAltura() {
		return this.altura;
	}
	public double calcularArea() {
		double area = this.getBase()*this.getAltura()/2;
		return area;
	}

}
