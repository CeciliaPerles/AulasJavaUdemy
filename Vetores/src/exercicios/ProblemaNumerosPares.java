package exercicios;

import java.util.Scanner;

public class ProblemaNumerosPares {

	public static void main(String[] args) {

		Scanner scPares = new Scanner(System.in);
		System.out.println("Quantos numeros ira digitar? ");
		int numDigitar = scPares.nextInt();
		int quantidadeNumeroPar = 0;

		int[] vectNumeroDigitar = new int[numDigitar];

		for (int i = 0; i < numDigitar; i++) {
			System.out.println("Numero: ");
			vectNumeroDigitar[i] = scPares.nextInt();
		}

		System.out.println("Numeros pares: ");
		for (int i = 0; i < numDigitar; i++) {
			if (vectNumeroDigitar[i] % 2 == 0) {
				System.out.println(vectNumeroDigitar[i]);
				quantidadeNumeroPar += 1;
			}
		}
		System.out.println("Quantidade numeros pares: " + quantidadeNumeroPar);
		scPares.close();

	}

}
