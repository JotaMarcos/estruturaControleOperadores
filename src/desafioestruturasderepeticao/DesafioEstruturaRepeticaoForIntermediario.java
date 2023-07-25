package desafioestruturasderepeticao;

import java.util.Scanner;

public class DesafioEstruturaRepeticaoForIntermediario {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("######################################################");
		
		System.out.print("Digite um número inteiro positivo: ");
		int numero = scanner.nextInt();
		
		 boolean numeroPrimo = true; 

		 System.out.println("______________________________________________________");					
		
		for (int i = 2; i < numero; i++) {
			if(numero % i == 0) {
				numeroPrimo = false;
				break;
			}
		}
		
		if(numeroPrimo && numero > 1) {
			System.out.println("Esse número é primo!");				
		} else {				
			System.out.println("Esse número não é primo!");
		}
		System.out.println("######################################################");
		scanner.close();
		
	}

}
