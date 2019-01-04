package com.leonardo.aula5.exercicio1;

public class Lampada {
	private boolean ligada = false;
	
	public boolean getLigada() {
		return this.ligada;
	}
	public void ligar() throws Exception {
		if(this.getLigada()==false) {
		this.ligada=true;
		System.out.println("Lâmpada ligada.");
		}else {
			throw new RuntimeException("A Lâmpada ja esta ligada!");
		}
	}
	public void desligar() throws Exception {
		if(ligada==true) {
			this.ligada = false;
			System.out.println("Lâmpada desligada!");
		}else {
			throw new RuntimeException("A Lâmpada ja esta desligada!");
		}
	}

}
