

/**
 * Minha Exceção personalizada.
 * 
 * @author Vinicius de Carvalho
 *
 */
public class MinhaExceptionVerificavelPeloCompilador extends Exception{
	private static final long serialVersionUID = 356082676433925917L;
	
	public MinhaExceptionVerificavelPeloCompilador(String msg) {
		super(msg);
	}
}
