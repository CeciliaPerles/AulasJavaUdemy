package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Funcionarios;

public class Exercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Funcionarios> funcionarios = new ArrayList<>();

		System.out.println("Quantos empregados vai registrar? ");
		int numDigitar = sc.nextInt();
		
		for (int i = 0; i < numDigitar; i++) {
		
		System.out.println("Digite ID do funcionario " + (i + 1));
			
		int id = sc.nextInt();
		
		System.out.println("Digitar nome do funcionario " + (i + 1));
		String nome = sc.next();
		
		System.out.println("Digitar salario do funcionario " + (i + 1));
		double salario = sc.nextDouble();
		
		funcionarios.add(new Funcionarios(id, nome, salario));
		}
		
		
		
		
		sc.close();
	}

}
