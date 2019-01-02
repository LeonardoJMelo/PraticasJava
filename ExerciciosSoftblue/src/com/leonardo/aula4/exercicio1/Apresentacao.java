package com.leonardo.aula4.exercicio1;

import java.util.Scanner;

/*
 * @author Leonardo Melo
 * Objetivo: Ajustar a respectiva hora, baseando-se na posição do ponteiro no relógio.
 *  
 */
public class Apresentacao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Relogio relogio = new Relogio();
		try {
			System.out.print("Informe a hora desejada: ");
			int hora = scan.nextInt();
			System.out.print("Informe a posição do pinteiro para minutos: ");
			int minuto = scan.nextInt();
			System.out.print("Informe a posição do ponteiro para segundos: ");
			int segundo = scan.nextInt();
			scan.close();
			relogio.acertarRelogio(hora, minuto, segundo);
			System.out.printf("%02d:%02d:%02d",relogio.getPonteiroHora(),relogio.getPonteiroMinuto(),relogio.getPonteiroSegundo());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}