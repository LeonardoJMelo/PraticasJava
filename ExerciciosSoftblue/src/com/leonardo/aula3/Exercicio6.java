package com.leonardo.aula3;

import java.util.Scanner;

/*
 * @author Leonardo Melo
 * Objetivo: Receber e validar dados que irão compor uma data.
 * 
 */
public class Exercicio6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o dia: ");
		int dia = scan.nextInt();
		System.out.print("Informe o mês:");
		int mes = scan.nextInt();
		System.out.print("Informe o ano");
		int ano = scan.nextInt();
		scan.close();
		try {
			Exercicio6.validarData(dia, mes, ano);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void validarData(int dia, int mes, int ano) throws Exception {
		if((dia>0&&dia<31)&&(mes>0&&mes!=2&&mes<=12)&&ano==2018) {
			System.out.println(dia+" / "+mes+" / "+ano);
		}else if((dia>0&&dia<=29)&&(mes==2)&&ano==2018) {
			System.out.println(dia+"/"+mes+"/"+ano);
		}else{
			throw new RuntimeException("Data é inválida!");
		}
	}
}
