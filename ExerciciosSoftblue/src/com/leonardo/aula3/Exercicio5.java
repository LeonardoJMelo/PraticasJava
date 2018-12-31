package com.leonardo.aula3;

import java.util.Scanner;

/*
 * @author Leonardo Melo
 * Objetivo: Verificar se um valor é par/impar, e realizar um calculo com diferentes estruturas de 
 * decisão.
 * 
 */
public class Exercicio5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um numero qualquer: ");
		int valor = scan.nextInt();
		scan.close();
		Exercicio5.verificarComOpTernario(valor);	
	}
	public static void verificarComOpTernario(int valor) {
		for(int contador = 0; valor<1000; contador++) {
			valor = (valor%2)==0? valor+5:valor*2;
			System.out.println(valor);
		}
	}
	public static void verificarComifElse(int valor) {
		while(valor<1000) {
			if((valor%2)==0) {
				valor+=5;
			}else {
				valor*=2;
			}
			System.out.println(valor);
		}
	}
	public static void verificarComSwitch(int valor) {
		do {
			switch(valor%2) {
			case 0: valor = valor+5;
			break;
			default: valor = valor*2;
			}
			System.out.println(valor);
		}while(valor<1000);
	}
}