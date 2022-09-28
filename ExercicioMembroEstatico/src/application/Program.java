package application;

import java.util.Locale;
import java.util.Scanner;

import util.Dolar;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Dolar dolar = new Dolar();
		
		System.out.print("Qual valor do dolar? ");
		double valor = sc.nextDouble();
		System.out.print("Qual quantidade de dolares? ");
		double quantidade = sc.nextDouble();
		System.out.printf("Total: %2f%n", Dolar.total(valor, quantidade));
		
		
		sc.close();
	}

}
