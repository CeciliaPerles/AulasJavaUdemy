package desafio;

import java.util.Scanner;

import desafio.Quarto;

public class ProgramaQuarto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos quartos serao alugados?");
		int numeroQuartos = sc.nextInt();

		Quarto[] vetorQuartos = new Quarto[numeroQuartos];

		for (int i = 0; i < numeroQuartos; i++) {
			sc.nextLine();
			System.out.println("Rent " + (i + 1));
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();

			vetorQuartos[i] = new Quarto(name, email, room);

		}
		


		
		sc.close();
	}

}
