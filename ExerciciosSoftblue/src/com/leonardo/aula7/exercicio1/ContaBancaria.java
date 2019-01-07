package com.leonardo.aula7.exercicio1;

public abstract class ContaBancaria implements IConta {
	private double saldo;

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo() {
		return this.saldo;
	}
	@Override
	public void depositar(double valor) throws ValorInvalidoException {
		if(valor<0) {
			throw new ValorInvalidoException("Valor inválido para depósito.");
		}
		this.setSaldo(this.getSaldo()+valor);
	}
	@Override
	public void sacar(double valor) throws SaldoInsuficienteException{
		if(this.getSaldo()<valor) {
			throw new SaldoInsuficienteException("Saldo insuficiente.");
		}
		this.setSaldo(this.getSaldo()-valor);
	}
	@Override
	public void transferir(double valor, IConta conta) throws SaldoInsuficienteException, ValorInvalidoException {
		this.sacar(valor);
		conta.depositar(valor);
	}
	@Override
	public abstract double calcularSaldo();
}
