package procedenciadeoperadoreslogicos;

import java.util.Scanner;

// Desejável: acima de 20 ng/ML
// Grupos de risco: 30 a 60 ng/ML

public class ExameVitaminaD {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Qual o seu Grupo de Risco: ");
		boolean grupoDeRisco = scanner.nextBoolean();
		
		System.out.print("Qual o seu nível de Vitamina D: ");
		double vitaminaD = scanner.nextDouble(); // nanograma por mililitro
		
		boolean vitaminaDNormal = (grupoDeRisco == false && vitaminaD > 20)
				|| (grupoDeRisco == true && vitaminaD >= 30 && vitaminaD <= 60);
				
		boolean vitaminaDAnormal = grupoDeRisco == true && vitaminaD < 20;
		
		System.out.println("Vitamina D normal: " + vitaminaDNormal);
		System.out.println("Vitamina D anormal: " + vitaminaDAnormal);
				
		
		scanner.close();
	}

}
