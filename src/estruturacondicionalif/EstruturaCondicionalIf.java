package estruturacondicionalif;

import java.util.Scanner;

public class EstruturaCondicionalIf {

	final static double  IMC_ABAIXO_DO_PESO = 18.5;
	final static double  IMC_PESO_IDEAL = 25.0;
	final static double  IMC_ACIMA_PESO = 30.0;
	final static double  IMC_OBESIDADE_GRAU_I = 35.0;
	final static double  IMC_OBESIDADE_GRAU_II = 40.0;
	

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.print("Digite o seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Digite o seu peso:  ");
		double peso = scanner.nextDouble();
		
		System.out.print("Digite a sua altura: ");
		double altura = scanner.nextDouble();
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
		double calcularAltura = (altura * altura);
		
		double imc = (peso / calcularAltura) * 10000;
		System.out.printf("Olá! %s, o seu IMC é %.3f%ncom o índice IMC: ", nome, imc);
		
		if (imc < IMC_ABAIXO_DO_PESO ) {
			System.out.println("Abaixo do peso ideal!");
		} else if (imc < IMC_PESO_IDEAL) {
			System.out.println("Abaixo do peso ideal!");
		} else if (imc < IMC_ABAIXO_DO_PESO ) {
			System.out.println("Peso ideal!");
		} else if (imc < IMC_ACIMA_PESO ) {
			System.out.println("Abaixo do peso ideal!");
		} else if (imc < IMC_OBESIDADE_GRAU_I ) {
			System.out.println("Obesidade grau I!");
		} else if (imc < IMC_OBESIDADE_GRAU_II ) {
			System.out.println("Obesidade grau II!");
		} else {
			System.out.println("Obesidade grau III!");
		} 
		
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
		
		
		scanner.close();
			
	}

}
