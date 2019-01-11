package com.leonardo.aula9.exercicio2;


/*
 * @author Leonardo Melo
 * Objetivo: Formatar a saída de strings.
 *
 */
public class Apresentacao {

	public static void main(String[] args) {
		try {
			System.out.println(retornarString(null));
		}catch(NullPointerException e) {
			System.out.println("null");
		}
	}

	public static String retornarString(String palavra) throws NullPointerException{
		String palavraAntiga = palavra.toUpperCase();
		String novaPalavra ="";
		if(palavraAntiga == null) {
			novaPalavra = null;
		}else if(palavraAntiga.length()<=3) {
			novaPalavra = palavraAntiga;
		}else if(palavraAntiga.length()>3) {
			novaPalavra = palavraAntiga.substring(0, 3);
			StringBuffer palavraInvertida = new StringBuffer(novaPalavra);
			palavraInvertida.reverse();
			return palavraInvertida.toString()+palavraAntiga.toUpperCase();
		}
		return novaPalavra;
	}
}