package com.leonardo.aula4.exercicio2;

public class Fracao {
	private double numerador;
	private double denominador;

	public void setNumerador(double numerador) {
		verificarValor(numerador);
		this.numerador = numerador;
	}
	public void setDenominador(double denominador) {
		verificarValor(denominador);
		this.denominador = denominador;
	}
	public double getNumerador() {
		return this.numerador;
	}
	public double getDenominador() {
		return this.denominador;
	}
	public double calcularValor() {
		double resultado = this.getNumerador() / this.getDenominador();
		return resultado;
	}
	public Fracao multiplicarFracoes(Fracao fracao){
		Fracao novaFracao = new Fracao();
		novaFracao.setNumerador(this.getNumerador()*fracao.getNumerador());
		novaFracao.setDenominador(this.getDenominador()*fracao.getDenominador());
		return novaFracao;
	}
	public String obterNovaFracao() {
		return this.numerador+" / "+this.denominador;
	}
	private void verificarValor(double valor) {
		if(valor==0) {
			throw new RuntimeException("Valor inválido para calculo");
		}
	}
}
