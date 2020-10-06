
public class Administrador extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

//	private int senha;

	public Administrador() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public double getBonificacao() {
		return 50;
	}

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
