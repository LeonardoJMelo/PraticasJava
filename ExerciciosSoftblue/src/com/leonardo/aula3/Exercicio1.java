package com.leonardo.aula3;

import java.util.Scanner;

/*
 * @author Leonardo Melo
 * 
 */

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite a primeira nota: ");
		double nota1 = scan.nextDouble();
		System.out.print("Digite a segunda nota: ");
		double nota2 = scan.nextDouble();
		System.out.print("Digite a terceira nota: ");
		double nota3 = scan.nextDouble();
		scan.close();
		double media = (nota1+nota2+nota3)/3;
		double mediaFormatada = Math.round(media);
		System.out.print("Sua média foi: "+mediaFormatada);
	}
}
