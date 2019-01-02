package com.leonardo.aula4.exercicio3;

public class Circunferencia {
	private double raio;
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public double getRaio() {
		return this.raio;
	}
	public double calcularArea() {
		double area = Math.PI*Math.pow(this.getRaio(), 2);
		return area;
	}

}
