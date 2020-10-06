// não uso mais o extends, e sim o implements
// ao assinar (implements) o contrato 'Autenticavel'
// preciso implementar os métodos

public class Cliente implements Autenticavel {

	// private int senha;
	private AutenticacaoUtil autenticador;

	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
	} 
	// criei uma instância do AutenticacaoUtil
	// ao criar o cliente, vou criar internamente o AutenticacaoUtil
	

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		// quem vai guardar a senha é o 'autenticador'
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);		
		// deleguei a chamada para a AutenticacaoUtil
	}

}
