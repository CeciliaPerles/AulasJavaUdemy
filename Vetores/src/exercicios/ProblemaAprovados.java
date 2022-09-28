package exercicios;

import java.util.Scanner;

public class ProblemaAprovados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos alunos voce vai digitar?");
		int numDigitar = sc.nextInt();

		String[] vetorNomeAluno = new String[numDigitar];
		double[] vetorNotaUm = new double[numDigitar];
		double[] vetorNotaDois = new double[numDigitar];
		
		for (int i = 0; i < numDigitar; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + " aluno: ");
			vetorNomeAluno[i] = sc.next();
			vetorNotaUm[i] = sc.nextDouble();
			vetorNotaDois[i] = sc.nextDouble();
		}

		double media = 0;
		System.out.println("Aprovados: ");
		for (int i = 0; i < numDigitar; i++) {
			media = (vetorNotaUm[i] + vetorNotaDois[i])/2;
			if (media > 6) {
			System.out.println(vetorNomeAluno[i]);
			}
		}
				
		sc.close();
	}

}
