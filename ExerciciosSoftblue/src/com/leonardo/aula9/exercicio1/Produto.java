package com.leonardo.aula9.exercicio1;

public class Produto {
	private String nome;
	private double peso;
	private int dia;
	private int mes;
	private int ano;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getNome() {
		return this.nome;
	}
	public double getPeso() {
		return this.peso;
	}
	public int getDia() {
		return this.dia;
	}
	public int getMes() {
		return this.mes;
	}
	public int getAno() {
		return this.ano;
	}
	public String consultarDataValidade() {
		return this.getDia()+"/"+this.getMes()+"/"+this.getAno();
	}
	public String getDataValidade() {
	String s ="l" ;
	return s;
	}
}
