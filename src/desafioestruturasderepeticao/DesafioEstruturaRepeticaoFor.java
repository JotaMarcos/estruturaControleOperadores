package desafioestruturasderepeticao;

import java.util.Scanner;

public class DesafioEstruturaRepeticaoFor {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("######################################################");
		
		int numero = 0;
		int soma = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite 10 números: ");
			numero = scanner.nextInt();
			System.out.println("______________________________________________________");
			soma += numero;
		}
		System.out.println("A soma de todos os número é: " + soma);
				
		System.out.println("######################################################");
		scanner.close();
	}

}
