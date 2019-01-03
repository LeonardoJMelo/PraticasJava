package com.leonardo.aula4.exercicio4;

public class Turma {
	Aluno aluno1 = new Aluno();
	Aluno aluno2 = new Aluno();
	
	public double calcularMediaTurma() {
		double mediaTurma = aluno1.calcularMedia()+aluno2.calcularMedia();
		return mediaTurma;
	}
}
