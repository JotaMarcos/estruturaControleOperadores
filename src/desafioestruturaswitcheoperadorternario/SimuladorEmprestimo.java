package desafioestruturaswitcheoperadorternario;

import java.util.Scanner;

public class SimuladorEmprestimo {

	static final double TARIFA_FIXA = 1.50;
	static final double TARIFA_NORMAL = 0.0;
	static final double TAXA_JUROS_1_OU_2_PARCELAS = 1.99;
	static final double TAXA_JUROS_3_PARCELAS = 2.99;
	static final double TAXA_JUROS_OUTRAS_PARCELAS = 3.99;
	
	
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||");

    System.out.print("Valor do empréstimo: ");
    double valorEmprestimo = scanner.nextDouble();

    System.out.print("Quantidade de parcelas: ");
    int quantidadeParcelas = scanner.nextInt();
    System.out.println("___________________________________________________");
    double taxaJuros = switch (quantidadeParcelas) {
	case 1, 2 -> TAXA_JUROS_1_OU_2_PARCELAS;
	case 3 -> TAXA_JUROS_3_PARCELAS;
	default -> TAXA_JUROS_OUTRAS_PARCELAS;
    };
	

    double tarifaFixada = valorEmprestimo >= 100 ? TARIFA_FIXA : TARIFA_NORMAL;
    double totalJuros = valorEmprestimo * (taxaJuros / 100 * quantidadeParcelas);
    double custoTotal = valorEmprestimo + tarifaFixada + totalJuros;

    System.out.printf("Tarifa fixa: R$%.2f%n", tarifaFixada);
    System.out.printf("Total de juros: R$%.2f%n", totalJuros);
    System.out.printf("Custo total: R$%.2f%n", custoTotal);
    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||");
    
    scanner.close();
  }

}