package com.leonardo.aula4.exercicio3;

import java.util.Scanner;

public class Acoes {
	public void calcularArea(int opcao) {
		Scanner scan = new Scanner(System.in);
		if(opcao==1) {
			System.out.print("Informe o valor de um dos lados do quadrado:");
			double l = scan.nextDouble();
			Quadrado quadrado = new Quadrado();
			quadrado.setLado(l);
			System.out.println("Área do Quadrado: "+quadrado.calcularArea());
		}else if(opcao==2) {
			System.out.print("Informe o valor da base do triângulo:");
			double base = scan.nextDouble();
			Triangulo triangulo = new Triangulo();
			triangulo.setBase(base);
			System.out.print("Informe o valor da altura do triângulo:");
			double altura = scan.nextDouble();
			triangulo.setAltura(altura);
			System.out.println("Área do triângulo: "+triangulo.calcularArea());
		}else if(opcao==3) {
			System.out.print("Informe o valor da base maior do trapézio:");
			Trapezio trapezio = new Trapezio();
			double baseMaior = scan.nextDouble();
			trapezio.setBaseMaior(baseMaior);
			System.out.print("Informe o valor da base menor do trapézio:");
			double baseMenor = scan.nextDouble();
			trapezio.setBaseMenor(baseMenor);
			System.out.print("Informe o valor da altura do trapézio: ");
			double altura = scan.nextDouble();
			trapezio.setAltura(altura);
			System.out.println("Área do Trapézio = "+trapezio.calcularArea());
		}else if(opcao==4) {
			System.out.print("Informe o valor do raio da Circunferência:");
			Circunferencia circunferencia = new Circunferencia();
			double raio = scan.nextDouble();
			circunferencia.setRaio(raio);
			System.out.printf("Área da Circunferência: %.2f",circunferencia.calcularArea());
		}else if(opcao<=0||opcao>4){
			System.out.println("Ação inválida, programa finalizado!");
		}
		scan.close();
	}
}