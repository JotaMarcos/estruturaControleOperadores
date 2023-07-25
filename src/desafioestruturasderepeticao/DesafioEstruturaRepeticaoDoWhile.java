package desafioestruturasderepeticao;

import java.util.Scanner;

public class DesafioEstruturaRepeticaoDoWhile {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("######################################################");
		
		int totalNumeroPares = 0;
		int totalNumeroImpares = 0;
		boolean proximoNumero = true;
		
		do {
			System.out.println("Digite um número: ");
			int numeroNatural = scanner.nextInt();
			
			if (numeroNatural % 2 == 0) {
				totalNumeroPares += numeroNatural;
			} else {
				totalNumeroImpares += numeroNatural;
			}
			
			System.out.print("Deseja digitar um próximo número? ");
			proximoNumero = scanner.nextBoolean();
			
		} while(proximoNumero);
		
		
		System.out.println("______________________________________________________");
			
		System.out.println("Total dos números pares: " + totalNumeroPares);
		System.out.println("Total dos números impares: " + totalNumeroImpares);
					
		System.out.println("######################################################");
		scanner.close();
		
	}

}
