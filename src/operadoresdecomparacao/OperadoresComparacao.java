package operadoresdecomparacao;

public class OperadoresComparacao {

	public static void main(String[] args) {
		
		int pesoProdutos = 900;
		int limitePesoCaminhao = 1000;
		
		boolean cargaExcedida = pesoProdutos > limitePesoCaminhao;
		
		if(cargaExcedida) {
			System.err.printf("Carga excedida: %b%n", cargaExcedida);
			
		} else {
			System.out.printf("Carga excedida: %b%n", cargaExcedida);
		}
		
//		boolean cargaLiberada = pesoProdutos <= limitePesoCaminhao;
		boolean cargaLiberada = limitePesoCaminhao >= pesoProdutos;
		
		if(cargaLiberada) {
			
			System.out.printf("Carga liberada: %b%n", cargaLiberada);
		} else {
			System.err.printf("Carga não foi liberada: %b%n", cargaLiberada);
		}
		
		
	}

}
