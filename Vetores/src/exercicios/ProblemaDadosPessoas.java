package exercicios;

import java.util.Scanner;

public class ProblemaDadosPessoas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas voce vai digitar?");
		int numDigitar = sc.nextInt();

		double[] vetorAlturaPessoas = new double[numDigitar];
		String[] vetorGeneroPessoas = new String[numDigitar];

		for (int i = 0; i < numDigitar; i++) {
			System.out.println("Digite altura da " + (i + 1) + " pessoa: ");
			vetorAlturaPessoas[i] = sc.nextDouble();
			System.out.println("Digite genero da " + (i + 1) + " pessoa: ");
			vetorGeneroPessoas[i] = sc.next();
		}

		double maiorAltura = vetorAlturaPessoas[0];
		double menorAltura = vetorAlturaPessoas[0];

		for (int i = 1; i < numDigitar; i++) {
			if (vetorAlturaPessoas[i] < menorAltura) {
				menorAltura = vetorAlturaPessoas[i];
			}
			if (vetorAlturaPessoas[i] > maiorAltura) {
				maiorAltura = vetorAlturaPessoas[i];
			}
		}

		int numeroDeHomens = 0;
		int numeroDeMulheres = 0;
		double somaAlturaMulheres = 0;
		double mediaAlturaMulheres = 0;
		char m = 'm';

		for (int i = 0; i < numDigitar; i++) {
			if (vetorGeneroPessoas[i].charAt(0) == m) {
				numeroDeHomens++;
			} else {
				numeroDeMulheres++;
				somaAlturaMulheres = somaAlturaMulheres + vetorAlturaPessoas[i];
			}
		}

		mediaAlturaMulheres = somaAlturaMulheres / numeroDeMulheres;

		System.out.println("Menor altura: " + menorAltura);
		System.out.println("Maior altura: " + maiorAltura);
		System.out.println("Numero de homens: " + numeroDeHomens);
		System.out.println("Media altura mulheres: " + mediaAlturaMulheres);
		sc.close();
	}

}
