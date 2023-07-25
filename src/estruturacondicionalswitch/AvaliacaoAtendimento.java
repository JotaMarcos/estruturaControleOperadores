package estruturacondicionalswitch;

import java.util.Scanner;

public class AvaliacaoAtendimento {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	
		
		System.out.println("=========================================================================");
		
		System.out.print("Avalie o nosso atendimento [1 a 5]: ");
		int nota = scanner.nextInt();		
		System.out.println("_________________________________________________________________________");
		String descricaoNota;
		
		/*
		if (nota == 1) {
			descricaoNota = "Muito ruim!";
		} else if(nota ==2){
			descricaoNota = "Ruim!";
		} else if (nota == 3) {
			descricaoNota = "Razoável!";
		} else if (nota == 4) {
			descricaoNota = "Muito bom!";
		} else if (nota ==5) {
			descricaoNota = "Excelente!";
		} else {
			descricaoNota = "Opção inválida!";
		}
		*/
		switch (nota) {
		case 1:
			descricaoNota = "Muito ruim!";
			break;
		case 2:
			descricaoNota = "Ruim!";
			break;
		case 3:
			descricaoNota = "Razoável!";
			break;
		case 4:
			descricaoNota = "Muito bom!";
			break;
		case 5:
			descricaoNota = "Excelente!";
			break;
		default:
			descricaoNota = "Opção inválida!";
			break;
		}
		
		System.out.printf("Sua nota foi: %d - %s%n", nota, descricaoNota);
		System.out.println("Agradeçemos a sua participação!:=)");
		
		System.out.println("=========================================================================");
		
		scanner.close();
	}

}
