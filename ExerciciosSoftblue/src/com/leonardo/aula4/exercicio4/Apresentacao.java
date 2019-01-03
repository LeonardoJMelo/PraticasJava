package com.leonardo.aula4.exercicio4;

/*
 * @author Leonardo Melo
 * Objetivo: Montar uma turma com dois alunos, calcular a média individual deles. Feito isso devemos
 * calcular a média da turma.
 * 
 */
public class Apresentacao {
	public static void main(String[] args) {
		System.out.println("Para finalizar o programa digite -1");
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		double[][] notas = new double[2][4];
		Turma turma = new Turma();
		turma.aluno1 = aluno1;
		turma.aluno2 = aluno2;
		try {
			System.out.println("Digite o nome do aluno: ");
			String nome = aluno1.definirNome();
			aluno1.setNome(nome);
			System.out.println("Primeira prova: ");
			notas[0][0] = aluno1.definirNota();
			notas[0][1] = aluno1.definirNota();
			aluno1.setProva1(notas[0][0],notas[0][1]);
			System.out.println("Segunda prova");
			notas[0][2] = aluno1.definirNota();
			notas[0][3] = aluno1.definirNota();
			aluno1.setProva2(notas[0][2], notas[0][3]);
			System.out.println(aluno1.exibirNotas()+"\nMédia do aluno: "+aluno1.calcularMedia());
			System.out.println();
			System.out.println("Digite o nome do aluno: ");
			String nomeAluno = aluno2.definirNome();
			aluno2.setNome(nomeAluno);
			System.out.println("Primeira prova: ");
			notas[1][0]=aluno2.definirNota();
			notas[1][1]=aluno2.definirNota();
			aluno2.setProva1(notas[1][1], notas[1][0]);
			System.out.println("Segunda prova: ");
			notas[1][2] = aluno2.definirNota();
			notas[1][3] = aluno2.definirNota();
			aluno2.setProva2(notas[1][2], notas[1][3]);
			System.out.println(aluno2.exibirNotas()+"\nMédia do aluno: "+aluno2.calcularMedia());
			System.out.println("Média da turma: "+turma.calcularMediaTurma());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}	
}
