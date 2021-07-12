package util;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class CalcTempo {
	

	public static void calcularHora() {
		
		LocalTime inicio = LocalTime.now();
		LocalTime fim = LocalTime.now();
		
		System.out.println(inicio + " - " + fim);
		
		Duration tempo = Duration.between(inicio, fim);
		System.out.println(tempo.toHours());
	}

}
