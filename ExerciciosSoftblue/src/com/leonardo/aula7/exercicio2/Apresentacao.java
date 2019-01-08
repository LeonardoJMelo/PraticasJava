package com.leonardo.aula7.exercicio2;

public class Apresentacao {

	public static void main(String[] args) {
		Porta porta = new Porta();
		porta.setAltura(1.80);
		porta.setLargura(1);
		Porta portaClonada;
		try {
			portaClonada = (Porta) porta.clone();
			System.out.println("Tamanho da porta: \n"+porta.getAltura() +" x "+ porta.getLargura());
			System.out.println();
			System.out.println("Tamanho porta Clonada: \n"+portaClonada.getAltura()+" x "+portaClonada.getLargura());

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
