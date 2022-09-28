package application;

import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Scanner scAluno = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		System.out.println("Dados aluno: ");
		System.out.print("Nome: ");
		aluno.nome = scAluno.nextLine();
		System.out.print("Nota Um: ");
		aluno.notaUm = scAluno.nextDouble();
		System.out.print("Nota Dois: ");
		aluno.notaDois = scAluno.nextDouble();
		System.out.print("Nota Tres: ");
		aluno.notaTres = scAluno.nextDouble();

		System.out.println();
		System.out.println("Notas aluno: " + aluno.notaUm + ", " + aluno.notaDois + ", " + aluno.notaTres + ".");

		System.out.println();
		
		if (aluno.notaFinal() >= 60) {
		System.out.println("Voce passou!");
		} else {
		System.out.println("Nota final: " + aluno.notaFinal() + ". Voce nao passou :/ Faltam " + (aluno.pontosFaltantes()) + " pontos.");
		}
		scAluno.close();
	}

}
