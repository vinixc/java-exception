
public class TesteConexao {
	
	public static void main(String[] args) {
		Conexao con = null;
		
		try {
			con = new Conexao();
			con.leDados();
		}catch(IllegalStateException ex) {
			System.out.println("Deu Erro na conexao");
		}finally {
			con.fecha();
		}
	}

}
