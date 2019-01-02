package com.leonardo.aula4.exercicio3;

public class Quadrado {
	private double lado;
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getLado() {
		return this.lado;
	}
	public double calcularArea() {
		double area = this.getLado()*this.getLado();
		return area;
	}
}
