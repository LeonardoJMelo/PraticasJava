package com.leonardo.aula9.exercicio1;

/*
 * @author Leonardo Melo
 * Objetivo: Formatar uma saída de produtos com printf.
 *
 */
public class Apresentacao {
	public static void main(String[] args) {
		Produto[] produto = new Produto[6];
		produto[0] = new Produto("Maça", 3.8, 12,1,2019);
		produto[1] = new Produto("Uva",2.7, 11,1,2019);
		produto[2] = new Produto("Banana", 1.9, 20,1,2019);
		produto[3] = new Produto("Melancia", 4,21,1,2019);
		produto[4] = new Produto("Morango", 1.8,24,1,2019);
		produto[5] = new Produto("Laranja", 2.1, 27,1,2019);

		for(int cont = 0; cont<produto.length; cont++){
			System.out.printf(cont+") %9s %09.2f %s",produto[cont].getNome(),produto[cont].getPeso(),produto[cont].consultarDataValidade());
			System.out.println();
		}
	}
}