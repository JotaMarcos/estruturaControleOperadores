package curtocircuitodeoperadoreslogicos;

public class CurtoCircuitoOperadoresLogicos {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
//		boolean resultado = x == 10 && y++ == 20;
		boolean resultado = x == 10 || y++ == 20;
		
		System.out.println("O resultado é: " + resultado);
		System.out.println("O resultado de y é: " + y);
	}

}