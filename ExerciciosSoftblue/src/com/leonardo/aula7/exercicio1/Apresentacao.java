package com.leonardo.aula7.exercicio1;

import java.util.Scanner;

/*
 * @author Leonardo Melo
 * Objetivo: Praticar conceitos de orientação a objetos(herança, polimorfismo, e encapsulamento), Através de duas contas bancárias e transações bancárias,
 * e também criar as próprias classes de Exceptions referentes a operações bancárias implementadas na nossa aplicação.
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
				System.out.println("Informe a ação que deseja realizar: \n1 - Depósito \n2 - Saque \n3 - Transferência \n0 - Sair");
				int acao = scan.nextInt();
				if(acao==1) {
					System.out.print("Valor do depósito: ");
					double valor = scan.nextDouble();
					conta1.depositar(valor);
				}
				else if(acao==2) {
					System.out.print("Valor do saque: ");
					double valor = scan.nextDouble();
					conta1.sacar(valor);
				}
				else if(acao==3) {
					System.out.print("Valor da transferência: ");
					double valor = scan.nextDouble();
					conta1.transferir(valor, conta2);
				}else {
					System.out.println("Transação finalizada.");
				} 
				System.out.println("Saldo conta1: "+(conta1.calcularSaldo())+"\nSaldo Conta2: "+conta2.calcularSaldo());
				System.out.println();
				System.out.print("Deseja fazer outra operação? \n1 - SIM \n2 - NÃO");

				int p = scan.nextInt();
				if(p==1) {
					continuar = true;
				}else {
					continuar = false;
					System.out.println("Transação finalizada.");
				}
			}
			scan.close();
		}catch(Exception e) {
			System.out.println("Erro: "+e.getMessage());
		}
	}
}