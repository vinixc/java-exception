public class FluxoComError {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		}catch(ArithmeticException | NullPointerException e) {
			System.out.println("Exception : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		try {
			metodo2();
		}catch(StackOverflowError e) {
			System.out.println("Peguei a StackOverFlowError");
			System.out.println(e.getMessage());
			//metodo1(); //causando um loop infinito da stackOverFlow haha
			//System.out.close();
		}
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Chamando metodo 2");
		metodo2();
		System.out.println("Fim metodo 2");
	}
}