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
		LocalTime dataInicial = LocalTime.parse("03:00:00");
		LocalTime dataFinal = LocalTime.now();
		
		Duration d = Duration.between(dataInicial, dataFinal);
		System.out.println("Se passaram "+d.getSeconds()+" segundos, das 3:00 AM até o momento.");
	}
	public static void calcularIdadeJamesGosling() {
		LocalDate dataAtual = LocalDate.now();
		LocalDate dataAniversario = LocalDate.parse("1955-05-19");
		Period p = Period.between(dataAniversario,dataAtual);
		System.out.println("A idade de James Gosling é: "+p.getYears()+" anos.");
	}
}
