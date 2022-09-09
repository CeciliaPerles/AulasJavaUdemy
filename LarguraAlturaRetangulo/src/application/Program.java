package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		System.out.println("Insira a largura e altura do retângulo:");
		retangulo.heigth = sc.nextDouble();
		retangulo.width = sc.nextDouble();
		
		
		System.out.println("AREA: " + retangulo.area() + ", PERIMETER: " + retangulo.perimeter() + ", DIAGONAL: " + retangulo.diagonal());
		
		
		sc.close();
	}

}
