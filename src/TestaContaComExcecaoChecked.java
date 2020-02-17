
public class TestaContaComExcecaoChecked {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		try {
			conta.deposita();
		} catch (MinhaExceptionVerificavelPeloCompilador e) {
			System.out.println("Tratamento...");
		}
	}
}
