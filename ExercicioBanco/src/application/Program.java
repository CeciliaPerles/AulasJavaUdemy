package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account holder: ");
		String nomeTitular = sc.nextLine();
		System.out.print("Enter account number: ");
		int numeroConta = sc.nextInt();
		sc.nextLine();
		System.out.println("Is there initial deposit? ");
		String temDepositoInicial = sc.nextLine();
		double depositoInicial = 0;
		if (temDepositoInicial.equalsIgnoreCase("Sim")) {
			System.out.println("Initial deposit value: ");
			depositoInicial = sc.nextDouble();
		} else {
			System.out.println("Initial deposit value: 0");
		}
				
		Conta conta = new Conta(nomeTitular, numeroConta, depositoInicial);
		
		conta.getNomeTitular();
		conta.getNumeroConta();
		conta.getSaldo();
		
		System.out.println("Dados da conta: " + conta);

		System.out.println();
		System.out.println("Enter a deposit value: ");
		double deposito = sc.nextDouble();
		conta.deposito(deposito);

		System.out.println("Dados da conta: " + conta);
		
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double saque = sc.nextDouble();
		conta.saque(saque);

		System.out.println("Dados da conta: " + conta);
				
		sc.close();
	}

}
