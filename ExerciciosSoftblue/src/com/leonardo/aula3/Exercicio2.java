package com.leonardo.aula3;

/*
 * @author Leonardo Melo
 * Objetivo: Gerar diferentes sa�das usando loops.
 * 
 */
public class Exercicio2 {

	public static void main(String[] args) {

		Exercicio2.imprimirNumDe10Ate25();
		Exercicio2.imprimirSomaAte100();
		Exercicio2.imprimirSomandoOSeguinte();
		Exercicio2.imprimirTabuada(9);	
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
