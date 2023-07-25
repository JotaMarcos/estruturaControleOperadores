package clausulabreakecontinue;

import java.util.Scanner;

public class ControlePesoAeronave {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("###################################################");
		
		System.out.print("Qual o peso máximo da aeronave: ");
		int pesoMaximoAeronave = scanner.nextInt();
				
		int pesoTotalPassageiros = 0;
		
		
		System.out.println("---------------------------------------------------");

		while(true) {
			System.out.print("Peso do passageiro: ");
			int pesoPassageiro = scanner.nextInt();
			
			if(pesoTotalPassageiros + pesoPassageiro > pesoMaximoAeronave) {
				System.out.println("Não pôde incluir passageiro. Peso excederia o máximo.");
				continue;
			}
			
			
			pesoTotalPassageiros += pesoPassageiro;
			
			System.out.println("Incluir novo passageiro? ");
			if(!scanner.nextBoolean()) {
				break;
			}
		}
		
		/*while(true) {
			System.out.print("Peso do passageiro: ");
			int pesoPassageiro = scanner.nextInt();
			
			if(pesoTotalPassageiros + pesoPassageiro > pesoMaximoAeronave) {
				System.out.println("Não pôde incluir passageiro. Peso excederia o máximo.");
			} else {
				pesoTotalPassageiros += pesoPassageiro;
				
				System.out.println("Incluir novo passageiro? ");
				if(!scanner.nextBoolean()) {
					break;
				}
			}	
			
		}*/
		
		System.out.println("---------------------------------------------------");
		
		System.out.printf("Peso máximo da aeronave: %d kg%n", pesoMaximoAeronave);
		System.out.printf("Peso máximo dos passageiros: %d kg%n", pesoTotalPassageiros);
		System.out.printf("Situação da aeronave para o voo: %s%n", 
				pesoTotalPassageiros > pesoMaximoAeronave ? "peso excedido" : "liberada");		
		
		System.out.println("###################################################");
		scanner.close();
		
	}

}
