package exercicios;

import java.util.Scanner;

public class ProblemaMaiorPosicao {

	public static void main(String[] args) {

		Scanner scMaior = new Scanner(System.in);
		System.out.println("Quantos numeros voce vai digitar?");
		int numDigitar = scMaior.nextInt();
		
		int[] vectMaiorPosicao = new int[numDigitar];

		for (int i = 0; i < numDigitar; i++) {
			System.out.println("Numero: ");
			vectMaiorPosicao[i] = scMaior.nextInt();
	
		}
		
		int maiorNumero = vectMaiorPosicao[0];
		int posicaoMaiorNumero = 0;
		
		for (int i = 0; i < numDigitar; i++) {
			if (vectMaiorPosicao[i] > maiorNumero) {
			maiorNumero = vectMaiorPosicao[i];
			posicaoMaiorNumero = i;
		}
		}
		
		System.out.println("Maior numero: " + maiorNumero);
		System.out.println("Posicao maior numero: " + posicaoMaiorNumero);
		
		scMaior.close();
	}

}
