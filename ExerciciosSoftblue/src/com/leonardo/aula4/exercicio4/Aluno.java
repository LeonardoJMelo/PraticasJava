package com.leonardo.aula4.exercicio4;

import java.util.Scanner;

public class Aluno {
	Scanner scan = new Scanner(System.in);
	private String nome;
	private Prova prova1 = new Prova();
	private Prova prova2 = new Prova();

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setProva1(double nota1, double nota2) {
		this.prova1.setNota1(nota1);
		this.prova1.setNota2(nota2);
	}
	public void setProva2(double nota1, double nota2) {
		this.prova2.setNota1(nota1);
		this.prova2.setNota2(nota2);
	}
	public String exibirNotas() {
		String exibirNome = "Nome do aluno: "+getNome()+"\n";
		String exibirNotaProva1 = "Nota1: "+this.prova1.getNota1()+"\nNota2: "+this.prova1.getNota2();
		String exibirNotaProva2 = "Nota1: "+this.prova2.getNota1()+"\nNota2: "+this.prova2.getNota2();
		return exibirNome+"Prova1\n"+exibirNotaProva1+"\nProva2\n"+exibirNotaProva2;
	}
	public double calcularMedia() {
		double media = prova1.calcularNota()+prova2.calcularNota();
		return media/2;
	}
	protected double definirNota() throws Exception{
		double nota = 0.0;
		if(nota ==-1) {
			scan.close();
		}
		System.out.print("Digite um valor:");
		nota = scan.nextDouble();
		return validarNota(nota);
	} 
	protected String definirNome() {
		String nome = scan.nextLine();
		return nome.trim();
	}
	private double validarNota(double valor1) {
		if(valor1==-1) {
			throw new RuntimeException("Programa finalizado.");
		}
		return valor1;
	}
}
