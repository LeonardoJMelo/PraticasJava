package com.leonardo.aula7.exercicio1;

public class ContaCorrente extends ContaBancaria implements IConta{

	@Override
	public double calcularSaldo() {
		double imposto = this.getSaldo()*10/100;
		double saldoFinal = this.getSaldo()-imposto;
		this.setSaldo(saldoFinal);
		return this.getSaldo();
	}

	@Override
	public double consultarSaldo() {
		return this.getSaldo();
	}
}
