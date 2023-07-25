package desafiocalculadoradeimc;

import java.util.Scanner;

public class CalculadoraComplexIMC {
	
	final static double  IMC_ABAIXO_DO_PESO_MULHERES = 19.1;
	final static double  IMC_PESO_IDEAL_MULHERES = 25.8;
	final static double  IMC_ACIMA_UM_POUCO_DO_PESO_MULHERES = 27.3;
	final static double  IMC_ACIMA_PESO_MULHERES = 32.3;
	
	final static double  IMC_ABAIXO_DO_PESO_HOMENS = 20.7;
	final static double  IMC_PESO_IDEAL_HOMENS = 26.4;
	final static double  IMC_ACIMA_UM_POUCO_DO_PESO_HOMENS = 27.8;
	final static double  IMC_ACIMA_PESO_HOMENS = 31.1;
	
	

	

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.print("Digite o seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Digite o sexo: [F-Feminino / M-Masculino]: ");
		char sexo = scanner.next().charAt(0);
		
		System.out.print("Digite o seu peso:  ");
		double peso = scanner.nextDouble();
		
		System.out.print("Digite a sua altura: ");
		double altura = scanner.nextDouble();
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
		double calcularAltura = (altura * altura);
		
		double imc = (peso / calcularAltura) * 10000;
		System.out.printf("Olá! %s, com sexo '%C', o seu IMC é %.3f%ncom o índice IMC: ", nome, sexo, imc);
		
		if((sexo == 'F' && imc < IMC_ABAIXO_DO_PESO_MULHERES) || (sexo == 'M' && imc < IMC_ABAIXO_DO_PESO_HOMENS)) {
			System.out.println("Abaixo do peso!");
		} else if((sexo == 'F' && imc < IMC_PESO_IDEAL_MULHERES) || (sexo == 'M' && imc < IMC_PESO_IDEAL_HOMENS)) {
			System.out.println("No peso ideal!");
		} else if((sexo == 'F' && imc < IMC_ACIMA_UM_POUCO_DO_PESO_MULHERES) || (sexo == 'M' && imc < IMC_ACIMA_UM_POUCO_DO_PESO_HOMENS)) {
			System.out.println("Um pouco acima do peso!");
		} else  if((sexo == 'F' && imc < IMC_ACIMA_PESO_MULHERES) || (sexo == 'M' && imc < IMC_ACIMA_PESO_HOMENS)) {
			System.out.println("Acima do peso ideal!");
		} else {
			System.out.println("Obeso!");
		}
		
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
		
		
		scanner.close();
			
	}
	
}
