package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateClass {

	public static void main(String[] args) {

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

		/*
		 * LocalDate d01 = LocalDate.now(); System.out.println(d01);
		 * 
		 * LocalDateTime d02 = LocalDateTime.now(); System.out.println(d02);
		 * 
		 * Instant d03 = Instant.now(); System.out.println(d03);
		 */

		// Instant nao esta em hora local, mas sim hora global. O dia e horario depende
		// do fuso. Para declarar customizado
		// e preciso informar o fuso

		LocalDate d04 = LocalDate.parse("2022-07-20");
		System.out.println("d04: " + d04.format(fmt1));
		System.out.println("d04: " + fmt1.format(d04));

		System.out.println("d04: " + d04.getDayOfMonth());
		System.out.println("d04: " + d04.getMonthValue());
		System.out.println("d04: " + d04.getYear());

		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeeLocalDate = d04.plusDays(7);

		System.out.println(pastWeekLocalDate + " e " + nextWeeLocalDate);

		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		System.out.println("d05: " + d05.format(fmt1));
		System.out.println("d05: " + d05.format(fmt2));
		System.out.println("d05: " + d05.format(fmt4));

		System.out.println("d05: " + d05.getHour());
		System.out.println("d05: " + d05.getMinute());

		LocalDateTime pastWeekLocalDateTime = d05.minusHours(7);
		LocalDateTime nextWeeLocalDateTime = d05.plusMinutes(7);

		System.out.println(pastWeekLocalDateTime + " e " + nextWeeLocalDateTime);

		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		System.out.println("d06: " + fmt3.format(d06));
		System.out.println("d06: " + fmt5.format(d06));

		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

		System.out.println("d06: " + pastWeekInstant);
		System.out.println("d06: " + nextWeekInstant);

		/*
		 * LocalDate d07 = LocalDate.of(2022, 07, 20); System.out.println(d07);
		 * 
		 * LocalDate d08 = LocalDate.parse("20/07/2022", fmt1); System.out.println(d08);
		 */

		Duration t1 = Duration.between(pastWeekInstant, d06);
		System.out.println("duracao: " + t1.toDays() + " dias");

	}

}
