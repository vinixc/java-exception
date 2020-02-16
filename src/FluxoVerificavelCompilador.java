public class FluxoVerificavelCompilador {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		}catch(ArithmeticException | NullPointerException | MinhaExceptionVerificavelPeloCompilador e ) {
			System.out.println("Exception : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() throws MinhaExceptionVerificavelPeloCompilador{
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() throws MinhaExceptionVerificavelPeloCompilador{
		System.out.println("Ini do metodo2");
		throw new MinhaExceptionVerificavelPeloCompilador("Deu Ruim irmom!");
	}
}