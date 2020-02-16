

/**
 * Minha Exceção personalizada.
 * 
 * @author Vinicius de Carvalho
 *
 */
public class MinhaException extends RuntimeException{
	private static final long serialVersionUID = 356082676433925917L;
	
	public MinhaException(String msg) {
		super(msg);
	}
}
