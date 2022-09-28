package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scAltura = new Scanner(System.in);
		System.out.println("Quantas pessoas ira digitar? ");
		int numPessoas = scAltura.nextInt();
		int [] vect = new int [numPessoas];
		
		for (int i = 0; i < numPessoas; i++){
			System.out.println("Nome: ");
			vect[i] = scAltura.nextInt();
		}
		
		System.out.println("Idade: ");
		for (int i = 0; i < numPessoas; i++) {
			System.out.println(vect[i]);

		}



		scAltura.close();
			
	}
		
	
}
