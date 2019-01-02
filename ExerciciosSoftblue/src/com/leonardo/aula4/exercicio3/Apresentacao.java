package com.leonardo.aula4.exercicio3;

import java.util.Scanner;

/*
 * @author Leo Melo
 * Objetivo: Calcular a área de algumas figuras geométricas.
 *
 */
public class Apresentacao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Por favor, informe com o respectivo valor, a figura geometrica que deseja calcular a área:\n 1 - Quadrado \n2 - Triângulo \n3 - Trapézio \n4 - Circunferência \n0 - Sair do Programa");
		int opcao = scan.nextInt();
		Acoes acoes = new Acoes();
		acoes.calcularArea(opcao);
		scan.close();
	}
}