package com.leonardo.aula3;

/*
 * @author Leonardo Melo
 * 
 */
public class Exercicio3 {

	public static void main(String[] args) {

		Exercicio3.calcularFatorial(5);
	}
	public static void calcularFatorial(int valorCalculado) {
		int soma=1;
		for(int contador = valorCalculado; contador>1; contador--) {
			soma = soma* contador;
		}
		System.out.println(soma);
	}
}
