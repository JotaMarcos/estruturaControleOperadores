package desafiooperadoresdeigualdadeelogicos;

import java.util.Scanner;

public class DesafioOperadoresIgualdadeLogicos {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um ano: ");
		int ano = scanner.nextInt();
		
		boolean anoBissexto = (ano % 400 == 0) || (ano % 4 == 0);
		
		System.out.printf("O ano de %d é bissexto: %b%n", ano, anoBissexto);
		
		scanner.close();
	}

}
