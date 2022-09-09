package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		System.out.println("Insira os dados: ");
		System.out.print("Nome: ");
		funcionario.name = sc.nextLine();
		System.out.print("Salário bruto: ");
		funcionario.grossSalary = sc.nextDouble();
		System.out.print("Taxas: ");
		funcionario.tax = sc.nextInt();
		
		System.out.println();
		System.out.println("Funcionário: " + funcionario.name + ", Salário líquido: " + funcionario.netSalary());
		
		System.out.println();
		System.out.println("Qual aumento? ");
		double percentage = sc.nextInt();
		funcionario.increaseSalary(percentage);
			
		System.out.println();
		System.out.println("Atualizado: " + funcionario.netSalary());

		sc.close();
	}

}
