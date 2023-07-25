package desafioestruturasderepeticao;

import java.util.Scanner;

public class DesafioEstruturaRepeticaoWhileIntermediario {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("######################################################");
		
		int numero = 0;
		
		System.out.print("Digite um número: ");
		int numeroInicial = scanner.nextInt();
		
		int numeroAuxiliar = numeroInicial;
		int numeroTrocado = 0;
		
		while(numeroAuxiliar > 0) {
			int restoDaDivisao = numeroAuxiliar % 10;
			numeroTrocado = numeroTrocado * 10 + restoDaDivisao;
			numeroAuxiliar /= 10;
		}
		System.out.println("______________________________________________________");

		System.out.println("Número " + numeroInicial + " invertido fica: " + numeroTrocado);
		
		System.out.println("######################################################");
		scanner.close();
		
	}

}
