package com.leonardo.aula9.exercicio1;

public class Apresentacao {

	public static void main(String[] args) {
		Produto p = new Produto();
		p.setNome("Maça");
		p.setPeso(3.8);
		p.setDia(10);
		p.setMes(1);
		p.setAno(2019);
		
		System.out.printf("%9s %09.2f %nData de validade: "+p.consultarDataValidade(),p.getNome(),p.getPeso());
	
		double x =-1234567;
		char q = 'R';
		System.out.printf("%n%+,015.2f %<.2f %30c", x,q);
	}

}
