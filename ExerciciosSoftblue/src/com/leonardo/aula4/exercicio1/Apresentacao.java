package com.leonardo.aula4.exercicio1;

/*
 * @author Leonardo Melo
 * Objetivo: Ajustar a respectiva hora, baseando-se na posição do ponteiro no relógio.
 *  
 */
public class Apresentacao {
	public static void main(String[] args) {
		Relogio relogio = new Relogio();
		try {
			relogio.acertarRelogio(17, 12, 12);
			System.out.printf("%02d:%02d:%02d",relogio.getPonteiroHora(),relogio.getPonteiroMinuto(),relogio.getPonteiroSegundo());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}