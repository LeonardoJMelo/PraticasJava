package com.leonardo.aula4.exercicio1;

public class Relogio {
	private Ponteiro ponteiroHora = new Ponteiro();
	private Ponteiro ponteiroMinuto = new Ponteiro();
	private Ponteiro ponteiroSegundo = new Ponteiro();

	public void setPonteiroHora(int posicaoHora) {
		this.ponteiroHora.setPosicao(posicaoHora);
	}
	public void setPonteiroMinuto(int posicaoMinuto) {
		this.ponteiroMinuto.setPosicao(posicaoMinuto);
	}
	public void setPonteiroSegundo(int posicaoSegundo) {
		this.ponteiroSegundo.setPosicao(posicaoSegundo);
	}
	public int getPonteiroHora() {
		return this.ponteiroHora.getPosicao();
	}
	public int getPonteiroMinuto() {
		return this.ponteiroMinuto.getPosicao();
	}
	public int getPonteiroSegundo() {
		return this.ponteiroSegundo.getPosicao();
	}
	public void acertarRelogio(int hora, int minuto, int segundo) {
		setPonteiroHora(validarHora(hora));
		setPonteiroMinuto(validarMinSeg(minuto));
		setPonteiroSegundo(validarMinSeg(segundo));
	}
	private int validarHora(int hora) {
		if(hora>0&&hora<=24) {
			return hora%12;
		}else {
			throw new RuntimeException("Hora inválida.");
		}
	}
	private int validarMinSeg(int valor) {
		if(valor==12) {
			return 00;
		}else if(valor>=0&&valor<=12) {
			return valor*5;
		}else {
			throw new RuntimeException("Valor inválido min/seg");
		}
	}
}
