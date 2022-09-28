package exercicios;

import java.util.Scanner;

public class ProblemaMaisVelho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas voce vai digitar?");
		int numeroPessoas = sc.nextInt();
		
		String[] vetorNomePessoas = new String[numeroPessoas];
		int[] vetorIdadePessoas = new int[numeroPessoas];
		
		System.out.println("Dados da pessoa:");
		
		for (int i = 0; i < numeroPessoas; i++) {
			System.out.println("Nome da pessoa:");
			vetorNomePessoas[i] = sc.next();
			System.out.println("Idade da pessoa:");
			vetorIdadePessoas[i] = sc.nextInt();
		}
		
		int maiorIdade = vetorIdadePessoas[0];
		int posicaoMaiorIdade = 0;
				
		for (int i = 0; i < numeroPessoas; i++) {
			if (vetorIdadePessoas[i] > maiorIdade) {
				maiorIdade = vetorIdadePessoas[i];
				posicaoMaiorIdade = i;
			}
		}
		System.out.println("Maior idade: " + vetorNomePessoas[posicaoMaiorIdade]);
		
		
		
		
		sc.close();
	}

}
