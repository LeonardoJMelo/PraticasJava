package com.leonardo.aula3;

/*
 * @author Leonardo Melo
 * Objetivo: Calcular e exibir os 15 primeiro números da Sequência de fibonnaci.
 * 
 */
public class Exercicio4 {
	public static void main(String[] args) {
		Exercicio4.serieFibonacci();	
	}
	public static void serieFibonacci() {
		int valorSubtraindo=1;
		int valorSomando=0;
		for(int contador=0; contador<15; contador++) {
			valorSomando = valorSubtraindo+valorSomando;
			valorSubtraindo= valorSomando-valorSubtraindo;
			System.out.print(valorSubtraindo+" ");
		}
	}
}
