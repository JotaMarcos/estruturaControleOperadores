package operadoreslogicos;

import java.util.Scanner;

public class ExameCortisol {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.print("Digite o seu Cortisol: ");
		double cortisol = scanner.nextDouble();

		// cortisol ideal é de 6 a 18.4
		boolean resultadoNormal = cortisol >= 6.0 && cortisol <= 18.4;

		System.out.printf("Coritsol normal: %b%n", resultadoNormal);
		System.out.println("-------------------------------------------------------------------------");
		boolean resultadoAnormal = cortisol < 6 || cortisol > 18.4; 
		System.out.printf("Coritsol anormal: %b%n", resultadoAnormal);

		System.out.println();
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

		scanner.close();

	}

}
