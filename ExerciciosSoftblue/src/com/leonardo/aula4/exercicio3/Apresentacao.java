package com.leonardo.aula4.exercicio3;

import java.util.Scanner;

/*
 * @author Leo Melo
 * Objetivo: Calcular a �rea de algumas figuras geom�tricas.
 *
 */
public class Apresentacao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Por favor, informe com o respectivo valor, a figura geometrica que deseja calcular a �rea:\n 1 - Quadrado \n2 - Tri�ngulo \n3 - Trap�zio \n4 - Circunfer�ncia \n0 - Sair do Programa");
		int opcao = scan.nextInt();
		Acoes acoes = new Acoes();
		acoes.calcularArea(opcao);
		scan.close();
	}
}