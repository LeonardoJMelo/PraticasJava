package com.leonardo.aula8.exercicio;

public class Apresentacao {

	public static void main(String[] args) {
		Object o = null;
		try {
			o.toString();
		}catch(NullPointerException e) {
			System.out.println("Programa finalizado, o objeto é nulo.");
		}
	}
}