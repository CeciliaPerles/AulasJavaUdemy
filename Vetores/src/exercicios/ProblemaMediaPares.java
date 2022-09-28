package exercicios;

import java.util.Scanner;

public class ProblemaMediaPares {

	public static void main(String[] args) {
		Scanner scPares = new Scanner(System.in);
		System.out.println("Quantos elementos vai ter o vetor?");
		int numDigitar = scPares.nextInt();

		double vetor[] = new double[numDigitar];

		for (int i = 0; i < numDigitar; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = scPares.nextDouble();
		}

		double somaPares = 0;
		int numeroDeValoresPares = 0;
		for (int i = 0; i < numDigitar; i++) {
			if (vetor[i] % 2 == 0) {
				somaPares += vetor[i];
				numeroDeValoresPares += 1;
			}
		}
			if (somaPares == 0) {
				System.out.println("Nao ha numeros pares");
			} else {
				
				System.out.printf("Media pares = %.1f\n", somaPares / numeroDeValoresPares);
			

		}
		scPares.close();
	}
}
