package com.leonardo.aula7.exercicio1;

public interface IConta {
	void depositar(double valor) throws ValorInvalidoException;
	void sacar(double valor) throws SaldoInsuficienteException;
	void transferir(double valor, IConta conta) throws SaldoInsuficienteException, ValorInvalidoException;
	double calcularSaldo();
	double consultarSaldo();
}