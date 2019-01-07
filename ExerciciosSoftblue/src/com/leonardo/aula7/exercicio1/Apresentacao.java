package com.leonardo.aula7.exercicio1;

import java.util.Scanner;

/*
 * @author Leonardo Melo
 * Objetivo: Praticar conceitos de orienta��o a objetos(heran�a, polimorfismo, e encapsulamento), Atrav�s de duas contas banc�rias e transa��es banc�rias,
 * e tamb�m criar as pr�prias classes de Exceptions referentes a opera��es banc�rias implementadas na nossa aplica��o.
 *
 */
public class Apresentacao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean continuar = true;
		IConta conta1 = new ContaCorrente();
		IConta conta2 = new ContaInvestimento();
		try {
			while(continuar) {
				System.out.println("Informe a a��o que deseja realizar: \n1 - Dep�sito \n2 - Saque \n3 - Transfer�ncia \n0 - Sair");
				int acao = scan.nextInt();
				if(acao==1) {
					System.out.print("Valor do dep�sito: ");
					double valor = scan.nextDouble();
					conta1.depositar(valor);
				}
				else if(acao==2) {
					System.out.print("Valor do saque: ");
					double valor = scan.nextDouble();
					conta1.sacar(valor);
				}
				else if(acao==3) {
					System.out.print("Valor da transfer�ncia: ");
					double valor = scan.nextDouble();
					conta1.transferir(valor, conta2);
				}else {
					System.out.println("Transa��o finalizada.");
				} 
				System.out.println("Saldo conta1: "+(conta1.calcularSaldo())+"\nSaldo Conta2: "+conta2.calcularSaldo());
				System.out.println();
				System.out.print("Deseja fazer outra opera��o? \n1 - SIM \n2 - N�O");

				int p = scan.nextInt();
				if(p==1) {
					continuar = true;
				}else {
					continuar = false;
					System.out.println("Transa��o finalizada.");
				}
			}
			scan.close();
		}catch(Exception e) {
			System.out.println("Erro: "+e.getMessage());
		}
	}
}