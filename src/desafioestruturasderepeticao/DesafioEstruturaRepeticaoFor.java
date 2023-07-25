package desafioestruturasderepeticao;

import java.util.Scanner;

public class DesafioEstruturaRepeticaoFor {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("######################################################");
		
		int numero = 0;
		int soma = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite números pares: ");
			numero = scanner.nextInt();
			System.out.println("______________________________________________________");
			if(numero % 2 == 0) {
				soma += numero;
			} else {
				i--;
			}
			
		}
		System.out.println("A soma de todos os números pares é: " + soma);
				
		System.out.println("######################################################");
		scanner.close();
	}

}
