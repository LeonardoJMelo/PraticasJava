package com.leonardo.aula5.exercicio1;

import java.util.Scanner;

/*
 * @author Leonardo Melo
 * Objetivo: Interagir com uma classe L�mpada.
 * 
 */
public class Apresentacao {

	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		Scanner scan = new Scanner(System.in);
		try {
			while(true) {
				System.out.println("Escolha a a��o desejada: \n0 - Desligar L�mpada. \n1 - Ligar L�mpada. \nPara finalizar pressione outro n�mero qualquer.");
				int acao = scan.nextInt();
				switch(acao) {
				case 0: try {
					lampada.desligar();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
				case 1: try {
					lampada.ligar();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
				default: throw new RuntimeException("A��o inv�lida, programa finalizado.");
				}
			}
		}catch(Exception e) {
			scan.close();
			System.out.println(e.getMessage());}
	}
}
