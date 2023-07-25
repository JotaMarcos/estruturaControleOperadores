package operadorternario;

public class CalculadoraImpostos {

	static final double NOTA_FISCAL_TIPO_PRODUTO = 0.16; 
	static final double NOTA_FISCAL_TIPO_SERVICO = 0.35; 
	static final char NOTA_FISCAL_DE_PRODUTO = 'P'; 
	static final char NOTA_FISCAL_DE_SERVICO = 'S'; 
	
	public static void main(String[] args) {
		
		char tipoNotFiscal = NOTA_FISCAL_DE_SERVICO;
		double totalFaturamento = 1_200.30;
		
	/*
		 double valorImpostos = 0.0;
		 
				
		if (tipoNotFiscal == NOTA_FISCAL_DE_PRODUTO) {
			valorImpostos = totalFaturamento * NOTA_FISCAL_TIPO_PRODUTO;
			System.out.println("====================== NOTA FISCAL DE PRODUTO! ======================");
		} else if(tipoNotFiscal == NOTA_FISCAL_DE_SERVICO){
			System.out.println("====================== NOTA FISCAL DE SERVIÇO! ======================");
			valorImpostos = totalFaturamento * NOTA_FISCAL_TIPO_SERVICO;
		} else {
			System.out.println("Tipo inválido de Nota Fiscal!");
		}
	*/
		
		double valorImpostos = tipoNotFiscal == NOTA_FISCAL_DE_SERVICO 
				                             ? totalFaturamento * NOTA_FISCAL_TIPO_SERVICO 
											 : totalFaturamento * NOTA_FISCAL_DE_PRODUTO;
		

		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		
		System.out.printf("Total faturado: R$%.2f%n", totalFaturamento);
		System.out.printf("Valor dos impostos: R$%.2f%n", valorImpostos);
		
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
	}

}
