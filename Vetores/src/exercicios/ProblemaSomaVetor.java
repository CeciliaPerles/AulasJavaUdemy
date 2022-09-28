package exercicios;

import java.util.Scanner;

public class ProblemaSomaVetor {

	public static void main(String[] args) {

		Scanner scSoma = new Scanner(System.in);
		System.out.println("Quantos numeros ira digitar? ");
		int numDigitar = scSoma.nextInt();
		int[] vect = new int[numDigitar];

		for (int i = 0; i < numDigitar; i++) {
			System.out.println("Numero: ");
			vect[i] = scSoma.nextInt();
		}

		System.out.println("Numeros: ");
		for (int i = 0; i < numDigitar; i++) {
			System.out.println(vect[i]);

		}

		double sum = 0;
		for (int i = 0; i < numDigitar; i++) {
			sum += vect[i];
		}
		System.out.println("Soma: " + sum);

		double avg = sum / numDigitar;
		System.out.println("Media: " + avg);

		scSoma.close();
	}
}
