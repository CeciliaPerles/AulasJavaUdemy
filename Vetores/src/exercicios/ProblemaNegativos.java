package exercicios;

import java.util.Scanner;

public class ProblemaNegativos {

	public static void main(String[] args) {

		Scanner scNegativos = new Scanner(System.in);
		System.out.println("Quantos numeros ira digitar? ");
		int numerosIraDigitar = scNegativos.nextInt();
		int [] vect = new int [numerosIraDigitar];
		
		for (int i = 0; i < numerosIraDigitar; i++){
		vect[i] = scNegativos.nextInt();
		}
				
		
		System.out.println("Negativos: ");
		for (int i = 0; i < numerosIraDigitar; i++) {
	        if (vect[i] < 0) {
	        	System.out.println(vect[i]);
	        }
				
		scNegativos.close();

	}

}
}