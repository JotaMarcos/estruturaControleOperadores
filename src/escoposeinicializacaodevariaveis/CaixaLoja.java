package escoposeinicializacaodevariaveis;

import java.util.Scanner;

public class CaixaLoja {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*********************************************************************");
		System.out.print("Digite o preço dos produtos: R$ ");
		double precoProdutos = scanner.nextDouble();
		
		System.out.print("Cobrar frete? ");
		boolean cobrarFrete = scanner.nextBoolean();
		
		System.out.println("---------------------------------------------------------------------");
		
		double valorFrete = 0;
		
		if (cobrarFrete) {
			System.out.print("Valor do Frete: R$ ");
			valorFrete = scanner.nextDouble();
		}
		System.out.println("*********************************************************************");
		
		double valorTotal = precoProdutos + valorFrete;
		
		System.out.printf("Valor total : R$ %.2f%n", valorTotal);
			
		System.out.println("*********************************************************************");
		
		scanner.close();
		
	}

}
