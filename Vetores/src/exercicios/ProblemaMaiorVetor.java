package exercicios;

import java.util.Scanner;

public class ProblemaMaiorVetor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numeros tera cada vetor?");
		int numDigitar = sc.nextInt();
			
		int[] vectA = new int [numDigitar];
		int[] vectB = new int [numDigitar];
		int[] vectC = new int [numDigitar];
		
		System.out.println("Digite os valores do vetor A:");
		for (int i = 0; i < numDigitar; i++) {
			vectA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for (int i = 0; i < numDigitar; i++) {
			vectB[i] = sc.nextInt();
		}
		
		for (int i = 0; i < numDigitar; i++) {
		vectC[i] = vectA[i] + vectB[i];
		}
		
		System.out.println("Soma:");
		for (int i = 0; i < numDigitar; i++) {
			System.out.println(vectC[i]);
			}
			
		sc.close();

	}

}
