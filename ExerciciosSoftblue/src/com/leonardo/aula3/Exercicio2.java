package com.leonardo.aula3;

import java.util.Scanner;

/*
 * @author Leonardo Melo
 * Objetivo: Gerar diferentes saídas usando loops.
 * 
 */
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Exercicio2.imprimirNumDe10Ate25();
		Exercicio2.imprimirSomaAte100();
		Exercicio2.imprimirSomandoOSeguinte();
		System.out.print("Informe o valor que deseja ser multiplicado: ");
		int valor = scan.nextInt();
		scan.close();
		Exercicio2.imprimirTabuada(valor);	
	}

	public static void imprimirNumDe10Ate25() {
		for(int contador = 10; contador<=25; contador++) {
			System.out.print(contador+" ");
		}
		System.out.println();
	}
	public static void imprimirSomaAte100() {
		for(int contador=1; contador<=100; contador+=2) {
			System.out.print(contador+" ");
		}
		System.out.println();
	}	
	public static void imprimirSomandoOSeguinte() {
		int soma = 0;		
		int contador = 0;		
		while (soma + contador < 100) {
			soma += contador;
			contador++;
		}
		System.out.println(soma);
	}
	public static void imprimirTabuada(int valorMultiplicado) {
		int contador = 0;
		do {
			int resultado = valorMultiplicado*contador;
			System.out.println(valorMultiplicado + " X " + contador + " = " + resultado);
			contador++;
		}while(contador<=10);
		System.out.println();
	}

}
