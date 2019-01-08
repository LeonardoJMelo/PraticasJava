package com.leonardo.aula7.exercicio2;

public class Porta implements Cloneable{
	private double altura;
	private double largura;
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getAltura() {
		return this.altura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double getLargura() {
		return this.largura;
	}
	
	public Object clone() throws CloneNotSupportedException {
		Porta porta = new Porta();
		porta.altura = this.altura;
		porta.largura = this.largura;
		return porta;
	}
}
