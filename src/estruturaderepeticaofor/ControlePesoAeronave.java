package estruturaderepeticaofor;

import java.util.Scanner;

public class ControlePesoAeronave {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("###################################################");
		
		System.out.print("Qual o peso máximo da aeronave: ");
		int pesoMaximoAeronave = scanner.nextInt();
		
		System.out.print("Quantidade de passageiros: ");
		int totalPassageiros = scanner.nextInt();
		
		int pesoTotalPassageiros = 0;
		
		System.out.println("---------------------------------------------------");
		
		for(int passageiroAtual = 1; passageiroAtual <= totalPassageiros; passageiroAtual++) {
			System.out.printf("Peso do passageiro #%d: ", passageiroAtual);
			int pesoPassageiro = scanner.nextInt();
			pesoTotalPassageiros += pesoPassageiro;
		}
		
		System.out.println("---------------------------------------------------");
		
		System.out.printf("Peso máximo da aeronave: %d kg%n", pesoMaximoAeronave);
		System.out.printf("Peso máximo dos passageiros: %d kg%n", pesoTotalPassageiros);
		System.out.printf("Situação da aeronave para o voo: %s%n", 
				pesoTotalPassageiros > pesoMaximoAeronave ? "peso excedido" : "liberada");
		
		
		System.out.println("###################################################");
		scanner.close();
		
	}

}
