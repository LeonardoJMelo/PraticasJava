package com.leonardo.aula3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * @author Leonardo Melo
 * Objetivo: Verificar se � um valor v�lido e calcular a m�dia de todas notas que o usu�rio informar.
 * 
 */
public class Exercicio7 {
	public static void main(String[] args) {
		int qtdNotas = 0;
		int contador = 1;
		double somaNotas = 0.0;
		while(true) {
			System.out.println("Digite a Nota"+(contador++)+":");
			double nota = Exercicio7.lerDecimal();
			if(nota == -1) {
				break;
			}else if(nota<0.0||nota>10.0){
				System.out.println("Nota inv�lida.");
				continue;
			}
			somaNotas+=nota;
			qtdNotas++;
		}
		double media = somaNotas/qtdNotas;
		System.out.println("A m�dia foi: "+media);
	}
	public static String lerLinha() {
		try {
			BufferedReader buffered = new BufferedReader(new InputStreamReader(System.in));
			return buffered.readLine();

		} catch (IOException e) {
			throw new RuntimeException("Erro ao ler dados do teclado.");
		}
	}
	public static int lerNumInteiro() {
		String leitura = lerLinha();
		try {
			return Integer.parseInt(leitura);
		}catch(Exception e) {
			throw new RuntimeException(leitura+" N�o � um int valido.");
		}
	}
	public static double lerDecimal() {
		String leitura = lerLinha();
		try {
			return Double.parseDouble(leitura);
		}catch(Exception e) {
			throw new RuntimeException(leitura+" N�o um decimal valido.");
		}
	}	
}
