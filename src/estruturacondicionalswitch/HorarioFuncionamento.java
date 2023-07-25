package estruturacondicionalswitch;

import java.util.Scanner;

public class HorarioFuncionamento {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("=========================================================================");
		System.out.print("Digite um dia semana (ex.: seg, ter, qua, qui, sex, sáb, dom): ");
		String diaDaSemana = scanner.nextLine();
		
		System.out.print("Digite o mês [1 até 12]: ");
		int mes = scanner.nextInt();
		System.out.println("_________________________________________________________________________");
		
		/*
		String horarioFuncionamento;
		
		switch (diaDaSemana) {
		case "seg"-> horarioFuncionamento = "Fechado!";
		case "ter", "qua", "qui", "sex" -> horarioFuncionamento = "Aberto! 08:00 às 18:00";
		case "sáb", "dom" ->{
			horarioFuncionamento = "Aberto! 08:00 às 12:00";
		}
		default -> horarioFuncionamento = "Dia da semana inválido!";
		}
		*/
		
		// Switch Expressions ou JavaScript aplicado no Java!?!?!?
//		String horarioFuncionamento = switch (diaDaSemana) {
//			case "seg"-> "Fechado!";
//			case "ter", "qua", "qui", "sex" -> "Aberto! 08:00 às 18:00";
//			case "sáb", "dom" -> "Aberto! 08:00 às 12:00";
//			default -> "Dia da semana inválido!";
//		};
//		System.out.printf("Horário de funcionamento: %s%n", horarioFuncionamento);		
		
		System.out.printf("Horário de funcionamento: %s%n", switch (diaDaSemana) {
		case "seg"-> {
			if(mes == 12) {
				yield "Aberto! 08:00 às 16:00";
			}
			yield "Fechado!";
		}		
		case "ter", "qua", "qui", "sex" -> "Aberto! 08:00 às 18:00";
		case "sáb", "dom" -> "Aberto! 08:00 às 12:00";
		default -> "Dia da semana inválido!";
	});		
		System.out.println("=========================================================================");

		scanner.close();
	}

}
