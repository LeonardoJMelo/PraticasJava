package com.leonardo.aula7.exercicio1;

public class ContaInvestimento extends ContaBancaria implements IConta{

	@Override
	public double calcularSaldo() {
		double rendimento = this.getSaldo()*5/100;
		double saldoFinal = this.getSaldo()+rendimento;
		this.setSaldo(saldoFinal);
		return this.getSaldo();
	}

	@Override
	public double consultarSaldo() {
		return this.getSaldo();
	}
}
