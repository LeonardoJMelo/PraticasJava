package com.leonardo.aula9.exercicio3;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
/*
 * @author Leo Melo
 * Objetivo: Usar a API time do java para levantar algumas informações.
 * 
 */
public class Apresentacao {
	public static void main(String[] args) {
		calcularIdadeJamesGosling();
		calculaSegundosAteOMomento();
	}
	public static void calculaSegundosAteOMomento() {
		LocalTime horaInicial = LocalTime.parse("03:00:00");
		LocalTime horaFinal = LocalTime.now();
		
		Duration duracao = Duration.between(horaInicial, horaFinal);
		System.out.println("Se passaram "+duracao.getSeconds()+" segundos, das 3:00 AM até o momento.");
	}
	public static void calcularIdadeJamesGosling() {
		LocalDate dataAtual = LocalDate.now();
		LocalDate dataAniversario = LocalDate.parse("1955-05-19");
		Period periodo = Period.between(dataAniversario,dataAtual);
		System.out.println("A idade de James Gosling é: "+periodo.getYears()+" anos.");
	}
}
