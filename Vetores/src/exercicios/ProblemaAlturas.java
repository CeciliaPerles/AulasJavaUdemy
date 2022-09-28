package exercicios;

import java.util.Scanner;

public class ProblemaAlturas {

	public static void main(String[] args) {

		Scanner scAltura = new Scanner(System.in);
		System.out.println("Quantas alturas ira digitar? ");
		int numPessoas = scAltura.nextInt();
		double mediaAltura = 0;
		double somaAltura = 0;
		int menorDezesseis = 0;

		Pessoa [] listaDePessoas = new Pessoa [numPessoas];
			
		for (int i = 0; i < numPessoas; i++) {
			System.out.println("Nome: ");
			String nome = scAltura.next();
			
			System.out.println("Idade: ");
			int idade = scAltura.nextInt();
		
			System.out.println("Altura: ");
			double altura = scAltura.nextDouble();
		
			Pessoa pessoaDigitada = new Pessoa(nome, idade, altura);
			
			listaDePessoas[i] = pessoaDigitada;
			somaAltura = somaAltura + altura;
			if (idade < 16) {
				menorDezesseis = menorDezesseis + 1;
			}
					
		}
		
		mediaAltura = somaAltura / numPessoas;
		System.out.println("Media: " + mediaAltura);
		
		System.out.println("Porcentagem menores 16 anos: " + (double) menorDezesseis / numPessoas * 100);
		
		
		for (int i = 0; i < numPessoas; i++) {
			if (listaDePessoas[i].isUnderAge()) {
				System.out.println(listaDePessoas[i].getName());
				System.out.println();
				
				
				
				
		}
		}
		
		
		scAltura.close();
		
			
		
			
		
	}
	}
