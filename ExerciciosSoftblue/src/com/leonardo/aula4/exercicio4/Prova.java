package com.leonardo.aula4.exercicio4;

public class Prova {
	private double nota1;
	private double nota2;

	public void setNota1(double nota1) {
		if(nota1>=0&&nota1<=5) {
			this.nota1 = nota1;
		}else {
			throw new RuntimeException("Valor inválido.");
		}
	}
	public void setNota2(double nota2) {
		if(nota2>=0&&nota2<=5) {
			this.nota2 = nota2;
		}else {
			throw new RuntimeException("Valor inválido");
		}
	}
	public double getNota1() {
		return this.nota1;
	}
	public double getNota2() {
		return this.nota2;
	}
	public double calcularNota() {
		double notaFinal = this.getNota1()+this.getNota2();
		return notaFinal;
	}

}
