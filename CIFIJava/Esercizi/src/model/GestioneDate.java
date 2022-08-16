package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GestioneDate {

	public static void main(String[] args) {
		
		LocalDate oggiLD = LocalDate.now();
		System.out.println("oggi: " + oggiLD.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("ieri: " + LocalDate.now().plusDays(-1));
		System.out.println("domani: " + LocalDate.now().plusDays(1));
		
		LocalDate d = LocalDate.of(2008, 5, 21);
		System.out.println("data: " + d.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		

	}

}
