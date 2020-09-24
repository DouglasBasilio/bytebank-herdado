// não uso mais o extends, e sim o implements
// ao assinar (implements) o contrato 'Autenticavel'
// preciso implementar os métodos

public class Cliente implements Autenticavel {

	private int senha;
	
	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	

}
