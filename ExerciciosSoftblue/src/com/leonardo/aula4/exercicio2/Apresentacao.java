package com.leonardo.aula4.exercicio2;

import java.util.Scanner;

/*
 * @author Leonardo Melo
 * Objetivo: Calcular duas frações, e com o resultado de ambas, formar uma nova fração
 * 
 */
public class Apresentacao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Fracao fracao1 = new Fracao();
		Fracao fracao2 = new Fracao();
		try {
			System.out.print("Digite o numerador: ");
			double primeiroNumerador = scan.nextDouble();
			fracao1.setNumerador(primeiroNumerador);
			System.out.print("Digite o denominador: ");
			double primeiroDenominador = scan.nextDouble();
			fracao1.setDenominador(primeiroDenominador);
			System.out.print("Digite o numerador: ");
			double segundoNumerador = scan.nextDouble();
			fracao2.setNumerador(segundoNumerador);
			System.out.print("Digite o denominador:");
			double segundoDenominador = scan.nextDouble();
			fracao2.setDenominador(segundoDenominador);
			Fracao fracao3 = fracao1.multiplicarFracoes(fracao2);
			scan.close();
			System.out.println(fracao3.obterNovaFracao());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
