package com.leonardo.aula5.exercicio2;

import java.util.Scanner;

/*
 * @author Leonardo Melo
 * Objetivo: Marcar um evento, passando uma descri��o, data e um hor�rio. O hor�rio padr�o pode ser definido no formato 12 ou 24 horas.
 *  
 */
public class Apresentacao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Marcar um evento");
			System.out.print("Evento: ");
			String evento = scan.nextLine();
			System.out.print("Dia:");
			int dia = scan.nextInt();
			System.out.print("M�s: ");
			int mes = scan.nextInt();
			System.out.print("Ano: ");
			int ano = scan.nextInt();
			System.out.print("Hora: ");
			int hora = scan.nextInt();
			System.out.print("Minutos: ");
			int minutos = scan.nextInt();
			scan.close();
			Data d = new Data(evento,dia,mes,ano,hora,minutos);
			d.imprimir(1);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
