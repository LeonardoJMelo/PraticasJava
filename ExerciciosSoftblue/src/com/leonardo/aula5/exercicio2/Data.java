package com.leonardo.aula5.exercicio2;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	private int hora;
	private int minuto;
	private String descricao;
	public static final int FORMATO_12H = 1;
	public static final int FORMATO_24H = 2;

	public Data(int dia, int mes, int ano) {
		this.VerificarFevereiro(dia, mes);
		if(dia>0&&dia<=31) {
			this.dia = dia;
		}else{
			throw new RuntimeException("Dia inválido!");
		}
		if(mes>0&&mes<=12) {
			this.mes = mes;
		}else {
			throw new RuntimeException("Mês inválido!");
		}
		if(ano>0&&ano<=2019) {
			this.ano = ano;
		}else {
			throw new RuntimeException("Ano inválido!");
		}
	}
	public Data(String descricao, int dia, int mes, int ano, int hora, int minuto) {
		this(dia, mes, ano);
		if(hora>=0&&hora<=24) {
			this.hora = hora;
		}else {
			throw new RuntimeException("Hora inválida!");
		}
		if(minuto>=0&&minuto<=60) {
			this.minuto = minuto;
		}else {
			throw new RuntimeException("Minutos/segundos inválidos");
		}
		this.descricao = descricao;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getDia() {
		return this.dia;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getMes() {
		return this.mes;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getAno() {
		return this.ano;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getHora() {
		return this.hora;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	public int getMinuto() {
		return this.minuto;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return this.descricao;
	}
	private void VerificarFevereiro(int dia, int mes) {
		if(dia>29&&mes==2) {
			throw new RuntimeException("Dia inválido para Fevereiro.");
		}
	}
	public void imprimir(int formato) {
		String periodo = "";
		if(formato==FORMATO_12H) {
			if(this.getHora()>12) {
				this.setHora(this.getHora()%12);
				periodo = " PM";
			}else {
				periodo = "AM";
			}
		}else if(formato==FORMATO_24H) {
			if(this.getHora()==24) {
				this.setHora(00);
			}else {
				this.getHora();
				this.setHora(this.getHora());
			}
		}
		System.out.println(this.getDescricao());
		System.out.printf("%02d/%02d/%02d - %02d:%02d %s",this.getDia(),this.getMes(),this.getAno(),this.getHora(),this.getMinuto(),periodo);
	}
}
