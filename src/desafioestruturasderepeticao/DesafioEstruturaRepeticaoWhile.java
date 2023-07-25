package desafioestruturasderepeticao;

import java.util.Scanner;

public class DesafioEstruturaRepeticaoWhile {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("######################################################");
		
		int soma = 0;
		
		while (soma < 100) {
			System.out.print("Digite um número: ");
			int numero = scanner.nextInt();
			soma += numero;
			System.out.println("______________________________________________________");
		}
		
		if(soma >= 100) {
			System.out.println("A soma de todos os número é: " + soma);
			
		}
		
		
				
		System.out.println("######################################################");
		scanner.close();
		
	}

}
