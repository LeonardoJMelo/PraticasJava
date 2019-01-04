package com.leonardo.aula5.exercicio1;

import java.util.Scanner;

/*
 * @author Leonardo Melo
 * Objetivo: Interagir com uma classe Lâmpada.
 * 
 */
public class Apresentacao {

	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		Scanner scan = new Scanner(System.in);
		try {
			while(true) {
				System.out.println("Escolha a ação desejada: \n0 - Desligar Lâmpada. \n1 - Ligar Lâmpada. \nPara finalizar pressione outro número qualquer.");
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
				default: throw new RuntimeException("Ação inválida, programa finalizado.");
				}
			}
		}catch(Exception e) {
			scan.close();
			System.out.println(e.getMessage());}
	}
}
