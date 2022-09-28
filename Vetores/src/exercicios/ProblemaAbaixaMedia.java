package exercicios;

import java.util.Scanner;

public class ProblemaAbaixaMedia {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("QUANTOS ELEMENTOS TERA O VETOR?");
		int numDigitar = scanner.nextInt();

		int[] vetor = new int[numDigitar];

		for (int i = 0; i < numDigitar; i++) {
			System.out.println("DIGITE UM NUMERO: ");
			vetor[i] = scanner.nextInt();
		}
		
		double soma = 0;
		for (int i = 0; i < numDigitar; i++) {
			soma += vetor[i];
		}
		
		double media = 0;
		for (int i = 0; i < numDigitar; i++) {
			media = soma / numDigitar;
			}
		System.out.printf("SOMA = %.3f\n", media);
		
		for (int i = 0; i < numDigitar; i++) {
			media = soma / numDigitar;
			if (vetor[i] < media){
			System.out.printf("ABAIXO DA MEDIA = %.1f\n", vetor[i]);
			}
		}
		

		
		scanner.close();
	}

}
